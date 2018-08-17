/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_suplencia;

import comun.Suplencia;
import controlador.Comando;
import modelo.modulo_suplencias.DAOSuplencia;

/**
 *
 * @author Ronald
 */
public class BorrarSuplenciaComando extends Comando {
    
    private Suplencia borrarSuplencia;
    private Suplencia respuesta;

    public BorrarSuplenciaComando(Suplencia _borrarSuplencia) {
        this.borrarSuplencia = _borrarSuplencia;
    }
    
    @Override
    public void execute() throws Exception {
        DAOSuplencia daosup = new DAOSuplencia();
        respuesta = daosup.borrarInasistencia(borrarSuplencia);
    }
    
    public Suplencia obtenerRespuesta(){
        return respuesta;
    }
    
}
