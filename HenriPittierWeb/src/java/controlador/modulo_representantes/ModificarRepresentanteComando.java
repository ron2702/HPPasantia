/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_representantes;

import comun.Representante;
import controlador.Comando;
import modelo.modulo_representantes.DAORepresentante;

/**
 *
 * @author Ronald
 */
public class ModificarRepresentanteComando extends Comando {
    
    private Representante modificarRepresentante;
    private Representante respuesta;

    public ModificarRepresentanteComando(Representante _modificarRepresentante) {
        this.modificarRepresentante = _modificarRepresentante;
    }
    
    

    @Override
    public void execute() throws Exception {
        DAORepresentante daoRep = new DAORepresentante();
        respuesta = daoRep.modificarRepresentante(modificarRepresentante);
    }
    
    public Representante obtenerRespuesta(){
        return respuesta;
    }
}
