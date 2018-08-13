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
public class BorrarRepEstComando extends Comando {
    
    private REPEST borrarREPEST;
    private REPEST respuesta;
    
    public BorrarRepEstComando(REPEST _borrarREPEST){
        this.borrarREPEST = _borrarREPEST;
    }

    @Override
    public void execute() throws Exception {
        DAORepest daorep = new DAORepest();
        respuesta = daorep.borrarREPEST(borrarREPEST);
    }
    
    public REPEST obtenerRespuesta(){
        return respuesta;
    }
}
