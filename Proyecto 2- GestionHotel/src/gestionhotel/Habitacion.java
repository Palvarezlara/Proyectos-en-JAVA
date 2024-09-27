
package gestionhotel;

/**
 *
 * @author palvarez 24-09-2024
 */
public class Habitacion {
    private String nroHabitacion;
    private double precioNoche;
    private boolean habDisponible;

    public Habitacion() {
    }

    public Habitacion(String nroHabitacion, double precioNoche) {
        this.nroHabitacion = nroHabitacion;
        this.precioNoche = precioNoche;
        this.habDisponible = true;
    }

    public String getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(String nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isHabDisponible() {
        return habDisponible;
    }

    public void setHabDisponible(boolean habDisponible) {
        this.habDisponible = habDisponible;
    }

    @Override
    public String toString() {
        return "\nNúmero Habitacion = " + nroHabitacion + "\nPrecio Noche = " + precioNoche+ "\n"; 
    }

    
    
    
    
}
