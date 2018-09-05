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
public class BorrarRepEstComando extends Comando {
    
    private Rep_Est borrarREPEST;
    private Rep_Est respuesta;
    
    public BorrarRepEstComando(Rep_Est _borrarREPEST){
        this.borrarREPEST = _borrarREPEST;
    }

    @Override
    public void execute() throws Exception {
        DAORepest daorep = new DAORepest();
        respuesta = daorep.borrarREPEST(borrarREPEST);
    }
    
    public Rep_Est obtenerRespuesta(){
        return respuesta;
    }
}
