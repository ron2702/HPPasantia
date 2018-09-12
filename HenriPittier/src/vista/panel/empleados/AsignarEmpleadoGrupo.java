/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.empleados;

import comun.Emp_Gru_Est;
import comun.Empleado;
import comun.Grupo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.ComunicacionREST;
import modelo.Registry;


public class AsignarEmpleadoGrupo extends javax.swing.JPanel {
    private Empleado empleadoAsignar;
    private Grupo grupoAsignar;
    
    
    public AsignarEmpleadoGrupo() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            
            ArrayList<Empleado> listaEmpleados = comRest.consultarEmpleados();
            ArrayList<Grupo> listaGrupos = comRest.consultarGrupos();
            
            for (Empleado empleado : listaEmpleados) {
                cb_listaEmpleados.addItem(empleado);
            }
            
            for (Grupo grupo : listaGrupos) {
                cb_listaGrupos.addItem(grupo);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(AsignarEmpleadoGrupo.class.getName()).log(Level.SEVERE, null, ex);
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
        lbl_tituloEmpleadoAsignar = new javax.swing.JLabel();
        cb_listaGrupos = new javax.swing.JComboBox();
        lbl_tituloGrupoAlumnos = new javax.swing.JLabel();
        cb_listaEmpleados = new javax.swing.JComboBox();
        btn_asignar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        pnl_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        lbl_tituloEmpleadoAsignar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tituloEmpleadoAsignar.setText("Empleado a asignar:");

        cb_listaGrupos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_tituloGrupoAlumnos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tituloGrupoAlumnos.setText("Grupo de alumnos:");

        cb_listaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_asignar.setBackground(new java.awt.Color(0, 153, 102));
        btn_asignar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_asignar.setForeground(new java.awt.Color(255, 255, 255));
        btn_asignar.setText("Asignar");
        btn_asignar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tituloEmpleadoAsignar)
                    .addComponent(lbl_tituloGrupoAlumnos))
                .addGap(38, 38, 38)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_listaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(btn_asignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lbl_tituloEmpleadoAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tituloGrupoAlumnos)
                    .addComponent(cb_listaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(btn_asignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Asignar Docente a un Grupo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarActionPerformed
        try {
            empleadoAsignar = (Empleado) cb_listaEmpleados.getSelectedItem();
            grupoAsignar = (Grupo) cb_listaGrupos.getSelectedItem();
            ComunicacionREST comRest = new ComunicacionREST();
            Emp_Gru_Est asignarPersonal = new Emp_Gru_Est(empleadoAsignar, grupoAsignar);
            asignarPersonal = comRest.asignarPersonal(asignarPersonal);
            
            if (asignarPersonal.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Se asignó exitosamente el empleado al grupo", "Información", JOptionPane.INFORMATION_MESSAGE);
            
            }else{
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "No se ha podido asignar el empleado al grupo, ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(AsignarEmpleadoGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_asignarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asignar;
    private javax.swing.JComboBox cb_listaEmpleados;
    private javax.swing.JComboBox cb_listaGrupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_tituloEmpleadoAsignar;
    private javax.swing.JLabel lbl_tituloGrupoAlumnos;
    private javax.swing.JPanel pnl_datos;
    // End of variables declaration//GEN-END:variables
}
