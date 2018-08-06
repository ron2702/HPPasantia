
package modelo.modulo_usuarios;

import comun.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import modelo.DAO;
import modelo.Registry;

/**
 *
 * @author LuisAlejandro
 */
public class DAOUsuario extends DAO {
    
    private Connection _bdCon;
    private static String _sqlEmpleadoIniciarSesion = "{?=call EMPLEADO_INICIARSESION(?,?)}";
    private ResultSet rs;
    
    public Usuario iniciarSesion (Usuario _usuario) throws Exception {
        
        Usuario _usuarioFallido = new Usuario();
        
        Usuario _usuarioOK = null;
        
        CallableStatement cstmt;

        int respuesta = 0;
        
        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlEmpleadoIniciarSesion);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            
            cstmt.setString(2, _usuario.getUsuario());
            cstmt.setString(3, _usuario.getClave());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULT_CODE_OK){
                
                _usuario.setError(200);
                return _usuario;
            }
            else{
                _usuarioFallido.setError(301);
                return _usuarioFallido;
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
