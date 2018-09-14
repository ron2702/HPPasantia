/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_control_salida;

import comun.Control_Salida;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_control_salida.DAOControl_Salida;

/**
 *
 * @author Ronald
 */
public class ConsultarSalidaComando extends Comando {
    
     private ArrayList<Control_Salida> respuesta;

    @Override
    public void execute() throws Exception {
        DAOControl_Salida daoControl = new DAOControl_Salida();
        respuesta = daoControl.consultarSalida();
    }
    
    public ArrayList<Control_Salida> obtenerRespuesta(){
        return respuesta;
    }
    
}
