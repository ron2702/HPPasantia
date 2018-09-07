/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_suplencia;

import comun.Suplencia;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_suplencias.DAOSuplencia;

/**
 *
 * @author Ronald
 */
public class ConsultarSuplenciaDetalleComando extends Comando {
    
    private Suplencia consultarSuplencia;
    private ArrayList<Suplencia> respuesta;

    public ConsultarSuplenciaDetalleComando(Suplencia _consultarSuplencia) {
        this.consultarSuplencia = _consultarSuplencia;
    }

    @Override
    public void execute() throws Exception {
        DAOSuplencia daosup = new DAOSuplencia();
        respuesta = daosup.consultarSuplenciaDetalle(consultarSuplencia);
    }
    
     public ArrayList<Suplencia> obtenerRespuesta(){
        return respuesta;
    }
    
}
