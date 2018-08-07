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
public class ModificarEstudianteComando extends Comando{
    
    private Estudiante modificarEstudiante;
    private Estudiante respuesta;
    
    public ModificarEstudianteComando (Estudiante _modificarEstudiante){
        this.modificarEstudiante = _modificarEstudiante;
    }

    @Override
    public void execute() throws Exception {
        DAOEstudiante daoEst = new DAOEstudiante();
        respuesta = daoEst.modificarEstudiante(modificarEstudiante);
    }
    
    public Estudiante obtenerRespuesta(){
        return respuesta;
    }
}
