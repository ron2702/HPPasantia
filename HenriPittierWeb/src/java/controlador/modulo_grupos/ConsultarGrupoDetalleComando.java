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
public class ConsultarGrupoDetalleComando extends Comando {
    
    private Grupo grupoConsultado;
    private Grupo respuesta;

    public ConsultarGrupoDetalleComando(Grupo _grupoConsultado) {
        this.grupoConsultado = _grupoConsultado;
    }

    @Override
    public void execute() throws Exception {
        DAOGrupo daogr = new DAOGrupo();
        respuesta = daogr.consultarGrupoDetalle(grupoConsultado);
    }
    
    public Grupo obtenerRespuesta(){
        return respuesta;
    }
}
