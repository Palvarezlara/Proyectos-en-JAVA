/**
 *
 * @author palva
 * 
 */
public class Sede {
    private String nomSede, comunaSede;
    private int nroSede;

    public Sede() {
    }

    public Sede(String nomSede, String comunaSede, int nroSede) {
        this.nomSede = nomSede;
        this.comunaSede = comunaSede;
        this.nroSede = nroSede;
    }

    public String getNomSede() {
        return nomSede;
    }

    public void setNomSede(String nomSede) {
        this.nomSede = nomSede;
    }

    public String getComunaSede() {
        return comunaSede;
    }

    public void setComunaSede(String comunaSede) {
        this.comunaSede = comunaSede;
    }

    public int getNroSede() {
        return nroSede;
    }

    public void setNroSede(int nroSede) {
        this.nroSede = nroSede;
    }

    @Override
    public String toString() {
        return "Sede{" + "nomSede=" + nomSede + ", comunaSede=" + comunaSede + ", nroSede=" + nroSede + '}';
    }
    
    
    public void mostrarSede(){
        System.out.println("---Datos de Sede----");
        System.out.println("Número de sede:" + getNroSede());
        System.out.println("Nombre de Sede:" + getNomSede());
        System.out.println("Comuna de Sede:" + getComunaSede());
    }
    
}
