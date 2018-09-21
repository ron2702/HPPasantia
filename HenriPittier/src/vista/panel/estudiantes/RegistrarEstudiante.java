

package vista.panel.estudiantes;

import comun.Estudiante;
import comun.Rep_Est;
import comun.Representante;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.ComunicacionREST;
import modelo.Registry;


public class RegistrarEstudiante extends javax.swing.JPanel {
    private Estudiante estudianteConsultar;
    private Representante representanteConsultar;
    private File archivoSeleccionado;
    private Object cb_estados;
    long cedulaEscolar;
    int cedulaRepresentante;
    int flag;
   
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
        btn_limpiar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        lbl_cedulaRepresentante = new javax.swing.JLabel();
        txt_cedulaRepresentante = new javax.swing.JTextField();
        lbl_sexo = new javax.swing.JLabel();
        cb_sexo = new javax.swing.JComboBox();
        lbl_parentezco = new javax.swing.JLabel();
        cb_parentezco = new javax.swing.JComboBox();
        lbl_tituloRegistroEstudiantes = new javax.swing.JLabel();

        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 640));

        pnl_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

    lbl_foto.setBackground(new java.awt.Color(255, 255, 255));
    lbl_foto.setForeground(new java.awt.Color(255, 255, 255));
    lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    btn_cargarImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    btn_cargarImagen.setText("Cargar imagen");
    btn_cargarImagen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_cargarImagenActionPerformed(evt);
        }
    });

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

    btn_registrar.setBackground(new java.awt.Color(0, 153, 102));
    btn_registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
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
    txt_cedulaRepresentante.setToolTipText("");
    txt_cedulaRepresentante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    txt_cedulaRepresentante.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txt_cedulaRepresentanteKeyTyped(evt);
        }
    });

    lbl_sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_sexo.setText("Sexo:");

    cb_sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    cb_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F", "M" }));

    lbl_parentezco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_parentezco.setText("Parentezco:");

    cb_parentezco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Madre", "Padre", "Autorizado", "Otro" }));

    javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
    pnl_datos.setLayout(pnl_datosLayout);
    pnl_datosLayout.setHorizontalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dc_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnl_datosLayout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_segundoNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addComponent(txt_primerApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_segundoApellido)
                                .addComponent(txt_primerNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_cedulaRepresentante)
                                .addComponent(lbl_parentezco))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_cedulaRepresentante)
                                .addComponent(cb_parentezco, 0, 182, Short.MAX_VALUE))
                            .addGap(33, 33, 33))))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_sexo)
                        .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_cargarImagen)
                        .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))))
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
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_segundoNombre))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_primerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_primerApellido)))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_parentezco)
                        .addComponent(cb_parentezco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_segundoApellido)
                .addComponent(txt_segundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(dc_fechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(lbl_fechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_sexo)
                .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_cargarImagen)
                .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(38, 38, 38))
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
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(56, Short.MAX_VALUE))
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

    flag = 0;
    if ((!txt_primerNombre.getText().equals("")) && (!txt_primerApellido.getText().equals(""))
             &&(!dc_fechaNac.getText().equals("")) && (cb_sexo.getSelectedItem() != null) && (cb_parentezco.getSelectedItem() != null) && (!txt_cedulaRepresentante.getText().equals(""))){
        
        try {
            
            cedulaRepresentante = Integer.parseInt(txt_cedulaRepresentante.getText());
            ComunicacionREST comRestRep = new ComunicacionREST();
            Representante _representante = new Representante(cedulaRepresentante);
            
            try {
                    representanteConsultar = comRestRep.consultarRepresentanteDetalle(_representante);
            } catch (Exception ex) {
                    Logger.getLogger(RegistrarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (representanteConsultar.getTipo().equals("Representante I")){
                
                /*Pasos para generar cedula escolar INICIO*/
                SimpleDateFormat parseFecha = new SimpleDateFormat("dd/MM/yy");
                Date fechaNacimiento = parseFecha.parse(dc_fechaNac.getText());
                Calendar calNac = Calendar.getInstance();
                calNac.setTime(fechaNacimiento);

                String ci = txt_cedulaRepresentante.getText();

                long tamano = String.valueOf(ci).length();
                if (tamano  == 7){
                    ci = "0" + ci;
                }
                if (tamano == 6){
                    ci = "00" + ci;
                }

                int anoNac = calNac.get(Calendar.YEAR) %100;
                String anoNacString = String.valueOf(anoNac);       

                String hijonumero = "1";

                String cedulaConcat = new StringBuilder().append(hijonumero).append(anoNacString).append(ci).toString();

                try {
                    cedulaEscolar = Long.parseLong(cedulaConcat.trim());    
                } catch (NumberFormatException nfe) {
                    System.out.println("NumberFormatException: " + nfe.getMessage());
                }

                while(flag == 0){
                    ComunicacionREST comRestEst = new ComunicacionREST();
                    Estudiante _estudiante = new Estudiante(cedulaEscolar);

                    try {
                        estudianteConsultar = comRestEst.consultarEstudianteDetalle(_estudiante);
                    } catch (Exception ex) {
                        Logger.getLogger(RegistrarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                    }

                        if(estudianteConsultar.getCedulaEscolar() == cedulaEscolar){
                            String ciEscolarString = Long.toString(cedulaEscolar);
                            String digitoString = Character.toString(ciEscolarString.charAt(0));
                            int digito = Integer.parseInt(digitoString);

                            digito = digito + 1;
                            String digitoAString = String.valueOf(digito);
                            char c = digitoAString.charAt(0);

                            StringBuilder test = new StringBuilder(ciEscolarString);
                            test.setCharAt(0, c);

                            ciEscolarString = test.toString();

                            cedulaEscolar = Long.parseLong(ciEscolarString);
                        }
                        else{
                            flag = 1;
                        }
                }
                /*Pasos para generar cedula escolar FIN*/
                
                /*Pasos para generar cedula MAPFRE INICIO*/
                String ciRep = txt_cedulaRepresentante.getText();
                int ano = calNac.get(Calendar.YEAR) %100;

                String anoAString = String.valueOf(ano);

                String cedulaMAPFRE = ciRep + "-" + anoAString;
                /*Pasos para generar cedula MAPFRE FIN*/
                
                Estudiante estudianteRegistrar = new Estudiante(cedulaEscolar, txt_primerNombre.getText(), txt_segundoNombre.getText(), txt_primerApellido.getText(),
                                            txt_segundoApellido.getText(), fechaNacimiento, "fotico", cedulaMAPFRE, (String) cb_sexo.getSelectedItem());
                Rep_Est repestRegistar = new Rep_Est(cedulaRepresentante, cedulaEscolar, (String) cb_parentezco.getSelectedItem());
                ComunicacionREST comRest = new ComunicacionREST();
                ComunicacionREST comRest2 = new ComunicacionREST();
                Estudiante estudianteRegistrado = comRest.registrarEstudiante(estudianteRegistrar);
                Rep_Est repestRegistrado = comRest2.registrarRepEst(repestRegistar);
                if ((estudianteRegistrado.getError() == Registry.RESULTADO_CODIGO_RECURSO_CREADO) && (repestRegistrado.getError() == Registry.RESULTADO_CODIGO_BIEN)){
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Se registro existosamente el estudiante", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "No se ha podido registrar el estudiante, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Este representante no esta autorizado ya que no cumple con el tipo", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
             Logger.getLogger(RegistrarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else{
        final JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, "No se ha podido registrar el estudiante, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_cedulaRepresentante.setText("");
        txt_primerNombre.setText("");
        txt_primerApellido.setText("");
        txt_segundoNombre.setText("");
        txt_segundoApellido.setText("");
        dc_fechaNac.setCurrent(null);
        cb_sexo.setSelectedItem(null);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_cedulaRepresentanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaRepresentanteKeyTyped
        keyTypedSoloNumeros(evt, txt_cedulaRepresentante, 8);
    }//GEN-LAST:event_txt_cedulaRepresentanteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargarImagen;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox cb_parentezco;
    private javax.swing.JComboBox cb_sexo;
    private datechooser.beans.DateChooserCombo dc_fechaNac;
    private javax.swing.JLabel lbl_cedulaRepresentante;
    private javax.swing.JLabel lbl_fechaNac;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_parentezco;
    private javax.swing.JLabel lbl_primerApellido;
    private javax.swing.JLabel lbl_primerNombre;
    private javax.swing.JLabel lbl_segundoApellido;
    private javax.swing.JLabel lbl_segundoNombre;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_tituloRegistroEstudiantes;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JTextField txt_cedulaRepresentante;
    private javax.swing.JTextField txt_primerApellido;
    private javax.swing.JTextField txt_primerNombre;
    private javax.swing.JTextField txt_segundoApellido;
    private javax.swing.JTextField txt_segundoNombre;
    // End of variables declaration//GEN-END:variables

}
