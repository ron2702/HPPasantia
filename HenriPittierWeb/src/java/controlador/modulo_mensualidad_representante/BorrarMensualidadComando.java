/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_mensualidad_representante;

import comun.Mensualidad_Representante;
import controlador.Comando;
import modelo.modulo_mensualidad_representante.DAOMensualidad_Representante;

/**
 *
 * @author Ronald
 */
public class BorrarMensualidadComando extends Comando {
    
    private Mensualidad_Representante borrarMensualidad;
    private Mensualidad_Representante respuesta;

    public BorrarMensualidadComando(Mensualidad_Representante borrarMensualidad) {
        this.borrarMensualidad = borrarMensualidad;
    }

    @Override
    public void execute() throws Exception {
        DAOMensualidad_Representante daoMensualidad = new DAOMensualidad_Representante();
        respuesta = daoMensualidad.borrarMensualidad(borrarMensualidad);
    }
    
    public Mensualidad_Representante obtenerRespuesta(){
        return respuesta;
    }
    
}
