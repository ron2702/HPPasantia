

package vista.panel.estudiantes;

import comun.Estudiante;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.ComunicacionREST;
import modelo.ManejadorImagen;
import modelo.Registry;


public class ModificarEstudiante extends javax.swing.JPanel {
    private File archivoSeleccionado;
    private Estudiante estudianteModificar;
    Estudiante estudianteSeleccionado;
    
    
    public ModificarEstudiante() {
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
                        estudianteSeleccionado = (Estudiante) cb_listaEstudiantes.getSelectedItem();
                        String cedulaEscolar = Long.toString(estudianteSeleccionado.getCedulaEscolar());
                        txt_cedulaEscolar.setText(cedulaEscolar);
                        txt_primerNombre.setText(estudianteSeleccionado.getPrimerNombre());
                        txt_primerApellido.setText(estudianteSeleccionado.getPrimerApellido());
                        txt_segundoNombre.setText(estudianteSeleccionado.getSegundoNombre());
                        txt_segundoApellido.setText(estudianteSeleccionado.getSegundoApellido());
                        Calendar calNac = Calendar.getInstance();
                        calNac.setTime(estudianteSeleccionado.getFechaNac());
                        dc_fechaNac.setSelectedDate(calNac);
                        cb_sexo.setSelectedItem(estudianteSeleccionado.getSexo());
                        txt_cedulaMapfre.setText(estudianteSeleccionado.getCedulaMAPFRE());
                        if (!estudianteSeleccionado.getFoto().equals("")){
                            ImageIcon imagenEstudiante;
                            imagenEstudiante = new ImageIcon(estudianteSeleccionado.getFoto());
                            Image img = imagenEstudiante.getImage();
                            Image newimg = img.getScaledInstance(134, 134,  java.awt.Image.SCALE_SMOOTH);
                            ImageIcon newIcon = new ImageIcon(newimg);
                            lbl_foto.setIcon(newIcon);
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(ModificarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            
        } catch (Exception ex) {
            Logger.getLogger(ModificarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modificarEstudiantes = new javax.swing.JPanel();
        lbl_tituloModificarEstudiantes = new javax.swing.JLabel();
        pnl_datos = new javax.swing.JPanel();
        lbl_segundoApellido = new javax.swing.JLabel();
        txt_segundoApellido = new javax.swing.JTextField();
        txt_primerApellido = new javax.swing.JTextField();
        txt_segundoNombre = new javax.swing.JTextField();
        txt_primerNombre = new javax.swing.JTextField();
        lbl_primerNombre = new javax.swing.JLabel();
        lbl_segundoNombre = new javax.swing.JLabel();
        lbl_primerApellido = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        dc_fechaNac = new datechooser.beans.DateChooserCombo();
        lbl_fechaNac = new javax.swing.JLabel();
        lbl_foto = new javax.swing.JLabel();
        btn_cargarImagen = new javax.swing.JButton();
        cb_listaEstudiantes = new javax.swing.JComboBox();
        lbl_tituloModificar = new javax.swing.JLabel();
        lbl_cedulaEscolar = new javax.swing.JLabel();
        txt_cedulaEscolar = new javax.swing.JTextField();
        lbl_sexo = new javax.swing.JLabel();
        cb_sexo = new javax.swing.JComboBox();
        lbl_cedulaMAPFRE = new javax.swing.JLabel();
        txt_cedulaMapfre = new javax.swing.JTextField();

        modificarEstudiantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificarEstudiantes.setPreferredSize(new java.awt.Dimension(950, 640));

        lbl_tituloModificarEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloModificarEstudiantes.setText("Modificar Estudiantes");

        pnl_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        lbl_segundoApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_segundoApellido.setText("Segundo Apellido:");

        txt_segundoApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_primerApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_primerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_primerApellidoActionPerformed(evt);
            }
        });

        txt_segundoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_primerNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_primerNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_primerNombre.setText("Primer Nombre:");

        lbl_segundoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_segundoNombre.setText("Segundo Nombre:");

        lbl_primerApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_primerApellido.setText("Primer Apellido:");

        btn_limpiar.setBackground(new java.awt.Color(153, 0, 0));
        btn_limpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(0, 153, 102));
        btn_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("Modificar");
        btn_modificar.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
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
    dc_fechaNac.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
    dc_fechaNac.setLocale(new java.util.Locale("es", "ES", ""));
    dc_fechaNac.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

    lbl_fechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_fechaNac.setText("Fecha de Nacimiento: ");

    lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    btn_cargarImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btn_cargarImagen.setText("Cargar imagen");
    btn_cargarImagen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_cargarImagenActionPerformed(evt);
        }
    });

    cb_listaEstudiantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    lbl_tituloModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_tituloModificar.setText("Estudiante a modificar:");

    lbl_cedulaEscolar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_cedulaEscolar.setText("Cédula Escolar:");

    txt_cedulaEscolar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_cedulaEscolar.setEnabled(false);
    txt_cedulaEscolar.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_cedulaEscolarKeyTyped(evt);
        }
    });

    lbl_sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_sexo.setText("Sexo:");

    cb_sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    cb_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F", "M" }));

    lbl_cedulaMAPFRE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_cedulaMAPFRE.setText("Cédula MAPFRE:");

    txt_cedulaMapfre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    txt_cedulaMapfre.setEnabled(false);
    txt_cedulaMapfre.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_cedulaMapfreKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
    pnl_datos.setLayout(pnl_datosLayout);
    pnl_datosLayout.setHorizontalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(305, 305, 305)
            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_segundoNombre)
                .addComponent(lbl_primerApellido)
                .addComponent(lbl_segundoApellido)
                .addComponent(lbl_primerNombre)
                .addComponent(lbl_tituloModificar)
                .addComponent(lbl_fechaNac)
                .addComponent(lbl_sexo))
            .addGap(35, 35, 35)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_primerApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_segundoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_primerNombre)
                            .addComponent(txt_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                            .addComponent(cb_listaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9))
                        .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(57, 57, 57)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_cargarImagen))
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_cedulaEscolar)
                                .addComponent(lbl_cedulaMAPFRE))
                            .addGap(39, 39, 39)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_cedulaMapfre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_cedulaEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 80, Short.MAX_VALUE))
    );
    pnl_datosLayout.setVerticalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cb_listaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_tituloModificar)
                .addComponent(lbl_cedulaEscolar)
                .addComponent(txt_cedulaEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_cedulaMAPFRE)
                        .addComponent(txt_cedulaMapfre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cargarImagen))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33))
                .addGroup(pnl_datosLayout.createSequentialGroup()
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
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_sexo)
                        .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    javax.swing.GroupLayout modificarEstudiantesLayout = new javax.swing.GroupLayout(modificarEstudiantes);
    modificarEstudiantes.setLayout(modificarEstudiantesLayout);
    modificarEstudiantesLayout.setHorizontalGroup(
        modificarEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(modificarEstudiantesLayout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(modificarEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_tituloModificarEstudiantes)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(56, Short.MAX_VALUE))
    );
    modificarEstudiantesLayout.setVerticalGroup(
        modificarEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(modificarEstudiantesLayout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(lbl_tituloModificarEstudiantes)
            .addGap(18, 18, 18)
            .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(66, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 950, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 640, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_primerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_primerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_primerApellidoActionPerformed

    private void btn_cargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarImagenActionPerformed
        FileFilter filtroImagenes = new FileNameExtensionFilter("Archivos de imagen", ImageIO.getReaderFileSuffixes());
        JFileChooser exploradorArchivos = new JFileChooser("FotosEstudiantes");
        exploradorArchivos.setAcceptAllFileFilterUsed(false);
        exploradorArchivos.addChoosableFileFilter(filtroImagenes);
        int opcionElegida = exploradorArchivos.showOpenDialog(null);
        if (opcionElegida == JFileChooser.APPROVE_OPTION) 
        {
            archivoSeleccionado = exploradorArchivos.getSelectedFile();
            ImageIcon imagenEstudiante;
            imagenEstudiante = new ImageIcon(archivoSeleccionado.getAbsoluteFile().getAbsolutePath());
            Image img = imagenEstudiante.getImage();
            Image newimg = img.getScaledInstance(134, 134,  java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newimg);
            lbl_foto.setIcon(newIcon);
        }
    }//GEN-LAST:event_btn_cargarImagenActionPerformed

    private void txt_cedulaEscolarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaEscolarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaEscolarKeyTyped

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
       if ((!txt_primerNombre.getText().equals("")) && (!txt_primerApellido.getText().equals("")) 
           &&(!dc_fechaNac.getText().equals("")) && (cb_sexo.getSelectedItem() != null)){
           
           try {
               
               SimpleDateFormat parseFecha = new SimpleDateFormat("dd/MM/yy");
               Date fechaNacimiento = parseFecha.parse(dc_fechaNac.getText());
               long ciEscolar = Long.parseLong(txt_cedulaEscolar.getText());
               
               ManejadorImagen img = new ManejadorImagen();
               String file = "";
               if (archivoSeleccionado != null){
                    file = "FotosEstudiantes\\" + archivoSeleccionado.getName();
                }else{
                    file = estudianteSeleccionado.getFoto();
                }
               
               estudianteModificar = new Estudiante(ciEscolar, txt_primerNombre.getText(), txt_segundoNombre.getText(), txt_primerApellido.getText(),
                                        txt_segundoApellido.getText(), fechaNacimiento, file, txt_cedulaMapfre.getText(), (String) cb_sexo.getSelectedItem());
               ComunicacionREST comRest = new ComunicacionREST();
               Estudiante estudianteModificado = comRest.modificarEstudiante(estudianteModificar);
               if (estudianteModificado.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Se modifico existosamente el estudiante", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se ha podido modificar el estudiante, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
               
           } catch (Exception ex) {
               Logger.getLogger(RegistrarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }else{
        final JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, "No se ha podido modificar el estudiante, revise los campos e intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_cedulaEscolar.setText("");
        txt_primerNombre.setText("");
        txt_primerApellido.setText("");
        txt_segundoNombre.setText("");
        txt_segundoApellido.setText("");
        dc_fechaNac.setCurrent(null);
        cb_sexo.setSelectedItem(null);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_cedulaMapfreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaMapfreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaMapfreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargarImagen;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox cb_listaEstudiantes;
    private javax.swing.JComboBox cb_sexo;
    private datechooser.beans.DateChooserCombo dc_fechaNac;
    private javax.swing.JLabel lbl_cedulaEscolar;
    private javax.swing.JLabel lbl_cedulaMAPFRE;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_primerApellido;
    private javax.swing.JLabel lbl_primerNombre;
    private javax.swing.JLabel lbl_segundoApellido;
    private javax.swing.JLabel lbl_segundoNombre;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_tituloModificar;
    private javax.swing.JLabel lbl_tituloModificarEstudiantes;
    private javax.swing.JPanel modificarEstudiantes;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTextField txt_cedulaEscolar;
    private javax.swing.JTextField txt_cedulaMapfre;
    private javax.swing.JTextField txt_primerApellido;
    private javax.swing.JTextField txt_primerNombre;
    private javax.swing.JTextField txt_segundoApellido;
    private javax.swing.JTextField txt_segundoNombre;
    // End of variables declaration//GEN-END:variables
}
