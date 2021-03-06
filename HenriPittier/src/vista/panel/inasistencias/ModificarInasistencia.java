/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.inasistencias;

import comun.Empleado;
import comun.Inasistencia;
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


public class ModificarInasistencia extends javax.swing.JPanel {

    /**
     * Creates new form ModificarInasistencia
     */
    public ModificarInasistencia() {
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
                        Inasistencia inasistenciaEmpleado = new Inasistencia();
                        Empleado empleadoSeleccionado = (Empleado) cb_listaEmpleados.getSelectedItem();
                        
                    } catch (Exception ex) {
                        Logger.getLogger(ModificarInasistencia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
        } catch (Exception ex) {
            Logger.getLogger(ModificarInasistencia.class.getName()).log(Level.SEVERE, null, ex);
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

        pnl_modificarInasistencia = new javax.swing.JPanel();
        lbl_empleadoSuplencia = new javax.swing.JLabel();
        cb_listaEmpleados = new javax.swing.JComboBox();
        lbl_mesSuplencias = new javax.swing.JLabel();
        cb_meses = new javax.swing.JComboBox();
        lbl_anoSuplencias = new javax.swing.JLabel();
        cb_anos = new javax.swing.JComboBox();
        lbl_cantInasistencias = new javax.swing.JLabel();
        cb_cantInasistencias = new javax.swing.JComboBox();
        btn_limpiar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        lbl_tituloModificarSuplencia = new javax.swing.JLabel();

        pnl_modificarInasistencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_empleadoSuplencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_empleadoSuplencia.setText("Nombre del empleado:");

        cb_listaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_mesSuplencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_mesSuplencias.setText("Mes de las inasistencias:");

        cb_meses.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_meses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        lbl_anoSuplencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_anoSuplencias.setText("Año de las inasistencias:");

        cb_anos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_anos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        lbl_cantInasistencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cantInasistencias.setText("Cantidad de inasistencias:");

        cb_cantInasistencias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_cantInasistencias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb_cantInasistencias.setPreferredSize(new java.awt.Dimension(40, 19));

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

        javax.swing.GroupLayout pnl_modificarInasistenciaLayout = new javax.swing.GroupLayout(pnl_modificarInasistencia);
        pnl_modificarInasistencia.setLayout(pnl_modificarInasistenciaLayout);
        pnl_modificarInasistenciaLayout.setHorizontalGroup(
            pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarInasistenciaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_mesSuplencias)
                    .addComponent(lbl_empleadoSuplencia)
                    .addComponent(lbl_anoSuplencias)
                    .addComponent(lbl_cantInasistencias))
                .addGap(26, 26, 26)
                .addGroup(pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_modificarInasistenciaLayout.createSequentialGroup()
                        .addGroup(pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_anos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_cantInasistencias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(564, 564, 564))
                    .addGroup(pnl_modificarInasistenciaLayout.createSequentialGroup()
                        .addGroup(pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnl_modificarInasistenciaLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_modificarInasistenciaLayout.setVerticalGroup(
            pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modificarInasistenciaLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_empleadoSuplencia)
                    .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_meses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mesSuplencias))
                .addGap(43, 43, 43)
                .addGroup(pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_anoSuplencias)
                    .addComponent(cb_anos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantInasistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_cantInasistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(pnl_modificarInasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        lbl_tituloModificarSuplencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloModificarSuplencia.setText("Modificar Inasistencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tituloModificarSuplencia)
                    .addComponent(pnl_modificarInasistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_tituloModificarSuplencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_modificarInasistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        cb_listaEmpleados.setSelectedIndex(0);
        cb_meses.setSelectedIndex(0);
        cb_anos.setSelectedIndex(0);
        cb_cantInasistencias.setSelectedIndex(0);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        try {
            Empleado empleadoSeleccionado = (Empleado) cb_listaEmpleados.getSelectedItem();
            String anoSeleccionado = (String) cb_anos.getSelectedItem();
            String diasSeleccionados = (String) cb_cantInasistencias.getSelectedItem();
            String mesSeleccionado = (String) cb_meses.getSelectedItem();
            Inasistencia nuevaInasistencia = new Inasistencia(empleadoSeleccionado.getCedula(), Integer.parseInt(diasSeleccionados), mesSeleccionado, Integer.parseInt(anoSeleccionado));
            ComunicacionREST com = new ComunicacionREST();
            
            Inasistencia inasistenciaModificada = com.modificarInasistencia(nuevaInasistencia);
            if (inasistenciaModificada.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Se modificó exitosamente la inasistencia", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "No se ha podido modificar la inasistencia, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(ModificarInasistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox cb_anos;
    private javax.swing.JComboBox cb_cantInasistencias;
    private javax.swing.JComboBox cb_listaEmpleados;
    private javax.swing.JComboBox cb_meses;
    private javax.swing.JLabel lbl_anoSuplencias;
    private javax.swing.JLabel lbl_cantInasistencias;
    private javax.swing.JLabel lbl_empleadoSuplencia;
    private javax.swing.JLabel lbl_mesSuplencias;
    private javax.swing.JLabel lbl_tituloModificarSuplencia;
    private javax.swing.JPanel pnl_modificarInasistencia;
    // End of variables declaration//GEN-END:variables
}
