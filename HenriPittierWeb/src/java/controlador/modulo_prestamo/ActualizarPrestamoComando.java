/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_prestamo;

import comun.Prestamo;
import controlador.Comando;
import modelo.modulo_prestamo.DAOPrestamo;


public class ActualizarPrestamoComando extends Comando{
    private Prestamo actualizarPrestamo;
    private Prestamo respuesta;
    
    public ActualizarPrestamoComando(Prestamo _actualizarPrestamo){
        this.actualizarPrestamo = _actualizarPrestamo;
    }
    
    @Override
    public void execute() throws Exception {
        DAOPrestamo daoprestamo = new DAOPrestamo();
        respuesta = daoprestamo.registrarPrestamo(actualizarPrestamo);
    }
    
     public Prestamo obtenerRespuesta(){
        return respuesta;
    }
    
}
