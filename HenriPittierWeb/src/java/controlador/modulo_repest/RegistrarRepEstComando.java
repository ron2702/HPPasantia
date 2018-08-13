/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_repest;

import comun.REPEST;
import controlador.Comando;
import modelo.modulo_repest.DAORepest;

/**
 *
 * @author Ronald
 */
public class RegistrarRepEstComando extends Comando {
    
    private REPEST registrarREPEST;
    private REPEST respuesta;
    
    public RegistrarRepEstComando (REPEST _registrarREPEST){
        this.registrarREPEST = _registrarREPEST;
    }

    @Override
    public void execute() throws Exception {
        DAORepest daorep = new DAORepest();
        respuesta = daorep.registrarREPEST(registrarREPEST);
    }
    
    public REPEST obtenerRespuesta(){
        return respuesta;
    }
}
