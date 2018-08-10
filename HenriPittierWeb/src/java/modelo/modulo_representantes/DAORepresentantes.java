
package modelo.modulo_representantes;

import comun.Representante;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.DAO;
import static modelo.Registry.RESULTADO_CODIGO_BIEN;

/**
 *
 * @author Ronald
 */
public class DAORepresentantes extends DAO {
    
    private Connection _bdCon;
    private static String _sqlRepresentantesConsultar = "{call REPRESENTANTE_CONSULTAR_TODOS()}";
    private static String _sqlRepresentantesDetalle = "{call REPRESENTANTE_CONSULTAR_DETALLE(?)}";
    private ResultSet rs;
    
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
    
}
