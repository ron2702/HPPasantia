/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_emp_gru_est;

import comun.Emp_Gru_Est;
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
public class DAOEmp_Gru_Est extends DAO {
    
    private Connection _bdCon;
    private static String _sqlEmpGruEstRegistrar = "{?=call EMPGRUEST_REGISTRAR(?,?,?)}";
    private static String _sqlEmpGruEstBorrar = "{?=call EMPGRUEST_BORRAR(?,?,?)}";
    private static String _sqlEmpGruEstConsultar = "{call EMPGRUEST_CONSULTAR_TODOS()}";
    private static String _sqlEmpGruEstDetalle = "{call EMPGRUEST_CONSULTAR_DETALLE(?,?,?)}";
    private ResultSet rs;
    
    public Emp_Gru_Est registrarEmpGruEst (Emp_Gru_Est _empgruest) throws SQLException, Exception{
        
        Emp_Gru_Est _empgruestFallido = new Emp_Gru_Est();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpGruEstRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _empgruest.getCedula_emp());
            cstmt.setInt(3, _empgruest.getCedulaEscolar_est());
            cstmt.setString(4, _empgruest.getCodigo_gr());
            
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _empgruest.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _empgruest;   
                
            }else{
                
                _empgruestFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _empgruestFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }

    public ArrayList<Emp_Gru_Est> consultarREPEST() throws Exception {

        ArrayList<Emp_Gru_Est> listaEmpGruEst = new ArrayList<Emp_Gru_Est>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpGruEstConsultar);
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                Emp_Gru_Est empgruest = new Emp_Gru_Est(rs.getInt("cedulaemp"), 
                                  rs.getString("primernombreemp"),
                                  rs.getString("primerapellidoemp"),
                                  rs.getInt("cedulaescolarest"),
                                  rs.getString("primernombreest"),
                                  rs.getString("primerapellidoest"),
                                  rs.getString("codigo"),
                                  rs.getString("nombre"));
                empgruest.setError(RESULTADO_CODIGO_BIEN);
                listaEmpGruEst.add(empgruest);
                
            }
            return listaEmpGruEst;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
    public Emp_Gru_Est consultarEmpGruEstDetalle(Emp_Gru_Est _empgruest) throws Exception {
        
        Emp_Gru_Est empgruestConsultado = new Emp_Gru_Est();
        CallableStatement cstmt;

        int response = 0;

        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpGruEstDetalle);
            cstmt.setInt(1, _empgruest.getCedula_emp());
            cstmt.setInt(2, _empgruest.getCedulaEscolar_est());
            cstmt.setString(3, _empgruest.getCodigo_gr());
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                empgruestConsultado = new Emp_Gru_Est(rs.getInt("cedulaemp"), 
                                  rs.getString("primernombreemp"),
                                  rs.getString("primerapellidoemp"),
                                  rs.getInt("cedulaescolarest"),
                                  rs.getString("primernombreest"),
                                  rs.getString("primerapellidoest"),
                                  rs.getString("codigo"),
                                  rs.getString("nombre"));
                empgruestConsultado.setError(RESULTADO_CODIGO_BIEN);
                
            }
            return empgruestConsultado;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
}
