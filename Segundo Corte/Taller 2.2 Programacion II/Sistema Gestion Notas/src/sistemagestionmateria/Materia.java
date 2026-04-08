package sistemagestionmateria;

public class Materia {

    private Docente docente;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Materia(Docente docente, String nombre, double nota1, double nota2, double nota3) {
        this.docente = docente;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {

        System.out.println("---------------------------------------------");
        System.out.println("Materia: " + nombre);
        System.out.println("Profesor: " + docente.getNombre());
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("NotaFinal: " + ((nota1 + nota2 + nota3) / 3));
        System.out.println("---------------------------------------------");

    }

}
