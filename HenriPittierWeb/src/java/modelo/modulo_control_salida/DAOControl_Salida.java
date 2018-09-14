/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_control_salida;

import comun.Control_Salida;
import comun.Estudiante;
import comun.Rep_Est;
import comun.Representante;
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
 * @author Ronald
 */
public class DAOControl_Salida extends DAO {
    
    private Connection _bdCon;
    private static String _sqlControlSalidaRegistrar = "{?=CONTROL_SALIDA_REGISTRAR(?,?,?,?)}";
    private static String _sqlControlSalidaBorrar = "{?=call CONTROL_SALIDA_BORRAR(?,?,?,?)}";
    private static String _sqlControlSalidaConsultar = "{call CONTROL_SALIDA_CONSULTAR()}";
    private ResultSet rs;
    
    
    public Control_Salida asignarSalida (Control_Salida _control) throws SQLException, Exception{
        
        Control_Salida _controlFallido = new Control_Salida();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlControlSalidaRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFecha = new java.sql.Date(_control.getFechaSalida().getTime());
            
            cstmt.setDate(2, sqlFecha);
            cstmt.setString(3, _control.getHoraSalida());
            cstmt.setInt(4, _control.getRepresentante().getCedula());
            cstmt.setLong(4, _control.getEstudiante().getCedulaEscolar());
            
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _control.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _control;   
                
            }else{
                
                _controlFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _controlFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
    public Control_Salida borrarSalida (Control_Salida _control) throws SQLException, Exception{
        
        Control_Salida _controlFallido = new Control_Salida();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlControlSalidaBorrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFecha = new java.sql.Date(_control.getFechaSalida().getTime());
            
            cstmt.setDate(2, sqlFecha);
            cstmt.setString(3, _control.getHoraSalida());
            cstmt.setInt(4, _control.getRepresentante().getCedula());
            cstmt.setLong(4, _control.getEstudiante().getCedulaEscolar());
            
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _control.setError(RESULTADO_CODIGO_BIEN);
                return _control;   
                
            }else{
                
                _controlFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _controlFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
    
    public ArrayList<Control_Salida> consultarSalida() throws Exception {

        ArrayList<Control_Salida> listaSalida = new ArrayList<Control_Salida>();
        Control_Salida control;
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlControlSalidaConsultar);
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                                
                Estudiante estudiante = new Estudiante(rs.getLong("cedulaescolar_est"), 
                                  rs.getString("primernombre_est"),
                                  rs.getString("primerapellido_est"));
                
                Representante representante = new Representante(rs.getInt("cedula_rep"),
                                    rs.getString("primernombre_rep"),
                                    rs.getString("primerapellido_rep"));
                
                Rep_Est repest = new Rep_Est(rs.getString("parentezco"));
                
                control = new Control_Salida(rs.getDate("fecha"),
                        rs.getString("hora"),
                        estudiante,
                        representante,
                        repest);
                
                representante.setError(RESULTADO_CODIGO_BIEN);
                estudiante.setError(RESULTADO_CODIGO_BIEN);
                repest.setError(RESULTADO_CODIGO_BIEN);
                
                
                
                listaSalida.add(control);
                
            }
            return listaSalida;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
}
