/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;

/**
 *
 * @author Ronald
 */
public class Emp_Gru_Est {
    
    private int cedula_emp;
    private String primerNombre_emp;
    private String primerApellido_emp;
    private long cedulaEscolar_est;
    private String primerNombre_est;
    private String primerApellido_est;
    private String codigo_gr;
    private String nombre_gr;
    private int error;

    public Emp_Gru_Est() {
    }

    public Emp_Gru_Est(int cedula_emp, long cedulaEscolar_est, String codigo_gr) {
        this.cedula_emp = cedula_emp;
        this.cedulaEscolar_est = cedulaEscolar_est;
        this.codigo_gr = codigo_gr;
    }

    public Emp_Gru_Est(int cedula_emp, String primerNombre_emp, String primerApellido_emp, long cedulaEscolar_est, String primerNombre_est, String primerApellido_est, String codigo_gr, String nombre_gr) {
        this.cedula_emp = cedula_emp;
        this.primerNombre_emp = primerNombre_emp;
        this.primerApellido_emp = primerApellido_emp;
        this.cedulaEscolar_est = cedulaEscolar_est;
        this.primerNombre_est = primerNombre_est;
        this.primerApellido_est = primerApellido_est;
        this.codigo_gr = codigo_gr;
        this.nombre_gr = nombre_gr;
    }

    public int getCedula_emp() {
        return cedula_emp;
    }

    public void setCedula_emp(int cedula_emp) {
        this.cedula_emp = cedula_emp;
    }

    public String getPrimerNombre_emp() {
        return primerNombre_emp;
    }

    public void setPrimerNombre_emp(String primerNombre_emp) {
        this.primerNombre_emp = primerNombre_emp;
    }

    public String getPrimerApellido_emp() {
        return primerApellido_emp;
    }

    public void setPrimerApellido_emp(String primerApellido_emp) {
        this.primerApellido_emp = primerApellido_emp;
    }

    public long getCedulaEscolar_est() {
        return cedulaEscolar_est;
    }

    public void setCedulaEscolar_est(long cedulaEscolar_est) {
        this.cedulaEscolar_est = cedulaEscolar_est;
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

    public String getCodigo_gr() {
        return codigo_gr;
    }

    public void setCodigo_gr(String codigo_gr) {
        this.codigo_gr = codigo_gr;
    }

    public String getNombre_gr() {
        return nombre_gr;
    }

    public void setNombre_gr(String nombre_gr) {
        this.nombre_gr = nombre_gr;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
    
    
    
    
}
