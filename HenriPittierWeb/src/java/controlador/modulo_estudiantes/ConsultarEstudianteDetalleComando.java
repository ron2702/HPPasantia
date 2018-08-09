/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_estudiantes;

import comun.Estudiante;
import controlador.Comando;
import modelo.modulo_estudiantes.DAOEstudiante;


public class ConsultarEstudianteDetalleComando extends Comando {

    private Estudiante estudianteConsultar;
    private Estudiante respuesta;
    
    public ConsultarEstudianteDetalleComando (Estudiante _estudianteConsultar){
        this.estudianteConsultar = _estudianteConsultar;
    }
    
    @Override
    public void execute() throws Exception {
        DAOEstudiante daoEst = new DAOEstudiante();
        respuesta = daoEst.consultarEstudianteDetalle(estudianteConsultar);
    }
    
    public Estudiante obtenerRespuesta(){
        return this.respuesta;
    }
    
}
