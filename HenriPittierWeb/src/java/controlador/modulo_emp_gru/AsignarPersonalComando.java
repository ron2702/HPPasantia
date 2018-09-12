/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_emp_gru;

import comun.Emp_Gru_Est;
import controlador.Comando;
import modelo.modulo_emp_gru.DAOEmp_Gru;


public class AsignarPersonalComando extends Comando{
    private Emp_Gru_Est asignarGrupo;
    private Emp_Gru_Est respuesta;
    
    public AsignarPersonalComando(Emp_Gru_Est _asignarGrupo){
        this.asignarGrupo = _asignarGrupo;
    }
    
    @Override
    public void execute() throws Exception {
        DAOEmp_Gru daoempgru = new DAOEmp_Gru();
        respuesta = daoempgru.registrarEmpGru(asignarGrupo);
    }
    
    public Emp_Gru_Est obtenerRespuesta(){
        return respuesta;
    }
}
    
    