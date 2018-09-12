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
public class RegistrarEmpGruEstComando extends Comando{
    
    private Emp_Gru_Est registrarEmpGruEst;
    private Emp_Gru_Est respuesta;
    
    public RegistrarEmpGruEstComando(Emp_Gru_Est _registrarEmpGruEst){
        this.registrarEmpGruEst = _registrarEmpGruEst;
    }

    @Override
    public void execute() throws Exception {
        DAOEmp_Gru_Est daoempgruest = new DAOEmp_Gru_Est();
        respuesta = daoempgruest.registrarEmpGruEst(registrarEmpGruEst);
    }
    
    public Emp_Gru_Est obtenerRespuesta(){
        return respuesta;
    }
    
}
