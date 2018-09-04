/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_repest;

import comun.REPEST;
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
public class DAORepest extends DAO {
    
    private Connection _bdCon;
    private static String _sqlRepestRegistrar = "{?=call REPEST_REGISTRAR(?,?)}";
    private static String _sqlRepestBorrar = "{?=call REPEST_BORRAR(?,?)}";
    private static String _sqlRepestConsultar = "{call REPEST_CONSULTAR_TODOS()}";
    private static String _sqlRepestDetalle = "{call REPEST_CONSULTAR_DETALLE(?)}";
    private ResultSet rs;
    
    public REPEST registrarREPEST (REPEST _repest) throws SQLException, Exception{
        
        REPEST _repestFallido = new REPEST();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlRepestRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _repest.getCedula());
            cstmt.setLong(3, _repest.getCedulaEscolar());
            
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _repest.setError(RESULTADO_CODIGO_BIEN);
                return _repest;   
                
            }else{
                
                _repestFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _repestFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
    public REPEST borrarREPEST (REPEST _repest) throws SQLException, Exception{
        
        REPEST _repestFallido = new REPEST();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlRepestBorrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _repest.getCedula());
            cstmt.setLong(3, _repest.getCedulaEscolar());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _repest.setError(RESULTADO_CODIGO_BIEN);
                return _repest;   
                
            }else{
                
                _repestFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _repestFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
    
    public ArrayList<REPEST> consultarREPEST() throws Exception {

        ArrayList<REPEST> listaREPEST = new ArrayList<REPEST>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlRepestConsultar);
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                REPEST repest = new REPEST(rs.getInt("cedularep"), 
                                  rs.getString("primernombrerep"),
                                  rs.getString("primerapellidorep"),
                                  rs.getLong("cedulaescolares"),
                                  rs.getString("primernombrees"),
                                  rs.getString("primerapellidoes"));
                repest.setError(RESULTADO_CODIGO_BIEN);
                listaREPEST.add(repest);
                
            }
            return listaREPEST;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
    public REPEST consultarREPESTDetalle(REPEST _repest) throws Exception {
        
        REPEST repestConsultado = new REPEST();
        CallableStatement cstmt;

        int response = 0;

        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlRepestDetalle);
            cstmt.setInt(1, _repest.getCedula());
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                repestConsultado = new REPEST(rs.getInt("cedularep"), 
                                  rs.getString("primernombrerep"),
                                  rs.getString("primerapellidorep"),
                                  rs.getLong("cedulaescolares"),
                                  rs.getString("primernombrees"),
                                  rs.getString("primerapellidoes"));
                repestConsultado.setError(RESULTADO_CODIGO_BIEN);
                
            }
            return repestConsultado;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
}
