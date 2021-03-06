/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.representantes;

import comun.Mensualidad_Representante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.ComunicacionREST;
import modelo.Registry;

/**
 *
 * @author Ronald
 */
public class BorrarMensualidad extends javax.swing.JPanel {
    
    Mensualidad_Representante mensualidadSeleccionada;
    Long CedulaEscolar;
    String ciEstudiante;
    String codigoMensualidad;
    /**
     * Creates new form BorrarMensualidad
     */
    public BorrarMensualidad() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            ArrayList<Mensualidad_Representante> listaMensualidad = comRest.consultarMensualidad();
            for (Mensualidad_Representante mensualidad : listaMensualidad) {
                cb_listaPagos.addItem(mensualidad);
            }
            cb_listaPagos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        mensualidadSeleccionada = (Mensualidad_Representante) cb_listaPagos.getSelectedItem();
                        String monto = Integer.toString(mensualidadSeleccionada.getMonto());
                        String cedulaRepresentante = Integer.toString(mensualidadSeleccionada.getCedulaRepresentante());
                        String cedulaEscolar = Long.toString(mensualidadSeleccionada.getCedulaEstudiante());
                        codigoMensualidad = mensualidadSeleccionada.getCodigo();
                        
                        txt_codigoTransferencia.setText(mensualidadSeleccionada.getCodigoTransferencia());
                        txt_monto.setText(monto);
                        cb_banco.setSelectedItem(mensualidadSeleccionada.getBanco());
                        Calendar calNac = Calendar.getInstance();
                        calNac.setTime(mensualidadSeleccionada.getFechapago());
                        dc_fechaPago.setSelectedDate(calNac);
                        txt_datosPago.setText(mensualidadSeleccionada.getDatosPago());
                        txt_cedulaRepresentante.setText(cedulaRepresentante);
                        txt_cedulaEstudiante.setText(cedulaEscolar);
                    } catch (Exception ex) {
                        Logger.getLogger(RegistrarMensualidad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            
        } catch (Exception ex) {
            Logger.getLogger(BorrarMensualidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void keyTypedSoloNumeros(java.awt.event.KeyEvent evt, JTextField campoEvaluar, int tamanoMax){
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE) || (campoEvaluar.getText().length() == tamanoMax)) {
            evt.consume();
        }
    }

    
    public void keyTypedSoloLetras(java.awt.event.KeyEvent evt, JTextField campoEvaluar, int tamanoMax){
        char vChar = evt.getKeyChar();
        
        if ((!(Character.isAlphabetic(vChar)) && (vChar != ' ')) || (campoEvaluar.getText().length() == tamanoMax)) {
            evt.consume();
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
        lbl_Monto = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        lbl_fechaNac = new javax.swing.JLabel();
        dc_fechaPago = new datechooser.beans.DateChooserCombo();
        btn_borrar = new javax.swing.JButton();
        lbl_cedulaRepresentante = new javax.swing.JLabel();
        txt_cedulaRepresentante = new javax.swing.JTextField();
        lbl_banco = new javax.swing.JLabel();
        cb_banco = new javax.swing.JComboBox();
        lbl_Monto1 = new javax.swing.JLabel();
        txt_codigoTransferencia = new javax.swing.JTextField();
        txt_datosPago = new javax.swing.JTextField();
        lbl_datosPago = new javax.swing.JLabel();
        lbl_listaPagos = new javax.swing.JLabel();
        cb_listaPagos = new javax.swing.JComboBox();
        lbl_cedulaEstudiante = new javax.swing.JLabel();
        txt_cedulaEstudiante = new javax.swing.JTextField();

        lbl_tituloborrarMensualidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloborrarMensualidad.setText("Borrar registro de Mensualidad");

        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        lbl_Monto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_Monto.setText("Monto:");

        txt_monto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_monto.setEnabled(false);
        txt_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_montoKeyTyped(evt);
            }
        });

        lbl_fechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fechaNac.setText("Fecha de Pago: ");

        dc_fechaPago.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
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
    dc_fechaPago.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dc_fechaPago.setCalendarPreferredSize(new java.awt.Dimension(400, 250));
    dc_fechaPago.setEnabled(false);
    dc_fechaPago.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
    dc_fechaPago.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

    btn_borrar.setBackground(new java.awt.Color(121, 213, 177));
    btn_borrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btn_borrar.setText("Borrar");
    btn_borrar.setPreferredSize(new java.awt.Dimension(109, 25));
    btn_borrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_borrarActionPerformed(evt);
        }
    });

    lbl_cedulaRepresentante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_cedulaRepresentante.setText("Cédula del Representante:");

    txt_cedulaRepresentante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_cedulaRepresentante.setToolTipText("");
    txt_cedulaRepresentante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    txt_cedulaRepresentante.setEnabled(false);
    txt_cedulaRepresentante.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_cedulaRepresentanteKeyTyped(evt);
        }
    });

    lbl_banco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_banco.setText("Banco:");

    cb_banco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100% Banco", "BBVA Banco Provincial", "Bancamiga", "Bancaribe", "Banco Activo", "Banco Agricola de Venezuela", "Banco Bicentenario del Pueblo", "Banco Caroni", "Banco del Tesoro", "Banco de Venezuela", "Banco Exterior", "Banco Mercantil", "Banco Plaza", "Banco Sofitasa", "Banco Venezolano de Credito", "Banesco", "Banfanb", "Banplus", "BFC Banco Fondo Comun", "BNC Banco Nacional de Credito", "BOD Banco Occidental de Descuento", "CitiBank", "DELSUR", "Mi Banco" }));
    cb_banco.setEnabled(false);

    lbl_Monto1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_Monto1.setText("Codigo Transferencia:");

    txt_codigoTransferencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_codigoTransferencia.setEnabled(false);
    txt_codigoTransferencia.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_codigoTransferenciaKeyTyped(evt);
        }
    });

    txt_datosPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_datosPago.setEnabled(false);
    txt_datosPago.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_datosPagoKeyTyped(evt);
        }
    });

    lbl_datosPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_datosPago.setText("Datos del Pago: ");

    lbl_listaPagos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_listaPagos.setText("Lista de Pagos:");

    cb_listaPagos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    lbl_cedulaEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_cedulaEstudiante.setText("Cédula del Estudiante:");

    txt_cedulaEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_cedulaEstudiante.setToolTipText("");
    txt_cedulaEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    txt_cedulaEstudiante.setEnabled(false);
    txt_cedulaEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_cedulaEstudianteKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
    pnl_datos.setLayout(pnl_datosLayout);
    pnl_datosLayout.setHorizontalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
            .addContainerGap(38, Short.MAX_VALUE)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_datosPago)
                                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_banco)
                                    .addComponent(lbl_fechaNac)
                                    .addComponent(lbl_Monto))))
                        .addComponent(lbl_Monto1))
                    .addGap(41, 41, 41)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dc_fechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_datosPago, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_codigoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(81, 81, 81)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_cedulaEstudiante)
                                .addComponent(lbl_cedulaRepresentante))))
                    .addGap(18, 18, 18)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_cedulaRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_cedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(lbl_listaPagos))
            .addGap(29, 29, 29))
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(174, 174, 174)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(cb_listaPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    pnl_datosLayout.setVerticalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(63, 63, 63)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cb_listaPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_listaPagos))
            .addGap(53, 53, 53)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_cedulaRepresentante, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(lbl_cedulaRepresentante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_cedulaEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(lbl_cedulaEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(94, 94, 94))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_codigoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Monto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Monto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_banco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dc_fechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_datosPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_datosPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(88, 88, 88)
            .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_tituloborrarMensualidad)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(56, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(lbl_tituloborrarMensualidad)
            .addGap(18, 18, 18)
            .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(59, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_montoKeyTyped
        keyTypedSoloNumeros(evt, txt_monto, 30);
    }//GEN-LAST:event_txt_montoKeyTyped

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        
        if (mensualidadSeleccionada != null){

            try {
                Mensualidad_Representante mensualidadBorrar = new Mensualidad_Representante(codigoMensualidad);
                ComunicacionREST comRest = new ComunicacionREST();
                Mensualidad_Representante mensualidadBorrado = comRest.borrarMensualidad(mensualidadBorrar);
                if ((mensualidadBorrado.getError() == Registry.RESULTADO_CODIGO_BIEN)){
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Se borro exitosamente el pago", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se ha podido borrar el pago, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception ex) {
                Logger.getLogger(RegistrarMensualidad.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "No se ha podido borrar el pago, revise los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void txt_cedulaRepresentanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaRepresentanteKeyTyped
        keyTypedSoloNumeros(evt, txt_cedulaRepresentante, 8);
    }//GEN-LAST:event_txt_cedulaRepresentanteKeyTyped

    private void txt_codigoTransferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoTransferenciaKeyTyped
        keyTypedSoloNumeros(evt, txt_codigoTransferencia, 30);
    }//GEN-LAST:event_txt_codigoTransferenciaKeyTyped

    private void txt_datosPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_datosPagoKeyTyped
        keyTypedSoloLetras(evt, txt_datosPago, 100);
    }//GEN-LAST:event_txt_datosPagoKeyTyped

    private void txt_cedulaEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaEstudianteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaEstudianteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JComboBox cb_banco;
    private javax.swing.JComboBox cb_listaPagos;
    private datechooser.beans.DateChooserCombo dc_fechaPago;
    private javax.swing.JLabel lbl_Monto;
    private javax.swing.JLabel lbl_Monto1;
    private javax.swing.JLabel lbl_banco;
    private javax.swing.JLabel lbl_cedulaEstudiante;
    private javax.swing.JLabel lbl_cedulaRepresentante;
    private javax.swing.JLabel lbl_datosPago;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_listaPagos;
    private javax.swing.JLabel lbl_tituloborrarMensualidad;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTextField txt_cedulaEstudiante;
    private javax.swing.JTextField txt_cedulaRepresentante;
    private javax.swing.JTextField txt_codigoTransferencia;
    private javax.swing.JTextField txt_datosPago;
    private javax.swing.JTextField txt_monto;
    // End of variables declaration//GEN-END:variables
}
