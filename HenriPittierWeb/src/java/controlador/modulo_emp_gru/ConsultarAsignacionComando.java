/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_emp_gru;

import comun.Emp_Gru_Est;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_emp_gru.DAOEmp_Gru;


public class ConsultarAsignacionComando extends Comando {
    private ArrayList<Emp_Gru_Est> respuesta;
    
    
    @Override
    public void execute() throws Exception {
        DAOEmp_Gru daoempgru = new DAOEmp_Gru();
        respuesta = daoempgru.consultarEmpGru();
    }
    
    public ArrayList<Emp_Gru_Est> obtenerRespuesta(){
        return respuesta;
    }
}

