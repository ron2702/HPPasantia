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
    
    private Empleado empleado;
    private Estudiante estudiante;
    private Grupo grupo;
    private int error;

    public Emp_Gru_Est() {   
    }

    public Emp_Gru_Est(Empleado empleado, Estudiante estudiante, Grupo grupo) {
        this.empleado = empleado;
        this.estudiante = estudiante;
        this.grupo = grupo;
    }

    public Emp_Gru_Est(Empleado empleado, Grupo grupo) {
        this.empleado = empleado;
        this.grupo = grupo;
    }
    
    public Emp_Gru_Est(Estudiante estudiante, Grupo grupo) {
        this.estudiante = estudiante;
        this.grupo = grupo;
    }
    
    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the estudiante
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * @return the grupo
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
