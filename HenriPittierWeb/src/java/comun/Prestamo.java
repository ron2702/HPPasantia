/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;

import java.util.Date;


public class Prestamo {
    private Date fechaPrestamo;
    private int monto;
    private int fk_empleado;
    private int error;
    
    public Prestamo(){
    }
    
    public Prestamo(int _cedula){
        this.fk_empleado = _cedula;
    }
    
    public Prestamo(Date _fechaPrestamo, int _monto, int _cedula){
        this.fechaPrestamo = _fechaPrestamo;
        this.monto = _monto;
        this.fk_empleado = _cedula;
    }

    /**
     * @return the fechaprestamo
     */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * @param fechaprestamo the fechaprestamo to set
     */
    public void setFechaprestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * @return the monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }

    /**
     * @return the fk_empleado
     */
    public int getFk_empleado() {
        return fk_empleado;
    }

    /**
     * @param fk_empleado the fk_empleado to set
     */
    public void setFk_empleado(int fk_empleado) {
        this.fk_empleado = fk_empleado;
    }

    /**
     * @return the error
     */
    public int getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(int error) {
        this.error = error;
    }
    
}
