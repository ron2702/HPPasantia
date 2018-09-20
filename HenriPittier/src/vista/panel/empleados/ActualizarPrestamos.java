/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.empleados;

import comun.Empleado;
import comun.Prestamo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.ComunicacionREST;
import modelo.Registry;


public class ActualizarPrestamos extends javax.swing.JPanel {
    private Empleado empleadoSeleccionado;
    
    private Prestamo registrarPrestamo(int signo) throws Exception{
        try {
            int monto = Integer.parseInt(txt_montoNuevo.getText());
            monto = monto * signo;
            Date fechaActual = new Date();
            int cedulaEmpleado = empleadoSeleccionado.getCedula();
            ComunicacionREST com = new ComunicacionREST();
            Prestamo prestamoRegistrar = new Prestamo(fechaActual, monto, cedulaEmpleado);
            return com.registrarPrestamo(prestamoRegistrar);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void keyTypedSoloNumeros(java.awt.event.KeyEvent evt, JTextField campoEvaluar, int tamanoMax){
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE) || (campoEvaluar.getText().length() == tamanoMax)) {
            evt.consume();
        }
    }
     
    public ActualizarPrestamos() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            
            ArrayList<Empleado> listaEmpleados = comRest.consultarEmpleados();
            
            for (Empleado empleado : listaEmpleados) {
                    cb_listaEmpleados.addItem(empleado);
                }
            
            cb_listaEmpleados.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        empleadoSeleccionado = (Empleado) cb_listaEmpleados.getSelectedItem();
                        ComunicacionREST con = new ComunicacionREST();
                        Prestamo p = new Prestamo(empleadoSeleccionado.getCedula());
                        ArrayList<Prestamo> listaPrestamos = con.consultarPrestamoDetalle(p);
                        int montoPrestamos = 0;
                        DefaultTableModel model = (DefaultTableModel) tb_historicoPrestamos.getModel();
                        int filasTabla = model.getRowCount();
                        //Elimina los datos de la tabla
                        for (int i = filasTabla - 1; i >= 0; i--) {
                            model.removeRow(i);
                        }
                        for(Prestamo prestamo : listaPrestamos){
                            montoPrestamos += prestamo.getMonto();
                            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
 
                            //to convert Date to String, use format method of SimpleDateFormat class.
                            String fecPrestamo = dateFormat.format(prestamo.getFechaPrestamo());
                            model.addRow(new Object[] {fecPrestamo, prestamo.getMonto()});
                        }
                        txt_montoActual.setText(String.valueOf(montoPrestamos));
                    } catch (Exception ex) {
                        Logger.getLogger(ActualizarPrestamos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                }
               
            });
            
        } catch (Exception ex) {
            Logger.getLogger(ActualizarPrestamos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_datos = new javax.swing.JPanel();
        sp_empleados = new javax.swing.JScrollPane();
        tb_historicoPrestamos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        cb_listaEmpleados = new javax.swing.JComboBox();
        lbl_empleadoPrestamo = new javax.swing.JLabel();
        txt_montoActual = new javax.swing.JTextField();
        lbl_prestamoActual = new javax.swing.JLabel();
        lbl_bsS = new javax.swing.JLabel();
        txt_montoNuevo = new javax.swing.JTextField();
        lbl_montoNuevo = new javax.swing.JLabel();
        btn_restar = new javax.swing.JButton();
        btn_sumar = new javax.swing.JButton();
        lbl_tituloPrestamos = new javax.swing.JLabel();

        pnl_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        tb_historicoPrestamos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_historicoPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha ", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sp_empleados.setViewportView(tb_historicoPrestamos);

        cb_listaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_empleadoPrestamo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_empleadoPrestamo.setText("Empleado a asignarle préstamo:");

        txt_montoActual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_montoActual.setEnabled(false);

        lbl_prestamoActual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_prestamoActual.setText("Préstamo Actual:");

        lbl_bsS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_bsS.setText("Bs. S");

        txt_montoNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_montoNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_montoNuevoKeyTyped(evt);
            }
        });

        lbl_montoNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_montoNuevo.setText("Monto para actualizar:");

        btn_restar.setBackground(new java.awt.Color(153, 0, 0));
        btn_restar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_restar.setForeground(new java.awt.Color(255, 255, 255));
        btn_restar.setText("Restar");
        btn_restar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restarActionPerformed(evt);
            }
        });

        btn_sumar.setBackground(new java.awt.Color(0, 153, 102));
        btn_sumar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_sumar.setForeground(new java.awt.Color(255, 255, 255));
        btn_sumar.setText("Sumar");
        btn_sumar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_empleadoPrestamo)
                            .addComponent(lbl_prestamoActual)
                            .addComponent(lbl_montoNuevo))
                        .addGap(27, 27, 27)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_datosLayout.createSequentialGroup()
                                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_montoNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txt_montoActual, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_bsS))))
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(btn_restar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sumar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(sp_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(sp_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 55, Short.MAX_VALUE))
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_empleadoPrestamo))
                .addGap(45, 45, 45)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_bsS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_montoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_prestamoActual)))
                .addGap(45, 45, 45)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_montoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_montoNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sumar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_restar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        lbl_tituloPrestamos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloPrestamos.setText("Actualizar Préstamos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tituloPrestamos)
                    .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_tituloPrestamos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_montoNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_montoNuevoKeyTyped
        keyTypedSoloNumeros(evt, txt_montoNuevo, 30);
    }//GEN-LAST:event_txt_montoNuevoKeyTyped

    private void btn_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restarActionPerformed
        try {
            if ((empleadoSeleccionado != null) && (!txt_montoNuevo.getText().equals(""))){
                int montoActual = Integer.parseInt(txt_montoActual.getText());
                int montoRestar = Integer.parseInt(txt_montoNuevo.getText());
                int resta = montoActual - montoRestar;
                if (resta >= 0){
                    Prestamo prestamoRegistrar = registrarPrestamo(-1);
                    if (prestamoRegistrar.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                            final JPanel panel = new JPanel();
                            JOptionPane.showMessageDialog(panel, "Se registró exitosamente el préstamo", "Información", JOptionPane.INFORMATION_MESSAGE);
                            DefaultTableModel model = (DefaultTableModel) tb_historicoPrestamos.getModel();
                            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

                            //to convert Date to String, use format method of SimpleDateFormat class.
                            String fecPrestamo = dateFormat.format(prestamoRegistrar.getFechaPrestamo());
                            
                            model.addRow(new Object[] {fecPrestamo, prestamoRegistrar.getMonto()});
                            String montoNuevo = String.valueOf(resta);
                            txt_montoActual.setText(montoNuevo);
                    }else{
                        final JPanel panel = new JPanel();
                        JOptionPane.showMessageDialog(panel, "No se ha podido registrar el préstamo, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se puede tener un saldo a favor del empleado", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Existen campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(ActualizarPrestamos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_restarActionPerformed

    private void btn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarActionPerformed
        try {
            if ((empleadoSeleccionado != null) && (!txt_montoNuevo.getText().equals(""))){
                Prestamo prestamoRegistrar = registrarPrestamo(1);
                if (prestamoRegistrar.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                        final JPanel panel = new JPanel();
                        JOptionPane.showMessageDialog(panel, "Se registró exitosamente el préstamo", "Información", JOptionPane.INFORMATION_MESSAGE);
                        DefaultTableModel model = (DefaultTableModel) tb_historicoPrestamos.getModel();
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
 
                        //to convert Date to String, use format method of SimpleDateFormat class.
                        String fecPrestamo = dateFormat.format(prestamoRegistrar.getFechaPrestamo());
                        model.addRow(new Object[] {fecPrestamo, prestamoRegistrar.getMonto()});
                        
                        int montoActual = Integer.parseInt(txt_montoActual.getText());
                        int montoRestar = Integer.parseInt(txt_montoNuevo.getText());
                        int suma = montoActual + montoRestar;
                        String montoNuevo = String.valueOf(suma);
                        txt_montoActual.setText(montoNuevo);
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se ha podido registrar el préstamo, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Existen campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(ActualizarPrestamos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_sumarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_restar;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JComboBox cb_listaEmpleados;
    private javax.swing.JLabel lbl_bsS;
    private javax.swing.JLabel lbl_empleadoPrestamo;
    private javax.swing.JLabel lbl_montoNuevo;
    private javax.swing.JLabel lbl_prestamoActual;
    private javax.swing.JLabel lbl_tituloPrestamos;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JScrollPane sp_empleados;
    private javax.swing.JTable tb_historicoPrestamos;
    private javax.swing.JTextField txt_montoActual;
    private javax.swing.JTextField txt_montoNuevo;
    // End of variables declaration//GEN-END:variables
}
