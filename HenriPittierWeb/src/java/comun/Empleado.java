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
    private int sueldoMensualextra;
    private int sueldoQuincenal;
    private int sueldoQuincenalextra;
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
    private String estado;
    private String municipio;
    private String parroquia;
    private int error;
    
    public Empleado(){       
    }
    
    public Empleado(int _cedula){
        this.cedula = _cedula;
    }
    
    public Empleado(int _cedula, String _primerNombre, String _segundoNombre, String _primerApellido, String _segundoApellido, String _banco, int _sueldoMensual, int _sueldoMensualextra, int _sueldoQuincenal, int _sueldoQuincenalextra, Date _fechaIngreso, Date _fechaNac, String _telefonoCasa, String _telefonoMovil, String _cargo, int _asistencia, int _suplencia, String _foto, String _usuario, String _clave, String _estado, String _municipio, String _parroquia) {
        this.cedula = _cedula;
        this.primerNombre = _primerNombre;
        this.segundoNombre = _segundoNombre;
        this.primerApellido = _primerApellido;
        this.segundoApellido = _segundoApellido;
        this.banco = _banco;
        this.sueldoMensual = _sueldoMensual;
        this.sueldoMensualextra = _sueldoMensualextra;
        this.sueldoQuincenal = _sueldoQuincenal;
        this.sueldoQuincenalextra = _sueldoQuincenalextra;
        this.fechaIngreso = _fechaIngreso;
        this.fechaNac = _fechaNac;
        this.telefonoCasa = _telefonoCasa;
        this.telefonoMovil = _telefonoMovil;
        this.cargo = _cargo;
        this.asistencia = _asistencia;
        this.suplencia = _suplencia;
        this.foto = _foto;
        this.usuario = _usuario;
        this.clave = _clave;
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

    public int getSueldoMensualextra() {
        return sueldoMensualextra;
    }

    public void setSueldoMensualextra(int sueldoMensualextra) {
        this.sueldoMensualextra = sueldoMensualextra;
    }

    public int getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    public void setSueldoQuincenal(int sueldoQuincenal) {
        this.sueldoQuincenal = sueldoQuincenal;
    }

    public int getSueldoQuincenalextra() {
        return sueldoQuincenalextra;
    }

    public void setSueldoQuincenalextra(int sueldoQuincenalextra) {
        this.sueldoQuincenalextra = sueldoQuincenalextra;
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

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getSuplencia() {
        return suplencia;
    }

    public void setSuplencia(int suplencia) {
        this.suplencia = suplencia;
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
    
    
    
}
