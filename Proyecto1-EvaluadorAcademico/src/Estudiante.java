/**
 *
 * @author palva
 * 11-09-20224 
 */
public class Estudiante {
    //run, nombre, edad, fecha de nacimiento
    private String runAlumno, nomAlumno, fechaNac;
    private int edadAlumno;

    public Estudiante() {
    }

    public Estudiante(String runAlumno, String nomAlumno, String fechaNac, int edadAlumno) {
        this.runAlumno = runAlumno;
        if (nomAlumno == null || nomAlumno.isEmpty()) {
            System.out.println("Error, debe ingresar un nombre de alumno");
        } else {
            this.nomAlumno = nomAlumno;
        }
        this.fechaNac = fechaNac;
        if (edadAlumno>0 && edadAlumno<101) {
            this.edadAlumno = edadAlumno;
        } else {
            System.out.println("Debe ingresar una edad válida.");
        }
    }

    public String getRunAlumno() {
        return runAlumno;
    }

    public void setRunAlumno(String runAlumno) {
        this.runAlumno = runAlumno;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getEdadAlumno() {
        return edadAlumno;
    }

    public void setEdadAlumno(int edadAlumno) {
        this.edadAlumno = edadAlumno;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "runAlumno=" + runAlumno + ", nomAlumno=" + nomAlumno + ", fechaNac=" + fechaNac + ", edadAlumno=" + edadAlumno + '}';
    }
    
    public void mostrarDatos(){
        System.out.println("---Datos Estudiantes---");
        System.out.println("Nombre: "+ getNomAlumno());
        System.out.println("Run: "+ getRunAlumno());
        System.out.println("Fecha de nacimiento: "+ getFechaNac());
        System.out.println("Edad: "+ getEdadAlumno());
        System.out.println("");
    }
}
