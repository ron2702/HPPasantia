/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_grupos;

import comun.Grupo;
import controlador.Comando;
import java.util.ArrayList;
import modelo.modulo_grupo.DAOGrupo;

/**
 *
 * @author Ronald
 */
public class ConsultarGrupoComando extends Comando {
    
    private ArrayList<Grupo> respuesta;

    public ConsultarGrupoComando() {
    }
    
    
    @Override
    public void execute() throws Exception {
        DAOGrupo daogr = new DAOGrupo();
        respuesta = daogr.consultarGrupos();
    }
    
    public ArrayList<Grupo> obtenerRespuesta(){
        return this.respuesta;
    }
    
}
