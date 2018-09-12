/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_emp_gru_est;

import comun.Emp_Gru_Est;
import controlador.Comando;
import modelo.modulo_emp_gru_est.DAOEmp_Gru_Est;

/**
 *
 * @author Ronald
 */
public class ConsultarEmpGruEstDetalleComando extends Comando {
    
    private Emp_Gru_Est consultarEmpGruEst;
    private Emp_Gru_Est respuesta;
    
    public ConsultarEmpGruEstDetalleComando(Emp_Gru_Est _consultarEmpGruEst){
        this.consultarEmpGruEst = _consultarEmpGruEst;
    }

    @Override
    public void execute() throws Exception {
        DAOEmp_Gru_Est daoempgruest = new DAOEmp_Gru_Est();
        respuesta = daoempgruest.consultarEmpGruEstDetalle(consultarEmpGruEst);
    }
    
    public Emp_Gru_Est obtenerRespuesta(){
        return respuesta;
    }
    
}
