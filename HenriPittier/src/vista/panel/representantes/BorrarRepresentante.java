/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.representantes;

import comun.Empleado;
import comun.Representante;
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

/**
 *
 * @author LuisAlejandro
 */
public class BorrarRepresentante extends javax.swing.JPanel {
    private Representante representanteBorrar;
    
    public BorrarRepresentante() {
        initComponents();
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
        lbl_segundoApellido = new javax.swing.JLabel();
        txt_segundoApellido = new javax.swing.JTextField();
        txt_primerApellido = new javax.swing.JTextField();
        lbl_telefonoCasa = new javax.swing.JLabel();
        txt_segundoNombre = new javax.swing.JTextField();
        lbl_telefonoMovil = new javax.swing.JLabel();
        txt_primerNombre = new javax.swing.JTextField();
        lbl_primerNombre = new javax.swing.JLabel();
        txt_telefonoMovil = new javax.swing.JTextField();
        lbl_segundoNombre = new javax.swing.JLabel();
        txt_telefonoCasa = new javax.swing.JTextField();
        lbl_primerApellido = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        dc_fechaNac = new datechooser.beans.DateChooserCombo();
        lbl_fechaNac = new javax.swing.JLabel();
        lbl_tituloEliminar = new javax.swing.JLabel();
        txt_cedulaRepresentante = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        pnl_datos.setBackground(new java.awt.Color(204, 204, 204));
        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        lbl_segundoApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_segundoApellido.setText("Segundo Apellido:");

        txt_segundoApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_segundoApellido.setEnabled(false);

        txt_primerApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_primerApellido.setEnabled(false);

        lbl_telefonoCasa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoCasa.setText("Telefono Casa:");

        txt_segundoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_segundoNombre.setEnabled(false);

        lbl_telefonoMovil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_telefonoMovil.setText("Teléfono Móvil:");

        txt_primerNombre.setBackground(new java.awt.Color(240, 240, 240));
        txt_primerNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_primerNombre.setEnabled(false);

        lbl_primerNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_primerNombre.setText("Primer Nombre:");

        txt_telefonoMovil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_telefonoMovil.setEnabled(false);

        lbl_segundoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_segundoNombre.setText("Segundo Nombre:");

        txt_telefonoCasa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_telefonoCasa.setEnabled(false);

        lbl_primerApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_primerApellido.setText("Primer Apellido:");

        btn_eliminar.setBackground(new java.awt.Color(121, 213, 177));
        btn_eliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_eliminar.setText("Borrar");
        btn_eliminar.setActionCommand("Eliminar");
        btn_eliminar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        dc_fechaNac.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
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
    dc_fechaNac.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dc_fechaNac.setCalendarPreferredSize(new java.awt.Dimension(400, 250));
    try {
        dc_fechaNac.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    dc_fechaNac.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
    dc_fechaNac.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

    lbl_fechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_fechaNac.setText("Fecha de Nacimiento: ");

    lbl_tituloEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_tituloEliminar.setText("Introduzca la cédula:");

    txt_cedulaRepresentante.setBackground(new java.awt.Color(240, 240, 240));
    txt_cedulaRepresentante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_cedulaRepresentante.setEnabled(false);
    txt_cedulaRepresentante.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_cedulaRepresentanteKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
    pnl_datos.setLayout(pnl_datosLayout);
    pnl_datosLayout.setHorizontalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_segundoNombre)
                        .addComponent(lbl_primerApellido)
                        .addComponent(lbl_segundoApellido)
                        .addComponent(lbl_primerNombre)
                        .addComponent(lbl_telefonoCasa)
                        .addComponent(lbl_telefonoMovil)
                        .addComponent(lbl_tituloEliminar)
                        .addComponent(lbl_fechaNac))
                    .addGap(80, 80, 80)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_telefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_primerApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_segundoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_telefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_primerNombre)
                            .addComponent(txt_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cedulaRepresentante))
                        .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(362, 362, 362)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 363, Short.MAX_VALUE))
    );
    pnl_datosLayout.setVerticalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_tituloEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_cedulaRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(42, 42, 42)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_primerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_primerNombre))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_segundoNombre))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_primerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_primerApellido))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_segundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_segundoApellido))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_telefonoCasa)
                .addComponent(txt_telefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_telefonoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_telefonoMovil))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(35, 35, 35))
    );

    lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lbl_titulo.setText("Eliminar Representante");

    btn_buscar.setBackground(new java.awt.Color(0, 153, 204));
    btn_buscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btn_buscar.setText("Buscar");
    btn_buscar.setPreferredSize(new java.awt.Dimension(109, 25));
    btn_buscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_buscarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addComponent(lbl_titulo)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(477, Short.MAX_VALUE)
            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(364, 364, 364))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(lbl_titulo)
            .addGap(49, 49, 49)
            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(519, Short.MAX_VALUE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE)))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        if(representanteBorrar != null) {
            try {
                ComunicacionREST comRest = new ComunicacionREST();
                //representanteBorrar = comRest.borrarRepresentante(representanteBorrar);  /*DESCOMENTAR CUANDO SE AGREGUE ESE MÉTODO A ComunicacionREST*/
                if (representanteBorrar.getError() == Registry.RESULTADO_CODIGO_BIEN){
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Se eliminó exitosamente el representante", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se ha podido eliminar el representante, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(BorrarRepresentante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Debe seleccionar un empleado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_cedulaRepresentanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaRepresentanteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaRepresentanteKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if(!txt_cedulaRepresentante.getText().equals("")) {
            ComunicacionREST comRest = new ComunicacionREST();
            Representante representanteConsultar = new Representante(Integer.parseInt(txt_cedulaRepresentante.getText()));
            //representanteBorrar = comRest.consultarRepresentanteDetalle(representanteConsultar);  /*DESCOMENTAR CUANDO SE AGREGUE ESE MÉTODO A ComunicacionREST*/
            if (representanteBorrar.getError() == Registry.RESULTADO_CODIGO_BIEN){
                //Se llenan los campos del representante
            }else{
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "No se obtuvo información sobre dicho representante, por favor revise los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private datechooser.beans.DateChooserCombo dc_fechaNac;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_primerApellido;
    private javax.swing.JLabel lbl_primerNombre;
    private javax.swing.JLabel lbl_segundoApellido;
    private javax.swing.JLabel lbl_segundoNombre;
    private javax.swing.JLabel lbl_telefonoCasa;
    private javax.swing.JLabel lbl_telefonoMovil;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_tituloEliminar;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTextField txt_cedulaRepresentante;
    private javax.swing.JTextField txt_primerApellido;
    private javax.swing.JTextField txt_primerNombre;
    private javax.swing.JTextField txt_segundoApellido;
    private javax.swing.JTextField txt_segundoNombre;
    private javax.swing.JTextField txt_telefonoCasa;
    private javax.swing.JTextField txt_telefonoMovil;
    // End of variables declaration//GEN-END:variables
}
