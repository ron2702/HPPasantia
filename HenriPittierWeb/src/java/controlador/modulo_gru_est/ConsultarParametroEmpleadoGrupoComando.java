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
public class ConsultarParametroEmpleadoGrupoComando extends Comando {
    
    private Emp_Gru_Est gruestConsultar;
    private ArrayList<Emp_Gru_Est> respuesta;
    
    public ConsultarParametroEmpleadoGrupoComando(Emp_Gru_Est gruestConsultar) {
        this.gruestConsultar = gruestConsultar;
    }

    @Override
    public void execute() throws Exception {
        DAOGru_Est daogruest = new DAOGru_Est();
        respuesta = daogruest.consultarEmpGrutParametro(gruestConsultar);
    }
    
     public ArrayList<Emp_Gru_Est> obtenerRespuesta(){
        return this.respuesta;
    }
    
}
