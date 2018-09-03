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
import java.util.ArrayList;
import static modelo.Registry.RESULTADO_CODIGO_BIEN;
import static modelo.Registry.RESULTADO_CODIGO_FALLIDO;
import static modelo.Registry.RESULTADO_CODIGO_NO_ENCONTRADO;
import static modelo.Registry.RESULTADO_CODIGO_RECURSO_CREADO;

public class DAOEstudiante extends DAO {
    
    private Connection _bdCon;
    private static String _sqlEstudianteRegistrar = "{?=call ESTUDIANTE_REGISTRAR(?,?,?,?,?,?,?,?,?)}";
    private static String _sqlEstudianteModificar = "{?=call ESTUDIANTE_MODIFICAR(?,?,?,?,?,?,?,?,?)}";
    private static String _sqlEstudianteBorrar = "{?=call ESTUDIANTE_BORRAR(?)}";
    private static String _sqlEstudiantesConsultar = "{call ESTUDIANTE_CONSULTAR_TODOS()}";
    private static String _sqlEstudianteDetalle = "{call ESTUDIANTE_CONSULTAR_DETALLE(?)}";
    private ResultSet rs;
    
    public Estudiante registrarEstudiante (Estudiante _estudiante) throws Exception{
        
        Estudiante _estudianteFallido = new Estudiante();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEstudianteRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFecha = new java.sql.Date(_estudiante.getFechaNac().getTime());
            cstmt.setLong(2, _estudiante.getCedulaEscolar());
            cstmt.setString(3, _estudiante.getPrimerNombre());
            cstmt.setString(4, _estudiante.getSegundoNombre());
            cstmt.setString(5, _estudiante.getPrimerApellido());
            cstmt.setString(6, _estudiante.getSegundoApellido());
            cstmt.setDate(7, sqlFecha);
            cstmt.setString(8, _estudiante.getFoto());
            cstmt.setString(9, _estudiante.getCedulaMAPFRE());
            cstmt.setString(10, _estudiante.getSexo());
            
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _estudiante.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _estudiante;    
                
            }else{
                _estudianteFallido.setError(RESULTADO_CODIGO_FALLIDO);
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
            cstmt = _bdCon.prepareCall(_sqlEstudianteModificar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFecha = new java.sql.Date(_estudiante.getFechaNac().getTime());
            cstmt.setLong(2, _estudiante.getCedulaEscolar());
            cstmt.setString(3, _estudiante.getPrimerNombre());
            cstmt.setString(4, _estudiante.getSegundoNombre());
            cstmt.setString(5, _estudiante.getPrimerApellido());
            cstmt.setString(6, _estudiante.getSegundoApellido());
            cstmt.setDate(7, sqlFecha);
            cstmt.setString(8, _estudiante.getFoto());
            cstmt.setString(9, _estudiante.getCedulaMAPFRE());
            cstmt.setString(10, _estudiante.getSexo());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _estudiante.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _estudiante;      
                
            }else{
                
                _estudianteFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
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
            cstmt = _bdCon.prepareCall(_sqlEstudianteBorrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, _estudiante.getCedulaEscolar());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _estudiante.setError(RESULTADO_CODIGO_BIEN);
                return _estudiante;   
                
            }else{
                
                _estudianteFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
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
    
     public ArrayList<Estudiante> consultarEstudiantes() throws Exception {

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEstudiantesConsultar);
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                Estudiante estudiante = new Estudiante(rs.getLong("cedulaescolar"), 
                                  rs.getString("primernombre"),
                                  rs.getString("segundonombre"),
                                  rs.getString("primerapellido"),
                                  rs.getString("segundoapellido"),
                                  rs.getDate("fechanac"),
                                  rs.getString("foto"),
                                  rs.getString("cedulamapfre"),
                                  rs.getString("sexo"));
                estudiante.setError(RESULTADO_CODIGO_BIEN);
                listaEstudiantes.add(estudiante);
                
            }
            return listaEstudiantes;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
     
    public Estudiante consultarEstudianteDetalle(Estudiante _estudiante) throws Exception {
        
        Estudiante estudianteConsultado = new Estudiante();
        CallableStatement cstmt;

        int response = 0;

        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEstudianteDetalle);
            cstmt.setLong(1, _estudiante.getCedulaEscolar());
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                estudianteConsultado = new Estudiante(rs.getLong("cedulaescolar"), 
                                  rs.getString("primernombre"),
                                  rs.getString("segundonombre"),
                                  rs.getString("primerapellido"),
                                  rs.getString("segundoapellido"),
                                  rs.getDate("fechanac"),
                                  rs.getString("foto"),
                                  rs.getString("cedulamapfre"),
                                  rs.getString("sexo"));
                estudianteConsultado.setError(RESULTADO_CODIGO_BIEN);
                
            }
            return estudianteConsultado;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
}
