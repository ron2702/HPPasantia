/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_emp_gru;

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
public class DAOEmp_Gru extends DAO {
    
    private Connection _bdCon;
    private static String _sqlEmpGruRegistrar = "{?=call EMPGRU_REGISTRAR(?,?,?)}";
    private static String _sqlEmpGruBorrar = "{?=call EMPGRU_BORRAR(?,?)}";
    private static String _sqlEmpGruConsultar = "{call EMPGRU_CONSULTAR()}";
    private ResultSet rs;
    
    public Emp_Gru_Est registrarEmpGru (Emp_Gru_Est _empgru) throws SQLException, Exception{
        
        Emp_Gru_Est _empgruFallido = new Emp_Gru_Est();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpGruRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _empgru.getEmpleado().getCedula());
            cstmt.setString(3, _empgru.getGrupo().getCodigo());
            cstmt.setString(4, _empgru.getEmpleado().getCargo());
            
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _empgru.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _empgru;   
                
            }else{
                
                _empgruFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _empgruFallido;
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
}
