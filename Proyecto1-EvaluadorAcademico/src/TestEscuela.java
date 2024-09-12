
import java.util.Scanner;

/**
 *
 * @author palva 11-09-2024
 */
public class TestEscuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante("12.345.678-9", "Juan Perez", "12-03-1998", 26);
        Sede sede1 = new Sede("Viña del Mar", "Viña del Mar", 123);
        Docente docente1 = new Docente("10.987.234-6", "Cecilio Caceres", "21-09-2020", 327, sede1);
        Asignatura poo = new Asignatura("DYO14011", "Desarrollo orientado a objetos", 3.9, 4.5, 5.0, estudiante1, docente1);
        int opc = 0;
        double notaExamen = 0;
        do {
            System.out.println("\n--Calculadora de Notas---");
            System.out.println("1. Mostrar Datos de asignatura");
            System.out.println("2. Ingresar Nota Examen");
            System.out.println("3. Salir ");
            System.out.print("Ingresar opción -> ");

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
                    poo.mostrarAsignatura();
                    break;
                case 2:
                    boolean notaValida = false;
                    while (!notaValida) {
                        try {
                            System.out.print("Ingresar nota (x,x): ");
                            notaExamen = scan.nextDouble();
                            if (notaExamen >= 1 && notaExamen <= 7) {  
                                notaValida = true;
                            } else {
                                System.out.println("Debe ingresar una nota válida entre 1 y 7.");
                            }
                        } catch (Exception e) {
                            System.out.print("Debe ingresar un número válido para la nota: ");
                            scan.next(); // limpia el buffer de entrada
                        }
                    }
                    poo.mostrarAsignatura();
                    poo.aprobadoOno(notaExamen);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;

            }
        } while (opc != 3);
    }

}
