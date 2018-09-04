
package comun;


public class Suplencia {
    
    private int diasAdicionales;
    private String mes;
    private int ano;
    private int cedulaEmpleado;
    private int error;

    public Suplencia() {
    }

    public Suplencia(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }
    
    public Suplencia(int _cedulaEmpleado, int _diasAdicionales, String _mes, int _ano) {
        this.cedulaEmpleado = _cedulaEmpleado;
        this.diasAdicionales = _diasAdicionales;
        this.mes = _mes;
        this.ano = _ano;
    }

    public int getDiasAdicionales() {
        return diasAdicionales;
    }

    public void setDiasAdicionales(int diasAdicionales) {
        this.diasAdicionales = diasAdicionales;
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
