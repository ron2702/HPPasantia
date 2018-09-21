/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.representantes;

import comun.Representante;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import modelo.ComunicacionREST;
import modelo.Registry;


public class ConsultarRepresentantes extends javax.swing.JPanel {
    private Representante representanteConsultar;
    DefaultTableModel model;
    
    public ConsultarRepresentantes() {
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
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_datos = new javax.swing.JPanel();
        sp_representantes = new javax.swing.JScrollPane();
        tb_consultarRepresentantes = new javax.swing.JTable();
        lbl_fechaNac = new javax.swing.JLabel();
        lbl_telefonoCasa = new javax.swing.JLabel();
        lbl_telefonoMovil = new javax.swing.JLabel();
        txt_telefonoCasa = new javax.swing.JTextField();
        txt_telefonoMovil = new javax.swing.JTextField();
        lbl_tipo = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        lbl_municipio = new javax.swing.JLabel();
        txt_municipio = new javax.swing.JTextField();
        lbl_parroquia = new javax.swing.JLabel();
        txt_parroquia = new javax.swing.JTextField();
        lbl_fotoRepresentantes = new javax.swing.JLabel();
        txt_fechaNac = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_foto = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();

        pnl_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        tb_consultarRepresentantes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        tb_consultarRepresentantes.setUpdateSelectionOnSort(false);
        tb_consultarRepresentantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_consultarRepresentantesMouseClicked(evt);
            }
        });
        sp_representantes.setViewportView(tb_consultarRepresentantes);

        lbl_fechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fechaNac.setText("Fecha de Nacimiento:");

        lbl_telefonoCasa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoCasa.setText("Telefono Casa:");

        lbl_telefonoMovil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoMovil.setText("Teléfono Móvil:");

        txt_telefonoCasa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_telefonoCasa.setEnabled(false);

        txt_telefonoMovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_telefonoMovil.setEnabled(false);

        lbl_tipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tipo.setText("Tipo:");

        lbl_estado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_estado.setText("Estado:");

        txt_tipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_tipo.setEnabled(false);

        txt_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_estado.setEnabled(false);

        lbl_municipio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_municipio.setText("Municipio:");

        txt_municipio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_municipio.setEnabled(false);

        lbl_parroquia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_parroquia.setText("Parroquia:");

        txt_parroquia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_parroquia.setEnabled(false);

        lbl_fotoRepresentantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fotoRepresentantes.setText("Foto del Representante:");

        txt_fechaNac.setEditable(false);
        txt_fechaNac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_fechaNac.setEnabled(false);

        lbl_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_email.setText("Email:");

        txt_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_email.setEnabled(false);

        lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_telefonoCasa)
                            .addComponent(lbl_fechaNac)
                            .addComponent(lbl_telefonoMovil)
                            .addComponent(lbl_tipo))
                        .addGap(45, 45, 45)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_datosLayout.createSequentialGroup()
                                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_estado)
                                    .addComponent(lbl_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_parroquia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_parroquia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 62, Short.MAX_VALUE))
                            .addGroup(pnl_datosLayout.createSequentialGroup()
                                .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 457, Short.MAX_VALUE))))
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_datosLayout.createSequentialGroup()
                                .addComponent(lbl_email)
                                .addGap(132, 132, 132)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_datosLayout.createSequentialGroup()
                                .addComponent(sp_representantes, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_fotoRepresentantes)
                                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 38, Short.MAX_VALUE))))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(sp_representantes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_fotoRepresentantes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_estado)))
                .addGap(18, 18, 18)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefonoCasa)
                    .addComponent(txt_telefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_municipio)
                    .addComponent(txt_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefonoMovil)
                    .addComponent(lbl_parroquia)
                    .addComponent(txt_parroquia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipo))
                .addGap(45, 45, 45))
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
                .addGap(26, 26, 26)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_consultarRepresentantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_consultarRepresentantesMouseClicked
        int index = tb_consultarRepresentantes.getSelectedRow();
        
        String cedula = model.getValueAt(index, 0).toString();
        int cedulaRepresentante = Integer.parseInt(cedula);
        ComunicacionREST comRest = new ComunicacionREST();
        Representante _representante = new Representante(cedulaRepresentante);
        
        try {
            representanteConsultar = comRest.consultarRepresentanteDetalle(_representante);
        } catch (Exception ex) {
            Logger.getLogger(ConsultarRepresentantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (representanteConsultar.getError() == Registry.RESULTADO_CODIGO_BIEN){
            
            /*Calendar calNac = Calendar.getInstance();
            calNac.setTime(representanteConsultar.getFechaNac());
            dc_fechaNac.setSelectedDate(calNac);*/
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
            String nacimiento = dateFormat.format(representanteConsultar.getFechaNac());
            txt_fechaNac.setText(nacimiento);
            txt_telefonoCasa.setText(representanteConsultar.getTelefonoCasa());
            txt_telefonoMovil.setText(representanteConsultar.getTelefonoMovil());
            txt_email.setText(representanteConsultar.getEmail());
            txt_tipo.setText(representanteConsultar.getTipo());
            txt_estado.setText(representanteConsultar.getEstado());
            txt_municipio.setText(representanteConsultar.getMunicipio());
            txt_parroquia.setText(representanteConsultar.getParroquia());
            if (!representanteConsultar.getFoto().equals("")){
                    ImageIcon imagenRepresentante;
                    imagenRepresentante = new ImageIcon(representanteConsultar.getFoto());
                    Image img = imagenRepresentante.getImage();
                    Image newimg = img.getScaledInstance(134, 134,  java.awt.Image.SCALE_SMOOTH);
                    ImageIcon newIcon = new ImageIcon(newimg);
                    lbl_foto.setIcon(newIcon);
                }
        }
    }//GEN-LAST:event_tb_consultarRepresentantesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_fotoRepresentantes;
    private javax.swing.JLabel lbl_municipio;
    private javax.swing.JLabel lbl_parroquia;
    private javax.swing.JLabel lbl_telefonoCasa;
    private javax.swing.JLabel lbl_telefonoMovil;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JScrollPane sp_representantes;
    private javax.swing.JTable tb_consultarRepresentantes;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_fechaNac;
    private javax.swing.JTextField txt_municipio;
    private javax.swing.JTextField txt_parroquia;
    private javax.swing.JTextField txt_telefonoCasa;
    private javax.swing.JTextField txt_telefonoMovil;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
