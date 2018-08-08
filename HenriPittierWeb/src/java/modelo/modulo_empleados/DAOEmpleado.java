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

/**
 *
 * @author LuisAlejandro
 */
public class DAOEmpleado extends DAO{
    
    private Connection _bdCon;
    private static String _sqlEmpleadoBorrado = "{?=call EMPLEADO_BORRAR(?)}";
    private static String _sqlEmpleadoConsultado = "{call EMPLEADO_CONSULTAR_TODOS()}";
    private static String _sqlEmpleadoConsultadoPorCedula = "{call EMPLEADO_CONSULTAR_DETALLE(?)}";
    
    private ResultSet rs;
    
      public Empleado borrarEmpleado (Empleado _empleado) throws SQLException, Exception{
        
        Empleado _empleadoFallido = new Empleado();
        
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpleadoBorrado);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _empleado.getCedula());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULT_CODE_OK){
                
                _empleado.setError(200);
                return _empleado;       
            }else{
                _empleadoFallido.setError(101);
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
    
    
    public ArrayList<Empleado> consultarEmpleado () throws SQLException, Exception{
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        CallableStatement cstmt;

        int response = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpleadoConsultado);
            
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
                empleado.setError(200);
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

    
        public ArrayList<Empleado> consultarEmpleadoPorCedula(Empleado _empleado) throws Exception {

        
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpleadoConsultadoPorCedula);
            
            cstmt.setInt(1, _empleado.getCedula());
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
                empleado.setError(200);
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
    
}
