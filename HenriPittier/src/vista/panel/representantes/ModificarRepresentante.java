/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.representantes;

import comun.Lugar;
import comun.Representante;
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


public class ModificarRepresentante extends javax.swing.JPanel {
    private File archivoSeleccionado;
    private Representante representanteModificar;
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

    
    public ModificarRepresentante() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
           
            listaEstados = comRest.consultarEstados();
            ArrayList<Representante> listaRepresentantes = comRest.consultarRepresentantes();
            
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
                        Logger.getLogger(ModificarRepresentante.class.getName()).log(Level.SEVERE, null, ex);
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
                        Logger.getLogger(ModificarRepresentante.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            for (Representante representante : listaRepresentantes) {
                cb_listaRepresentantes.addItem(representante);
            }
            cb_listaRepresentantes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Representante representanteSeleccionado = (Representante) cb_listaRepresentantes.getSelectedItem();
                        representanteModificar = representanteSeleccionado;
                        
                        txt_primerNombre.setText(representanteModificar.getPrimerNombre());
                        txt_segundoNombre.setText(representanteModificar.getSegundoNombre());
                        txt_primerApellido.setText(representanteModificar.getPrimerApellido());
                        txt_segundoApellido.setText(representanteModificar.getSegundoApellido());
                        txt_telefonoCasa.setText(representanteModificar.getTelefonoCasa());
                        txt_telefonoMovil.setText(representanteModificar.getTelefonoMovil());
                        Calendar calNac = Calendar.getInstance();
                        calNac.setTime(representanteModificar.getFechaNac());
                        dc_fechaNac.setSelectedDate(calNac);
                        cb_tipo.setSelectedItem(representanteModificar.getTipo());
                        Lugar estadoEmpleado = buscarLugarPorNombre(listaEstados, representanteModificar.getEstado());
                        cb_estados.setSelectedItem(estadoEmpleado);
                        Lugar municipioEmpleado = buscarLugarPorNombre(listaMunicipios, representanteModificar.getMunicipio());
                        cb_municipios.setSelectedItem(municipioEmpleado);
                        Lugar parroquiaEmpleado = buscarLugarPorNombre(listaParroquias, representanteModificar.getParroquia());
                        cb_parroquias.setSelectedItem(parroquiaEmpleado);
                    } catch (Exception ex) {
                        Logger.getLogger(ModificarRepresentante.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
         
            
            
            
        } catch (Exception ex) {
             Logger.getLogger(ModificarRepresentante.class.getName()).log(Level.SEVERE, null, ex);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        lbl_primerNombre = new javax.swing.JLabel();
        txt_telefonoMovil = new javax.swing.JTextField();
        lbl_segundoNombre = new javax.swing.JLabel();
        txt_telefonoCasa = new javax.swing.JTextField();
        lbl_primerApellido = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();
        lbl_municipio = new javax.swing.JLabel();
        lbl_parroquia = new javax.swing.JLabel();
        btn_limnpiar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        dc_fechaNac = new datechooser.beans.DateChooserCombo();
        lbl_fechaNac = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox();
        lbl_tipo = new javax.swing.JLabel();
        cb_estados = new javax.swing.JComboBox();
        cb_municipios = new javax.swing.JComboBox();
        cb_parroquias = new javax.swing.JComboBox();
        lbl_foto = new javax.swing.JLabel();
        btn_cargarImagen = new javax.swing.JButton();
        cb_listaRepresentantes = new javax.swing.JComboBox();
        lbl_tituloModificar = new javax.swing.JLabel();
        lbl_tituloModificarRepresentantes = new javax.swing.JLabel();

        pnl_datos.setBackground(new java.awt.Color(204, 204, 204));
        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        btn_limnpiar.setBackground(new java.awt.Color(218, 87, 54));
        btn_limnpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_limnpiar.setText("Limpiar");
        btn_limnpiar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_limnpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limnpiarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(121, 213, 177));
        btn_modificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
    dc_fechaNac.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

    lbl_fechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_fechaNac.setText("Fecha de Nacimiento: ");

    cb_tipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    cb_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Representante", "Autorizado" }));

    lbl_tipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_tipo.setText("Tipo:");

    cb_estados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    cb_municipios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    cb_parroquias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    btn_cargarImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btn_cargarImagen.setText("Cargar imagen");
    btn_cargarImagen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_cargarImagenActionPerformed(evt);
        }
    });

    cb_listaRepresentantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    lbl_tituloModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_tituloModificar.setText("Representante a modificar:");

    javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
    pnl_datos.setLayout(pnl_datosLayout);
    pnl_datosLayout.setHorizontalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_segundoNombre)
                .addComponent(lbl_primerApellido)
                .addComponent(lbl_segundoApellido)
                .addComponent(lbl_primerNombre)
                .addComponent(lbl_telefonoCasa)
                .addComponent(lbl_tituloModificar)
                .addComponent(lbl_telefonoMovil))
            .addGap(35, 35, 35)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_telefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_primerApellido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_segundoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_telefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_primerNombre)
                    .addComponent(txt_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(cb_listaRepresentantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_cargarImagen))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_estado)
                                .addComponent(lbl_municipio)
                                .addComponent(lbl_parroquia))
                            .addGap(34, 34, 34)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_estados, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_municipios, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_parroquias, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lbl_direccion)
                        .addComponent(lbl_tipo)
                        .addComponent(lbl_fechaNac))))
            .addGap(0, 25, Short.MAX_VALUE))
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(305, 305, 305)
            .addComponent(btn_limnpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(cb_listaRepresentantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tituloModificar))
                .addComponent(lbl_fechaNac))
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(lbl_tipo)
                    .addGap(16, 16, 16)
                    .addComponent(lbl_direccion)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbl_municipio)
                    .addGap(18, 18, 18)
                    .addComponent(lbl_parroquia)
                    .addGap(157, 203, Short.MAX_VALUE))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
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
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btn_limnpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(31, 31, 31))
    );

    lbl_tituloModificarRepresentantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lbl_tituloModificarRepresentantes.setText("Modificar Representante");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(58, 58, 58)
            .addComponent(lbl_tituloModificarRepresentantes)
            .addContainerGap(724, Short.MAX_VALUE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(lbl_tituloModificarRepresentantes)
            .addContainerGap(595, Short.MAX_VALUE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE)))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_segundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundoApellidoKeyTyped
        keyTypedSoloLetras(evt, txt_segundoApellido, 30);
    }//GEN-LAST:event_txt_segundoApellidoKeyTyped

    private void txt_primerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primerApellidoKeyTyped
        keyTypedSoloLetras(evt, txt_primerApellido, 30);
    }//GEN-LAST:event_txt_primerApellidoKeyTyped

    private void txt_segundoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundoNombreKeyTyped
        keyTypedSoloLetras(evt, txt_segundoNombre, 30);
    }//GEN-LAST:event_txt_segundoNombreKeyTyped

    private void txt_primerNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primerNombreKeyTyped
        keyTypedSoloLetras(evt, txt_primerNombre, 30);
    }//GEN-LAST:event_txt_primerNombreKeyTyped

    private void txt_telefonoMovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoMovilKeyTyped
        keyTypedSoloNumeros(evt, txt_telefonoMovil, 11);
    }//GEN-LAST:event_txt_telefonoMovilKeyTyped

    private void txt_telefonoCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoCasaKeyTyped
        keyTypedSoloNumeros(evt, txt_telefonoCasa, 11);
    }//GEN-LAST:event_txt_telefonoCasaKeyTyped

    private void btn_limnpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limnpiarActionPerformed
        txt_primerNombre.setText("");
        txt_primerApellido.setText("");
        txt_segundoNombre.setText("");
        txt_segundoApellido.setText("");
        txt_telefonoCasa.setText("");
        txt_telefonoMovil.setText("");
        dc_fechaNac.setCurrent(null);
        cb_tipo.setSelectedItem(null);
        cb_estados.setSelectedIndex(0);
        cb_municipios.removeAllItems();
        cb_parroquias.removeAllItems();
        /*cb_estados.setSelectedItem(null);
        cb_municipios.setSelectedItem(null);
        cb_parroquias.setSelectedItem(null);*/
    }//GEN-LAST:event_btn_limnpiarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        Object objeto = cb_estados.getSelectedItem();
        Object objeto1 = cb_municipios.getSelectedItem();
        Object objeto2 = cb_parroquias.getSelectedItem();
        if((!txt_primerNombre.getText().equals("")) && (!txt_segundoNombre.getText().equals(""))
            && (!txt_primerApellido.getText().equals("")) && (!txt_segundoApellido.getText().equals(""))
            && (!dc_fechaNac.getText().equals("")) && (!txt_telefonoCasa.getText().equals(""))
            && (!txt_telefonoMovil.getText().equals("")) && (cb_estados.getSelectedItem() != null) && (cb_tipo.getSelectedItem() != null)
            && (cb_municipios.getSelectedItem() != null) && (cb_parroquias.getSelectedItem() != null) && (archivoSeleccionado != null)) {

            try {
                Lugar estadoSeleccionado = (Lugar) cb_estados.getSelectedItem();
                Lugar municipioSeleccionado = (Lugar) cb_municipios.getSelectedItem();
                Lugar parroquiaSeleccionada = (Lugar) cb_parroquias.getSelectedItem();
                SimpleDateFormat parseFecha = new SimpleDateFormat("dd/MM/yy");
                Date fechaNacimiento = parseFecha.parse(dc_fechaNac.getText());
                ManejadorImagen img = new ManejadorImagen();
                
                representanteModificar = new Representante(representanteModificar.getCedula(), txt_primerNombre.getText(),
                    txt_segundoNombre.getText(), txt_primerApellido.getText(), txt_segundoApellido.getText(), fechaNacimiento,
                    txt_telefonoCasa.getText(), txt_telefonoMovil.getText(), (String) cb_tipo.getSelectedItem(), "Foto",
                    estadoSeleccionado.getNombre(), municipioSeleccionado.getNombre(), parroquiaSeleccionada.getNombre());
                
                ComunicacionREST comRest = new ComunicacionREST();
                Representante representanteModificado = comRest.modificarRepresentante(representanteModificar);
                if (representanteModificado.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Se modificó exitosamente el representante", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se ha podido modificar el representante, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(ModificarRepresentante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Existen campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargarImagen;
    private javax.swing.JButton btn_limnpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox cb_estados;
    private javax.swing.JComboBox cb_listaRepresentantes;
    private javax.swing.JComboBox cb_municipios;
    private javax.swing.JComboBox cb_parroquias;
    private javax.swing.JComboBox cb_tipo;
    private datechooser.beans.DateChooserCombo dc_fechaNac;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_municipio;
    private javax.swing.JLabel lbl_parroquia;
    private javax.swing.JLabel lbl_primerApellido;
    private javax.swing.JLabel lbl_primerNombre;
    private javax.swing.JLabel lbl_segundoApellido;
    private javax.swing.JLabel lbl_segundoNombre;
    private javax.swing.JLabel lbl_telefonoCasa;
    private javax.swing.JLabel lbl_telefonoMovil;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_tituloModificar;
    private javax.swing.JLabel lbl_tituloModificarRepresentantes;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTextField txt_primerApellido;
    private javax.swing.JTextField txt_primerNombre;
    private javax.swing.JTextField txt_segundoApellido;
    private javax.swing.JTextField txt_segundoNombre;
    private javax.swing.JTextField txt_telefonoCasa;
    private javax.swing.JTextField txt_telefonoMovil;
    // End of variables declaration//GEN-END:variables
}
