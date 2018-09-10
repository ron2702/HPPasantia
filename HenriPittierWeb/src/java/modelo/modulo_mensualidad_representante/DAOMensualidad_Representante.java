/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_mensualidad_representante;

import comun.Mensualidad_Representante;
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
public class DAOMensualidad_Representante extends DAO {
    
    private Connection _bdCon;
    private static String _sqlMensualidadRegistrar = "{?=call MENSUALIDAD_REPRESENTANTE_REGISTRAR(?,?,?,?,?,?,?,?)}";
    private static String _sqlMensualidadModificar = "{?=call REPRESENTANTE_MODIFICAR(?,?,?,?,?,?,?,?)}";
    private static String _sqlMensualidadBorrar = "{?=call REPRESENTANTE_BORRAR(?)}";
     private static String _sqlMensualidadConsultarTodos = "{call MENSUALIDAD_REPRESENTANTE_CONSULTAR_TODOS()}";
    private static String _sqlMensualidadDetalle = "{call MENSUALIDAD_REPRESENTANTE_CONSULTAR_DETALLE(?)}";
    private ResultSet rs;
    
    public Mensualidad_Representante registrarMensualidad (Mensualidad_Representante _mesualidadRepresentante) throws Exception{
        
        Mensualidad_Representante _mensualidadFallido = new Mensualidad_Representante();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlMensualidadRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFecha = new java.sql.Date(_mesualidadRepresentante.getFechapago().getTime());
            cstmt.setString(2, _mesualidadRepresentante.getCodigo());
            cstmt.setDate(3, sqlFecha);
            cstmt.setString(4, _mesualidadRepresentante.getDatosPago());
            cstmt.setInt(5, _mesualidadRepresentante.getMonto());
            cstmt.setString(6, _mesualidadRepresentante.getBanco());
            cstmt.setString(7, _mesualidadRepresentante.getCodigoTransferencia());
            cstmt.setInt(8, _mesualidadRepresentante.getCedulaRepresentante());
            cstmt.setLong(9, _mesualidadRepresentante.getCedulaEstudiante());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _mesualidadRepresentante.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _mesualidadRepresentante;    
                
            }else{
                
                _mesualidadRepresentante.setError(RESULTADO_CODIGO_FALLIDO);
                return _mensualidadFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Mensualidad_Representante modificarMensualidad (Mensualidad_Representante _mesualidadRepresentante) throws Exception{
        
        Mensualidad_Representante _mensualidadFallido = new Mensualidad_Representante();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlMensualidadModificar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFecha = new java.sql.Date(_mesualidadRepresentante.getFechapago().getTime());
            cstmt.setString(2, _mesualidadRepresentante.getCodigo());
            cstmt.setDate(3, sqlFecha);
            cstmt.setString(4, _mesualidadRepresentante.getDatosPago());
            cstmt.setInt(5, _mesualidadRepresentante.getMonto());
            cstmt.setString(6, _mesualidadRepresentante.getBanco());
            cstmt.setString(7, _mesualidadRepresentante.getCodigoTransferencia());
            cstmt.setInt(8, _mesualidadRepresentante.getCedulaRepresentante());
            cstmt.setLong(9, _mesualidadRepresentante.getCedulaEstudiante());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _mesualidadRepresentante.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _mesualidadRepresentante;    
                
            }else{
                
                _mesualidadRepresentante.setError(RESULTADO_CODIGO_FALLIDO);
                return _mensualidadFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Mensualidad_Representante borrarMensualidad (Mensualidad_Representante _mesualidadRepresentante) throws SQLException, Exception{
        
        Mensualidad_Representante _mensualidadFallido = new Mensualidad_Representante();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlMensualidadBorrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setString(2, _mesualidadRepresentante.getCodigo());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _mesualidadRepresentante.setError(RESULTADO_CODIGO_BIEN);
                return _mesualidadRepresentante;       
                
            }else{
                
                _mensualidadFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _mensualidadFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
    public ArrayList<Mensualidad_Representante> consultarMensualidad() throws Exception {

        ArrayList<Mensualidad_Representante> listaMensualidad = new ArrayList<Mensualidad_Representante>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlMensualidadConsultarTodos);
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                Mensualidad_Representante mensualidad = new Mensualidad_Representante(
                                  rs.getString("codigo_mr"), 
                                  rs.getDate("fechapago_mr"),
                                  rs.getString("datospago_mr"),
                                  rs.getInt("monto_mr"),
                                  rs.getString("banco_mr"),
                                  rs.getString("codigotransferencia_mr"),
                                  rs.getInt("cedula_re"),
                                  rs.getString("primernombre_re"),
                                  rs.getString("primerapellido_re"),
                                  rs.getLong("cedulaescolar_est"),
                                  rs.getString("primernombre_est"),
                                  rs.getString("primerapellido_est"));
                mensualidad.setError(RESULTADO_CODIGO_BIEN);
                listaMensualidad.add(mensualidad);
                
            }
            return listaMensualidad;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
    public Mensualidad_Representante consultarMensualidadDetalle(Mensualidad_Representante _mensualidad) throws Exception {

        Mensualidad_Representante mensualidadConsultar = new Mensualidad_Representante();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlMensualidadDetalle);
            
            cstmt.setString(1, _mensualidad.getCodigo());
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                mensualidadConsultar = new Mensualidad_Representante(
                                  rs.getString("codigo_mr"), 
                                  rs.getDate("fechapago_mr"),
                                  rs.getString("datospago_mr"),
                                  rs.getInt("monto_mr"),
                                  rs.getString("banco_mr"),
                                  rs.getString("codigotransferencia_mr"),
                                  rs.getInt("cedula_re"),
                                  rs.getString("primernombre_re"),
                                  rs.getString("primerapellido_re"),
                                  rs.getLong("cedulaescolar_est"),
                                  rs.getString("primernombre_est"),
                                  rs.getString("primerapellido_est"));
                mensualidadConsultar.setError(RESULTADO_CODIGO_BIEN);    
            }
            return mensualidadConsultar;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
}
