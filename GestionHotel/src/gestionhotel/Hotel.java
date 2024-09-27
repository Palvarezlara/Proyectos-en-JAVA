package gestionhotel;

import java.util.ArrayList;

/**
 *
 * @author palvarez 24-09-2024
 */
public class Hotel {
    private String idHotel, nombreHotel;
    private ArrayList<Habitacion> habitacionDisponibles;

    public Hotel() {
    }

    public Hotel(String idHotel, String nombreHotel) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        habitacionDisponibles = new ArrayList<>();
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public ArrayList<Habitacion> getHabitacionDisponibles() {
        return habitacionDisponibles;
    }

    public void setHabitacionDisponibles(ArrayList<Habitacion> habitacionDisponibles) {
        this.habitacionDisponibles = habitacionDisponibles;
    }

    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", nombreHotel=" + nombreHotel + ", habitacionDisponibles=" + habitacionDisponibles + '}';
    }
    
    //METODOS
    //MÉTODO PARA AÑADIR UNA HABITACIÓN
    public boolean agregarHabitacion(Habitacion habitacion){
        return habitacionDisponibles.add(habitacion);
    }
    
    public Habitacion buscarHabitacionDisponible() {
        for (Habitacion habitacion : habitacionDisponibles) {
            if (habitacion.isHabDisponible()) {
                return habitacion;  // Retorna la primera habitación disponible
            }
        }
        return null;  // Si no hay habitaciones disponibles, retorna null
    }
    
    // Método para mostrar habitaciones disponibles
    public void mostrarHabitaciones(){
        for(Habitacion hab: habitacionDisponibles){
            if( hab.isHabDisponible())
                System.out.println("Habitación: " + hab.getNroHabitacion() + ", Precio: " + hab.getPrecioNoche());
        }
    }
   
    public void listar(){
        for(Habitacion i: habitacionDisponibles){
            System.out.println(i);
        }
    }
    
    //Eliminar
    public boolean eliminarHabitacion(String numeroHabitacion){
        for(Habitacion i: habitacionDisponibles){
            if(i.getNroHabitacion().equalsIgnoreCase(numeroHabitacion))
                habitacionDisponibles.remove(i);
            return true;
        }
        return false;
    }
    
    //buscar
    public boolean buscarHabitacion(String numeroHabitacion){
        for(Habitacion i: habitacionDisponibles){
            if(i.getNroHabitacion().equalsIgnoreCase(numeroHabitacion))
                return true;
            
        }
        return false;
    }
            
    //luego lo mismo con cliente
}