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
public class ConsultarRepEstDetalleComando extends Comando {
    
    private REPEST repestConsultar;
    private REPEST respuesta;

    public ConsultarRepEstDetalleComando(REPEST _repestConsultar){
        this.repestConsultar = _repestConsultar;
    }
    
    @Override
    public void execute() throws Exception {
        DAORepest daorepest = new DAORepest();
        respuesta = daorepest.consultarREPESTDetalle(repestConsultar);
    }
    
    public REPEST obtenerRespuesta(){
        return this.respuesta;
    }
}
