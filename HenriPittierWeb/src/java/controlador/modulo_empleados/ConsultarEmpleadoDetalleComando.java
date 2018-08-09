/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_empleados;

import comun.Empleado;
import controlador.Comando;
import modelo.modulo_empleados.DAOEmpleado;


public class ConsultarEmpleadoDetalleComando extends Comando{
    
    private Empleado empleadoConsultar;
    private Empleado respuesta;
    
    public ConsultarEmpleadoDetalleComando(Empleado _empleadoConsultar){
        this.empleadoConsultar = _empleadoConsultar;
    }
    
    @Override
    public void execute() throws Exception {
        DAOEmpleado daoEmp = new DAOEmpleado();
        respuesta = daoEmp.consultarEmpleadoDetalle(empleadoConsultar);
    }
    
    public Empleado obtenerRespuesta(){
        return this.respuesta;
    }
}
