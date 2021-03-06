/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.empleados;

import comun.Emp_Gru_Est;
import comun.Empleado;
import comun.Grupo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.ComunicacionREST;
import modelo.Registry;



public class BorrarEmpleadoGrupo extends javax.swing.JPanel {
    private Empleado empleadoRemover;
    private Grupo grupoRemover;
    
    
    public BorrarEmpleadoGrupo() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            
            ArrayList<Empleado> listaEmpleados = comRest.consultarEmpleados();
            ArrayList<Grupo> listaGrupos = comRest.consultarGrupos();
            ArrayList<Empleado> listaCargoEmpleados = new ArrayList<Empleado>();
            
            for (Empleado empleado : listaEmpleados) {
                if ((empleado.getCargo().equals("Docente")) || (empleado.getCargo().equals("Auxiliar"))){
                    listaCargoEmpleados.add(empleado);
                }
            }
            for (Empleado empleado : listaCargoEmpleados) {
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
        lbl_tituloEmpleadoRemover = new javax.swing.JLabel();
        cb_listaEmpleados = new javax.swing.JComboBox();
        lbl_tituloGrupoAlumnos = new javax.swing.JLabel();
        cb_listaGrupos = new javax.swing.JComboBox();
        btn_remover = new javax.swing.JButton();
        lbl_tituloEliminarPersonal = new javax.swing.JLabel();

        pnl_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        lbl_tituloEmpleadoRemover.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tituloEmpleadoRemover.setText("Empleado a eliminar:");

        cb_listaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_tituloGrupoAlumnos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tituloGrupoAlumnos.setText("Grupo de alumnos:");

        cb_listaGrupos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_remover.setBackground(new java.awt.Color(0, 153, 102));
        btn_remover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_remover.setForeground(new java.awt.Color(255, 255, 255));
        btn_remover.setText("Remover");
        btn_remover.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tituloEmpleadoRemover)
                    .addComponent(lbl_tituloGrupoAlumnos))
                .addGap(38, 38, 38)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_listaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_listaEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lbl_tituloEmpleadoRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tituloGrupoAlumnos)
                    .addComponent(cb_listaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        lbl_tituloEliminarPersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloEliminarPersonal.setText("Eliminar Asignación de Empleado en un Grupo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tituloEliminarPersonal)
                    .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_tituloEliminarPersonal)
                .addGap(18, 18, 18)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        try {
            empleadoRemover = (Empleado) cb_listaEmpleados.getSelectedItem();
            grupoRemover = (Grupo) cb_listaGrupos.getSelectedItem();
            ComunicacionREST comRest = new ComunicacionREST();
            Emp_Gru_Est removerGrupo = new Emp_Gru_Est(empleadoRemover, grupoRemover);
            removerGrupo = comRest.removerPersonal(removerGrupo);

            if (removerGrupo.getError() == Registry.RESULTADO_CODIGO_BIEN){
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Se removió exitosamente el empleado", "Información", JOptionPane.INFORMATION_MESSAGE);

            }else{
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "No se ha podido remover el empleado de dicho grupo, ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            Logger.getLogger(AsignarEmpleadoGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_removerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_remover;
    private javax.swing.JComboBox cb_listaEmpleados;
    private javax.swing.JComboBox cb_listaGrupos;
    private javax.swing.JLabel lbl_tituloEliminarPersonal;
    private javax.swing.JLabel lbl_tituloEmpleadoRemover;
    private javax.swing.JLabel lbl_tituloGrupoAlumnos;
    private javax.swing.JPanel pnl_datos;
    // End of variables declaration//GEN-END:variables
}
