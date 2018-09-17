/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import comun.Nomina;
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
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DocumentosExcel {
    public void modificarNomina(ArrayList<Nomina> nominaEmpleados, int lunesMes, String inicioPeriodo, String finPeriodo) throws IOException {
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
            
            
            XSSFSheet sheet = wb.getSheetAt(0);
            int filaInicio = 9;
            int idFila = 1;
            
            XSSFRow filaLunesMes = sheet.getRow(2);
            XSSFRow filaPeriodo = sheet.getRow(4);
            
            XSSFCell celdaLunesMes = filaLunesMes.createCell(6);
            XSSFCell celdaPeriodo = filaPeriodo.createCell(12);
            
            celdaLunesMes.setCellStyle(my_style);
            celdaPeriodo.setCellStyle(my_style);
            
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
            String fechaFin = finPeriodo.replace('/', '_');
            FileOutputStream output = new FileOutputStream("Documentos\\Nominas\\Nomina_" + fechaFin + ".xlsx");
            wb.write(output);
            output.close();
            

        } catch (Exception ex) {
            Logger.getLogger(DocumentosExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
