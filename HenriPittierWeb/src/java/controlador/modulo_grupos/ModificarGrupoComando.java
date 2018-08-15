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
public class ModificarGrupoComando extends Comando {
    
    private Grupo modificarGrupo;
    private Grupo respuesta;

    public ModificarGrupoComando(Grupo _modificarGrupo) {
        this.modificarGrupo = _modificarGrupo;
    }
   
    @Override
    public void execute() throws Exception {
        DAOGrupo daogr = new DAOGrupo();
        respuesta = daogr.modificarGrupo(modificarGrupo);
    }
    
    public Grupo obtenerRespuesta(){
        return respuesta;
    }
    
}
