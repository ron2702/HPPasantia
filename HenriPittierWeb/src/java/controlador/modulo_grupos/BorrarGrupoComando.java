/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_grupos;

import comun.Grupo;
import controlador.Comando;
import modelo.modulo_grupo.DAOGrupo;

/**
 *
 * @author Ronald
 */
public class BorrarGrupoComando extends Comando{
    
    private Grupo borrarGrupo;
    private Grupo respuesta;

    public BorrarGrupoComando(Grupo _borrarGrupo) {
        this.borrarGrupo = _borrarGrupo;
    }
    
    @Override
    public void execute() throws Exception {
        DAOGrupo daogr = new DAOGrupo();
        respuesta = daogr.borrarGrupo(borrarGrupo);
    }
    
    public Grupo obtenerRespuesta(){
        return respuesta;
    } 
   
}
