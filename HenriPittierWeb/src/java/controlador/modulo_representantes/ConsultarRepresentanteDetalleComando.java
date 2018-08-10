/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_representantes;

import comun.Representante;
import controlador.Comando;
import modelo.modulo_representantes.DAORepresentantes;

/**
 *
 * @author Ronald
 */
public class ConsultarRepresentanteDetalleComando extends Comando {
    
    private Representante representanteConsultar;
    private Representante respuesta;
    
    public ConsultarRepresentanteDetalleComando (Representante _representanteConsultar){
        this.representanteConsultar = _representanteConsultar;
    }

    @Override
    public void execute() throws Exception {
        DAORepresentantes daoRep = new DAORepresentantes();
        respuesta = daoRep.consultarRepresentanteDetalle(representanteConsultar);
    }
    
    public Representante obtenerRespuesta(){
        return this.respuesta;
    }
    
}
