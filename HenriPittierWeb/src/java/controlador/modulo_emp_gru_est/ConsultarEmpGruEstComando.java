/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_emp_gru_est;

import comun.Emp_Gru_Est;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_emp_gru_est.DAOEmp_Gru_Est;

/**
 *
 * @author Ronald
 */
public class ConsultarEmpGruEstComando extends Comando{
    
    private ArrayList<Emp_Gru_Est> respuesta;
    
    public ConsultarEmpGruEstComando(){
    }

    @Override
    public void execute() throws Exception {
        DAOEmp_Gru_Est daoege = new DAOEmp_Gru_Est();
        respuesta = daoege.consultarREPEST();
    }
    
    public ArrayList<Emp_Gru_Est> obtenerRespuesta(){
        return this.respuesta;
    }
}
