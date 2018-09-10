/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;

import java.util.Date;

/**
 *
 * @author Ronald
 */
public class Mensualidad_Representante {
    
    private String codigo;
    private Date fechapago;
    private String datosPago;
    private int monto;
    private String banco;
    private String codigoTransferencia;
    private int cedulaRepresentante;
    private String primerNombre_rep;
    private String primerApellido_rep;
    private long cedulaEstudiante;
    private String primerNombre_est;
    private String primerApellido_est;
    private int error;

    public Mensualidad_Representante() {
    }

    public Mensualidad_Representante(String codigo) {
        this.codigo = codigo;
    }

    public Mensualidad_Representante(String codigo, Date fechapago, String datosPago, int monto, String banco, String codigoTransferencia, int cedulaRepresentante, long cedulaEstudiante) {
        this.codigo = codigo;
        this.fechapago = fechapago;
        this.datosPago = datosPago;
        this.monto = monto;
        this.banco = banco;
        this.codigoTransferencia = codigoTransferencia;
        this.cedulaRepresentante = cedulaRepresentante;
        this.cedulaEstudiante = cedulaEstudiante;
    }

    public Mensualidad_Representante(String codigo, Date fechapago, String datosPago, int monto, String banco, String codigoTransferencia, int cedulaRepresentante, String primerNombre_rep, String primerApellido_rep, long cedulaEstudiante, String primerNombre_est, String primerApellido_est) {
        this.codigo = codigo;
        this.fechapago = fechapago;
        this.datosPago = datosPago;
        this.monto = monto;
        this.banco = banco;
        this.codigoTransferencia = codigoTransferencia;
        this.cedulaRepresentante = cedulaRepresentante;
        this.primerNombre_rep = primerNombre_rep;
        this.primerApellido_rep = primerApellido_rep;
        this.cedulaEstudiante = cedulaEstudiante;
        this.primerNombre_est = primerNombre_est;
        this.primerApellido_est = primerApellido_est;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public String getDatosPago() {
        return datosPago;
    }

    public void setDatosPago(String datosPago) {
        this.datosPago = datosPago;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCodigoTransferencia() {
        return codigoTransferencia;
    }

    public void setCodigoTransferencia(String codigoTransferencia) {
        this.codigoTransferencia = codigoTransferencia;
    }

    public int getCedulaRepresentante() {
        return cedulaRepresentante;
    }

    public void setCedulaRepresentante(int cedulaRepresentante) {
        this.cedulaRepresentante = cedulaRepresentante;
    }

    public String getPrimerNombre_rep() {
        return primerNombre_rep;
    }

    public void setPrimerNombre_rep(String primerNombre_rep) {
        this.primerNombre_rep = primerNombre_rep;
    }

    public String getPrimerApellido_rep() {
        return primerApellido_rep;
    }

    public void setPrimerApellido_rep(String primerApellido_rep) {
        this.primerApellido_rep = primerApellido_rep;
    }

    public long getCedulaEstudiante() {
        return cedulaEstudiante;
    }

    public void setCedulaEstudiante(long cedulaEstudiante) {
        this.cedulaEstudiante = cedulaEstudiante;
    }

    public String getPrimerNombre_est() {
        return primerNombre_est;
    }

    public void setPrimerNombre_est(String primerNombre_est) {
        this.primerNombre_est = primerNombre_est;
    }

    public String getPrimerApellido_est() {
        return primerApellido_est;
    }

    public void setPrimerApellido_est(String primerApellido_est) {
        this.primerApellido_est = primerApellido_est;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
    
    
    
}
