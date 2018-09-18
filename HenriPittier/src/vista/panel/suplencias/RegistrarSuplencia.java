/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.suplencias;

import comun.Empleado;
import comun.Suplencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.ComunicacionREST;
import modelo.Registry;
import vista.panel.empleados.RegistrarEmpleado;


public class RegistrarSuplencia extends javax.swing.JPanel {
    private Empleado empleadoRegistrarSuplencia;
    
    
    public RegistrarSuplencia() {
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
                        Empleado empleadoSeleccionado = (Empleado) cb_listaEmpleados.getSelectedItem();
                        empleadoRegistrarSuplencia = empleadoSeleccionado;
                        
                    } catch (Exception ex) {
                        Logger.getLogger(RegistrarSuplencia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
        } catch (Exception ex) {
            Logger.getLogger(RegistrarSuplencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_datos = new javax.swing.JPanel();
        lbl_empleadoSuplencia = new javax.swing.JLabel();
        cb_listaEmpleados = new javax.swing.JComboBox();
        lbl_cantSuplencias = new javax.swing.JLabel();
        lbl_mesSuplencias = new javax.swing.JLabel();
        cb_meses = new javax.swing.JComboBox();
        cb_cantSuplencias = new javax.swing.JComboBox();
        btn_registrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        lbl_anoSuplencias = new javax.swing.JLabel();
        cb_anos = new javax.swing.JComboBox();
        lbl_tituloRegistrarSuplencia = new javax.swing.JLabel();

        pnl_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        lbl_empleadoSuplencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_empleadoSuplencia.setText("Nombre del empleado:");

        cb_listaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_cantSuplencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cantSuplencias.setText("Cantidad de suplencias:");

        lbl_mesSuplencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_mesSuplencias.setText("Mes de las suplencias:");

        cb_meses.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_meses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cb_cantSuplencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_cantSuplencias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb_cantSuplencias.setPreferredSize(new java.awt.Dimension(40, 19));

        btn_registrar.setBackground(new java.awt.Color(0, 153, 102));
        btn_registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

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

        lbl_anoSuplencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_anoSuplencias.setText("Año de las suplencias:");

        cb_anos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_anos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_mesSuplencias)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_empleadoSuplencia)
                            .addComponent(lbl_cantSuplencias)
                            .addComponent(lbl_anoSuplencias))
                        .addGap(35, 35, 35)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cb_cantSuplencias, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_anos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_empleadoSuplencia)
                    .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_mesSuplencias)
                    .addComponent(cb_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_anoSuplencias)
                    .addComponent(cb_anos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantSuplencias, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_cantSuplencias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        lbl_tituloRegistrarSuplencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloRegistrarSuplencia.setText("Registrar Suplencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tituloRegistrarSuplencia)
                    .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_tituloRegistrarSuplencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        try {
            Empleado empleadoSeleccionado = (Empleado) cb_listaEmpleados.getSelectedItem();
            String anoSeleccionado = (String) cb_anos.getSelectedItem();
            String diasSeleccionados = (String) cb_cantSuplencias.getSelectedItem();
            String mesSeleccionado = (String) cb_meses.getSelectedItem();
            Suplencia nuevaSuplencia = new Suplencia(empleadoSeleccionado.getCedula(), Integer.parseInt(diasSeleccionados), mesSeleccionado, Integer.parseInt(anoSeleccionado));
            ComunicacionREST com = new ComunicacionREST();
            Suplencia suplenciaRegistrada = com.registrarSuplencia(nuevaSuplencia);
            if (suplenciaRegistrada.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Se registró exitosamente la suplencia", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "No se ha podido registrar la suplencia, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(RegistrarSuplencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        cb_listaEmpleados.setSelectedIndex(0);  
        cb_meses.setSelectedIndex(0);
        cb_anos.setSelectedIndex(0);
        cb_cantSuplencias.setSelectedIndex(0);
    }//GEN-LAST:event_btn_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox cb_anos;
    private javax.swing.JComboBox cb_cantSuplencias;
    private javax.swing.JComboBox cb_listaEmpleados;
    private javax.swing.JComboBox cb_meses;
    private javax.swing.JLabel lbl_anoSuplencias;
    private javax.swing.JLabel lbl_cantSuplencias;
    private javax.swing.JLabel lbl_empleadoSuplencia;
    private javax.swing.JLabel lbl_mesSuplencias;
    private javax.swing.JLabel lbl_tituloRegistrarSuplencia;
    private javax.swing.JPanel pnl_datos;
    // End of variables declaration//GEN-END:variables
}
