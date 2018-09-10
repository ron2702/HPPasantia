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
public class RegistrarMensualidadComando extends Comando {
    
    private Mensualidad_Representante registroMensualidad;
    private Mensualidad_Representante respuesta;

    public RegistrarMensualidadComando(Mensualidad_Representante registroMensualidad) {
        this.registroMensualidad = registroMensualidad;
    }
    

    @Override
    public void execute() throws Exception {
        DAOMensualidad_Representante daoMensualidad = new DAOMensualidad_Representante();
        respuesta = daoMensualidad.registrarMensualidad(registroMensualidad);
    }
    
    public Mensualidad_Representante obtenerRespuesta(){
        return respuesta;
    }
    
}
