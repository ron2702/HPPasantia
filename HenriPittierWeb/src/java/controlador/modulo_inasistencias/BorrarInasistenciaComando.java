/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_inasistencias;

import comun.Inasistencia;
import controlador.Comando;
import modelo.modulo_inasistencias.DAOInasistencia;

/**
 *
 * @author LuisAlejandro
 */
public class BorrarInasistenciaComando extends Comando {
    
    private Inasistencia borrarInasistencia;
    private Inasistencia respuesta;

    public BorrarInasistenciaComando(Inasistencia _borrarInasistencia) {
        this.borrarInasistencia = _borrarInasistencia;
    }
    
    

    @Override
    public void execute() throws Exception {
        DAOInasistencia daoin = new DAOInasistencia();
        respuesta = daoin.borrarInasistencia(borrarInasistencia);
    }
    
    public Inasistencia obtenerRespuesta(){
        return respuesta;
    }
}
