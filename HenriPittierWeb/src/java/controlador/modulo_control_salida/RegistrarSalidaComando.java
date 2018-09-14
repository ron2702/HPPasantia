/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_control_salida;

import comun.Control_Salida;
import controlador.Comando;
import modelo.modulo_control_salida.DAOControl_Salida;

/**
 *
 * @author Ronald
 */
public class RegistrarSalidaComando extends Comando {
    
    private Control_Salida registrarSalida;
    private Control_Salida respuesta;

    public RegistrarSalidaComando(Control_Salida registrarSalida) {
        this.registrarSalida = registrarSalida;
    }


    @Override
    public void execute() throws Exception {
        DAOControl_Salida daoControl = new DAOControl_Salida();
        respuesta = daoControl.asignarSalida(registrarSalida);
    }
    
    public Control_Salida obtenerRespuesta(){
        return respuesta;
    }
    
}
