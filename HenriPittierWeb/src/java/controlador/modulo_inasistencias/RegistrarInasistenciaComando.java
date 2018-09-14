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
 * @author Ronald
 */
public class RegistrarInasistenciaComando extends Comando {
    
    private Inasistencia registrarInasistencia;
    private Inasistencia respuesta;
    
    public RegistrarInasistenciaComando(Inasistencia _registrarInasistencia){
        this.registrarInasistencia = _registrarInasistencia;
    }

    @Override
    public void execute() throws Exception {
        DAOInasistencia daoin = new DAOInasistencia();
        respuesta = daoin.registrarInasistencia  (registrarInasistencia);
    }
    
    public Inasistencia obtenerRespuesta(){
        return respuesta;
    }
    
}
