/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_estudiantes;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import modelo.DAO;
import modelo.Registry;
import comun.Estudiante;
import java.sql.Date;

public class DAOEstudiante extends DAO {
    
    private Connection _bdCon;
    private static String _sqlEstudianteRegistro = "{?=call ESTUDIANTE_REGISTRAR(?,?,?,?,?,?,?)}";
    private static String _sqlEstudianteModificado = "{?=call ESTUDIANTE_MODIFICAR(?,?,?,?,?,?,?)}";
    private static String _sqlEstudianteBorrado = "{?=call ESTUDIANTE_BORRAR(?)}";
    private ResultSet rs;
    
    public Estudiante registrarEstudiante (Estudiante _estudiante) throws Exception{
        
        
        Estudiante _estudianteFallido = new Estudiante();
        
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEstudianteRegistro);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFecha = new java.sql.Date(_estudiante.getFechaNac().getTime());
            cstmt.setInt(2, _estudiante.getCedulaEscolar());
            cstmt.setString(3, _estudiante.getPrimerNombre());
            cstmt.setString(4, _estudiante.getSegundoNombre());
            cstmt.setString(5, _estudiante.getPrimerApellido());
            cstmt.setString(6, _estudiante.getSegundoApellido());
            cstmt.setDate(7, sqlFecha);
            cstmt.setString(8, _estudiante.getFoto());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULT_CODE_OK){
                
                _estudiante.setError(200);
                return _estudiante;       
            }else{
                _estudianteFallido.setError(101);
                return _estudianteFallido;
            }
            
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Estudiante modificarEstudiante (Estudiante _estudiante) throws SQLException, Exception{
        
        Estudiante _estudianteFallido = new Estudiante();
        
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEstudianteModificado);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            
            java.sql.Date sqlFecha = new java.sql.Date(_estudiante.getFechaNac().getTime());
            cstmt.setInt(2, _estudiante.getCedulaEscolar());
            cstmt.setString(3, _estudiante.getPrimerNombre());
            cstmt.setString(4, _estudiante.getSegundoNombre());
            cstmt.setString(5, _estudiante.getPrimerApellido());
            cstmt.setString(6, _estudiante.getSegundoApellido());
            cstmt.setDate(7, sqlFecha);
            cstmt.setString(8, _estudiante.getFoto());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULT_CODE_OK){
                
                _estudiante.setError(200);
                return _estudiante;       
            }else{
                _estudianteFallido.setError(101);
                return _estudianteFallido;
            }
            
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Estudiante borrarEstudiante (Estudiante _estudiante) throws SQLException, Exception{
        
        Estudiante _estudianteFallido = new Estudiante();
        
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEstudianteBorrado);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _estudiante.getCedulaEscolar());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULT_CODE_OK){
                
                _estudiante.setError(200);
                return _estudiante;       
            }else{
                _estudianteFallido.setError(101);
                return _estudianteFallido;
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
