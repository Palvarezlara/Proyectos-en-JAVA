package gestionhotel;

import java.util.ArrayList;

/**
 *
 * @author palva
 */
public class Cliente {
    private String idCliente;
    private String nombreCliente;
    private ArrayList<Reserva> reservasRealizadas;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        reservasRealizadas = new ArrayList<>();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public void setReservasRealizadas(ArrayList<Reserva> reservasRealizadas) {
        this.reservasRealizadas = reservasRealizadas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", reservasRealizadas=" + reservasRealizadas + '}';
    }
    
    
    //Metodo para añadir reserva
    public String agregarReserva(Reserva reserva){
        try {
            reservasRealizadas.add(reserva);
            return "Agregada";
        } catch (Exception e) {
            return "No agregada" + e;
        }
        
    }
    
    //Metodo mostrar reservas del cliente
    public void mostrarReservas(){
        for(Reserva reserva: reservasRealizadas){
            System.out.println("Hotel:" + reserva.getHotel().getNombreHotel()+ ", Habitacion: "+reserva.getHabitacionReservada().getNroHabitacion() + ", Precio por noche: $"+ reserva.getHabitacionReservada().getPrecioNoche());
        }
    }
    
    
    
    
    
}
