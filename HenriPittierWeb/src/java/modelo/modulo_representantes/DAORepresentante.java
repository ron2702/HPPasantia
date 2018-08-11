
package modelo.modulo_representantes;

import comun.Representante;
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
public class DAORepresentante extends DAO {
    
    private Connection _bdCon;
    private static String _sqlRepresentanteRegistrar = "{?=call REPRESENTANTE_REGISTRAR(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
    private static String _sqlRepresentanteModificar = "{?=call REPRESENTANTE_MODIFICAR(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
    private static String _sqlRepresentanteBorrar = "{?=call REPRESENTANTE_BORRAR(?)}";
    private static String _sqlRepresentantesConsultar = "{call REPRESENTANTE_CONSULTAR_TODOS()}";
    private static String _sqlRepresentantesDetalle = "{call REPRESENTANTE_CONSULTAR_DETALLE(?)}";
    private ResultSet rs;
    
    
    public Representante registrarRepresentante (Representante _representante) throws Exception{
        
        Representante _representanteFallido = new Representante();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlRepresentanteRegistrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFecha = new java.sql.Date(_representante.getFechaNac().getTime());
            cstmt.setInt(2, _representante.getCedula());
            cstmt.setString(3, _representante.getPrimerNombre());
            cstmt.setString(4, _representante.getSegundoNombre());
            cstmt.setString(5, _representante.getPrimerApellido());
            cstmt.setString(6, _representante.getSegundoApellido());
            cstmt.setDate(7, sqlFecha);
            cstmt.setString(8, _representante.getTelefonoCasa());
            cstmt.setString(9, _representante.getTelefonoMovil());
            cstmt.setString(10, _representante.getTipo());
            cstmt.setString(11, _representante.getFoto());
            cstmt.setString(12, _representante.getEstado());
            cstmt.setString(13, _representante.getMunicipio());
            cstmt.setString(14, _representante.getParroquia());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _representante.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _representante;    
                
            }else{
                
                _representanteFallido.setError(RESULTADO_CODIGO_FALLIDO);
                return _representanteFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    public Representante modificarRepresentante (Representante _representante) throws Exception{
        
        Representante _representanteFallido = new Representante();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlRepresentanteModificar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            java.sql.Date sqlFecha = new java.sql.Date(_representante.getFechaNac().getTime());
            cstmt.setInt(2, _representante.getCedula());
            cstmt.setString(3, _representante.getPrimerNombre());
            cstmt.setString(4, _representante.getSegundoNombre());
            cstmt.setString(5, _representante.getPrimerApellido());
            cstmt.setString(6, _representante.getSegundoApellido());
            cstmt.setDate(7, sqlFecha);
            cstmt.setString(8, _representante.getTelefonoCasa());
            cstmt.setString(9, _representante.getTelefonoMovil());
            cstmt.setString(10, _representante.getTipo());
            cstmt.setString(11, _representante.getFoto());
            cstmt.setString(12, _representante.getEstado());
            cstmt.setString(13, _representante.getMunicipio());
            cstmt.setString(14, _representante.getParroquia());
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_RECURSO_CREADO){
                
                _representante.setError(RESULTADO_CODIGO_RECURSO_CREADO);
                return _representante;    
                
            }else{
                
                _representanteFallido.setError(RESULTADO_CODIGO_FALLIDO);
                return _representanteFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
    }
    
    
    public Representante borrarRepresentante (Representante _representante) throws SQLException, Exception{
        
        Representante _representanteFallido = new Representante();
        CallableStatement cstmt;
        
        int respuesta = 0;
        
        try {
            
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlRepresentanteBorrar);
            //Parametro de salida
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setInt(2, _representante.getCedula());
          
            cstmt.execute();
            
            respuesta = cstmt.getInt(1);
            
            if(respuesta == Registry.RESULTADO_CODIGO_BIEN){
                
                _representante.setError(RESULTADO_CODIGO_BIEN);
                return _representante;       
                
            }else{
                
                _representanteFallido.setError(RESULTADO_CODIGO_NO_ENCONTRADO);
                return _representanteFallido;
                
            }
            
        } catch (SQLException ex) {
            
            throw ex;
            
        } catch (Exception ex) {
            
            throw ex;
            
        } finally {
            
            _bdCon.close();
            
        }
        
    }
    
    public ArrayList<Representante> consultarRepresentantes() throws Exception {

        ArrayList<Representante> listaRepresentantes = new ArrayList<Representante>();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlRepresentantesConsultar);
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                Representante representante = new Representante(rs.getInt("cedula"), 
                                  rs.getString("primernombre"),
                                  rs.getString("segundonombre"),
                                  rs.getString("primerapellido"),
                                  rs.getString("segundoapellido"),
                                  rs.getDate("fechanac"),
                                  rs.getString("telefonocasa"),
                                  rs.getString("telefonomovil"),
                                  rs.getString("tipo"),
                                  rs.getString("foto"),
                                  rs.getString("estado"),
                                  rs.getString("municipio"),
                                  rs.getString("parroquia"));
                representante.setError(RESULTADO_CODIGO_BIEN);
                listaRepresentantes.add(representante);
                
            }
            return listaRepresentantes;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
    public Representante consultarRepresentanteDetalle(Representante _representante) throws Exception {

        Representante representanteConsultar = new Representante();
        CallableStatement cstmt;

        int response = 0;

        try {
            _bdCon = DAO.getBdConnect();
            cstmt = _bdCon.prepareCall(_sqlRepresentantesDetalle);
            
            cstmt.setInt(1, _representante.getCedula());
            
            rs = cstmt.executeQuery();
            
            while(rs.next()){
                
                representanteConsultar = new Representante(rs.getInt("cedula"), 
                                  rs.getString("primernombre"),
                                  rs.getString("segundonombre"),
                                  rs.getString("primerapellido"),
                                  rs.getString("segundoapellido"),
                                  rs.getDate("fechanac"),
                                  rs.getString("telefonocasa"),
                                  rs.getString("telefonomovil"),
                                  rs.getString("tipo"),
                                  rs.getString("foto"),
                                  rs.getString("estado"),
                                  rs.getString("municipio"),
                                  rs.getString("parroquia"));
                representanteConsultar.setError(RESULTADO_CODIGO_BIEN);    
            }
            return representanteConsultar;


        } catch (SQLException ex) {

            throw ex;

        } catch (Exception ex) {
            
            throw ex;

        } finally {
            _bdCon.close();
        }
    }
    
}
