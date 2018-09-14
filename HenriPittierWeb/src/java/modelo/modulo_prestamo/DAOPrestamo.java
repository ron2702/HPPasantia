/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_prestamo;

import comun.Prestamo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import modelo.DAO;
import modelo.Registry;
import static modelo.Registry.RESULTADO_CODIGO_NO_ENCONTRADO;
import static modelo.Registry.RESULTADO_CODIGO_RECURSO_CREADO;


public class DAOPrestamo extends DAO{
    private Connection _bdCon;
    private static String _sqlPrestamoRegistrar = "{?=call  PRESTAMO_REGISTRAR(?,?,?)}";
    private static String _sqlEmpGruConsultarDetalle= "{call PRESTAMO_CONSULTAR_DETALLE(?,?)}";
    private static String _sqlEmpGruConsultarMontoTotal = "{call PRESTAMO_CONSULTAR_MONTO_ACTUAL()}";
    private ResultSet rs;
    
    public Prestamo registrarPrestamo (Prestamo _prestamo) throws SQLException, Exception{
        
        Prestamo _prestamoFallido = new Prestamo();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlPrestamoRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFechaPrestamo = new java.sql.Date(_prestamo.getFechaPrestamo().getTime());
            cstmt.setDate(2, sqlFechaPrestamo);
            cstmt.setInt(3, _prestamo.getMonto());
            cstmt.setInt(4, _prestamo.getFk_empleado());
            
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _prestamo.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _prestamo;   
                
            }else{
                
                _prestamoFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _prestamoFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
}
