/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_gru_est;

import comun.Emp_Gru_Est;
import controlador.Comando;
import modelo.modulo_gru_est.DAOGru_Est;

/**
 *
 * @author Ronald
 */
public class ConsultarEstudianteGrupoComando extends Comando {
    
    private Emp_Gru_Est consultarEmpGruEst;
    private Emp_Gru_Est respuesta;
    
    public ConsultarEstudianteGrupoComando(Emp_Gru_Est _consultarEmpGruEst){
        this.consultarEmpGruEst = _consultarEmpGruEst;
    }

    @Override
    public void execute() throws Exception {
        DAOGru_Est daoempgruest = new DAOGru_Est();
        //respuesta = daoempgruest.consultarEmpGruEstDetalle(consultarEmpGruEst);
    }
    
    public Emp_Gru_Est obtenerRespuesta(){
        return respuesta;
    }
    
}
