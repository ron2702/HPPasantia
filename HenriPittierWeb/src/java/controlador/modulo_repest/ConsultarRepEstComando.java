/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_repest;

import comun.REPEST;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_repest.DAORepest;

/**
 *
 * @author Ronald
 */
public class ConsultarRepEstComando extends Comando {
    
    private ArrayList<REPEST> respuesta;
    
    public ConsultarRepEstComando(){
        
    }

    @Override
    public void execute() throws Exception {
        DAORepest daorepest = new DAORepest();
        respuesta = daorepest.consultarREPEST();
    }
    
    public ArrayList<REPEST> obtenerRespuesta(){
        return this.respuesta;
    }
}
