/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.modulo_gru_est;

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
public class DAOGru_Est extends DAO {
    
    private Connection _bdCon;
    private static String _sqlEmpGruRegistrar = "{?=call GRUEST_REGISTRAR(?,?)}";
    private static String _sqlEmpGruBorrar = "{?=call GRUEST_BORRAR(?,?)}";
    private static String _sqlEmpGruConsultar = "{call GRUEST_CONSULTAR()}";
    private ResultSet rs;
    
    public Emp_Gru_Est asignarGruEst (Emp_Gru_Est _gruest) throws SQLException, Exception{
        
        Emp_Gru_Est _gruestFallido = new Emp_Gru_Est();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpGruRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, _gruest.getEstudiante().getCedulaEscolar());
            cstmt.setString(3, _gruest.getGrupo().getCodigo());
            
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _gruest.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _gruest;   
                
            }else{
                
                _gruestFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _gruestFallido;
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
