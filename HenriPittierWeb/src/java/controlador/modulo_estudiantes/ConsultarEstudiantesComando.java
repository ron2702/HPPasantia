/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_estudiantes;

import comun.Estudiante;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_estudiantes.DAOEstudiante;


/**
 *
 * @author LuisAlejandro
 */
public class ConsultarEstudiantesComando extends Comando {

    private ArrayList<Estudiante> respuesta;
    
    public ConsultarEstudiantesComando (){
    }
    
    @Override
    public void execute() throws Exception {
        
        DAOEstudiante daoEst = new DAOEstudiante();
        respuesta = daoEst.consultarEstudiantes();
    }
    
    public ArrayList<Estudiante> obtenerRespuesta(){
        return this.respuesta;
    }
    
}
