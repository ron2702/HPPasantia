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
public class ModificarSuplenciaComando extends Comando {
    
    private Suplencia modificarSuplencia;
    private Suplencia respuesta;

    public ModificarSuplenciaComando(Suplencia _modificarSuplencia) {
        this.modificarSuplencia = _modificarSuplencia;
    }
    
    @Override
    public void execute() throws Exception {
        DAOSuplencia daosup = new DAOSuplencia();
        respuesta = daosup.modificarSuplencia(modificarSuplencia);
    }
    
    public Suplencia obtenerRespuesta(){
        return respuesta;
    }
    
}
