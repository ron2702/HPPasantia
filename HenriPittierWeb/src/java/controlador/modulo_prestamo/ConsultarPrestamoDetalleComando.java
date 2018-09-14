/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_prestamo;

import comun.Prestamo;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_prestamo.DAOPrestamo;



public class ConsultarPrestamoDetalleComando extends Comando{
    private Prestamo consultarPrestamo;
    private ArrayList<Prestamo> respuesta;
    
    public ConsultarPrestamoDetalleComando(Prestamo _consultarPrestamo){
        this.consultarPrestamo = _consultarPrestamo;
    }
    
    @Override
    public void execute() throws Exception {
        DAOPrestamo daoprestamo = new DAOPrestamo();
        respuesta = daoprestamo.consultarPrestamo(consultarPrestamo);
    }
    
    public ArrayList<Prestamo> obtenerRespuesta(){
        return respuesta;
    }
}