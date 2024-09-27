package gestionhotel;

import java.util.Scanner;

/**
 *
 * @author palva
 */
public class GestionHotel {

    public static void main(String[] args) {

        //Crearemos un hotel y sus habitaciones 
        Hotel hotel1 = new Hotel("Sher123", "Sheraton Miramar");
        // al hotel agregaremos habitaciones todas disponibles
        hotel1.agregarHabitacion(new Habitacion("1", 190_000));
        hotel1.agregarHabitacion(new Habitacion("2", 200_000));
        hotel1.agregarHabitacion(new Habitacion("3", 250_000));

        //podemos crear otro hotel si es necesario
        Hotel hotel2 = new Hotel("Gala1", "Gala");
        // al hotel agregaremos habitaciones todas disponibles
        hotel2.agregarHabitacion(new Habitacion("20", 100_000));
        hotel2.agregarHabitacion(new Habitacion("32", 150_000));
        hotel2.agregarHabitacion(new Habitacion("45", 200_000));

        //llamamos al scanner para hacer un menú
        Scanner scan = new Scanner(System.in);

        //Si intanciamos desde antes para poder usarlos
        Cliente cliente1 = null;

        //Declarar las variables que se usaran
        int opc = 0;
        String idCliente, nombreCliente;

        do {

            System.out.println("\nSistema de Reservas");
            System.out.println("1.- Ingresar Cliente");
            System.out.println("2.- Mostrar disponibilidad de Hoteles");
            System.out.println("3.- Reservar Hotel" + hotel1.getNombreHotel());
            System.out.println("4.- Reservar Hotel" + hotel2.getNombreHotel());
            System.out.println("5.- Mostrar Reservas");
            System.out.println("6.- Salir");

            boolean flag = true;
            while (flag) {
                try {
                    opc = scan.nextInt();
                    flag = false;
                } catch (Exception e) {
                    System.out.print("Debe ingresar un número: ");
                    scan.next();
                }
            }

            switch (opc) {
                case 1:
                    //scan.nextLine(); // tip para nextLine
                    System.out.println("Ingrese su Run o DNI: ");
                    idCliente = scan.next();

                    scan.nextLine();  // Consumir la línea pendiente

                    System.out.println("Ingrese su Nombre completo: ");
                    nombreCliente = scan.nextLine();  // nombres con espacios

                    //Creamos el cliente
                    cliente1 = new Cliente(idCliente, nombreCliente);
                    break;
                case 2:
                    //Mostrar habitaciones disponibles
                    System.out.println("Habitaciones disponibles en " + hotel1.getNombreHotel() + ":");
                    hotel1.mostrarHabitaciones();
                    System.out.println("----------------");
                    // Mostrar habitaciones disponibles en el Hotel 2
                    System.out.println("\nHabitaciones disponibles en " + hotel2.getNombreHotel() + ":");
                    hotel2.mostrarHabitaciones();
                    System.out.println("----------------");

                    break;
                case 3:
                    // Buscar una habitación disponible usando el método del hotel 1
                    if (cliente1 == null) {
                        System.out.println("Debe registrar un cliente antes de hacer una reserva.");
                        break;
                    }
                    Habitacion habitacionDisponible1 = hotel1.buscarHabitacionDisponible();
                    // Verificar si se encontró una habitación disponible
                    if (habitacionDisponible1 != null) {
                        // Hacer la reserva en hotel 1
                        Reserva reserva1 = new Reserva(hotel1, habitacionDisponible1);
                        cliente1.agregarReserva(reserva1);
                        habitacionDisponible1.setHabDisponible(false); // Actualizar el estado de la habitación a no disponible
                        System.out.println("Reserva realizada en " + hotel1.getNombreHotel());
                        cliente1.mostrarReservas();
                    } else {
                        System.out.println("No hay habitaciones disponibles en " + hotel1.getNombreHotel());
                    }
                    break;

                case 4:
                    // Buscar una habitación disponible en el Hotel 2
                    if (cliente1 == null) {
                        System.out.println("Debe registrar un cliente antes de hacer una reserva.");
                        break;
                    }
                    Habitacion habitacionDisponibleHotel2 = hotel2.buscarHabitacionDisponible();
                    // Verificar si se encontró una habitación disponible
                    if (habitacionDisponibleHotel2 != null) {
                        // Hacer una reserva en el Hotel 2
                        Reserva reserva2 = new Reserva(hotel2, habitacionDisponibleHotel2);
                        cliente1.agregarReserva(reserva2);
                        habitacionDisponibleHotel2.setHabDisponible(false);
                        System.out.println("Reserva realizada en " + hotel2.getNombreHotel());
                        cliente1.mostrarReservas();
                    } else {
                        System.out.println("No hay habitaciones disponibles en " + hotel2.getNombreHotel());

                    }
                    break;
                case 5:
                    // Mostrar todas las reservas del cliente en distintos hoteles
                    if (cliente1 == null) {
                        System.out.println("No hay reservas registradas.");
                    } else {
                    System.out.println("\nReservas del cliente " + cliente1.getNombreCliente() + ":");
                    cliente1.mostrarReservas();
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:

                    System.out.println("Opción no válida, por favor ingrese una opción correcta.");

            }

        } while (opc != 6);

    }
}
