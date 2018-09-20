/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import comun.Inasistencia;
import comun.Nomina;
import comun.Prestamo;
import comun.Suplencia;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DocumentosExcel {
    
    private String mesString(int mes) {
        if (mes == 1){
            return "Enero";
        }else if (mes == 2){
            return "Febrero";
        }else if (mes == 3){
            return "Marzo";
        }else if (mes == 4){
            return "Abril";
        }else if (mes == 5){
            return "Mayo";
        }else if (mes == 6){
            return "Junio";
        }else if (mes == 7){
            return "Julio";
        }else if (mes == 8){
            return "Agosto";
        }else if (mes == 9){
            return "Septiembre";
        }else if (mes == 10){
            return "Octubre";
        }else if (mes == 11){
            return "Noviembre";
        }else {
            return "Diciembre";
        }
    }
    
    public void crearNomina(ArrayList<Nomina> nominaEmpleados, int lunesMes, String inicioPeriodo, String finPeriodo) throws IOException {
        try {
            Collections.sort(nominaEmpleados); 
            FileInputStream file = new FileInputStream(new File("PlantillasExcel\\NominaPlantilla.xlsx"));
            
            String periodo = "Periodo: " + inicioPeriodo + " hasta el " + finPeriodo;
            XSSFWorkbook wb = new XSSFWorkbook(file);
            
            
            XSSFCellStyle my_style = wb.createCellStyle();
            XSSFFont my_font = wb.createFont();
            /* set the weight of the font */
            my_font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
            my_font.setFontName("Arial");
            /* attach the font to the style created earlier */
            my_style.setFont(my_font);
            my_style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            my_style.setBorderTop(HSSFCellStyle.BORDER_THIN);
            my_style.setBorderRight(HSSFCellStyle.BORDER_THIN);
            my_style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            
            XSSFCellStyle my_styleNoBorder = wb.createCellStyle();
            my_styleNoBorder.setFont(my_font);
            
            XSSFSheet sheet = wb.getSheetAt(0);
            int filaInicio = 9;
            int idFila = 1;
            
            XSSFRow filaLunesMes = sheet.getRow(2);
            XSSFRow filaPeriodo = sheet.getRow(4);
            
            XSSFCell celdaLunesMes = filaLunesMes.createCell(6);
            XSSFCell celdaPeriodo = filaPeriodo.createCell(12);
            
            celdaLunesMes.setCellStyle(my_styleNoBorder);
            celdaPeriodo.setCellStyle(my_styleNoBorder);
            
            celdaLunesMes.setCellValue(lunesMes);
            celdaPeriodo.setCellValue(periodo);
            
            for (Nomina empleado : nominaEmpleados){
                XSSFRow fila = sheet.getRow(filaInicio);
                if(fila == null){
                   fila = sheet.createRow(filaInicio);
                }
                    
                DateFormat format = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
                Date ingreso = format.parse(empleado.getFecIngreso());
                XSSFCell celdaId = fila.createCell(0);
                celdaId.setCellStyle(my_style);
                celdaId.setCellValue(idFila);
                
                XSSFCell celdaNombreCompleto = fila.createCell(1);
                celdaNombreCompleto.setCellStyle(my_style);
                celdaNombreCompleto.setCellValue(empleado.getNombreCompleto());
                XSSFCell celdaSueldoMensual = fila.createCell(2);
                celdaSueldoMensual.setCellStyle(my_style);
                celdaSueldoMensual.setCellValue(empleado.getSueldoMensual());
                XSSFCell celdaSuedoQuincenal = fila.createCell(3);
                celdaSuedoQuincenal.setCellStyle(my_style);
                celdaSuedoQuincenal.setCellValue(empleado.getSueldoQuincenal());
                XSSFCell celdaBanco = fila.createCell(4);
                celdaBanco.setCellStyle(my_style);
                celdaBanco.setCellValue(empleado.getBanco());
                XSSFCell celdaDiasTrabajados = fila.createCell(5);
                celdaDiasTrabajados.setCellStyle(my_style);
                celdaDiasTrabajados.setCellValue(empleado.getDiasTrabajados());
                XSSFCell celdaSSO = fila.createCell(6);
                celdaSSO.setCellStyle(my_style);
                celdaSSO.setCellValue(empleado.getSSO());
                XSSFCell celdaParoForzoso = fila.createCell(7);
                celdaParoForzoso.setCellStyle(my_style);
                celdaParoForzoso.setCellValue(empleado.getParoForzoso());
                XSSFCell celdaLPH = fila.createCell(8);
                celdaLPH.setCellStyle(my_style);
                celdaLPH.setCellValue(empleado.getLPH());
                XSSFCell celdaDiasFaltados = fila.createCell(9);
                celdaDiasFaltados.setCellStyle(my_style);
                celdaDiasFaltados.setCellValue(empleado.getDiasFaltados());
                XSSFCell celdaPrecioInasistencia = fila.createCell(10);
                celdaPrecioInasistencia.setCellStyle(my_style);
                celdaPrecioInasistencia.setCellValue(empleado.getPrecioInasistencia());
                XSSFCell celdaDiasAdicionales = fila.createCell(11);
                celdaDiasAdicionales.setCellStyle(my_style);
                celdaDiasAdicionales.setCellValue(empleado.getDiasAdicionales());
                XSSFCell celdaPrecioSuplencia = fila.createCell(12);
                celdaPrecioSuplencia.setCellStyle(my_style);
                celdaPrecioSuplencia.setCellValue(empleado.getPrecioSuplencia());
                XSSFCell celdaMontoPrestamos = fila.createCell(13);
                celdaMontoPrestamos.setCellStyle(my_style);
                celdaMontoPrestamos.setCellValue(empleado.getMontoPrestamos());
                XSSFCell celdaTotalDeducido = fila.createCell(14);
                celdaTotalDeducido.setCellStyle(my_style);
                celdaTotalDeducido.setCellValue(empleado.getTotalDeducido());
                XSSFCell celdaPagoNeto = fila.createCell(15);
                celdaPagoNeto.setCellStyle(my_style);
                celdaPagoNeto.setCellValue(empleado.getPagoNeto());
                XSSFCell celdaCedula = fila.createCell(16);
                celdaCedula.setCellStyle(my_style);
                celdaCedula.setCellValue(empleado.getCedula());
                XSSFCell celdaCargo = fila.createCell(17);
                celdaCargo.setCellStyle(my_style);
                celdaCargo.setCellValue(empleado.getCargo());
                XSSFCell celdaFechaIngreso = fila.createCell(18);
                celdaFechaIngreso.setCellStyle(my_style);
                celdaFechaIngreso.setCellValue(empleado.getFecIngreso());
                XSSFCell celdaAnos = fila.createCell(19);
                celdaAnos.setCellStyle(my_style);
                
                LocalDate fechaIngreso = ingreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaAhora = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Period periodoFechas = Period.between(fechaIngreso, fechaAhora);
                celdaAnos.setCellValue(periodoFechas.getYears());
                filaInicio++;
                idFila++;
            }
            
            file.close();
            String fechaFin = finPeriodo.replace('/', '-');
            FileOutputStream output = new FileOutputStream("Documentos\\Nominas\\Nomina_" + fechaFin + ".xlsx");
            wb.write(output);
            output.close();
            

        } catch (Exception ex) {
            Logger.getLogger(DocumentosExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearComprobantes(ArrayList<Nomina> nominaEmpleados, int lunesMes, String inicioPeriodo, String finPeriodo){
        try {
            Collections.sort(nominaEmpleados); 
            FileInputStream file = new FileInputStream(new File("PlantillasExcel\\ComprabantePagoPlantilla.xlsx"));
            
            String fechaFin = finPeriodo.replace('/', '-');
            File folder = new File("Documentos\\ComprobantesPago\\" + fechaFin);
            folder.mkdirs();
            
            String periodo = "Periodo: " + inicioPeriodo + " hasta el " + finPeriodo;
            XSSFWorkbook wb = new XSSFWorkbook(file);
            
            
            XSSFCellStyle my_style = wb.createCellStyle();
            XSSFFont my_font = wb.createFont();
            /* set the weight of the font */
            my_font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
            my_font.setFontName("Century");
            /* attach the font to the style created earlier */
            my_style.setFont(my_font);
            my_style.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
            
            XSSFCellStyle styleBordeAbajoDerecha = wb.createCellStyle();
            XSSFCellStyle styleBordeArribaDerecha = wb.createCellStyle();
            XSSFCellStyle styleBordeDerecha = wb.createCellStyle();
            
            styleBordeAbajoDerecha.setFont(my_font);
            styleBordeAbajoDerecha.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
            styleBordeArribaDerecha.setFont(my_font);
            styleBordeArribaDerecha.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
            styleBordeDerecha.setFont(my_font);
            styleBordeDerecha.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
            
            styleBordeAbajoDerecha.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            styleBordeArribaDerecha.setBorderTop(HSSFCellStyle.BORDER_THIN);
            styleBordeAbajoDerecha.setBorderRight(HSSFCellStyle.BORDER_THIN);
            styleBordeArribaDerecha.setBorderRight(HSSFCellStyle.BORDER_THIN);
            styleBordeDerecha.setBorderRight(HSSFCellStyle.BORDER_THIN);
            
            
            /*XSSFCellStyle cs = wb.createCellStyle();
            cs.setDataFormat((short)8);
            cs.setFont(my_font);*/
            
            
            
            XSSFSheet sheet = wb.getSheetAt(0);
            int filaInicio = 9;
            int idFila = 1;
            
            
            
            for (Nomina empleado : nominaEmpleados){
                XSSFRow filaLunesMes = sheet.getRow(12);
                XSSFRow filaPeriodo = sheet.getRow(5);

                XSSFCell celdaLunesMes = filaLunesMes.createCell(8);
                XSSFCell celdaPeriodo = filaPeriodo.createCell(0);

                celdaLunesMes.setCellStyle(styleBordeDerecha);
                celdaPeriodo.setCellStyle(my_style);

                celdaLunesMes.setCellValue(lunesMes);
                celdaPeriodo.setCellValue(periodo);
                
                XSSFRow fila;
                    
                DateFormat format = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
                Date ingreso = format.parse(empleado.getFecIngreso());
                fila = sheet.getRow(6);
                XSSFCell celdaId = fila.createCell(8);
                celdaId.setCellStyle(styleBordeArribaDerecha);
                celdaId.setCellValue(idFila);
                
                fila = sheet.getRow(8);
                XSSFCell celdaNombreCompleto = fila.createCell(0);
                celdaNombreCompleto.setCellStyle(my_style);
                celdaNombreCompleto.setCellValue(empleado.getNombreCompleto());
                
                fila = sheet.getRow(8);
                XSSFCell celdaCedula1 = fila.createCell(3);
                celdaCedula1.setCellStyle(my_style);
                celdaCedula1.setCellValue("V-" + empleado.getCedula());
                
                fila = sheet.getRow(8);
                XSSFCell celdaCargo = fila.createCell(5);
                celdaCargo.setCellStyle(my_style);
                celdaCargo.setCellValue(empleado.getCargo());
                
                fila = sheet.getRow(10);
                XSSFCell celdaFecIngreso = fila.createCell(8);
                celdaFecIngreso.setCellStyle(styleBordeDerecha);
                celdaFecIngreso.setCellValue(empleado.getFecIngreso());
                
                fila = sheet.getRow(11);
                XSSFCell celdaSuedoQuincenal = fila.createCell(8);
                celdaSuedoQuincenal.setCellStyle(styleBordeDerecha);
                celdaSuedoQuincenal.setCellValue("Bs.S. " + empleado.getSueldoQuincenal());
                
                fila = sheet.getRow(13);
                XSSFCell celdaPrecioSuplencia = fila.createCell(8);
                celdaPrecioSuplencia.setCellStyle(styleBordeDerecha);
                celdaPrecioSuplencia.setCellValue("Bs.S. " + empleado.getPrecioSuplencia());
                
                fila = sheet.getRow(14);
                XSSFCell celdaDiasTrabajados = fila.createCell(8);
                celdaDiasTrabajados.setCellStyle(styleBordeDerecha);
                celdaDiasTrabajados.setCellValue(empleado.getDiasTrabajados());
                
                fila = sheet.getRow(15);
                double asignaciones = empleado.getSueldoQuincenal() + empleado.getPrecioSuplencia();
                XSSFCell celdaBanco = fila.createCell(8);
                celdaBanco.setCellStyle(styleBordeDerecha);
                celdaBanco.setCellValue("Bs.S. " + asignaciones);
                
                fila = sheet.getRow(17);
                XSSFCell celdaSSO = fila.createCell(8);
                celdaSSO.setCellStyle(styleBordeDerecha);
                celdaSSO.setCellValue("Bs.S. " + empleado.getSSO());
                
                fila = sheet.getRow(18);
                XSSFCell celdaParoForzoso = fila.createCell(8);
                celdaParoForzoso.setCellStyle(styleBordeDerecha);
                celdaParoForzoso.setCellValue("Bs.S. " + empleado.getParoForzoso());
                
                fila = sheet.getRow(19);
                XSSFCell celdaLPH = fila.createCell(8);
                celdaLPH.setCellStyle(styleBordeDerecha);
                celdaLPH.setCellValue("Bs.S. " + empleado.getLPH());
                
                fila = sheet.getRow(20);
                XSSFCell celdaMontoPrestamos = fila.createCell(8);
                celdaMontoPrestamos.setCellStyle(styleBordeDerecha);
                celdaMontoPrestamos.setCellValue("Bs.S. " + empleado.getMontoPrestamos());
                
                fila = sheet.getRow(22);
                XSSFCell celdaDiasFaltados = fila.createCell(7);
                celdaDiasFaltados.setCellStyle(my_style);
                celdaDiasFaltados.setCellValue(empleado.getDiasFaltados());
                
                fila = sheet.getRow(22);
                XSSFCell celdaPrecioInasistencia = fila.createCell(8);
                celdaPrecioInasistencia.setCellStyle(styleBordeDerecha);
                celdaPrecioInasistencia.setCellValue("Bs.S. " + empleado.getPrecioInasistencia());
                                
                fila = sheet.getRow(23);
                XSSFCell celdaTotalDeducido = fila.createCell(8);
                celdaTotalDeducido.setCellStyle(styleBordeDerecha);
                celdaTotalDeducido.setCellValue("Bs.S. " + empleado.getTotalDeducido());
                
                fila = sheet.getRow(24);
                XSSFCell celdaPagoNeto = fila.createCell(8);
                celdaPagoNeto.setCellStyle(styleBordeArribaDerecha);
                celdaPagoNeto.setCellValue("Bs.S. " + empleado.getPagoNeto());
                
                fila = sheet.getRow(27);
                XSSFCell celdaCedula2 = fila.createCell(8);
                celdaCedula2.setCellStyle(styleBordeAbajoDerecha);
                celdaCedula2.setCellValue("V-" + empleado.getCedula());

                FileOutputStream output = new FileOutputStream("Documentos\\ComprobantesPago\\" + fechaFin + "\\ComprobantePago_" + empleado.getCedula() + "_" + fechaFin + ".xlsx");
                wb.write(output);
                output.close();
                
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Calendar cal = Calendar.getInstance();
                
                int mesInt = cal.get(Calendar.MONTH) + 1;
                String mes = mesString(mesInt);
                int ano = cal.get(Calendar.YEAR);
                ComunicacionREST com = new ComunicacionREST();
                Suplencia removerSup = new Suplencia(empleado.getCedula(), 0, mes, ano);
                Inasistencia removerIna = new Inasistencia(empleado.getCedula(), 0, mes, ano);
                Prestamo removerPrestamo = new Prestamo(new Date(), (empleado.getMontoPrestamos() * (-1)), empleado.getCedula());
                removerIna = com.modificarInasistencia(removerIna);
                removerSup = com.modificarSuplencia(removerSup);
                removerPrestamo = com.registrarPrestamo(removerPrestamo);
                
                filaInicio++;
                idFila++;
            }
            
            file.close();
            

        } catch (Exception ex) {
            Logger.getLogger(DocumentosExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearComprobantesEgreso(ArrayList<Nomina> nominaEmpleados, String inicioPeriodo, String finPeriodo){
        try {
            Collections.sort(nominaEmpleados); 
            FileInputStream file = new FileInputStream(new File("PlantillasExcel\\ComprabanteEgresoPlantilla.xlsx"));
            
            String fechaFin = finPeriodo.replace('/', '-');
            File folder = new File("Documentos\\ComprobantesEgreso\\" + fechaFin);
            folder.mkdirs();
            
            String periodo = "Periodo: " + inicioPeriodo + " hasta el " + finPeriodo;
            XSSFWorkbook wb = new XSSFWorkbook(file);
            
            
            XSSFCellStyle my_style = wb.createCellStyle();
            XSSFFont my_font = wb.createFont();
            /* set the weight of the font */
            my_font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
            my_font.setFontName("Century");
            /* attach the font to the style created earlier */
            my_style.setFont(my_font);
            my_style.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
            
            XSSFCellStyle styleBordeAbajoDerecha = wb.createCellStyle();
            XSSFCellStyle styleBordeIzquierdaDerecha = wb.createCellStyle();
            XSSFCellStyle styleBordeArribaDerecha = wb.createCellStyle();
            XSSFCellStyle styleBordeDerecha = wb.createCellStyle();
            
            styleBordeAbajoDerecha.setFont(my_font);
            styleBordeAbajoDerecha.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
            styleBordeIzquierdaDerecha.setFont(my_font);
            styleBordeIzquierdaDerecha.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
            styleBordeDerecha.setFont(my_font);
            styleBordeDerecha.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
            
            styleBordeAbajoDerecha.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            styleBordeIzquierdaDerecha.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            styleBordeAbajoDerecha.setBorderRight(HSSFCellStyle.BORDER_THIN);
            styleBordeIzquierdaDerecha.setBorderRight(HSSFCellStyle.BORDER_THIN);
            styleBordeArribaDerecha.setBorderTop(HSSFCellStyle.BORDER_THIN);
            styleBordeArribaDerecha.setBorderRight(HSSFCellStyle.BORDER_THIN);
            styleBordeDerecha.setBorderRight(HSSFCellStyle.BORDER_THIN);
            
            
            /*XSSFCellStyle cs = wb.createCellStyle();
            cs.setDataFormat((short)8);
            cs.setFont(my_font);*/
            
            
            
            XSSFSheet sheet = wb.getSheetAt(0);
            int filaInicio = 9;
            int idFila = 1;
            
            
            
            for (Nomina empleado : nominaEmpleados){
                XSSFRow filaPeriodo = sheet.getRow(12);

                XSSFCell celdaPeriodo = filaPeriodo.createCell(2);

                celdaPeriodo.setCellStyle(my_style);

                celdaPeriodo.setCellValue(periodo);
                
                XSSFRow fila;
                    
                DateFormat format = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
                Date ingreso = format.parse(empleado.getFecIngreso());
                fila = sheet.getRow(6);
                XSSFCell celdaId = fila.createCell(8);
                celdaId.setCellStyle(styleBordeArribaDerecha);
                celdaId.setCellValue(idFila);
                
                fila = sheet.getRow(8);
                XSSFCell celdaNombreCompleto = fila.createCell(0);
                celdaNombreCompleto.setCellStyle(my_style);
                celdaNombreCompleto.setCellValue(empleado.getNombreCompleto());
                
                fila = sheet.getRow(8);
                XSSFCell celdaCedula1 = fila.createCell(3);
                celdaCedula1.setCellStyle(my_style);
                celdaCedula1.setCellValue("V-" + empleado.getCedula());
                
                fila = sheet.getRow(8);
                XSSFCell celdaCargo = fila.createCell(5);
                celdaCargo.setCellStyle(my_style);
                celdaCargo.setCellValue(empleado.getCargo());
                
                fila = sheet.getRow(12);
                XSSFCell celdaPagoNeto = fila.createCell(8);
                celdaPagoNeto.setCellStyle(styleBordeIzquierdaDerecha);
                celdaPagoNeto.setCellValue("Bs.S. " + empleado.getPagoNeto());
                
                fila = sheet.getRow(15);
                XSSFCell celdaPagoTotal = fila.createCell(8);
                celdaPagoTotal.setCellStyle(styleBordeIzquierdaDerecha);
                celdaPagoTotal.setCellValue("Bs.S. " + empleado.getPagoNeto());
                
                fila = sheet.getRow(21);
                XSSFCell celdaCedula2 = fila.createCell(7);
                celdaCedula2.setCellStyle(styleBordeAbajoDerecha);
                celdaCedula2.setCellValue("V-" + empleado.getCedula());

                FileOutputStream output = new FileOutputStream("Documentos\\ComprobantesEgreso\\" + fechaFin + "\\ComprobanteEgreso_" + empleado.getCedula() + "_" + fechaFin + ".xlsx");
                wb.write(output);
                output.close();
                
                filaInicio++;
                idFila++;
            }
            
            file.close();
            

        } catch (Exception ex) {
            Logger.getLogger(DocumentosExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
