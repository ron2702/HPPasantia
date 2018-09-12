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
public class AsignarEstudianteGrupoComando extends Comando{
    
    private Emp_Gru_Est asignarEstudianteGrupo;
    private Emp_Gru_Est respuesta;
    
    public AsignarEstudianteGrupoComando(Emp_Gru_Est _asignarEstudianteGrupo){
        this.asignarEstudianteGrupo = _asignarEstudianteGrupo;
    }

    @Override
    public void execute() throws Exception {
        DAOGru_Est daogruest = new DAOGru_Est();
        respuesta = daogruest.asignarGruEst(asignarEstudianteGrupo);
    }
    
    public Emp_Gru_Est obtenerRespuesta(){
        return respuesta;
    }
    
}
