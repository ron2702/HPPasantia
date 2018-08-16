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
public class ModificarInasistenciaComando extends Comando {
    
    private Inasistencia modificarInasistencia;
    private Inasistencia respuesta;

    public ModificarInasistenciaComando(Inasistencia _modificarInasistencia) {
        this.modificarInasistencia = _modificarInasistencia;
    }
      
    @Override
    public void execute() throws Exception {
        DAOInasistencia daoin = new DAOInasistencia();
        respuesta = daoin.modificarEstudiante(modificarInasistencia);
    }
    
    public Inasistencia obtenerRespuesta(){
        return respuesta;
    }
    
}
