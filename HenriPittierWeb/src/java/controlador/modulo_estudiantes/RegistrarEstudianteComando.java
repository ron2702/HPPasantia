/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_estudiantes;

import comun.Estudiante;
import controlador.Comando;
import modelo.modulo_estudiantes.DAOEstudiante;

public class RegistrarEstudianteComando extends Comando {
    
    private Estudiante registroEstudiante;
    private Estudiante respuesta;
    
    public RegistrarEstudianteComando (Estudiante _registroEstudiante){
        this.registroEstudiante = _registroEstudiante;
    }

    @Override
    public void execute() throws Exception {
        DAOEstudiante daoEst = new DAOEstudiante();
        respuesta = daoEst.registrarEstudiante(registroEstudiante);
    }
    
    public Estudiante obtenerRespuesta(){
        return respuesta;
    }
}
