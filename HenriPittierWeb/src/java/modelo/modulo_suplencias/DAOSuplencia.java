/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_suplencias;

import comun.Suplencia;
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
public class DAOSuplencia extends DAO {
    
    private Connection _bdCon;
    private static String _sqlSuplenciaRegistrar = "{?=call SUPLENCIA_REGISTRAR(?,?,?,?)}";
    private static String _sqlSuplenciaModificar = "{?=call SUPLENCIA_MODIFICAR(?,?,?,?)}";
    private static String _sqlSuplenciaBorrar = "{?=call SUPLENCIA_BORRAR(?,?,?,?)}";
    private static String _sqlSuplenciaDetalle = "{call SUPLENCIA_CONSULTAR_DETALLE(?)}";
    private ResultSet rs;
    
    public Suplencia registrarSuplencia (Suplencia _suplencia) throws Exception{
        
        Suplencia _suplenciaFallido = new Suplencia();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlSuplenciaRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            
            cstmt.setInt(2, _suplencia.getDiasAdicionales());
            cstmt.setString(3, _suplencia.getMes());
            cstmt.setInt(4, _suplencia.getAno());
            cstmt.setInt(5, _suplencia.getCedulaEmpleado());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _suplencia.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _suplencia;    
                
            }else{
                _suplenciaFallido.setError(RESULTADO_CODIGO_FALLIDO);
                return _suplenciaFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Suplencia modificarSuplencia (Suplencia _suplencia) throws Exception{
        
        Suplencia _suplenciaFallido = new Suplencia();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlSuplenciaModificar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            
            cstmt.setInt(2, _suplencia.getDiasAdicionales());
            cstmt.setString(3, _suplencia.getMes());
            cstmt.setInt(4, _suplencia.getAno());
            cstmt.setInt(5, _suplencia.getCedulaEmpleado());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _suplencia.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _suplencia;    
                
            }else{
                _suplenciaFallido.setError(RESULTADO_CODIGO_FALLIDO);
                return _suplenciaFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Suplencia borrarSuplencia (Suplencia _suplencia) throws SQLException, Exception{
        
        Suplencia _suplenciaFallido = new Suplencia();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlSuplenciaBorrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _suplencia.getDiasAdicionales());
            cstmt.setString(3, _suplencia.getMes());
            cstmt.setInt(4, _suplencia.getAno());
            cstmt.setInt(5, _suplencia.getCedulaEmpleado());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _suplencia.setError(RESULTADO_CODIGO_BIEN);
                return _suplencia;       
                
            }else{
                
                _suplenciaFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _suplenciaFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
    public Suplencia consultarSuplenciaDetalle(Suplencia _suplencia) throws Exception {
        
        Suplencia suplenciaConsultado = new Suplencia();
        CallableStatement cstmt;

        int response = 0;

        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlSuplenciaDetalle);
            cstmt.setInt(1, _suplencia.getCedulaEmpleado());
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                suplenciaConsultado = new Suplencia(rs.getInt("cedula"), 
                                  rs.getInt("diasadicionales"),
                                  rs.getString("mes"),
                                  rs.getInt("ano"));
                suplenciaConsultado.setError(RESULTADO_CODIGO_BIEN);
                
            }
            return suplenciaConsultado;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
}
