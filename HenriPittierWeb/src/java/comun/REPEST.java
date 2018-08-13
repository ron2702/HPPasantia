
package comun;

/**
 *
 * @author Ronald
 */
public class REPEST {
    
    private int cedula;
    private String primerNombre_Rep;
    private String primerApellido_Rep;
    private int cedulaEscolar;
    private String primerNombre_Est;
    private String primerApellido_Est;
    private int error;
    
    public REPEST(){
        
    }
    
    public REPEST(int cedula){
        this.cedula = cedula;
    }

    public REPEST(int cedula, int cedulaEscolar) {
        this.cedula = cedula;
        this.cedulaEscolar = cedulaEscolar;
    }
    
    

    public REPEST(int cedula, String primerNombre_Rep, String primerApellido_Rep, int cedulaEscolar, String primerNombre_Est, String primerApellido_est) {
        this.cedula = cedula;
        this.primerNombre_Rep = primerNombre_Rep;
        this.primerApellido_Rep = primerApellido_Rep;
        this.cedulaEscolar = cedulaEscolar;
        this.primerNombre_Est = primerNombre_Est;
        this.primerApellido_Est = primerApellido_est;
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

    public int getCedulaEscolar() {
        return cedulaEscolar;
    }

    public void setCedulaEscolar(int cedulaEscolar) {
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

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
  
    
}
