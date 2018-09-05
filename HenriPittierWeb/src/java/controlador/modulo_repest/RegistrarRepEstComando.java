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
public class RegistrarRepEstComando extends Comando {
    
    private Rep_Est registrarREPEST;
    private Rep_Est respuesta;
    
    public RegistrarRepEstComando (Rep_Est _registrarREPEST){
        this.registrarREPEST = _registrarREPEST;
    }

    @Override
    public void execute() throws Exception {
        DAORepest daorep = new DAORepest();
        respuesta = daorep.registrarREPEST(registrarREPEST);
    }
    
    public Rep_Est obtenerRespuesta(){
        return respuesta;
    }
}
