/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.representantes;

import comun.Mensualidad_Representante;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.ComunicacionREST;
import modelo.Registry;

/**
 *
 * @author Ronald
 */
public class ConsultarMensualidad extends javax.swing.JPanel {

    Mensualidad_Representante mensualidadConsultar;
    DefaultTableModel model;
    /**
     * Creates new form ConsultarMensualidad
     */
    public ConsultarMensualidad() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            ArrayList<Mensualidad_Representante> listaMensualidad = comRest.consultarMensualidad();
            
            model = (DefaultTableModel) tb_consultarMensualidades.getModel();
            
            for (Mensualidad_Representante mensualidad : listaMensualidad) {
                model.addRow(new Object[] {mensualidad.getCodigo(), mensualidad.getCodigoTransferencia(), mensualidad.getCedulaRepresentante(), mensualidad.getCedulaEstudiante()});
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(ConsultarMensualidad.class.getName()).log(Level.SEVERE, null, ex);
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

        lbl_tituloborrarMensualidad = new javax.swing.JLabel();
        pnl_datos = new javax.swing.JPanel();
        sp_representantes = new javax.swing.JScrollPane();
        tb_consultarMensualidades = new javax.swing.JTable();
        lbl_fechaNac = new javax.swing.JLabel();
        lbl_telefonoCasa = new javax.swing.JLabel();
        lbl_telefonoMovil = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        txt_banco = new javax.swing.JTextField();
        lbl_tipo = new javax.swing.JLabel();
        lbl_nombreRepresentante = new javax.swing.JLabel();
        txt_datosPago = new javax.swing.JTextField();
        txt_nombreRepresentante = new javax.swing.JTextField();
        lbl_municipio = new javax.swing.JLabel();
        txt_apellidoRepresentante = new javax.swing.JTextField();
        lbl_nombreEstudiante = new javax.swing.JLabel();
        txt_nombreEstudiante = new javax.swing.JTextField();
        txt_fechaPago = new javax.swing.JTextField();
        txt_apellidoEstudiante = new javax.swing.JTextField();
        lbl_apellidoEstudiante = new javax.swing.JLabel();

        lbl_tituloborrarMensualidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloborrarMensualidad.setText("Consultar Registros de Mensualidad");

        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        tb_consultarMensualidades.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_consultarMensualidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Numero de Transferencia", "Cedula Representante", "Cedula Estudiante "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_consultarMensualidades.setUpdateSelectionOnSort(false);
        tb_consultarMensualidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_consultarMensualidadesMouseClicked(evt);
            }
        });
        sp_representantes.setViewportView(tb_consultarMensualidades);

        lbl_fechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fechaNac.setText("Fecha de Pago:");

        lbl_telefonoCasa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoCasa.setText("Monto:");

        lbl_telefonoMovil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoMovil.setText("Banco:");

        txt_monto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_monto.setEnabled(false);

        txt_banco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_banco.setEnabled(false);

        lbl_tipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tipo.setText("Datos del Pago:");

        lbl_nombreRepresentante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_nombreRepresentante.setText("Nombre Representante");

        txt_datosPago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_datosPago.setEnabled(false);

        txt_nombreRepresentante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nombreRepresentante.setEnabled(false);

        lbl_municipio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_municipio.setText("Apellido Representante");

        txt_apellidoRepresentante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_apellidoRepresentante.setEnabled(false);

        lbl_nombreEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_nombreEstudiante.setText("Nombre Estudiante:");

        txt_nombreEstudiante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nombreEstudiante.setEnabled(false);

        txt_fechaPago.setEditable(false);
        txt_fechaPago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_fechaPago.setEnabled(false);

        txt_apellidoEstudiante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_apellidoEstudiante.setEnabled(false);

        lbl_apellidoEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_apellidoEstudiante.setText("Apellido Estudiante:");

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addComponent(sp_representantes, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_telefonoCasa)
                            .addComponent(lbl_fechaNac)
                            .addComponent(lbl_telefonoMovil)
                            .addComponent(lbl_tipo))
                        .addGap(45, 45, 45)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_datosPago, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_nombreRepresentante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_municipio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_nombreEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbl_apellidoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombreRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellidoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(sp_representantes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_fechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nombreRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_nombreRepresentante)))
                .addGap(18, 18, 18)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefonoCasa)
                    .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_municipio)
                    .addComponent(txt_apellidoRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefonoMovil)
                    .addComponent(lbl_nombreEstudiante)
                    .addComponent(txt_nombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo)
                    .addComponent(txt_datosPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellidoEstudiante))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tituloborrarMensualidad))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_tituloborrarMensualidad)
                .addGap(18, 18, 18)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_consultarMensualidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_consultarMensualidadesMouseClicked
        int index = tb_consultarMensualidades.getSelectedRow();
        
         String cedula = model.getValueAt(index, 0).toString();
         ComunicacionREST comRest = new ComunicacionREST();
         Mensualidad_Representante _mensualidad = new Mensualidad_Representante(cedula);
         
         try {
              mensualidadConsultar = comRest.consultarMensualidadDetalle(_mensualidad);
        } catch (Exception ex) {
            Logger.getLogger(ConsultarMensualidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         if (mensualidadConsultar.getError() == Registry.RESULTADO_CODIGO_BIEN){
            
            String monto = Integer.toString(mensualidadConsultar.getMonto());
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
            String fechaPago = dateFormat.format(mensualidadConsultar.getFechapago());
            
            txt_fechaPago.setText(fechaPago);
            txt_monto.setText(monto);
            txt_banco.setText(mensualidadConsultar.getBanco());
            txt_datosPago.setText(mensualidadConsultar.getDatosPago());
            txt_nombreRepresentante.setText(mensualidadConsultar.getPrimerNombre_rep());
            txt_apellidoRepresentante.setText(mensualidadConsultar.getPrimerApellido_rep());
            txt_nombreEstudiante.setText(mensualidadConsultar.getPrimerNombre_est());
            txt_apellidoEstudiante.setText(mensualidadConsultar.getPrimerApellido_est());
            
         }
        
    }//GEN-LAST:event_tb_consultarMensualidadesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_apellidoEstudiante;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_municipio;
    private javax.swing.JLabel lbl_nombreEstudiante;
    private javax.swing.JLabel lbl_nombreRepresentante;
    private javax.swing.JLabel lbl_telefonoCasa;
    private javax.swing.JLabel lbl_telefonoMovil;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_tituloborrarMensualidad;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JScrollPane sp_representantes;
    private javax.swing.JTable tb_consultarMensualidades;
    private javax.swing.JTextField txt_apellidoEstudiante;
    private javax.swing.JTextField txt_apellidoRepresentante;
    private javax.swing.JTextField txt_banco;
    private javax.swing.JTextField txt_datosPago;
    private javax.swing.JTextField txt_fechaPago;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_nombreEstudiante;
    private javax.swing.JTextField txt_nombreRepresentante;
    // End of variables declaration//GEN-END:variables
}
