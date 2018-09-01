/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.grupos;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Ronald
 */
public class BorrarGrupo extends javax.swing.JPanel {

    /**
     * Creates new form BorrarGrupo
     */
    public BorrarGrupo() {
        initComponents();
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_tituloBorrarGrupo = new javax.swing.JLabel();
        pnl_datos = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_descripcion = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        lbl_capacidad = new javax.swing.JLabel();
        txt_capacidad = new javax.swing.JTextField();
        btn_borrar = new javax.swing.JButton();
        lbl_periodo = new javax.swing.JLabel();
        txt_periodo = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        lbl_tituloModificar = new javax.swing.JLabel();
        cb_listaGrupos = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(204, 204, 204));

        lbl_tituloBorrarGrupo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloBorrarGrupo.setText("Borrar Grupo");

        pnl_datos.setBackground(new java.awt.Color(204, 204, 204));
        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        lbl_codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_codigo.setText("Codigo:");

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_nombre.setText("Nombre:");

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nombre.setEnabled(false);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        lbl_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_descripcion.setText("Descripcion:");

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_descripcion.setEnabled(false);
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });

        lbl_capacidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_capacidad.setText("Capacidad:");

        txt_capacidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_capacidad.setEnabled(false);
        txt_capacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_capacidadKeyTyped(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(121, 213, 177));
        btn_borrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_borrar.setText("Borrar");
        btn_borrar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        lbl_periodo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_periodo.setText("Periodo:");

        txt_periodo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_periodo.setToolTipText("");
        txt_periodo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_periodo.setEnabled(false);
        txt_periodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_periodoKeyTyped(evt);
            }
        });

        txt_codigo.setEnabled(false);

        lbl_tituloModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tituloModificar.setText("Grupo a borrar:");

        cb_listaGrupos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_codigo)
                    .addComponent(lbl_nombre)
                    .addComponent(lbl_descripcion)
                    .addComponent(lbl_tituloModificar))
                .addGap(68, 68, 68)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addComponent(cb_listaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_nombre)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_periodo)
                            .addComponent(lbl_capacidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))))
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tituloModificar)
                    .addComponent(cb_listaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_periodo)
                    .addComponent(txt_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre)
                    .addComponent(lbl_capacidad)
                    .addComponent(txt_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descripcion)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbl_tituloBorrarGrupo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbl_tituloBorrarGrupo)
                .addGap(18, 18, 18)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        keyTypedSoloLetras(evt, txt_nombre, 30);
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyTyped
        keyTypedSoloLetras(evt, txt_descripcion, 30);
    }//GEN-LAST:event_txt_descripcionKeyTyped

    private void txt_capacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_capacidadKeyTyped
        keyTypedSoloNumeros(evt, txt_capacidad, 100);
    }//GEN-LAST:event_txt_capacidadKeyTyped

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        /*
        if ((!txt_codigo.getText().equals("")) && (!txt_descripcion.getText().equals("")) && (!txt_nombre.getText().equals(""))
            && (!txt_capacidad.getText().equals("")) &&(!dc_fechaNac.getText().equals(""))){

            try {

                SimpleDateFormat parseFecha = new SimpleDateFormat("dd/MM/yy");
                Date fechaNacimiento = parseFecha.parse(dc_fechaNac.getText());

                String ci = txt_periodo.getText();
                String ciPartida = ci.substring(0, 4);

                Calendar calNac = Calendar.getInstance();
                calNac.setTime(fechaNacimiento);
                int diadelmes = calNac.get(Calendar.DAY_OF_MONTH);
                int mes = calNac.get(Calendar.MONTH) + 1;

                String diadelmesAString = String.valueOf(diadelmes);
                String mesAString = String.valueOf(mes);

                String cedulaConcat = ciPartida + diadelmesAString + mesAString;

                int cedulaEscolar = Integer.parseInt(cedulaConcat);

                Estudiante estudianteRegistrar = new Estudiante(cedulaEscolar, txt_codigo.getText(), txt_descripcion.getText(), txt_nombre.getText(),
                    txt_capacidad.getText(), fechaNacimiento, "");
                ComunicacionREST comRest = new ComunicacionREST();
                Estudiante estudianteRegistrado = comRest.registrarEstudiante(estudianteRegistrar);
                if (estudianteRegistrado.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Se registro existosamente el estudiante", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se ha podido registrar el estudiante, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(RegistrarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "No se ha podido registrar el estudiante, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void txt_periodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_periodoKeyTyped
        keyTypedSoloLetras(evt, txt_periodo, 50);
    }//GEN-LAST:event_txt_periodoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JComboBox cb_listaGrupos;
    private javax.swing.JLabel lbl_capacidad;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_periodo;
    private javax.swing.JLabel lbl_tituloBorrarGrupo;
    private javax.swing.JLabel lbl_tituloModificar;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTextField txt_capacidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_periodo;
    // End of variables declaration//GEN-END:variables
}
