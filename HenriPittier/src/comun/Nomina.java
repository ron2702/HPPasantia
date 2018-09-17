/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;


public class Nomina implements Comparable {
    private int cedula;
    private String nombreCompleto;
    private int sueldoMensual;
    private double sueldoQuincenal;
    private String banco;
    private int diasTrabajados;
    private double SSO;
    private double paroForzoso;
    private double LPH;
    private int diasFaltados;
    private double precioInasistencia;
    private int diasAdicionales;
    private double precioSuplencia;
    private int montoPrestamos;
    private double totalDeducido;
    private double pagoNeto;
    private String cargo;
    private String fecIngreso;

    
    public Nomina(){
    }
    
    public Nomina(int _cedula, String _nombreCompleto,  int _sueldoMensual, double _sueldoQuincenal, String _banco, int _diasTrabajados, 
                  double _SSO, double _paroForzoso, double _LPH, int _diasFaltados, double _precioInasistencia, int _diasAdicionales, 
                  double _precioSuplencia, int _montoPrestamos, double _totalDeducido, double _pagoNeto, String _cargo, String _fecIngreso)
    {
        this.cedula = _cedula;
        this.nombreCompleto = _nombreCompleto;
        this.sueldoMensual = _sueldoMensual;
        this.sueldoQuincenal = _sueldoQuincenal;
        this.banco = _banco;
        this.diasTrabajados = _diasTrabajados;
        this.SSO = _SSO;
        this.paroForzoso = _paroForzoso;
        this.LPH = _LPH;
        this.diasFaltados = _diasFaltados;
        this.precioInasistencia = _precioInasistencia;
        this.diasAdicionales = _diasAdicionales;
        this.precioSuplencia = _precioSuplencia;
        this.montoPrestamos = _montoPrestamos;
        this.totalDeducido = _totalDeducido;
        this.pagoNeto = _pagoNeto;
        this.cargo = _cargo;
        this.fecIngreso = _fecIngreso;
    }
    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the sueldoQuincenal
     */
    public double getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    /**
     * @param sueldoQuincenal the sueldoQuincenal to set
     */
    public void setSueldoQuincenal(double sueldoQuincenal) {
        this.sueldoQuincenal = sueldoQuincenal;
    }

    /**
     * @return the sueldoMensual
     */
    public int getSueldoMensual() {
        return sueldoMensual;
    }

    /**
     * @param sueldoMensual the sueldoMensual to set
     */
    public void setSueldoMensual(int sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the diasTrabajados
     */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    /**
     * @param diasTrabajados the diasTrabajados to set
     */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    /**
     * @return the SSO
     */
    public double getSSO() {
        return SSO;
    }

    /**
     * @param SSO the SSO to set
     */
    public void setSSO(double SSO) {
        this.SSO = SSO;
    }

    /**
     * @return the paroForzoso
     */
    public double getParoForzoso() {
        return paroForzoso;
    }

    /**
     * @param paroForzoso the paroForzoso to set
     */
    public void setParoForzoso(double paroForzoso) {
        this.paroForzoso = paroForzoso;
    }

    /**
     * @return the LPH
     */
    public double getLPH() {
        return LPH;
    }

    /**
     * @param LPH the LPH to set
     */
    public void setLPH(double LPH) {
        this.LPH = LPH;
    }

    /**
     * @return the diasFaltados
     */
    public int getDiasFaltados() {
        return diasFaltados;
    }

    /**
     * @param diasFaltados the diasFaltados to set
     */
    public void setDiasFaltados(int diasFaltados) {
        this.diasFaltados = diasFaltados;
    }

    /**
     * @return the precioInasistencia
     */
    public double getPrecioInasistencia() {
        return precioInasistencia;
    }

    /**
     * @param precioInasistencia the precioInasistencia to set
     */
    public void setPrecioInasistencia(double precioInasistencia) {
        this.precioInasistencia = precioInasistencia;
    }

    /**
     * @return the diasAdicionales
     */
    public int getDiasAdicionales() {
        return diasAdicionales;
    }

    /**
     * @param diasAdicionales the diasAdicionales to set
     */
    public void setDiasAdicionales(int diasAdicionales) {
        this.diasAdicionales = diasAdicionales;
    }

    /**
     * @return the precioSuplencia
     */
    public double getPrecioSuplencia() {
        return precioSuplencia;
    }

    /**
     * @param precioSuplencia the precioSuplencia to set
     */
    public void setPrecioSuplencia(double precioSuplencia) {
        this.precioSuplencia = precioSuplencia;
    }

    /**
     * @return the montoPrestamos
     */
    public int getMontoPrestamos() {
        return montoPrestamos;
    }

    /**
     * @param montoPrestamos the montoPrestamos to set
     */
    public void setMontoPrestamos(int montoPrestamos) {
        this.montoPrestamos = montoPrestamos;
    }

    /**
     * @return the totalDeducido
     */
    public double getTotalDeducido() {
        return totalDeducido;
    }

    /**
     * @param totalDeducido the totalDeducido to set
     */
    public void setTotalDeducido(double totalDeducido) {
        this.totalDeducido = totalDeducido;
    }

    /**
     * @return the pagoNeto
     */
    public double getPagoNeto() {
        return pagoNeto;
    }

    /**
     * @param pagoNeto the pagoNeto to set
     */
    public void setPagoNeto(double pagoNeto) {
        this.pagoNeto = pagoNeto;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the fecIngreso
     */
    public String getFecIngreso() {
        return fecIngreso;
    }

    /**
     * @param fecIngreso the fecIngreso to set
     */
    public void setFecIngreso(String fecIngreso) {
        this.fecIngreso = fecIngreso;
    }
    
    @Override
    public int compareTo(Object compararNom) {
        int compararSueldo=((Nomina)compararNom).getSueldoMensual();
        /* For Ascending order*/
        return this.sueldoMensual - compararSueldo;

        /* For Descending order do like this */
        //return compararSueldo - this.sueldoMensual;
    }
}

    