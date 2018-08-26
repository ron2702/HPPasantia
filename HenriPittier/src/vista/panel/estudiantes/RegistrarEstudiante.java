

package vista.panel.estudiantes;

import java.awt.event.KeyEvent;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class RegistrarEstudiante extends javax.swing.JPanel {
    private File archivoSeleccionado;
    private Object cb_estados;
   
    public RegistrarEstudiante() {
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

        pnl_datos = new javax.swing.JPanel();
        lbl_primerNombre = new javax.swing.JLabel();
        txt_primerNombre = new javax.swing.JTextField();
        lbl_segundoNombre = new javax.swing.JLabel();
        txt_segundoNombre = new javax.swing.JTextField();
        lbl_primerApellido = new javax.swing.JLabel();
        txt_primerApellido = new javax.swing.JTextField();
        lbl_segundoApellido = new javax.swing.JLabel();
        txt_segundoApellido = new javax.swing.JTextField();
        lbl_fechaNac = new javax.swing.JLabel();
        dc_fechaNac = new datechooser.beans.DateChooserCombo();
        lbl_foto = new javax.swing.JLabel();
        btn_cargarImagen = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        lbl_cedulaRepresentante = new javax.swing.JLabel();
        txt_cedulaRepresentante = new javax.swing.JTextField();
        lbl_cedulaEscolar = new javax.swing.JLabel();
        txt_cedulaEscolar = new javax.swing.JTextField();
        lbl_tituloRegistroEstudiantes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 640));

        pnl_datos.setBackground(new java.awt.Color(204, 204, 204));
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        lbl_primerNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_primerNombre.setText("Primer Nombre:");

        txt_primerNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_primerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primerNombreKeyTyped(evt);
            }
        });

        lbl_segundoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_segundoNombre.setText("Segundo Nombre:");

        txt_segundoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_segundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_segundoNombreKeyTyped(evt);
            }
        });

        lbl_primerApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_primerApellido.setText("Primer Apellido:");

        txt_primerApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_primerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primerApellidoKeyTyped(evt);
            }
        });

        lbl_segundoApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_segundoApellido.setText("Segundo Apellido:");

        txt_segundoApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_segundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_segundoApellidoKeyTyped(evt);
            }
        });

        lbl_fechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fechaNac.setText("Fecha de Nacimiento: ");

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
    dc_fechaNac.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
    dc_fechaNac.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

    lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    btn_cargarImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btn_cargarImagen.setText("Cargar imagen");
    btn_cargarImagen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_cargarImagenActionPerformed(evt);
        }
    });

    btn_cancelar.setBackground(new java.awt.Color(218, 87, 54));
    btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btn_cancelar.setText("Cancelar");
    btn_cancelar.setPreferredSize(new java.awt.Dimension(109, 25));

    btn_registrar.setBackground(new java.awt.Color(121, 213, 177));
    btn_registrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btn_registrar.setText("Registrar");
    btn_registrar.setPreferredSize(new java.awt.Dimension(109, 25));
    btn_registrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_registrarActionPerformed(evt);
        }
    });

    lbl_cedulaRepresentante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_cedulaRepresentante.setText("Cédula del Representante:");

    txt_cedulaRepresentante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_cedulaRepresentante.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_cedulaRepresentanteKeyTyped(evt);
        }
    });

    lbl_cedulaEscolar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_cedulaEscolar.setText("Cédula Escolar:");

    txt_cedulaEscolar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_cedulaEscolar.setEnabled(false);
    txt_cedulaEscolar.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_cedulaEscolarKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
    pnl_datos.setLayout(pnl_datosLayout);
    pnl_datosLayout.setHorizontalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_cargarImagen)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_primerNombre)
                        .addComponent(lbl_segundoNombre)
                        .addComponent(lbl_primerApellido)
                        .addComponent(lbl_segundoApellido)
                        .addComponent(lbl_fechaNac))
                    .addGap(45, 45, 45)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addComponent(txt_segundoApellido)
                            .addGap(473, 473, 473))
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnl_datosLayout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_primerNombre)
                                .addComponent(txt_segundoNombre)
                                .addComponent(txt_primerApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addGap(56, 56, 56)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnl_datosLayout.createSequentialGroup()
                                    .addComponent(lbl_cedulaRepresentante)
                                    .addGap(46, 46, 46)
                                    .addComponent(txt_cedulaRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_datosLayout.createSequentialGroup()
                                    .addComponent(lbl_cedulaEscolar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_cedulaEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(51, 51, 51))))))
    );
    pnl_datosLayout.setVerticalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_primerNombre)
                .addComponent(txt_primerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_cedulaRepresentante)
                .addComponent(txt_cedulaRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_segundoNombre)
                .addComponent(lbl_cedulaEscolar)
                .addComponent(txt_cedulaEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_primerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_primerApellido))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_segundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_segundoApellido))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(dc_fechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(lbl_fechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(btn_cargarImagen)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(31, 31, 31))
    );

    lbl_tituloRegistroEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lbl_tituloRegistroEstudiantes.setText("Registro de Estudiantes");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_tituloRegistroEstudiantes)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(54, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(lbl_tituloRegistroEstudiantes)
            .addGap(18, 18, 18)
            .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(59, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_primerNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primerNombreKeyTyped
        keyTypedSoloLetras(evt, txt_primerNombre, 30);
    }//GEN-LAST:event_txt_primerNombreKeyTyped

    private void txt_segundoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundoNombreKeyTyped
        keyTypedSoloLetras(evt, txt_segundoNombre, 30);
    }//GEN-LAST:event_txt_segundoNombreKeyTyped

    private void txt_primerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primerApellidoKeyTyped
        keyTypedSoloLetras(evt, txt_primerApellido, 30);
    }//GEN-LAST:event_txt_primerApellidoKeyTyped

    private void txt_segundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundoApellidoKeyTyped
        keyTypedSoloLetras(evt, txt_segundoApellido, 30);
    }//GEN-LAST:event_txt_segundoApellidoKeyTyped

    private void btn_cargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarImagenActionPerformed
        FileFilter filtroImagenes = new FileNameExtensionFilter("Archivos de imagen", ImageIO.getReaderFileSuffixes());
        JFileChooser exploradorArchivos = new JFileChooser();
        exploradorArchivos.setAcceptAllFileFilterUsed(false);
        exploradorArchivos.addChoosableFileFilter(filtroImagenes);
        int opcionElegida = exploradorArchivos.showOpenDialog(null);
        if (opcionElegida == JFileChooser.APPROVE_OPTION)
        {
            archivoSeleccionado = exploradorArchivos.getSelectedFile();
            ImageIcon imagenEmpleado;
            imagenEmpleado = new ImageIcon(archivoSeleccionado.getAbsoluteFile().getAbsolutePath());
            lbl_foto.setIcon(imagenEmpleado);
        }
    }//GEN-LAST:event_btn_cargarImagenActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed

       
        
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_cedulaRepresentanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaRepresentanteKeyTyped
        keyTypedSoloNumeros(evt, txt_cedulaRepresentante, 5);
    }//GEN-LAST:event_txt_cedulaRepresentanteKeyTyped

    private void txt_cedulaEscolarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaEscolarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaEscolarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cargarImagen;
    private javax.swing.JButton btn_registrar;
    private datechooser.beans.DateChooserCombo dc_fechaNac;
    private javax.swing.JLabel lbl_cedulaEscolar;
    private javax.swing.JLabel lbl_cedulaRepresentante;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_primerApellido;
    private javax.swing.JLabel lbl_primerNombre;
    private javax.swing.JLabel lbl_segundoApellido;
    private javax.swing.JLabel lbl_segundoNombre;
    private javax.swing.JLabel lbl_tituloRegistroEstudiantes;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTextField txt_cedulaEscolar;
    private javax.swing.JTextField txt_cedulaRepresentante;
    private javax.swing.JTextField txt_primerApellido;
    private javax.swing.JTextField txt_primerNombre;
    private javax.swing.JTextField txt_segundoApellido;
    private javax.swing.JTextField txt_segundoNombre;
    // End of variables declaration//GEN-END:variables

}
