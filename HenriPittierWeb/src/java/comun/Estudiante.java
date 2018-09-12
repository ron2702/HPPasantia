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
    
    private long cedulaEscolar;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNac;
    private String foto;
    private String cedulaMAPFRE;
    private String sexo;
    private int error;

    public Estudiante(){
    }
    
    public Estudiante(long _cedula){
        this.cedulaEscolar = _cedula;
    }

    public Estudiante(long cedulaEscolar, String primerNombre, String primerApellido) {
        this.cedulaEscolar = cedulaEscolar;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    public Estudiante(long _cedula, String _primerNombre, String _segundoNombre, String _primerApellido, String _segundoApellido, Date _fechaNac, String _foto, String _cedulaMAPFRE, String _sexo) {
        this.cedulaEscolar = _cedula;
        this.primerNombre = _primerNombre;
        this.segundoNombre = _segundoNombre;
        this.primerApellido = _primerApellido;
        this.segundoApellido = _segundoApellido;
        this.fechaNac = _fechaNac;
        this.foto = _foto;
        this.cedulaMAPFRE = _cedulaMAPFRE;
        this.sexo = _sexo;
    }

    
    public long getCedulaEscolar() {
        return cedulaEscolar;
    }


    public void setCedulaEscolar(long cedulaEscolar) {
        this.cedulaEscolar = cedulaEscolar;
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

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getCedulaMAPFRE() {
        return cedulaMAPFRE;
    }

    public void setCedulaMAPFRE(String cedulaMAPFRE) {
        this.cedulaMAPFRE = cedulaMAPFRE;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        return this.cedulaEscolar + " - " + this.primerNombre + " " + this.primerApellido;
    }
    
}
