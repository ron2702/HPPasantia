/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_empleados;

import comun.Empleado;
import controlador.Comando;
import modelo.modulo_empleados.DAOEmpleado;

/**
 *
 * @author LuisAlejandro
 */
public class BorrarEmpleadoComando extends Comando {
    private Empleado borrarEmpleado;
    private Empleado respuesta;
    
    public BorrarEmpleadoComando(Empleado _borrarEmpleado){
        this.borrarEmpleado = _borrarEmpleado;
    }

    @Override
    public void execute() throws Exception {
        DAOEmpleado daoEmp = new DAOEmpleado();
        respuesta = daoEmp.borrarEmpleado(borrarEmpleado);
    }
    
    public Empleado obtenerRespuesta(){
        return respuesta;
    }
}
