/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_representantes;

import comun.Representante;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_representantes.DAORepresentante;

/**
 *
 * @author Ronald
 */
public class ConsultarRepresentantesComando extends Comando {

    private ArrayList<Representante> respuesta;
    
    public ConsultarRepresentantesComando(){
    }
    
    public void execute() throws Exception {
        DAORepresentante daoRep = new DAORepresentante();
        respuesta = daoRep.consultarRepresentantes();
    }
    
    public ArrayList<Representante> obtenerRespuesta(){
        return this.respuesta;
    }
    
}
