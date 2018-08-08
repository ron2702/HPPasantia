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


public class ConsultarEmpleadoPorCedulaComando extends Comando{
    
    private Empleado empleadoConsultado;
    private ArrayList<Empleado> respuesta;
    
    public ConsultarEmpleadoPorCedulaComando(Empleado _empleadoConsultado){
        this.empleadoConsultado = _empleadoConsultado;
    }
    
    @Override
    public void execute() throws Exception {
        DAOEmpleado daoEmp = new DAOEmpleado();
        respuesta = daoEmp.consultarEmpleadoPorCedula(empleadoConsultado);
    }
    
    public ArrayList<Empleado> obtenerRespuesta(){
        return this.respuesta;
    }
}
