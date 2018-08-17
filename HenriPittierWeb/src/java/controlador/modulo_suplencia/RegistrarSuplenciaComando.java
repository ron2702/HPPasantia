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
public class RegistrarSuplenciaComando extends Comando {
    
    private Suplencia registrarSuplencia;
    private Suplencia respuesta;
    
    public RegistrarSuplenciaComando(Suplencia _registrarSuplencia){
        this.registrarSuplencia = _registrarSuplencia;
    }

    @Override
    public void execute() throws Exception {
        DAOSuplencia daosup = new DAOSuplencia();
        respuesta = daosup.registrarSuplencia(registrarSuplencia);
    }
    
    public Suplencia obtenerRespuesta(){
        return respuesta;
    }
    
}
