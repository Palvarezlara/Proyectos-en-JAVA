/**
 *
 * @author palva
 */
public class Docente {
    //String run, String nombreDocente, String fechaIngreso, int nroDocente, Sede sede
    private String runDocente, nomDocente, fechaIngreso;
    private int nroDocente;
    private Sede sede;

    public Docente() {
    }

    public Docente(String runDocente, String nomDocente, String fechaIngreso, int nroDocente, Sede sede) {
        this.runDocente = runDocente;
        this.nomDocente = nomDocente;
        this.fechaIngreso = fechaIngreso;
        this.nroDocente = nroDocente;
        this.sede = sede;
    }

    public String getRunDocente() {
        return runDocente;
    }

    public void setRunDocente(String runDocente) {
        this.runDocente = runDocente;
    }

    public String getNomDocente() {
        return nomDocente;
    }

    public void setNomDocente(String nomDocente) {
        this.nomDocente = nomDocente;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getNroDocente() {
        return nroDocente;
    }

    public void setNroDocente(int nroDocente) {
        this.nroDocente = nroDocente;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Docente{" + "runDocente=" + runDocente + ", nomDocente=" + nomDocente + ", fechaIngreso=" + fechaIngreso + ", nroDocente=" + nroDocente + ", sede=" + sede + '}';
    }
    
    public void mostrarDocente(){
        System.out.println("---Datos del Docente----");
        System.out.println("Nombre docente: " + getNomDocente());
        System.out.println("Run docente: "+getRunDocente());
        System.out.println("Fecha de ingreso: "+ getFechaIngreso());
        System.out.println("Número Docente: "+getNroDocente());
        System.out.println("Sede: "+ sede.getNomSede());
    }
}
