/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.empleados;

import comun.Empleado;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.ComunicacionREST;
import modelo.Registry;
import vista.panel.representantes.ConsultarRepresentantes;



public class ConsultarEmpleados extends javax.swing.JPanel {
    private Empleado empleadoConsultar;
    DefaultTableModel model;
  
    public ConsultarEmpleados() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            ArrayList<Empleado> listaEmpleados = comRest.consultarEmpleados();
            
            model = (DefaultTableModel) tb_consultarEmpleados.getModel();
            
            
            for (Empleado empleado : listaEmpleados) {
               model.addRow(new Object[] {empleado.getCedula(), empleado.getPrimerNombre(), empleado.getSegundoNombre(), empleado.getPrimerApellido(), empleado.getSegundoApellido()});
            }
            
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_datos = new javax.swing.JPanel();
        sp_empleados = new javax.swing.JScrollPane();
        tb_consultarEmpleados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        lbl_telefonoCasa = new javax.swing.JLabel();
        lbl_telefonoMovil = new javax.swing.JLabel();
        txt_telefonoCasa = new javax.swing.JTextField();
        txt_telefonoMovil = new javax.swing.JTextField();
        lbl_sueldoMensual = new javax.swing.JLabel();
        lbl_fechaNacimiento = new javax.swing.JLabel();
        txt_sueldoMensual = new javax.swing.JTextField();
        lbl_fechaIngreso = new javax.swing.JLabel();
        dc_fechaNac = new datechooser.beans.DateChooserCombo();
        dc_fechaIngreso = new datechooser.beans.DateChooserCombo();
        lbl_banco = new javax.swing.JLabel();
        txt_banco = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        lbl_municipio = new javax.swing.JLabel();
        txt_municipio = new javax.swing.JTextField();
        lbl_parroquia = new javax.swing.JLabel();
        txt_parroquia = new javax.swing.JTextField();
        lbl_cargo = new javax.swing.JLabel();
        txt_cargo = new javax.swing.JTextField();
        lbl_foto = new javax.swing.JLabel();
        lbl_fotoEmpleado = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        pnl_datos.setBackground(new java.awt.Color(204, 204, 204));
        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        tb_consultarEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_consultarEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Primer Nombre", "Segundo Nombre", "Primer Apellido", "Segundo Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_consultarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_consultarEmpleadosMouseClicked(evt);
            }
        });
        sp_empleados.setViewportView(tb_consultarEmpleados);

        lbl_telefonoCasa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoCasa.setText("Teléfono Casa:");

        lbl_telefonoMovil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoMovil.setText("Teléfono Móvil:");

        txt_telefonoCasa.setEditable(false);
        txt_telefonoCasa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_telefonoCasa.setEnabled(false);

        txt_telefonoMovil.setEditable(false);
        txt_telefonoMovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_telefonoMovil.setEnabled(false);

        lbl_sueldoMensual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_sueldoMensual.setText("Sueldo Mensual:");

        lbl_fechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fechaNacimiento.setText("Fecha de Nacimiento:");

        txt_sueldoMensual.setEditable(false);
        txt_sueldoMensual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_sueldoMensual.setEnabled(false);

        lbl_fechaIngreso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fechaIngreso.setText("Fecha de Ingreso:");

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
    dc_fechaNac.setEnabled(false);
    dc_fechaNac.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
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
dc_fechaIngreso.setEnabled(false);
dc_fechaIngreso.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
dc_fechaIngreso.setLocale(new java.util.Locale("es", "ES", ""));
dc_fechaIngreso.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

lbl_banco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
lbl_banco.setText("Banco:");

txt_banco.setEditable(false);
txt_banco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
txt_banco.setEnabled(false);

lbl_direccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
lbl_direccion.setText("Dirección de vivienda:");

lbl_estado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
lbl_estado.setText("Estado:");

txt_estado.setEditable(false);
txt_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
txt_estado.setEnabled(false);

lbl_municipio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
lbl_municipio.setText("Municipio:");

txt_municipio.setEditable(false);
txt_municipio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
txt_municipio.setEnabled(false);

lbl_parroquia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
lbl_parroquia.setText("Parroquia:");

txt_parroquia.setEditable(false);
txt_parroquia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
txt_parroquia.setEnabled(false);

lbl_cargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
lbl_cargo.setText("Cargo:");

txt_cargo.setEditable(false);
txt_cargo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
txt_cargo.setEnabled(false);

lbl_foto.setBackground(new java.awt.Color(255, 255, 255));
lbl_foto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
lbl_foto.setForeground(new java.awt.Color(255, 255, 255));
lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

lbl_fotoEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
lbl_fotoEmpleado.setText("Foto del Empleado:");

javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
pnl_datos.setLayout(pnl_datosLayout);
pnl_datosLayout.setHorizontalGroup(
    pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(pnl_datosLayout.createSequentialGroup()
        .addGap(45, 45, 45)
        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addComponent(sp_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbl_fotoEmpleado)))
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_telefonoCasa)
                    .addComponent(lbl_telefonoMovil)
                    .addComponent(lbl_sueldoMensual)
                    .addComponent(lbl_fechaNacimiento)
                    .addComponent(lbl_fechaIngreso))
                .addGap(41, 41, 41)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_telefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sueldoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dc_fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_direccion)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_cargo)
                        .addComponent(lbl_banco))
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_parroquia)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_estado)
                                .addComponent(lbl_municipio)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_parroquia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))))
    );
    pnl_datosLayout.setVerticalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(sp_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl_fotoEmpleado)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)))
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_telefonoCasa)
                .addComponent(txt_telefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_cargo)
                .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, Short.MAX_VALUE)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_telefonoMovil)
                .addComponent(txt_telefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_banco)
                .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_sueldoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_sueldoMensual))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dc_fechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(lbl_fechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dc_fechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addComponent(lbl_direccion)
                    .addGap(10, 10, 10)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_estado))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_municipio))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_parroquia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_parroquia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(43, 43, 43))
    );

    lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lbl_titulo.setText("Consultar Empleados");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_titulo)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(56, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(59, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_consultarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_consultarEmpleadosMouseClicked
        int index = tb_consultarEmpleados.getSelectedRow();
        
        String cedula = model.getValueAt(index, 0).toString();
        try{
            int cedulaEmpleado = Integer.parseInt(cedula);
            ComunicacionREST comRest = new ComunicacionREST();
            Empleado _empleado = new Empleado(cedulaEmpleado);

            empleadoConsultar = comRest.consultarEmpleadoDetalle(_empleado);

            if (empleadoConsultar.getError() == Registry.RESULTADO_CODIGO_BIEN){

                String sueldomen = String.valueOf(empleadoConsultar.getSueldoMensual());
                txt_telefonoCasa.setText(empleadoConsultar.getTelefonoCasa());
                txt_telefonoMovil.setText(empleadoConsultar.getTelefonoMovil());
                txt_sueldoMensual.setText(sueldomen);

                Calendar calNac = Calendar.getInstance();
                Calendar calIngreso = Calendar.getInstance();

                calNac.setTime(empleadoConsultar.getFechaNac());
                calIngreso.setTime(empleadoConsultar.getFechaNac());

                dc_fechaNac.setSelectedDate(calNac);
                dc_fechaIngreso.setSelectedDate(calNac);
                txt_cargo.setText(empleadoConsultar.getCargo());
                txt_banco.setText(empleadoConsultar.getBanco());
                txt_estado.setText(empleadoConsultar.getEstado());
                txt_municipio.setText(empleadoConsultar.getMunicipio());
                txt_parroquia.setText(empleadoConsultar.getParroquia());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tb_consultarEmpleadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dc_fechaIngreso;
    private datechooser.beans.DateChooserCombo dc_fechaNac;
    private javax.swing.JLabel lbl_banco;
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_fechaIngreso;
    private javax.swing.JLabel lbl_fechaNacimiento;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_fotoEmpleado;
    private javax.swing.JLabel lbl_municipio;
    private javax.swing.JLabel lbl_parroquia;
    private javax.swing.JLabel lbl_sueldoMensual;
    private javax.swing.JLabel lbl_telefonoCasa;
    private javax.swing.JLabel lbl_telefonoMovil;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JScrollPane sp_empleados;
    private javax.swing.JTable tb_consultarEmpleados;
    private javax.swing.JTextField txt_banco;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_municipio;
    private javax.swing.JTextField txt_parroquia;
    private javax.swing.JTextField txt_sueldoMensual;
    private javax.swing.JTextField txt_telefonoCasa;
    private javax.swing.JTextField txt_telefonoMovil;
    // End of variables declaration//GEN-END:variables
}
