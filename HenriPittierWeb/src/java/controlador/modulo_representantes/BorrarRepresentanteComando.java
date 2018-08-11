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
public class BorrarRepresentanteComando extends Comando {
    
    private Representante borrarEmpleado;
    private Representante respuesta;
    
    public BorrarRepresentanteComando(Representante _borrarRepresentante){
        this.borrarEmpleado = _borrarRepresentante;
    }

    @Override
    public void execute() throws Exception {
        DAORepresentante daoRep = new DAORepresentante();
        respuesta = daoRep.borrarRepresentante(borrarEmpleado);
    }
    
    public Representante obtenerRespuesta(){
        return respuesta;
    }
    
}
