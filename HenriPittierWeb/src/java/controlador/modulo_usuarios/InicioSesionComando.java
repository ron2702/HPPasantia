/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulo_usuarios;

import comun.Usuario;
import controlador.Comando;
import modelo.modulo_usuarios.DAOUsuario;

/**
 *
 * @author LuisAlejandro
 */
public class InicioSesionComando extends Comando{
    private Usuario usuarioLogin;
    private Usuario respuesta;
    
    public InicioSesionComando(Usuario _usuarioLogin){
        this.usuarioLogin = _usuarioLogin;
    } 

    @Override
    public void execute() throws Exception {
        DAOUsuario dao = new DAOUsuario();
        respuesta = dao.iniciarSesion(usuarioLogin);
    }
    
    public Usuario obtenerRespuesta(){
        return respuesta;
    }
}
