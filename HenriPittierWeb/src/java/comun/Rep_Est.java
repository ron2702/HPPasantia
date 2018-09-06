
package comun;

/**
 *
 * @author Ronald
 */
public class Rep_Est {
    
    private int cedula;
    private String primerNombre_Rep;
    private String primerApellido_Rep;
    private long cedulaEscolar;
    private String primerNombre_Est;
    private String primerApellido_Est;
    private String parentezco;
    private int error;
    
    public Rep_Est(){
        
    }
    
    public Rep_Est(int cedula){
        this.cedula = cedula;
    }
    
    public Rep_Est(long _cedulaEscolar){
        this.cedulaEscolar = _cedulaEscolar;
    }

    public Rep_Est(int cedula, long cedulaEscolar, String _parentezco) {
        this.cedula = cedula;
        this.cedulaEscolar = cedulaEscolar;
        this.parentezco = _parentezco;
    }
    
    

    public Rep_Est(int cedula, String primerNombre_Rep, String primerApellido_Rep, long cedulaEscolar, String primerNombre_Est, String primerApellido_est, String _parentezco) {
        this.cedula = cedula;
        this.primerNombre_Rep = primerNombre_Rep;
        this.primerApellido_Rep = primerApellido_Rep;
        this.cedulaEscolar = cedulaEscolar;
        this.primerNombre_Est = primerNombre_Est;
        this.primerApellido_Est = primerApellido_est;
        this.parentezco = _parentezco;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPrimerNombre_Rep() {
        return primerNombre_Rep;
    }

    public void setPrimerNombre_Rep(String primerNombre_Rep) {
        this.primerNombre_Rep = primerNombre_Rep;
    }

    public String getPrimerApellido_Rep() {
        return primerApellido_Rep;
    }

    public void setPrimerApellido_Rep(String primerApellido_Rep) {
        this.primerApellido_Rep = primerApellido_Rep;
    }

    public long getCedulaEscolar() {
        return cedulaEscolar;
    }

    public void setCedulaEscolar(long cedulaEscolar) {
        this.cedulaEscolar = cedulaEscolar;
    }

    public String getPrimerNombre_Est() {
        return primerNombre_Est;
    }

    public void setPrimerNombre_Est(String primerNombre_Est) {
        this.primerNombre_Est = primerNombre_Est;
    }

    public String getPrimerApellido_Est() {
        return primerApellido_Est;
    }

    public void setPrimerApellido_Est(String primerApellido_Est) {
        this.primerApellido_Est = primerApellido_Est;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }
    
    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
  
    
}
