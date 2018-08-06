/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;

/**
 *
 * @author LuisAlejandro
 */
public class Usuario {
    private String usuario;
    private String clave;
    private int error;
    
    public Usuario(){ }

    public Usuario(String _usuario, String _clave){
        this.usuario = _usuario;
        this.clave = _clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
}
