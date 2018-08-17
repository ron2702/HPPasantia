/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_inasistencias;

import comun.Inasistencia;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import modelo.DAO;
import modelo.Registry;
import static modelo.Registry.*;

/**
 *
 * @author Ronald
 */
public class DAOInasistencia extends DAO {
    
    private Connection _bdCon;
    private static String _sqlInasistenciaRegistrar = "{?=call INASISTENCIA_REGISTRAR(?,?,?,?)}";
    private static String _sqlInasistenciaModificar = "{?=call INASISTENCIA_MODIFICAR(?,?,?,?)}";
    private static String _sqlInasistenciaBorrar = "{?=call INASISTENCIA_BORRAR(?,?,?,?)}";
    private static String _sqlInasistenciaDetalle = "{call INASISTENCIA_CONSULTAR_DETALLE(?)}";
    private ResultSet rs;
    
    public Inasistencia registrarEstudiante (Inasistencia _inasistencia) throws Exception{
        
        Inasistencia _inasistenciaFallido = new Inasistencia();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlInasistenciaRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            
            cstmt.setInt(2, _inasistencia.getDiasFaltados());
            cstmt.setString(3, _inasistencia.getMes());
            cstmt.setInt(4, _inasistencia.getAno());
            cstmt.setInt(5, _inasistencia.getCedulaEmpleado());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _inasistencia.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _inasistencia;    
                
            }else{
                _inasistenciaFallido.setError(RESULTADO_CODIGO_FALLIDO);
                return _inasistenciaFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Inasistencia modificarEstudiante (Inasistencia _inasistencia) throws Exception{
        
        Inasistencia _inasistenciaFallido = new Inasistencia();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlInasistenciaModificar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            
            cstmt.setInt(2, _inasistencia.getDiasFaltados());
            cstmt.setString(3, _inasistencia.getMes());
            cstmt.setInt(4, _inasistencia.getAno());
            cstmt.setInt(5, _inasistencia.getCedulaEmpleado());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _inasistencia.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _inasistencia;    
                
            }else{
                _inasistenciaFallido.setError(RESULTADO_CODIGO_FALLIDO);
                return _inasistenciaFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Inasistencia borrarInasistencia (Inasistencia _inasistencia) throws SQLException, Exception{
        
        Inasistencia _inasistenciaFallido = new Inasistencia();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlInasistenciaBorrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _inasistencia.getDiasFaltados());
            cstmt.setString(3, _inasistencia.getMes());
            cstmt.setInt(4, _inasistencia.getAno());
            cstmt.setInt(5, _inasistencia.getCedulaEmpleado());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _inasistencia.setError(RESULTADO_CODIGO_BIEN);
                return _inasistencia;       
                
            }else{
                
                _inasistenciaFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _inasistenciaFallido;
                
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
