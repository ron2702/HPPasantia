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
public class RegistrarRepresentanteComando extends Comando {
    
    private Representante registroRepresentante;
    private Representante respuesta;
    
    public RegistrarRepresentanteComando(Representante _representante){
        this.registroRepresentante = _representante;
    }

    @Override
    public void execute() throws Exception {
        DAORepresentante daoRep = new DAORepresentante();
        respuesta = daoRep.registrarRepresentante(registroRepresentante);
    }
    
    public Representante obtenerRespuesta(){
        return respuesta;
    }
    
}
