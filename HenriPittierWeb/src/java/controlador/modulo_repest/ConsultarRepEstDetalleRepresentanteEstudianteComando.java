/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_repest;

import comun.Rep_Est;
import controlador.Comando;
import modelo.modulo_repest.DAORepest;

/**
 *
 * @author Ronald
 */
public class ConsultarRepEstDetalleRepresentanteEstudianteComando extends Comando {
    
    private Rep_Est repestConsultar;
    private Rep_Est respuesta;

    public ConsultarRepEstDetalleRepresentanteEstudianteComando(Rep_Est _repestConsultar) {
        this.repestConsultar = _repestConsultar;
    }
    
    @Override
    public void execute() throws Exception {
         DAORepest daorep = new DAORepest();
         respuesta = daorep.consultarREPESTDetalleRepresentanteEstudiante(repestConsultar);
    }
    
    public Rep_Est obtenerRespuesta(){
        return respuesta;
    }
    
}
