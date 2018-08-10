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
public class RegistrarEmpleadoComando extends Comando{
    private Empleado registroEmpleado;
    private Empleado respuesta;
    
    public RegistrarEmpleadoComando (Empleado _registroEmpleado){
        this.registroEmpleado = _registroEmpleado;
    }

    @Override
    public void execute() throws Exception {
        DAOEmpleado daoEmp = new DAOEmpleado();
        respuesta = daoEmp.registrarEmpleado(registroEmpleado);
    }
    
    public Empleado obtenerRespuesta(){
        return respuesta;
    }
}
