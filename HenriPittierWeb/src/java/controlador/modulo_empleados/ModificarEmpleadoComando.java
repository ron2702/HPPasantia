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
public class ModificarEmpleadoComando extends Comando{
    private Empleado modificarEmpleado;
    private Empleado respuesta;
    
    public ModificarEmpleadoComando(Empleado _modificarEmpleado){
        this.modificarEmpleado = _modificarEmpleado;
    }

    @Override
    public void execute() throws Exception {
        DAOEmpleado daoEmp = new DAOEmpleado();
        respuesta = daoEmp.modificarEmpleado(modificarEmpleado);
    }
    
    public Empleado obtenerRespuesta(){
        return respuesta;
    }
}
