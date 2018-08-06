/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;

import java.util.Date;

/**
 *
 * @author LuisAlejandro
 */
public class Estudiante {
    
    private int cedula;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNac;
    private String foto;

    public Estudiante(int _cedula, String _primerNombre, String _segundoNombre, String _primerApellido, String _segundoApellido, Date _fechaNac, String _foto) {
        this.cedula = _cedula;
        this.primerNombre = _primerNombre;
        this.segundoNombre = _segundoNombre;
        this.primerApellido = _primerApellido;
        this.segundoApellido = _segundoApellido;
        this.fechaNac = _fechaNac;
        this.foto = _foto;
    }

    
    public int getCedula() {
        return cedula;
    }


    public void setCedula(int cedula) {
        this.cedula = cedula;
    }


    public String getPrimerNombre() {
        return primerNombre;
    }


    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }


    public String getSegundoNombre() {
        return segundoNombre;
    }


    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }


    public String getPrimerApellido() {
        return primerApellido;
    }


    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }


    public String getSegundoApellido() {
        return segundoApellido;
    }


    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}
