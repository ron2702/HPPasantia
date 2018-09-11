/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.empleados;

import comun.Empleado;
import comun.Lugar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.ComunicacionREST;
import modelo.ManejadorImagen;
import modelo.Registry;
import vista.panel.empleados.*;


public class ModificarEmpleado extends javax.swing.JPanel {
    private File archivoSeleccionado;
    private Empleado empleadoModificar;
    private ArrayList<Lugar> listaEstados;
    private ArrayList<Lugar> listaMunicipios;
    private ArrayList<Lugar> listaParroquias;
    
    private Lugar buscarLugarPorNombre(ArrayList<Lugar> lugares, String nombreLugar){
        for (Lugar lugar : lugares) {
            if (lugar.getNombre().equals(nombreLugar)){
                return lugar;
            }
        }
        return null;
    }
    public ModificarEmpleado() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            
            listaEstados = comRest.consultarEstados();
            ArrayList<Empleado> listaEmpleados = comRest.consultarEmpleados();
            
            for (Lugar lugar : listaEstados) {
                cb_estados.addItem(lugar);
            }
            cb_estados.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        cb_municipios.removeAllItems();
                        Lugar estadoSeleccionado = (Lugar) cb_estados.getSelectedItem();
                        listaMunicipios = comRest.consultarMunicipios(estadoSeleccionado);
                        for (Lugar lugar : listaMunicipios) {
                            cb_municipios.addItem(lugar);
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(ModificarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            cb_municipios.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        cb_parroquias.removeAllItems();
                        Lugar municipioSeleccionado = (Lugar) cb_municipios.getSelectedItem();
                        if (municipioSeleccionado != null){
                            listaParroquias = comRest.consultarParroquias(municipioSeleccionado);
                            for (Lugar lugar : listaParroquias) {
                                cb_parroquias.addItem(lugar);
                            }
                        }

                    } catch (Exception ex) {
                        Logger.getLogger(ModificarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            for (Empleado empleado : listaEmpleados) {
                cb_listaEmpleados.addItem(empleado);
            }
            cb_listaEmpleados.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Empleado empleadoSeleccionado = (Empleado) cb_listaEmpleados.getSelectedItem();
                        empleadoModificar = empleadoSeleccionado;
                        String sueldomensual = Integer.toString(empleadoSeleccionado.getSueldoMensual());
                        txt_primerNombre.setText(empleadoSeleccionado.getPrimerNombre());
                        txt_segundoNombre.setText(empleadoSeleccionado.getSegundoNombre());
                        txt_primerApellido.setText(empleadoSeleccionado.getPrimerApellido());
                        txt_segundoApellido.setText(empleadoSeleccionado.getSegundoApellido());
                        txt_telefonoCasa.setText(empleadoSeleccionado.getTelefonoCasa());
                        txt_telefonoMovil.setText(empleadoSeleccionado.getTelefonoMovil());
                        txt_cargo.setText(empleadoSeleccionado.getCargo());
                        txt_sueldoMensual.setText(sueldomensual);
                        Calendar calNac = Calendar.getInstance();
                        calNac.setTime(empleadoSeleccionado.getFechaNac());
                        dc_fechaNac.setSelectedDate(calNac);
                        Calendar calIngreso = Calendar.getInstance();
                        calIngreso.setTime(empleadoSeleccionado.getFechaIngreso());
                        dc_fechaIngreso.setSelectedDate(calIngreso);
                        cb_banco.setSelectedItem(empleadoSeleccionado.getBanco());
                        Lugar estadoEmpleado = buscarLugarPorNombre(listaEstados, empleadoSeleccionado.getEstado());
                        cb_estados.setSelectedItem(estadoEmpleado);
                        Lugar municipioEmpleado = buscarLugarPorNombre(listaMunicipios, empleadoSeleccionado.getMunicipio());
                        cb_municipios.setSelectedItem(municipioEmpleado);
                        Lugar parroquiaEmpleado = buscarLugarPorNombre(listaParroquias, empleadoSeleccionado.getParroquia());
                        cb_parroquias.setSelectedItem(parroquiaEmpleado);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(ModificarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
        } catch (Exception ex) {
            Logger.getLogger(ModificarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void keyTypedSoloNumeros(java.awt.event.KeyEvent evt, JTextField campoEvaluar, int tamanoMax){
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE) || (campoEvaluar.getText().length() == tamanoMax)) {
            evt.consume();
        }
    }

    
    public void keyTypedSoloLetras(java.awt.event.KeyEvent evt, JTextField campoEvaluar, int tamanoMax){
        char vChar = evt.getKeyChar();
        
        if ((!(Character.isAlphabetic(vChar)) && (vChar != ' ')) || (campoEvaluar.getText().length() == tamanoMax)) {
            evt.consume();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_datos = new javax.swing.JPanel();
        lbl_segundoApellido = new javax.swing.JLabel();
        txt_segundoApellido = new javax.swing.JTextField();
        txt_primerApellido = new javax.swing.JTextField();
        lbl_telefonoCasa = new javax.swing.JLabel();
        txt_segundoNombre = new javax.swing.JTextField();
        lbl_telefonoMovil = new javax.swing.JLabel();
        txt_primerNombre = new javax.swing.JTextField();
        lbl_cargo = new javax.swing.JLabel();
        lbl_sueldoMensual = new javax.swing.JLabel();
        txt_sueldoMensual = new javax.swing.JTextField();
        txt_cargo = new javax.swing.JTextField();
        lbl_primerNombre = new javax.swing.JLabel();
        txt_telefonoMovil = new javax.swing.JTextField();
        lbl_segundoNombre = new javax.swing.JLabel();
        txt_telefonoCasa = new javax.swing.JTextField();
        lbl_primerApellido = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();
        lbl_municipio = new javax.swing.JLabel();
        lbl_parroquia = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        dc_fechaNac = new datechooser.beans.DateChooserCombo();
        dc_fechaIngreso = new datechooser.beans.DateChooserCombo();
        lbl_fechaNac = new javax.swing.JLabel();
        lbl_fechaIngreso = new javax.swing.JLabel();
        cb_banco = new javax.swing.JComboBox();
        lbl_banco = new javax.swing.JLabel();
        cb_estados = new javax.swing.JComboBox();
        cb_municipios = new javax.swing.JComboBox();
        cb_parroquias = new javax.swing.JComboBox();
        lbl_foto = new javax.swing.JLabel();
        btn_cargarImagen = new javax.swing.JButton();
        cb_listaEmpleados = new javax.swing.JComboBox();
        lbl_tituloModificar = new javax.swing.JLabel();
        lbl_tituloModificarEmpleados = new javax.swing.JLabel();

        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 640));

        pnl_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        lbl_segundoApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_segundoApellido.setText("Segundo Apellido:");

        txt_segundoApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_segundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_segundoApellidoKeyTyped(evt);
            }
        });

        txt_primerApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_primerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primerApellidoKeyTyped(evt);
            }
        });

        lbl_telefonoCasa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoCasa.setText("Telefono Casa:");

        txt_segundoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_segundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_segundoNombreKeyTyped(evt);
            }
        });

        lbl_telefonoMovil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoMovil.setText("Teléfono Móvil:");

        txt_primerNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_primerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primerNombreKeyTyped(evt);
            }
        });

        lbl_cargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cargo.setText("Cargo:");

        lbl_sueldoMensual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_sueldoMensual.setText("Sueldo Mensual:");

        txt_sueldoMensual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_sueldoMensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sueldoMensualKeyTyped(evt);
            }
        });

        txt_cargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cargoKeyTyped(evt);
            }
        });

        lbl_primerNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_primerNombre.setText("Primer Nombre:");

        txt_telefonoMovil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_telefonoMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoMovilKeyTyped(evt);
            }
        });

        lbl_segundoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_segundoNombre.setText("Segundo Nombre:");

        txt_telefonoCasa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_telefonoCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoCasaKeyTyped(evt);
            }
        });

        lbl_primerApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_primerApellido.setText("Primer Apellido:");

        lbl_direccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_direccion.setText("Dirección de vivienda:");

        lbl_estado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_estado.setText("Estado:");

        lbl_municipio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_municipio.setText("Municipio:");

        lbl_parroquia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_parroquia.setText("Parroquia:");

        btn_limpiar.setBackground(new java.awt.Color(153, 0, 0));
        btn_limpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(0, 153, 102));
        btn_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("Modificar");
        btn_modificar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        dc_fechaNac.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dc_fechaNac.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dc_fechaNac.setCalendarPreferredSize(new java.awt.Dimension(400, 250));
    try {
        dc_fechaNac.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    dc_fechaNac.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
    dc_fechaNac.setLocale(new java.util.Locale("es", "ES", ""));
    dc_fechaNac.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

    dc_fechaIngreso.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dc_fechaIngreso.setCalendarBackground(new java.awt.Color(255, 255, 255));
dc_fechaIngreso.setCalendarPreferredSize(new java.awt.Dimension(400, 250));
try {
    dc_fechaIngreso.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    dc_fechaIngreso.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
    dc_fechaIngreso.setLocale(new java.util.Locale("es", "ES", ""));
    dc_fechaIngreso.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

    lbl_fechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_fechaNac.setText("Fecha de Nacimiento: ");

    lbl_fechaIngreso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_fechaIngreso.setText("Fecha de Ingreso: ");

    cb_banco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    cb_banco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100% Banco", "BBVA Banco Provincial", "Bancamiga", "Bancaribe", "Banco Activo", "Banco Agricola de Venezuela", "Banco Bicentenario del Pueblo", "Banco Caroni", "Banco del Tesoro", "Banco de Venezuela", "Banco Exterior", "Banco Mercantil", "Banco Plaza", "Banco Sofitasa", "Banco Venezolano de Credito", "Banesco", "Banfanb", "Banplus", "BFC Banco Fondo Comun", "BNC Banco Nacional de Credito", "BOD Banco Occidental de Descuento", "CitiBank", "DELSUR", "Mi Banco" }));

    lbl_banco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_banco.setText("Banco:");

    cb_estados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    cb_municipios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    cb_parroquias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    lbl_foto.setIcon(new javax.swing.ImageIcon("C:\\Users\\LuisAlejandro\\Pictures\\Blanco.PNG")); // NOI18N
    lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    btn_cargarImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btn_cargarImagen.setText("Cargar imagen");
    btn_cargarImagen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_cargarImagenActionPerformed(evt);
        }
    });

    cb_listaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    lbl_tituloModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_tituloModificar.setText("Empleado a modificar:");

    javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
    pnl_datos.setLayout(pnl_datosLayout);
    pnl_datosLayout.setHorizontalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_cargo)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_segundoNombre)
                        .addComponent(lbl_primerApellido)
                        .addComponent(lbl_segundoApellido)
                        .addComponent(lbl_primerNombre)
                        .addComponent(lbl_telefonoCasa)
                        .addComponent(lbl_tituloModificar)
                        .addComponent(lbl_sueldoMensual)
                        .addComponent(lbl_telefonoMovil))
                    .addGap(35, 35, 35)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_telefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_primerApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_segundoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_telefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sueldoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_primerNombre)
                            .addComponent(txt_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_cargarImagen))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_datosLayout.createSequentialGroup()
                                    .addGap(93, 93, 93)
                                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_estado)
                                        .addComponent(lbl_municipio)
                                        .addComponent(lbl_parroquia)))
                                .addComponent(lbl_fechaIngreso))
                            .addGap(34, 34, 34)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dc_fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_estados, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_municipios, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_parroquias, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lbl_direccion)
                        .addComponent(lbl_banco)
                        .addComponent(lbl_fechaNac))))
            .addGap(0, 35, Short.MAX_VALUE))
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(305, 305, 305)
            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    pnl_datosLayout.setVerticalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tituloModificar))
                .addComponent(lbl_fechaNac))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(lbl_fechaIngreso)
                    .addGap(18, 18, 18)
                    .addComponent(lbl_banco)
                    .addGap(16, 16, 16)
                    .addComponent(lbl_direccion)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbl_municipio)
                    .addGap(18, 18, 18)
                    .addComponent(lbl_parroquia)
                    .addGap(157, 204, Short.MAX_VALUE))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addComponent(dc_fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_primerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_primerNombre))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_segundoNombre))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_primerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_primerApellido))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_segundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_segundoApellido))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_telefonoCasa)
                                .addComponent(txt_telefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_telefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_telefonoMovil))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_cargo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_sueldoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_sueldoMensual))
                            .addGap(55, 55, 55))
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addComponent(cb_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_estados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cb_municipios, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cb_parroquias, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_datosLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_datosLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(btn_cargarImagen)))
                            .addGap(39, 39, 39)))))
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(31, 31, 31))
    );

    lbl_tituloModificarEmpleados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lbl_tituloModificarEmpleados.setText("Modificar Empleado");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_tituloModificarEmpleados)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(56, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(lbl_tituloModificarEmpleados)
            .addGap(18, 18, 18)
            .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(66, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarImagenActionPerformed
        FileFilter filtroImagenes = new FileNameExtensionFilter("Archivos de imagen", ImageIO.getReaderFileSuffixes());
        JFileChooser exploradorArchivos = new JFileChooser();
        exploradorArchivos.setAcceptAllFileFilterUsed(false);
        exploradorArchivos.addChoosableFileFilter(filtroImagenes);
        int opcionElegida = exploradorArchivos.showOpenDialog(null);
        if (opcionElegida == JFileChooser.APPROVE_OPTION)
        {
            archivoSeleccionado = exploradorArchivos.getSelectedFile();
            ImageIcon imagenEmpleado;
            imagenEmpleado = new ImageIcon(archivoSeleccionado.getAbsoluteFile().getAbsolutePath());
            lbl_foto.setIcon(imagenEmpleado);
        }
    }//GEN-LAST:event_btn_cargarImagenActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_primerNombre.setText("");
        txt_primerApellido.setText("");
        txt_segundoNombre.setText("");
        txt_segundoApellido.setText("");
        txt_telefonoCasa.setText("");
        txt_telefonoMovil.setText("");
        txt_cargo.setText("");
        txt_sueldoMensual.setText("");
        dc_fechaIngreso.setCurrent(null);
        dc_fechaNac.setCurrent(null);
        cb_banco.setSelectedItem(null);  
        cb_municipios.removeAllItems();
        cb_parroquias.removeAllItems();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        Object objeto = cb_estados.getSelectedItem();
        Object objeto1 = cb_municipios.getSelectedItem();
        Object objeto2 = cb_parroquias.getSelectedItem();
        if((!txt_primerNombre.getText().equals("")) && (!txt_segundoNombre.getText().equals("")) 
                && (!txt_primerApellido.getText().equals("")) && (!txt_segundoApellido.getText().equals("")) && (!txt_sueldoMensual.getText().equals("")) 
                && (!dc_fechaIngreso.getText().equals("")) && (!dc_fechaNac.getText().equals("")) && (!txt_telefonoCasa.getText().equals("")) 
                && (!txt_telefonoMovil.getText().equals("")) && (!txt_cargo.getText().equals("")) && (cb_estados.getSelectedItem() != null) 
                && (cb_municipios.getSelectedItem() != null) && (cb_parroquias.getSelectedItem() != null) && (archivoSeleccionado != null)) {
            
            try {
                Lugar estadoSeleccionado = (Lugar) cb_estados.getSelectedItem();
                Lugar municipioSeleccionado = (Lugar) cb_municipios.getSelectedItem();
                Lugar parroquiaSeleccionada = (Lugar) cb_parroquias.getSelectedItem();
                SimpleDateFormat parseFecha = new SimpleDateFormat("dd/MM/yy");
                Date fechaIngreso = parseFecha.parse(dc_fechaIngreso.getText());
                Date fechaNacimiento = parseFecha.parse(dc_fechaNac.getText());
                ManejadorImagen img = new ManejadorImagen();
                empleadoModificar = new Empleado(empleadoModificar.getCedula(), txt_primerNombre.getText(), txt_segundoNombre.getText(), 
                                                          txt_primerApellido.getText(), txt_segundoApellido.getText(), (String) cb_banco.getSelectedItem(),  
                                                          (Integer.parseInt(txt_sueldoMensual.getText())), fechaIngreso, fechaNacimiento,
                                                          txt_telefonoCasa.getText(), txt_telefonoMovil.getText(), txt_cargo.getText(), null, 
                                                          "", "", estadoSeleccionado.getNombre(), municipioSeleccionado.getNombre(), parroquiaSeleccionada.getNombre());
                ComunicacionREST comRest = new ComunicacionREST();
                Empleado empleadoRegistrado = comRest.modificarEmpleado(empleadoModificar);
                if (empleadoRegistrado.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Se modificó exitosamente el empleado", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se ha podido modificar el empleado, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(ModificarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Existen campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_primerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primerApellidoKeyTyped
        keyTypedSoloLetras(evt, txt_primerApellido, 30); 
    }//GEN-LAST:event_txt_primerApellidoKeyTyped

    private void txt_primerNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primerNombreKeyTyped
        keyTypedSoloLetras(evt, txt_primerNombre, 30);
    }//GEN-LAST:event_txt_primerNombreKeyTyped

    private void txt_segundoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundoNombreKeyTyped
        keyTypedSoloLetras(evt, txt_segundoNombre, 30); 
    }//GEN-LAST:event_txt_segundoNombreKeyTyped

    private void txt_telefonoCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoCasaKeyTyped
        keyTypedSoloNumeros(evt, txt_telefonoCasa, 11);
    }//GEN-LAST:event_txt_telefonoCasaKeyTyped

    private void txt_telefonoMovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoMovilKeyTyped
        keyTypedSoloNumeros(evt, txt_telefonoMovil, 11);
    }//GEN-LAST:event_txt_telefonoMovilKeyTyped

    private void txt_cargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cargoKeyTyped
        keyTypedSoloLetras(evt, txt_cargo, 30); 
    }//GEN-LAST:event_txt_cargoKeyTyped

    private void txt_sueldoMensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sueldoMensualKeyTyped
        keyTypedSoloNumeros(evt, txt_sueldoMensual, 5); 
    }//GEN-LAST:event_txt_sueldoMensualKeyTyped

    private void txt_segundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundoApellidoKeyTyped
        keyTypedSoloLetras(evt, txt_segundoApellido, 30); 
    }//GEN-LAST:event_txt_segundoApellidoKeyTyped



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargarImagen;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox cb_banco;
    private javax.swing.JComboBox cb_estados;
    private javax.swing.JComboBox cb_listaEmpleados;
    private javax.swing.JComboBox cb_municipios;
    private javax.swing.JComboBox cb_parroquias;
    private datechooser.beans.DateChooserCombo dc_fechaIngreso;
    private datechooser.beans.DateChooserCombo dc_fechaNac;
    private javax.swing.JLabel lbl_banco;
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_fechaIngreso;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_municipio;
    private javax.swing.JLabel lbl_parroquia;
    private javax.swing.JLabel lbl_primerApellido;
    private javax.swing.JLabel lbl_primerNombre;
    private javax.swing.JLabel lbl_segundoApellido;
    private javax.swing.JLabel lbl_segundoNombre;
    private javax.swing.JLabel lbl_sueldoMensual;
    private javax.swing.JLabel lbl_telefonoCasa;
    private javax.swing.JLabel lbl_telefonoMovil;
    private javax.swing.JLabel lbl_tituloModificar;
    private javax.swing.JLabel lbl_tituloModificarEmpleados;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_primerApellido;
    private javax.swing.JTextField txt_primerNombre;
    private javax.swing.JTextField txt_segundoApellido;
    private javax.swing.JTextField txt_segundoNombre;
    private javax.swing.JTextField txt_sueldoMensual;
    private javax.swing.JTextField txt_telefonoCasa;
    private javax.swing.JTextField txt_telefonoMovil;
    // End of variables declaration//GEN-END:variables

}
