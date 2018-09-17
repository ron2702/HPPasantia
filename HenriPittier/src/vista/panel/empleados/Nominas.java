/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel.empleados;


import comun.Empleado;
import comun.Inasistencia;
import comun.Prestamo;
import comun.Suplencia;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ComunicacionREST;


public class Nominas extends javax.swing.JPanel {
    DefaultTableModel model;
   
    private String nombreCompleto(Empleado empleado) {
        String segundoNombre = "";
        String segundoApellido = "";
        if (empleado.getSegundoNombre() != null){
            segundoNombre = " " + empleado.getSegundoNombre();
        }
        if (empleado.getSegundoApellido()!= null){
            segundoApellido = " " + empleado.getSegundoApellido();
        }
        return empleado.getPrimerApellido() + segundoApellido + ", " + empleado.getPrimerNombre() + segundoNombre;
    }
    

    public int cantidadLunesMes(Date fecha){
        Locale local = new Locale("en", "US");
        Calendar inicioCal = Calendar.getInstance(local);
        inicioCal.setTime(fecha);
        Calendar finCal = Calendar.getInstance(local);
        finCal.setTime(fecha);
        inicioCal.set(Calendar.DAY_OF_MONTH, finCal.getActualMinimum(Calendar.DAY_OF_MONTH));
        finCal.set(Calendar.DAY_OF_MONTH, finCal.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date d1 = inicioCal.getTime();
        Date d2 = finCal.getTime();
        int cantidadLunes = (finCal.getActualMaximum(Calendar.WEEK_OF_MONTH));
        int diaInicio = inicioCal.get(Calendar.DAY_OF_WEEK);
        int diaFin = finCal.get(Calendar.DAY_OF_WEEK);
        if(inicioCal.get(Calendar.DAY_OF_WEEK) != 2){
            cantidadLunes--;
        }
        if(finCal.get(Calendar.DAY_OF_WEEK) == 1){
            cantidadLunes--;
        }
        return cantidadLunes;
    }
    
    private int mesNumero(String mes) {
        if (mes.equals("Enero")){
            return 1;
        }else if (mes.equals("Febrero")){
            return 2;
        }else if (mes.equals("Marzo")){
            return 3;
        }else if (mes.equals("Abril")){
            return 4;
        }else if (mes.equals("Mayo")){
            return 5;
        }else if (mes.equals("Junio")){
            return 6;
        }else if (mes.equals("Julio")){
            return 7;
        }else if (mes.equals("Agosto")){
            return 8;
        }else if (mes.equals("Septiembre")){
            return 9;
        }else if (mes.equals("Octubre")){
            return 10;
        }else if (mes.equals("Noviembre")){
            return 11;
        }else {
            return 12;
        }
    }
    
    public Date obtenerFechaFinQuincena(Date fechaFin){
        Calendar finCal;
        finCal = Calendar.getInstance();
        finCal.setTime(fechaFin);
        int diaSemana = finCal.get(Calendar.DAY_OF_WEEK);
        if ((diaSemana == 7)){
            finCal.add(Calendar.DAY_OF_YEAR, -1);
        }else if ((diaSemana == 1)){
            finCal.add(Calendar.DAY_OF_YEAR, -2);
        }
        return finCal.getTime();
    }
    
    public Date obtenerFechaInicioQuincena(Date fechaFin){
        Calendar finCal;
        finCal = Calendar.getInstance();
        finCal.setTime(fechaFin);
        int mesFin = finCal.get(Calendar.MONTH);
        int anoFin = finCal.get(Calendar.YEAR);
        finCal.add(Calendar.DAY_OF_YEAR, -15);
        Calendar inicioCal = finCal;
        int mesInicio = inicioCal.get(Calendar.MONTH);
        if (mesInicio != mesFin){
            mesInicio = mesFin++;
            Date fechaInicio = new Date(mesFin + "/1/" + anoFin);
            inicioCal.setTime(fechaInicio);
        }
        int diaSemana = inicioCal.get(Calendar.DAY_OF_WEEK);
        if ((diaSemana == 7)){
            finCal.add(Calendar.DAY_OF_YEAR, 2);
        }else if ((diaSemana == 1)){
            finCal.add(Calendar.DAY_OF_YEAR, 1);
        }
        return finCal.getTime();
    }
    
    public Nominas() {
        try {
            initComponents();
            ComunicacionREST comRest = new ComunicacionREST();
            ArrayList<Empleado> listaEmpleados = comRest.consultarEmpleados();
            model = (DefaultTableModel) tb_nominaFija.getModel();
            
            for (Empleado empleado : listaEmpleados) {
                Inasistencia i = new Inasistencia(empleado.getCedula());
                ArrayList<Inasistencia> listaInasistencias = comRest.consultarInasistencias(i);
                
                Inasistencia inasistenciaQuincena = new Inasistencia();
                for (Inasistencia inasistencia : listaInasistencias) {
                    int mes = mesNumero(inasistencia.getMes());
                    Date fechaQuincena = obtenerFechaInicioQuincena(new Date());
                    Calendar finCal;
                    finCal = Calendar.getInstance();
                    finCal.setTime(fechaQuincena);
                    int mesActual = finCal.get(Calendar.MONTH) + 1;
                    int anoActual = finCal.get(Calendar.YEAR);
                    if ((mesActual == mes) && (anoActual == inasistencia.getAno())) {
                        inasistenciaQuincena = inasistencia;
                    }
                }
                Suplencia s = new Suplencia();
                ArrayList<Suplencia> listaSuplencias = comRest.consultarSuplencias(s);
                
                Suplencia suplenciaQuincena = new Suplencia();
                for (Suplencia suplencia : listaSuplencias) {
                    int mes = mesNumero(suplencia.getMes());
                    Date fechaQuincena = obtenerFechaInicioQuincena(new Date());
                    Calendar finCal;
                    finCal = Calendar.getInstance();
                    finCal.setTime(fechaQuincena);
                    int mesActual = finCal.get(Calendar.MONTH) + 1;
                    int anoActual = finCal.get(Calendar.YEAR);
                    if ((mesActual == mes) && (anoActual == suplencia.getAno())) {
                        suplenciaQuincena = suplencia;
                    }
                }
                
                Prestamo p = new Prestamo();
                ArrayList <Prestamo> listaPrestamo = comRest.consultarPrestamoDetalle(p);
                
                Prestamo prestamoQuincena = new Prestamo();
                for (Prestamo prestamo : listaPrestamo) {
                    
                }
                
                int sueldoQuincenal = empleado.getSueldoMensual()/2;
                int diasTrabajados = 15 - inasistenciaQuincena.getDiasFaltados();
                double SSO = (((((empleado.getSueldoMensual() * 12) / 52) * 0.04) / 2) * (cantidadLunesMes(new Date())));
                SSO = Math.floor(SSO * 100) / 100;
                double paroForzoso = (((((empleado.getSueldoMensual() * 12) / 52) * 0.005) / 2) * (cantidadLunesMes(new Date())));
                paroForzoso = Math.floor(paroForzoso * 100) / 100;
                double LPH = (sueldoQuincenal * 0.01);
                LPH = Math.floor(LPH * 100) / 100;
                double precioInasistencia = ((inasistenciaQuincena.getDiasFaltados() * empleado.getSueldoMensual()) / 30);
                precioInasistencia = Math.floor(precioInasistencia * 100) / 100;
                double precioSuplencia = ((suplenciaQuincena.getDiasAdicionales() * empleado.getSueldoMensual()) / 30);
                precioSuplencia = Math.floor(precioSuplencia * 100) / 100;
                String nombreCompleto = nombreCompleto(empleado);
                model.addRow(new Object[] {empleado.getCedula(), nombreCompleto, empleado.getSueldoMensual(), sueldoQuincenal,empleado.getBanco(),
                                           diasTrabajados, SSO, paroForzoso, LPH, inasistenciaQuincena.getDiasFaltados(), 
                                           precioInasistencia, suplenciaQuincena.getDiasAdicionales(), precioSuplencia, "", "", "", 
                                           empleado.getCargo(), empleado.getFechaIngreso()});
            }
        } catch (Exception e) {
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

        pnl_datos = new javax.swing.JPanel();
        sp_empleados = new javax.swing.JScrollPane();
        tb_nominaFija = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        lbl_tituloNomina = new javax.swing.JLabel();

        pnl_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        new JScrollPane(tb_nominaFija, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        tb_nominaFija.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb_nominaFija.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_nominaFija.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre del Empleado", "Sueldo (Mensual)", "Sueldo (Quincenal)", "Banco", "Días Trabajados (Quincenal)", "S.S.O (Quincenal)", "Paro Forzoso (Quincenal)", "L.P.H (Quincenal)", "Días (Inasistentes)", "Bs. S (Inasistencias)", "Días (Suplencias)", "Bs. S (Suplencias)", "Reposos/Préstamos", "Total Deducido", "Neto Pagado (Bs. S)", "Cargo", "Fecha de Ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sp_empleados.setViewportView(tb_nominaFija);
        if (tb_nominaFija.getColumnModel().getColumnCount() > 0) {
            tb_nominaFija.getColumnModel().getColumn(0).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_nominaFija.getColumnModel().getColumn(1).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(1).setPreferredWidth(230);
            tb_nominaFija.getColumnModel().getColumn(2).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(2).setPreferredWidth(110);
            tb_nominaFija.getColumnModel().getColumn(3).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(3).setPreferredWidth(120);
            tb_nominaFija.getColumnModel().getColumn(4).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(4).setPreferredWidth(130);
            tb_nominaFija.getColumnModel().getColumn(5).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(5).setPreferredWidth(180);
            tb_nominaFija.getColumnModel().getColumn(6).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(6).setPreferredWidth(140);
            tb_nominaFija.getColumnModel().getColumn(7).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(7).setPreferredWidth(160);
            tb_nominaFija.getColumnModel().getColumn(8).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(8).setPreferredWidth(120);
            tb_nominaFija.getColumnModel().getColumn(9).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(9).setPreferredWidth(120);
            tb_nominaFija.getColumnModel().getColumn(10).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(10).setPreferredWidth(140);
            tb_nominaFija.getColumnModel().getColumn(11).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(11).setPreferredWidth(120);
            tb_nominaFija.getColumnModel().getColumn(12).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(12).setPreferredWidth(120);
            tb_nominaFija.getColumnModel().getColumn(13).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(13).setPreferredWidth(140);
            tb_nominaFija.getColumnModel().getColumn(14).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(14).setPreferredWidth(130);
            tb_nominaFija.getColumnModel().getColumn(15).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(15).setPreferredWidth(140);
            tb_nominaFija.getColumnModel().getColumn(16).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(16).setPreferredWidth(120);
            tb_nominaFija.getColumnModel().getColumn(17).setResizable(false);
            tb_nominaFija.getColumnModel().getColumn(17).setPreferredWidth(120);
        }

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(sp_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(sp_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        lbl_tituloNomina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tituloNomina.setText("Nóminas de Empleados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tituloNomina)
                    .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lbl_tituloNomina)
                .addGap(18, 18, 18)
                .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_tituloNomina;
    private javax.swing.JPanel pnl_datos;
    private javax.swing.JScrollPane sp_empleados;
    private javax.swing.JTable tb_nominaFija;
    // End of variables declaration//GEN-END:variables
}
