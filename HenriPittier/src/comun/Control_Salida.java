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
public class Control_Salida {
    
    private Date fechaSalida;
    private String horaSalida;
    private Estudiante estudiante;
    private Representante representante;
    private Rep_Est repest;
    private int error;

    public Control_Salida() {
    }

    public Control_Salida(Date fechaSalida, String horaSalida, Estudiante estudiante, Representante representante, Rep_Est repest) {
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.estudiante = estudiante;
        this.representante = representante;
        this.repest = repest;
    }
    
    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }
    
    public Rep_Est getRepest() {
        return repest;
    }

    public void setRepest(Rep_Est repest) {
        this.repest = repest;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
    
}
