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
public class Grupo {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private int capacidad;
    private String periodo;
    private int error;
    
    public Grupo(){
    }
    
    public Grupo(String codigo) {
        this.codigo = codigo;
    }

    public Grupo(String codigo, String nombre, String descripcion, int capacidad, String periodo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.periodo = periodo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
    
    @Override
    public String toString() {
        return this.codigo + "- " + this.nombre;
    }
}
