/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.representantes;

import comun.Representante;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import modelo.ComunicacionREST;

/**
 *
 * @author LuisAlejandro
 */
public class ConsultarRepresentantes extends javax.swing.JPanel {
    DefaultTableModel model;
    
    /**
     * Creates new form ConsultarRepresentantes
     */
    public ConsultarRepresentantes() {
        //initComponents();
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            ArrayList<Representante> listaRepresentantes = comRest.consultarRepresentantes();
            
            model = (DefaultTableModel) tb_consultarRepresentantes.getModel();
            
            
            for (Representante representante : listaRepresentantes) {
               model.addRow(new Object[] {representante.getCedula(), representante.getPrimerNombre(), representante.getSegundoNombre(), representante.getPrimerApellido(), representante.getSegundoApellido()});
            }
            
        } catch (Exception e) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_consultarRepresentantes = new javax.swing.JTable();
        lbl_titulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        pnl_datos.setBackground(new java.awt.Color(204, 204, 204));
        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        tb_consultarRepresentantes.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_consultarRepresentantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_consultarRepresentantesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_consultarRepresentantes);

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
        );

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulo.setText("Consultar Representantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_consultarRepresentantesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_consultarRepresentantesMousePressed
        int index = tb_consultarRepresentantes.getSelectedRow();
        
        String cedula = model.getValueAt(index, 0).toString();
        String primerNombre = model.getValueAt(index, 1).toString();
        String primerApellido = model.getValueAt(index, 2).toString();
        String segundoNombre = model.getValueAt(index, 3).toString();
        String segundoApellido = model.getValueAt(index, 4).toString();
        
        System.out.println(cedula + " " + primerNombre + " " + primerApellido + " " + segundoNombre + " " + segundoApellido);
    }//GEN-LAST:event_tb_consultarRepresentantesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTable tb_consultarRepresentantes;
    // End of variables declaration//GEN-END:variables
}
