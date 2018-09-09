/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.estudiantes;

import comun.Estudiante;
import comun.Rep_Est;
import comun.Representante;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.ComunicacionREST;
import modelo.Registry;


public class ConsultarEstudiantes extends javax.swing.JPanel {
    private Estudiante estudianteConsultar;
    Representante representanteConsultado;
    DefaultTableModel model;
    
    
    
    public ConsultarEstudiantes() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            ArrayList<Estudiante> listaEstudiantes = comRest.consultarEstudiantes();
            
            model = (DefaultTableModel) tb_consultarEstudiantes.getModel();
            
            
            for (Estudiante estudiante : listaEstudiantes) {
               model.addRow(new Object[] {estudiante.getCedulaEscolar(), estudiante.getPrimerNombre(), estudiante.getSegundoNombre(), estudiante.getPrimerApellido(), estudiante.getSegundoApellido()});
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ConsultarEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
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
        sp_representantes = new javax.swing.JScrollPane();
        tb_consultarEstudiantes = new javax.swing.JTable();
        lbl_fechaNac = new javax.swing.JLabel();
        lbl_foto = new javax.swing.JLabel();
        lbl_fotoEstudiante = new javax.swing.JLabel();
        txt_fechaNac = new javax.swing.JTextField();
        lbl_cedulaMAPFRE = new javax.swing.JLabel();
        txt_cedulaMAPFRE = new javax.swing.JTextField();
        lbl_tituloEstudiantes = new javax.swing.JLabel();

        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        tb_consultarEstudiantes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_consultarEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_consultarEstudiantes.setUpdateSelectionOnSort(false);
        tb_consultarEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_consultarEstudiantesMouseClicked(evt);
            }
        });
        sp_representantes.setViewportView(tb_consultarEstudiantes);

        lbl_fechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fechaNac.setText("Fecha de Nacimiento:");

        lbl_foto.setBackground(new java.awt.Color(255, 255, 255));
        lbl_foto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_foto.setForeground(new java.awt.Color(255, 255, 255));
        lbl_foto.setIcon(new javax.swing.ImageIcon("C:\\Users\\LuisAlejandro\\Pictures\\Blanco.PNG")); // NOI18N
        lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_fotoEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fotoEstudiante.setText("Foto del Estudiante:");

        txt_fechaNac.setEditable(false);
        txt_fechaNac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_fechaNac.setEnabled(false);

        lbl_cedulaMAPFRE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cedulaMAPFRE.setText("Cedula MAPFRE:");

        txt_cedulaMAPFRE.setEditable(false);
        txt_cedulaMAPFRE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_cedulaMAPFRE.setEnabled(false);

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fechaNac)
                    .addComponent(lbl_cedulaMAPFRE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addComponent(txt_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(lbl_fotoEstudiante))
                    .addComponent(txt_cedulaMAPFRE, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(sp_representantes, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(sp_representantes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fotoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cedulaMAPFRE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cedulaMAPFRE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        lbl_tituloEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloEstudiantes.setText("Consultar Estudiantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tituloEstudiantes))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_tituloEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_consultarEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_consultarEstudiantesMouseClicked
        int index = 0;
        long cedulaEstudiante = 0;
        try {                                                     
            index = tb_consultarEstudiantes.getSelectedRow();
            
            String cedula = model.getValueAt(index, 0).toString();
            cedulaEstudiante = Long.parseLong(cedula);
            
            ComunicacionREST comRest = new ComunicacionREST();
         
            Estudiante _estudiante = new Estudiante(cedulaEstudiante);
            estudianteConsultar = comRest.consultarEstudianteDetalle(_estudiante);
            
            
            if (estudianteConsultar.getError() == Registry.RESULTADO_CODIGO_BIEN){
                
                
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
                String nacimiento = dateFormat.format(estudianteConsultar.getFechaNac());
                txt_fechaNac.setText(nacimiento);
                txt_cedulaMAPFRE.setText(estudianteConsultar.getCedulaMAPFRE());
            }
        } catch (Exception ex) {
            Logger.getLogger(ConsultarEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_consultarEstudiantesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_cedulaMAPFRE;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_fotoEstudiante;
    private javax.swing.JLabel lbl_tituloEstudiantes;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JScrollPane sp_representantes;
    private javax.swing.JTable tb_consultarEstudiantes;
    private javax.swing.JTextField txt_cedulaMAPFRE;
    private javax.swing.JTextField txt_fechaNac;
    // End of variables declaration//GEN-END:variables
}
