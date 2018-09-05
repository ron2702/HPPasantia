/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_repest;

import comun.Rep_Est;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_repest.DAORepest;

/**
 *
 * @author Ronald
 */
public class ConsultarRepEstDetalleEscolarComando extends Comando {
    
    private Rep_Est repestConsultar;
    private ArrayList<Rep_Est> respuesta;

    public ConsultarRepEstDetalleEscolarComando(Rep_Est _repestConsultar) {
        this.repestConsultar = _repestConsultar;
    }
    
    @Override
    public void execute() throws Exception {
        DAORepest daorepest = new DAORepest();
        respuesta = daorepest.consultarREPESTDetalleEscolar(repestConsultar);
    }
    
    public ArrayList<Rep_Est> obtenerRespuesta(){
        return this.respuesta;
    }
    
}
