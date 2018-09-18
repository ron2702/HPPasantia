/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.estudiantes;

import comun.Estudiante;
import comun.Grupo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.ComunicacionREST;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Ronald
 */
public class ConstanciaEstudio extends javax.swing.JPanel {
    
    String PrimerNombre;
    String PrimerApellido;
    String DiaConstancia;
    String MesConstancia;
    String AnoConstancia;
    String Parrafo1;
    String Parrafo2;
    
    
    public ConstanciaEstudio() {
        try {
            initComponents();
            lbl_Titulo.setVisible(false);
            lbl_Atentamente.setVisible(false);
            lbl_Directora.setVisible(false);
            lbl_Cargo.setVisible(false);
            lbl_Direccion.setVisible(false);
            lbl_Email.setVisible(false);
            ComunicacionREST comRest = new ComunicacionREST();
            ArrayList<Estudiante> listaEstudiantes = comRest.consultarEstudiantes();
            ArrayList<Grupo> listaGrupos = comRest.consultarGrupos();
            
            for (Estudiante estudiante : listaEstudiantes) {
                cb_listaEstudiantes.addItem(estudiante);
            }
            for (Grupo grupo : listaGrupos) {
                cb_listaGrupo.addItem(grupo);
            }
            
            btn_Generar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        
                        Parrafo1 = "";
                        Parrafo2 = "";
                        
                        Estudiante estudianteSeleccionado = (Estudiante) cb_listaEstudiantes.getSelectedItem();
                        Grupo grupoSeleccionado = (Grupo) cb_listaGrupo.getSelectedItem();
                        
                        SimpleDateFormat parseFecha = new SimpleDateFormat("dd/MM/yy");
                        Date fechaDoc = parseFecha.parse(dc_fechaDoc.getText());
                        Calendar calDoc = Calendar.getInstance();
                        calDoc.setTime(fechaDoc);
                        String mes = calDoc.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("es","ES"));
                        int dia = calDoc.get(Calendar.DAY_OF_MONTH);
                        int ano = calDoc.get(Calendar.YEAR);
                        
                        PrimerNombre = estudianteSeleccionado.getPrimerNombre();
                        PrimerApellido = estudianteSeleccionado.getPrimerApellido();
                        DiaConstancia = String.valueOf(dia);
                        MesConstancia = mes;
                        AnoConstancia = String.valueOf(ano);
                        
                        lbl_parrafo1.setText("Por medio de la presente hacemos constar que el alumno(a) " + estudianteSeleccionado.getPrimerApellido().toUpperCase() + " " + estudianteSeleccionado.getSegundoApellido().toUpperCase()
                                + " " + estudianteSeleccionado.getPrimerNombre().toUpperCase() + " " + estudianteSeleccionado.getSegundoNombre().toUpperCase() + ", está cursando el " +
                                 grupoSeleccionado.getNombre() + " en el periodo " + grupoSeleccionado.getPeriodo() + "," + " en C.E.I HENRI PITTIER.");
   
                        lbl_Parrafo2.setText("Constancia que se expide a solicitud de la parte interesada a los " + dia + " dias del mes de " + mes + " de " + ano + ".");
                        
                        Parrafo1 = lbl_parrafo1.getText();
                        Parrafo2 = lbl_Parrafo2.getText();
                              
                        lbl_Titulo.setVisible(true);
                        lbl_Atentamente.setVisible(true);
                        lbl_Directora.setVisible(true);
                        lbl_Cargo.setVisible(true);
                        lbl_Direccion.setVisible(true);
                        lbl_Email.setVisible(true);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(ConstanciaEstudio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
        } catch (Exception ex) {
            Logger.getLogger(ConstanciaEstudio.class.getName()).log(Level.SEVERE, null, ex);
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

        lbl_tituloModificarEstudiantes = new javax.swing.JLabel();
        pnl_datos = new javax.swing.JPanel();
        btn_crearDoc = new javax.swing.JButton();
        cb_listaEstudiantes = new javax.swing.JComboBox();
        lbl_tituloEstudiante = new javax.swing.JLabel();
        lbl_tituloGrupo = new javax.swing.JLabel();
        cb_listaGrupo = new javax.swing.JComboBox();
        btn_Generar = new javax.swing.JButton();
        dc_fechaDoc = new datechooser.beans.DateChooserCombo();
        lbl_fecha = new javax.swing.JLabel();
        textoPanel = new javax.swing.JPanel();
        lbl_parrafo1 = new javax.swing.JLabel();
        lbl_Titulo = new javax.swing.JLabel();
        lbl_Atentamente = new javax.swing.JLabel();
        lbl_Directora = new javax.swing.JLabel();
        lbl_Cargo = new javax.swing.JLabel();
        lbl_Direccion = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        lbl_Parrafo2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        lbl_tituloModificarEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloModificarEstudiantes.setText("Constancia de Estudio");

        pnl_datos.setBackground(new java.awt.Color(204, 204, 204));
        pnl_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_datos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnl_datos.setPreferredSize(new java.awt.Dimension(840, 520));

        btn_crearDoc.setBackground(new java.awt.Color(121, 213, 177));
        btn_crearDoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_crearDoc.setText("Crear Documento");
        btn_crearDoc.setPreferredSize(new java.awt.Dimension(109, 25));
        btn_crearDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearDocActionPerformed(evt);
            }
        });

        cb_listaEstudiantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_tituloEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tituloEstudiante.setText("Estudiante:");

        lbl_tituloGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tituloGrupo.setText("Grupo:");

        cb_listaGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_Generar.setText("Generar");

        dc_fechaDoc.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
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
    dc_fechaDoc.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dc_fechaDoc.setCalendarPreferredSize(new java.awt.Dimension(400, 250));
    dc_fechaDoc.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
    dc_fechaDoc.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 8));

    lbl_fecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    lbl_fecha.setText("Fecha:");

    textoPanel.setBackground(new java.awt.Color(255, 255, 255));
    textoPanel.setPreferredSize(new java.awt.Dimension(700, 365));

    lbl_parrafo1.setBackground(new java.awt.Color(255, 255, 255));
    lbl_parrafo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    lbl_Titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    lbl_Titulo.setText("CONSTANCIA DE ESTUDIO");

    lbl_Atentamente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lbl_Atentamente.setText("Atentamente");

    lbl_Directora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lbl_Directora.setText("Lic. Lucila de Gonzales");
    lbl_Directora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    lbl_Cargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lbl_Cargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbl_Cargo.setText("Directora");

    lbl_Direccion.setText("Dirección: Montalbán 1, 3era avenida entre calles 1 y 2, Qta. San Miguel A. Telf. 442-41-54 / 471-45-14");

    lbl_Email.setText("Correo: u_e_henripittier@hotmail.com");

    lbl_Parrafo2.setBackground(new java.awt.Color(255, 255, 255));
    lbl_Parrafo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    javax.swing.GroupLayout textoPanelLayout = new javax.swing.GroupLayout(textoPanel);
    textoPanel.setLayout(textoPanelLayout);
    textoPanelLayout.setHorizontalGroup(
        textoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textoPanelLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(textoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textoPanelLayout.createSequentialGroup()
                    .addComponent(lbl_Atentamente)
                    .addGap(322, 322, 322))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textoPanelLayout.createSequentialGroup()
                    .addComponent(lbl_Cargo)
                    .addGap(334, 334, 334))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textoPanelLayout.createSequentialGroup()
                    .addComponent(lbl_Direccion)
                    .addGap(105, 105, 105))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textoPanelLayout.createSequentialGroup()
                    .addComponent(lbl_Directora)
                    .addGap(292, 292, 292))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textoPanelLayout.createSequentialGroup()
                    .addComponent(lbl_Email)
                    .addGap(268, 268, 268))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textoPanelLayout.createSequentialGroup()
                    .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(238, 238, 238))))
        .addGroup(textoPanelLayout.createSequentialGroup()
            .addGap(55, 55, 55)
            .addGroup(textoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lbl_parrafo1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_Parrafo2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(56, Short.MAX_VALUE))
    );
    textoPanelLayout.setVerticalGroup(
        textoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(textoPanelLayout.createSequentialGroup()
            .addGap(44, 44, 44)
            .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lbl_parrafo1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbl_Parrafo2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(lbl_Atentamente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(23, 23, 23)
            .addComponent(lbl_Directora, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbl_Cargo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbl_Direccion)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbl_Email)
            .addContainerGap(41, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
    pnl_datos.setLayout(pnl_datosLayout);
    pnl_datosLayout.setHorizontalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl_datosLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addComponent(lbl_tituloEstudiante)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_datosLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(cb_listaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(lbl_tituloGrupo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cb_listaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dc_fechaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(189, 189, 189)))
                    .addComponent(btn_Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(49, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_crearDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(324, 324, 324))
    );
    pnl_datosLayout.setVerticalGroup(
        pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
            .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_tituloEstudiante)
                        .addComponent(cb_listaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_tituloGrupo)
                        .addComponent(cb_listaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dc_fechaDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addGroup(pnl_datosLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(btn_Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
            .addComponent(textoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btn_crearDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(48, 48, 48)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_tituloModificarEstudiantes))
            .addContainerGap(64, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addComponent(lbl_tituloModificarEstudiantes)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(34, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearDocActionPerformed

            FileNameExtensionFilter filtroWord = new FileNameExtensionFilter("Microsoft Word", "docx");
            final JFileChooser miConstancia = new JFileChooser();
            miConstancia.setFileFilter(filtroWord);
            int aceptar = miConstancia.showSaveDialog(null);
            miConstancia.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            
            if(aceptar == JFileChooser.APPROVE_OPTION){
                File archivoWord = miConstancia.getSelectedFile();
                String nombreArchivo = archivoWord.getName();
                if(nombreArchivo.indexOf('.') == -1){
                    nombreArchivo+=".docx";
                    archivoWord = new File(archivoWord.getParentFile(), nombreArchivo);
                }
                try {
            
                    FileOutputStream output = new FileOutputStream(archivoWord);
                    //FileOutputStream output = new FileOutputStream("C:\\Users\\Ronald\\Documents\\Pasantia\\" + PrimerNombre + PrimerApellido + DiaConstancia + MesConstancia + AnoConstancia + "-Constancia.docx");

                    XWPFDocument document = new XWPFDocument();

                    XWPFParagraph logo = document.createParagraph();
                    XWPFParagraph blankspace = document.createParagraph();
                    XWPFParagraph paragraphTitulo = document.createParagraph();
                    XWPFParagraph paragraphParrafo = document.createParagraph();
                    XWPFParagraph paragraphParrafo2 = document.createParagraph();
                    XWPFParagraph paragraphAtentamente = document.createParagraph();
                    XWPFParagraph paragraphDirectora = document.createParagraph();
                    XWPFParagraph paragraphCargo = document.createParagraph();
                    XWPFParagraph paragraphDireccion = document.createParagraph();
                    XWPFParagraph paragraphEmail = document.createParagraph();

                    XWPFRun runLogo = logo.createRun();
                    XWPFRun runBlank = blankspace.createRun();
                    XWPFRun runTitulo = paragraphTitulo.createRun();
                    XWPFRun runParrafo = paragraphParrafo.createRun();
                    XWPFRun runParrafo2 = paragraphParrafo2.createRun();
                    XWPFRun runAtentamente = paragraphAtentamente.createRun();
                    XWPFRun runDirectora = paragraphDirectora.createRun();
                    XWPFRun runCargo = paragraphCargo.createRun();
                    XWPFRun runDireccion = paragraphDireccion.createRun();
                    XWPFRun runEmail = paragraphEmail.createRun();

                    runTitulo.setText("");
                    runParrafo.setText("");
                    runParrafo2.setText("");
                    runAtentamente.setText("");
                    runDirectora.setText("");
                    runCargo.setText("");
                    runDireccion.setText("");
                    runEmail.setText("");

                    String imgFile = "..\\HenriPittier\\img\\LogoHPSinFondo.png";
                    FileInputStream is = new FileInputStream(imgFile);
                    runLogo.addPicture(is, XWPFDocument.PICTURE_TYPE_PNG, imgFile, Units.toEMU(120), Units.toEMU(100));
                    is.close();

                    runBlank.addBreak();
                    runBlank.addBreak();
                    runBlank.addBreak();
                    runBlank.addBreak();
                    runBlank.addBreak();

                    runTitulo.setText(lbl_Titulo.getText());
                    paragraphTitulo.setAlignment(ParagraphAlignment.CENTER);
                    runTitulo.setBold(true);
                    runTitulo.setFontSize(14);
                    runTitulo.setFontFamily("Arial");
                    runTitulo.addBreak();


                    runParrafo.setText(Parrafo1);
                    runParrafo.addBreak();
                    runParrafo.setFontSize(12);
                    runParrafo.setFontFamily("Arial");
                    runParrafo2.setText(Parrafo2);
                    runParrafo2.setFontSize(12);
                    runParrafo2.setFontFamily("Arial");
                    runParrafo2.addBreak();
                    runParrafo2.addBreak();
                    runParrafo2.addBreak();
                    runParrafo2.addBreak();
                    runParrafo2.addBreak();
                    runParrafo2.addBreak();


                    runAtentamente.setText(lbl_Atentamente.getText());
                    paragraphAtentamente.setAlignment(ParagraphAlignment.CENTER);
                    runAtentamente.setFontSize(12);
                    runAtentamente.setFontFamily("Arial");
                    runAtentamente.addBreak();
                    runAtentamente.addBreak();
                    runAtentamente.addBreak();
                    runAtentamente.addBreak();
                    runAtentamente.addBreak();

                    runDirectora.setText(lbl_Directora.getText());
                    paragraphDirectora.setAlignment(ParagraphAlignment.CENTER);
                    runDirectora.setFontSize(12);
                    runDirectora.setFontFamily("Arial");


                    runCargo.setText(lbl_Cargo.getText());
                    paragraphCargo.setAlignment(ParagraphAlignment.CENTER);
                    runCargo.setFontSize(12);
                    runCargo.setFontFamily("Arial");
                    runCargo.addBreak();
                    runCargo.addBreak();

                    runDireccion.setText(lbl_Direccion.getText());
                    paragraphDireccion.setAlignment(ParagraphAlignment.CENTER);
                    runDireccion.setFontSize(11);
                    runDireccion.setFontFamily("Arial");

                    runEmail.setText(lbl_Email.getText());
                    paragraphEmail.setAlignment(ParagraphAlignment.CENTER);
                    runEmail.setFontSize(11);
                    runEmail.setFontFamily("Arial");

                    document.write(output);
                    output.close();
                    
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Se genero exitosamente el documento", "Información", JOptionPane.INFORMATION_MESSAGE);
                    
                
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage().toString());
                }

            }
    }//GEN-LAST:event_btn_crearDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Generar;
    private javax.swing.JButton btn_crearDoc;
    private javax.swing.JComboBox cb_listaEstudiantes;
    private javax.swing.JComboBox cb_listaGrupo;
    private datechooser.beans.DateChooserCombo dc_fechaDoc;
    private javax.swing.JLabel lbl_Atentamente;
    private javax.swing.JLabel lbl_Cargo;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_Directora;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Parrafo2;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_parrafo1;
    private javax.swing.JLabel lbl_tituloEstudiante;
    private javax.swing.JLabel lbl_tituloGrupo;
    private javax.swing.JLabel lbl_tituloModificarEstudiantes;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JPanel textoPanel;
    // End of variables declaration//GEN-END:variables
}
