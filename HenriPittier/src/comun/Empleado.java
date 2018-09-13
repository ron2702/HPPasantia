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
public class Empleado {
    
    private int cedula;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String banco;
    private int sueldoMensual;
    private int sueldoMensualExtra;
    private int sueldoQuincenal;
    private int sueldoQuincenalExtra;
    private Date fechaIngreso;
    private Date fechaNac;
    private String telefonoCasa;
    private String telefonoMovil;
    private String cargo;
    private int asistencia;
    private int suplencia;
    private String foto;
    private String usuario;
    private String clave;
    private String tareasdirigidas;
    private String estado;
    private String municipio;
    private String parroquia;
    private int error;
    
    public Empleado(){       
    }
    
    public Empleado(int _cedula){
        this.cedula = _cedula;
    }
    
    public Empleado(int _cedula, String _primerNombre, String _segundoNombre, String _primerApellido, String _segundoApellido, String _banco, int _sueldoMensual, Date _fechaIngreso, Date _fechaNac, String _telefonoCasa, String _telefonoMovil, String _cargo, String _foto, String _usuario, String _clave, String _tareasdirigidas, String _estado, String _municipio, String _parroquia) {
        this.cedula = _cedula;
        this.primerNombre = _primerNombre;
        this.segundoNombre = _segundoNombre;
        this.primerApellido = _primerApellido;
        this.segundoApellido = _segundoApellido;
        this.banco = _banco;
        this.sueldoMensual = _sueldoMensual;
        this.fechaIngreso = _fechaIngreso;
        this.fechaNac = _fechaNac;
        this.telefonoCasa = _telefonoCasa;
        this.telefonoMovil = _telefonoMovil;
        this.cargo = _cargo;
        this.foto = _foto;
        this.usuario = _usuario;
        this.clave = _clave;
        this.tareasdirigidas = _tareasdirigidas;
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

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(int sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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

    public String getTareasDirigidas() {
        return tareasdirigidas;
    }

    public void setTareasDirigidas(String clave) {
        this.tareasdirigidas = tareasdirigidas;
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
        return this.cedula + "- " + this.primerNombre + " " + this.primerApellido;
    }
    
}
