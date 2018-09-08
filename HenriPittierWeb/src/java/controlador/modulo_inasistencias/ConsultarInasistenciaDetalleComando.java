/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_inasistencias;

import comun.Inasistencia;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_inasistencias.DAOInasistencia;

/**
 *
 * @author Ronald
 */
public class ConsultarInasistenciaDetalleComando extends Comando {
    
    private Inasistencia consultarInasistencia;
    private ArrayList<Inasistencia> respuesta;
    
    public ConsultarInasistenciaDetalleComando(Inasistencia _consultarInasistencia){
        this.consultarInasistencia = _consultarInasistencia;
    }

    @Override
    public void execute() throws Exception {
        DAOInasistencia daoin = new DAOInasistencia();
        respuesta = daoin.consultarInasistenciaDetalle(consultarInasistencia);
    }
    
    public ArrayList<Inasistencia> obtenerRespuesta(){
        return respuesta;
    }
    
}
