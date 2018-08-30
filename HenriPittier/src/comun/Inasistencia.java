
package comun;


public class Inasistencia {
    
    private int diasFaltados;
    private String mes;
    private int ano;
    private int cedulaEmpleado;
    private int error;
    
    public Inasistencia(){
    }

    public Inasistencia(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public Inasistencia(int diasFaltados, String mes, int ano, int cedulaEmpleado) {
        this.diasFaltados = diasFaltados;
        this.mes = mes;
        this.ano = ano;
        this.cedulaEmpleado = cedulaEmpleado;
    }
    
    public Inasistencia(int _cedulaEmpleado, int _diasFaltados, String _mes, int _ano){
        this.cedulaEmpleado = _cedulaEmpleado;
        this.diasFaltados = _diasFaltados;
        this.mes = _mes;
        this.ano = _ano;
    }
    
    public int getDiasFaltados() {
        return diasFaltados;
    }

    public void setDiasFaltados(int diasFaltados) {
        this.diasFaltados = diasFaltados;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
}
