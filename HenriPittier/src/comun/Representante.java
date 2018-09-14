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
public class Representante {
    
    private int cedula;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNac;
    private String email;
    private String telefonoCasa;
    private String telefonoMovil;
    private String tipo;
    private String foto;
    private String estado;
    private String municipio;
    private String parroquia;
    private int error;
    
    public Representante(){
    }
    
    public Representante(int _cedula){
        this.cedula = _cedula;
    }
    
    public Representante(int cedula, String primerNombre, String primerApellido) {
        this.cedula = cedula;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    public Representante(int _cedula, String _primerNombre, String _segundoNombre, String _primerApellido, String _segundoApellido, Date _fechaNac, String _email, String _telefonoCasa, String _telefonoMovil, String _tipo, String _foto, String _estado, String _municipio, String _parroquia) {
        this.cedula = _cedula;
        this.primerNombre = _primerNombre;
        this.segundoNombre = _segundoNombre;
        this.primerApellido = _primerApellido;
        this.segundoApellido = _segundoApellido;
        this.fechaNac = _fechaNac;
        this.email = _email;
        this.telefonoCasa = _telefonoCasa;
        this.telefonoMovil = _telefonoMovil;
        this.tipo = _tipo;
        this.foto = _foto;
        this.estado = _estado;
        this.municipio = _municipio;
        this.parroquia = _parroquia;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
    
    @Override
    public String toString() {
        return this.cedula + " - " + this.primerNombre + " " + this.primerApellido;
    }
    
}
