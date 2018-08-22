/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_lugares;

import comun.Lugar;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_lugares.DAOLugar;

/**
 *
 * @author Ronald
 */
public class ConsultarEstadosComando extends Comando {
    
    private ArrayList<Lugar> respuesta;

    public ConsultarEstadosComando() {
    }

    @Override
    public void execute() throws Exception {
        DAOLugar daolugar = new DAOLugar();
        respuesta = daolugar.consultarEstados();
    }
    
    public ArrayList<Lugar> obtenerRespuesta(){
        return respuesta;
    }
    
}
