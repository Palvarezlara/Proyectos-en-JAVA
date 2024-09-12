
/**
 *
 * @author palva
 */
public class Asignatura {

    //String codAsignatura, String nomAsignatura, double nota1, double nota2, double nota3, Alumno alumno, Docente docente
    private String codAsignatura, nomAsignatura;
    private double nota1, nota2, nota3;
    private Estudiante estudiante;
    private Docente docente;
    

    public Asignatura() {
    }

    public Asignatura(String codAsignatura, String nomAsignatura, double nota1, double nota2, double nota3, Estudiante estudiante, Docente docente) {
        this.codAsignatura = codAsignatura;
        this.nomAsignatura = nomAsignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.estudiante = estudiante;
        this.docente = docente;
    }

    public String getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codAsignatura=" + codAsignatura + ", nomAsignatura=" + nomAsignatura + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", estudiante=" + estudiante + ", docente=" + docente + '}';
    }

    public void mostrarAsignatura() {
        System.out.println("\n--- Datos de Asignatura---");
        System.out.println("Codigo Asignatura: " + getCodAsignatura());
        System.out.println("Nombre Asignatura: " + getNomAsignatura());
        System.out.println("Nombre Docente: " + docente.getNomDocente());
        System.out.println("Nombre Estudiante: " + estudiante.getNomAlumno());
        System.out.println("Nota 1: " + getNota1());
        System.out.println("Nota 2: " + getNota2());
        System.out.println("Nota 3: " + getNota3());
        // mostrar nota de presentación
        System.out.println("Nota presentación: " + notaPresentacion());
        // mostrar eximido o no, sobre 5.0
        if (eximidoONo()) {
            System.out.println("Estado: Eximido" );
        } else {
            System.out.println("Estado: No eximido" );
        }
    }

    public double notaPresentacion() {
        double notaPres = (this.nota1 * 0.30) + (this.nota2 * 0.30) + (this.nota3 * 0.40);
        return notaPres;

    }

    public boolean eximidoONo() {
        return notaPresentacion() >= 5.0;

    }
    public void aprobadoOno(double notaExamen) {
        double notaFinal = 0;
        notaFinal = notaExamen * 0.6 + notaPresentacion() * 0.4;
        double notaExamenTruncada = Math.floor(notaFinal * 10) / 10.0;
        if (notaFinal >= 3.5 && notaFinal <= 3.94) {
           System.out.println("Nota Examen: " + notaExamen);
           System.out.println("Nota Final: " + notaExamenTruncada);
           System.out.println("Estado: " + "Reprobado - Cursado");
        } else if(notaFinal >= 3.95){
            System.out.println("Nota Examen: " + notaExamen);
            System.out.println("Nota Final: " + notaExamenTruncada);
            System.out.println("Estado: " + "Aprobado");
        }
        
    }

}
