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
public class RegistrarGrupoComando extends Comando {
    
    private Grupo registrarGrupo;
    private Grupo respuesta;

    public RegistrarGrupoComando(Grupo _registrarGrupo) {
        this.registrarGrupo = _registrarGrupo;
    }

    @Override
    public void execute() throws Exception {
        DAOGrupo daogr = new DAOGrupo();
        respuesta = daogr.registrarGrupo(registrarGrupo);
    }
    
    public Grupo obtenerRespuesta(){
        return respuesta;
    }
}
