/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.estudiantes;

import comun.Control_Salida;
import comun.Estudiante;
import comun.Representante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.ComunicacionREST;
import modelo.Registry;

/**
 *
 * @author Ronald
 */
public class BorrarSalida extends javax.swing.JPanel {
    private Estudiante estudiante;
    private Representante representante;
    int cedulaRepresentante;
    long cedulaEscolar;
    
    public BorrarSalida() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();    
            ArrayList<Estudiante> listaEstudiantes = comRest.consultarEstudiantes();
            
            for (Estudiante estudiante : listaEstudiantes) {
                cb_listaEstudiantes.addItem(estudiante);
            }
            cb_listaEstudiantes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Estudiante estudianteSeleccionado = (Estudiante) cb_listaEstudiantes.getSelectedItem();
                        String cedulaEscolar = Long.toString(estudianteSeleccionado.getCedulaEscolar());
                        txt_cedulaEstudiante.setText(cedulaEscolar);
                    } catch (Exception ex) {
                        Logger.getLogger(ModificarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        } catch (Exception ex) {
            Logger.getLogger(BorrarSalida.class.getName()).log(Level.SEVERE, null, ex);     
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

        lbl_tituloEstudiantes = new javax.swing.JLabel();
        pnl_datos = new javax.swing.JPanel();
        btn_borrar = new javax.swing.JButton();
        dc_fechaSalida = new datechooser.beans.DateChooserCombo();
        lbl_fechaSalida1 = new javax.swing.JLabel();
        txt_cedulaEstudiante = new javax.swing.JTextField();
        lbl_cedulaEstudiante = new javax.swing.JLabel();
        txt_cedulaRepresentante = new javax.swing.JTextField();
        lbl_cedulaRepresentante = new javax.swing.JLabel();
        cb_listaEstudiantes = new javax.swing.JComboBox();
        lbl_listaEstudiantes = new javax.swing.JLabel();

        lbl_tituloEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloEstudiantes.setText("Borrar salida de estudiante");

        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        btn_borrar.setBackground(new java.awt.Color(0, 153, 102));
        btn_borrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_borrar.setText("Borrar");
        btn_borrar.setActionCommand("Eliminar");
        btn_borrar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        dc_fechaSalida.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
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
    dc_fechaSalida.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dc_fechaSalida.setCalendarPreferredSize(new java.awt.Dimension(400, 250));
    dc_fechaSalida.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
    dc_fechaSalida.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

    lbl_fechaSalida1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_fechaSalida1.setText("Fecha de salida:");

    txt_cedulaEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_cedulaEstudiante.setEnabled(false);

    lbl_cedulaEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_cedulaEstudiante.setText("Cedula Estudiante:");

    txt_cedulaRepresentante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    lbl_cedulaRepresentante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_cedulaRepresentante.setText("Cedula Representante");

    cb_listaEstudiantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    lbl_listaEstudiantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_listaEstudiantes.setText("Lista de estudiantes:");

    javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
    pnl_datos.setLayout(pnl_datosLayout);
    pnl_datosLayout.setHorizontalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
            .addContainerGap(388, Short.MAX_VALUE)
            .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(337, 337, 337))
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_cedulaRepresentante)
                .addComponent(lbl_fechaSalida1)
                .addComponent(lbl_cedulaEstudiante)
                .addComponent(lbl_listaEstudiantes))
            .addGap(45, 45, 45)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cb_listaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dc_fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_cedulaRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_cedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    pnl_datosLayout.setVerticalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(54, 54, 54)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_fechaSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dc_fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(49, 49, 49)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_cedulaRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_cedulaRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(50, 50, 50)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cb_listaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_listaEstudiantes))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_cedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_cedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(123, 123, 123)
            .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(35, 35, 35))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_tituloEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(54, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(lbl_tituloEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(54, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        String horaSalida = null;

        if((!txt_cedulaEstudiante.getText().equals("")) && (!txt_cedulaRepresentante.getText().equals(""))) {
            try {

                cedulaRepresentante = Integer.parseInt(txt_cedulaRepresentante.getText());
                cedulaEscolar = Long.parseLong(txt_cedulaEstudiante.getText());

                SimpleDateFormat parseFecha = new SimpleDateFormat("dd/MM/yy");
                Date fechaSalida = parseFecha.parse(dc_fechaSalida.getText());
                Calendar calNac = Calendar.getInstance();
                calNac.setTime(fechaSalida);

                estudiante = new Estudiante(cedulaEscolar);
                representante = new Representante(cedulaRepresentante);

                Control_Salida controlSalida = new Control_Salida(fechaSalida, estudiante, representante);
                ComunicacionREST comRest = new ComunicacionREST();
                Control_Salida controlBorrado = comRest.borrarSalida(controlSalida);
                if (controlBorrado.getError() == Registry.RESULTADO_CODIGO_BIEN){
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Se borro la salida del estudiante", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se pudo eliminar la salida, revise si ya fue eliminada anteriormente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(BorrarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "No debe dejar los campos vacios, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_btn_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JComboBox cb_listaEstudiantes;
    private datechooser.beans.DateChooserCombo dc_fechaSalida;
    private javax.swing.JLabel lbl_cedulaEstudiante;
    private javax.swing.JLabel lbl_cedulaRepresentante;
    private javax.swing.JLabel lbl_fechaSalida1;
    private javax.swing.JLabel lbl_listaEstudiantes;
    private javax.swing.JLabel lbl_tituloEstudiantes;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTextField txt_cedulaEstudiante;
    private javax.swing.JTextField txt_cedulaRepresentante;
    // End of variables declaration//GEN-END:variables
}
