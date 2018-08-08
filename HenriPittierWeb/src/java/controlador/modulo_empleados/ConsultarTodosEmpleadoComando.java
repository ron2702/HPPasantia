/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_empleados;

import comun.Empleado;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_empleados.DAOEmpleado;

/**
 *
 * @author LuisAlejandro
 */
public class ConsultarTodosEmpleadoComando extends Comando {
    
    private ArrayList<Empleado> respuesta;
    
    public ConsultarTodosEmpleadoComando (){
    }

    @Override
    public void execute() throws Exception {
        DAOEmpleado daoEmp = new DAOEmpleado();
        respuesta = daoEmp.consultarEmpleado();
    }
    
    public ArrayList<Empleado> obtenerRespuesta(){
        return this.respuesta;
    }
}
