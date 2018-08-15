/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_grupo;

import comun.Grupo;
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
public class DAOGrupo extends DAO{
    
    private Connection _bdCon;
    private static String _sqlGrupoRegistrar = "{?=call GRUPO_REGISTRAR(?,?,?,?,?)}";
    private static String _sqlGrupoModificar = "{?=call GRUPO_MODIFICAR(?,?,?,?,?)}";
    private static String _sqlGrupoBorrar = "{?=call GRUPO_BORRAR(?)}";
    private static String _sqlGrupoConsultar = "{call GRUPO_CONSULTAR_TODOS()}";
    private static String _sqlGrupoDetalle = "{call GRUPO_CONSULTAR_DETALLE(?)}";
    private ResultSet rs;
    
    public Grupo registrarGrupo (Grupo _grupo) throws Exception{
        
        Grupo _grupoFallido = new Grupo();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlGrupoRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            
            cstmt.setString(2, _grupo.getCodigo());
            cstmt.setString(3, _grupo.getNombre());
            cstmt.setString(4, _grupo.getDescripcion());
            cstmt.setInt(5, _grupo.getCapacidad());
            cstmt.setString(6, _grupo.getPeriodo());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _grupo.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _grupo;    
                
            }else{
                _grupoFallido.setError(RESULTADO_CODIGO_FALLIDO);
                return _grupoFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Grupo modificarGrupo (Grupo _grupo) throws Exception{
        
        Grupo _grupoFallido = new Grupo();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlGrupoModificar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            
            cstmt.setString(2, _grupo.getCodigo());
            cstmt.setString(3, _grupo.getNombre());
            cstmt.setString(4, _grupo.getDescripcion());
            cstmt.setInt(5, _grupo.getCapacidad());
            cstmt.setString(6, _grupo.getPeriodo());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _grupo.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _grupo;    
                
            }else{
                _grupoFallido.setError(RESULTADO_CODIGO_FALLIDO);
                return _grupoFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Grupo borrarGrupo (Grupo _grupo) throws SQLException, Exception{
        
        Grupo _grupoFallido = new Grupo();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlGrupoBorrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setString(2, _grupo.getCodigo());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _grupo.setError(RESULTADO_CODIGO_BIEN);
                return _grupo;       
                
            }else{
                
                _grupoFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _grupoFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
    public ArrayList<Grupo> consultarGrupos() throws Exception {

        ArrayList<Grupo> listaGrupos = new ArrayList<Grupo>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlGrupoConsultar);
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                Grupo grupo = new Grupo(rs.getString("codigo"), 
                                  rs.getString("nombre"),
                                  rs.getString("descripcion"),
                                  rs.getInt("capacidad"),
                                  rs.getString("periodo"));
                grupo.setError(RESULTADO_CODIGO_BIEN);
                listaGrupos.add(grupo);
                
            }
            return listaGrupos;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
    public Grupo consultarGrupoDetalle(Grupo _grupo) throws Exception {

        Grupo grupoConsultado = new Grupo();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlGrupoDetalle);
            cstmt.setString(1, _grupo.getCodigo());
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                grupoConsultado = new Grupo(rs.getString("codigo"), 
                                  rs.getString("nombre"),
                                  rs.getString("descripcion"),
                                  rs.getInt("capacidad"),
                                  rs.getString("periodo"));
                grupoConsultado.setError(RESULTADO_CODIGO_BIEN);
            }
            return grupoConsultado;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
}
