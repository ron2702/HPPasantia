/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_estudiantes;

import comun.Estudiante;
import controlador.Comando;
import modelo.modulo_estudiantes.DAOEstudiante;

/**
 *
 * @author LuisAlejandro
 */
public class BorrarEstudianteComando extends Comando{
    
    private Estudiante borrarEstudiante;
    private Estudiante respuesta;
    
    public BorrarEstudianteComando(Estudiante _borrarEstudiante){
        this.borrarEstudiante = _borrarEstudiante;
    }

    @Override
    public void execute() throws Exception {
        DAOEstudiante daoEst = new DAOEstudiante();
        respuesta = daoEst.borrarEstudiante(borrarEstudiante);
    }
    
    public Estudiante obtenerRespuesta(){
        return respuesta;
    }
}
