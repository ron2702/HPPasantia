/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_empleados;

import comun.Empleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import modelo.DAO;
import modelo.Registry;
import static modelo.Registry.*;

/**
 *
 * @author LuisAlejandro
 */
public class DAOEmpleado extends DAO{
    
    private Connection _bdCon;
    private static String _sqlEmpleadoRegistrar = "{?=call EMPLEADO_REGISTRAR(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
    private static String _sqlEmpleadoBorrar = "{?=call EMPLEADO_BORRAR(?)}";
    private static String _sqlEmpleadosConsultar = "{call EMPLEADO_CONSULTAR_TODOS()}";
    private static String _sqlEmpleadoDetalle = "{call EMPLEADO_CONSULTAR_DETALLE(?)}";
    private ResultSet rs;
    
    public Empleado registrarEmpleado (Empleado _empleado) throws Exception{
        
        Empleado _empleadoFallido = new Empleado();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpleadoRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFechaIngreso = new java.sql.Date(_empleado.getFechaIngreso().getTime());
            java.sql.Date sqlFecha = new java.sql.Date(_empleado.getFechaNac().getTime());
            cstmt.setInt(2, _empleado.getCedula());
            cstmt.setString(3, _empleado.getPrimerNombre());
            cstmt.setString(4, _empleado.getSegundoNombre());
            cstmt.setString(5, _empleado.getPrimerApellido());
            cstmt.setString(6, _empleado.getSegundoApellido());
            cstmt.setString(7, _empleado.getBanco());
            cstmt.setInt(8, _empleado.getSueldoMensual());
            cstmt.setInt(9, _empleado.getSueldoMensualExtra());
            cstmt.setInt(10, _empleado.getSueldoQuincenal());
            cstmt.setInt(11, _empleado.getSueldoQuincenalExtra());
            cstmt.setDate(12, sqlFechaIngreso);
            cstmt.setDate(13, sqlFecha);
            cstmt.setString(14, _empleado.getTelefonoCasa());
            cstmt.setString(15, _empleado.getTelefonoMovil());
            cstmt.setString(16, _empleado.getCargo());
            cstmt.setInt(17, _empleado.getAsistencia());
            cstmt.setInt(18, _empleado.getSuplencia());
            cstmt.setString(19, _empleado.getFoto());
            cstmt.setString(20, _empleado.getUsuario());
            cstmt.setString(21, _empleado.getClave());
            cstmt.setString(22, _empleado.getEstado());
            cstmt.setString(23, _empleado.getMunicipio());
            cstmt.setString(24, _empleado.getParroquia());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _empleado.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _empleado;    
                
            }else{
                
                _empleadoFallido.setError(RESULTADO_CODIGO_FALLIDO);
                return _empleadoFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
      public Empleado borrarEmpleado (Empleado _empleado) throws SQLException, Exception{
        
        Empleado _empleadoFallido = new Empleado();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpleadoBorrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _empleado.getCedula());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _empleado.setError(RESULTADO_CODIGO_BIEN);
                return _empleado;       
                
            }else{
                
                _empleadoFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _empleadoFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
    
    public ArrayList<Empleado> consultarEmpleados() throws SQLException, Exception{
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        CallableStatement cstmt;

        int response = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpleadosConsultar);
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                Empleado empleado = new Empleado(rs.getInt("cedula"), 
                                  rs.getString("primernombre"),
                                  rs.getString("segundonombre"),
                                  rs.getString("primerapellido"),
                                  rs.getString("segundoapellido"),
                                  rs.getString("banco"),
                                  rs.getInt("sueldomen"),
                                  rs.getInt("sueldomenextra"),
                                  rs.getInt("suedoquin"),
                                  rs.getInt("sueldoquinextra"),
                                  rs.getDate("fechaingreso"),
                                  rs.getDate("fechanac"),
                                  rs.getString("telfcasa"),
                                  rs.getString("telfmovil"),
                                  rs.getString("cargo"),
                                  rs.getInt("asistencia"),
                                  rs.getInt("suplencia"),
                                  rs.getString("foto"),
                                  rs.getString("usuario"),
                                  rs.getString("clave"),
                                  rs.getString("estado"),
                                  rs.getString("municipio"),
                                  rs.getString("parroquia"));
                empleado.setError(RESULTADO_CODIGO_BIEN);
                listaEmpleados.add(empleado);
                
            }
            return listaEmpleados;
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;

        } finally {
            
            _bdCon.close();
            
        }
        
    }

    
        public Empleado consultarEmpleadoDetalle(Empleado _empleado) throws Exception {

        
        Empleado empleadoConsultar = new Empleado();
        CallableStatement cstmt;

        int response = 0;

        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpleadoDetalle);
            
            cstmt.setInt(1, _empleado.getCedula());
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                empleadoConsultar = new Empleado(rs.getInt("cedula"), 
                                  rs.getString("primernombre"),
                                  rs.getString("segundonombre"),
                                  rs.getString("primerapellido"),
                                  rs.getString("segundoapellido"),
                                  rs.getString("banco"),
                                  rs.getInt("sueldomen"),
                                  rs.getInt("sueldomenextra"),
                                  rs.getInt("suedoquin"),
                                  rs.getInt("sueldoquinextra"),
                                  rs.getDate("fechaingreso"),
                                  rs.getDate("fechanac"),
                                  rs.getString("telfcasa"),
                                  rs.getString("telfmovil"),
                                  rs.getString("cargo"),
                                  rs.getInt("asistencia"),
                                  rs.getInt("suplencia"),
                                  rs.getString("foto"),
                                  rs.getString("usuario"),
                                  rs.getString("clave"),
                                  rs.getString("estado"),
                                  rs.getString("municipio"),
                                  rs.getString("parroquia"));
                empleadoConsultar.setError(RESULTADO_CODIGO_BIEN);
                
            }
            return empleadoConsultar;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            
            _bdCon.close();
            
        }
    }
    
}
