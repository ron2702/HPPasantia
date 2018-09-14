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
public class BorrarSalidaComando extends Comando {
    
    private Control_Salida borrarSalida;
    private Control_Salida respuesta;

    public BorrarSalidaComando(Control_Salida borrarSalida) {
        this.borrarSalida = borrarSalida;
    }

    @Override
    public void execute() throws Exception {
        DAOControl_Salida daoControl = new DAOControl_Salida();
        respuesta = daoControl.borrarSalida(borrarSalida);
    }
    
    public Control_Salida obtenerRespuesta(){
        return respuesta;
    }
    
}
