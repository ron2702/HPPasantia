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
    private static String _sqlEstadoConsultar = "{call LUGAR_CONSULTAR_ESTADO()}";
    private static String _sqlMunicipioDetalle = "{call LUGAR_CONSULTAR_MUNICIPIO(?)}";
    private static String _sqlParroquiaDetalle = "{call LUGAR_CONSULTAR_PARROQUIA(?)}";
    private ResultSet rs;
    
    public ArrayList<Lugar> consultarEstados() throws Exception {

        ArrayList<Lugar> listaEstados = new ArrayList<Lugar>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEstadoConsultar);
            
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
    
}
