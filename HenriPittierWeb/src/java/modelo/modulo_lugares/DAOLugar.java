/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_lugares;

import comun.Lugar;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.DAO;
import modelo.Registry;
import static modelo.Registry.*;

/**
 *
 * @author Ronald
 */
public class DAOLugar extends DAO {
    
    private Connection _bdCon;
    private static String _sqlEstadosConsultar = "{call ESTADO_CONSULTAR_TODOS()}";
    private static String _sqlMunicipiosConsultar = "{call MUNICIPIO_CONSULTAR_TODOS(?)}";
    private static String _sqlParroquiasConsultar = "{call PARROQUIA_CONSULTAR_TODOS(?)}";
    private ResultSet rs;
    
    public ArrayList<Lugar> consultarEstados() throws Exception {

        ArrayList<Lugar> listaEstados = new ArrayList<Lugar>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEstadosConsultar);
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                Lugar lugar = new Lugar(rs.getInt("codigo"), 
                                  rs.getString("nombre"));
                lugar.setError(RESULTADO_CODIGO_BIEN);
                listaEstados.add(lugar);
                
            }
            return listaEstados;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
    public ArrayList<Lugar> consultarMunicipios(Lugar _lugar) throws Exception {

        ArrayList<Lugar> listaMunicipios = new ArrayList<Lugar>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlMunicipiosConsultar);
            cstmt.setString(1, _lugar.getNombre());
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                Lugar lugar = new Lugar(rs.getInt("codigo"), 
                                  rs.getString("nombre"));
                lugar.setError(RESULTADO_CODIGO_BIEN);
                listaMunicipios.add(lugar);
                
            }
            return listaMunicipios;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
    public ArrayList<Lugar> consultarParroquias(Lugar _lugar) throws Exception {

        ArrayList<Lugar> listaParroquias = new ArrayList<Lugar>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlParroquiasConsultar);
            cstmt.setString(1, _lugar.getNombre());
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                Lugar lugar = new Lugar(rs.getInt("codigo"), 
                                  rs.getString("nombre"));
                lugar.setError(RESULTADO_CODIGO_BIEN);
                listaParroquias.add(lugar);
                
            }
            return listaParroquias;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
}
