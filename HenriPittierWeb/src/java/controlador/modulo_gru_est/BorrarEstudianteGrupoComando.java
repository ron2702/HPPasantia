/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_gru_est;

import comun.Emp_Gru_Est;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_gru_est.DAOGru_Est;

/**
 *
 * @author Ronald
 */
public class BorrarEstudianteGrupoComando extends Comando{
    
    private ArrayList<Emp_Gru_Est> respuesta;
    
    public BorrarEstudianteGrupoComando(){
    }

    @Override
    public void execute() throws Exception {
        DAOGru_Est daoege = new DAOGru_Est();
        //respuesta = daoege.consultarREPEST();
    }
    
    public ArrayList<Emp_Gru_Est> obtenerRespuesta(){
        return this.respuesta;
    }
}
