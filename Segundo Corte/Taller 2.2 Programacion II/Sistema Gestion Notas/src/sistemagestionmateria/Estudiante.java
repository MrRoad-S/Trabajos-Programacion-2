package sistemagestionmateria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudiante extends Persona {

    private String curso;
    private List<Materia> materias;
    Scanner sc = new Scanner(System.in);

    public Estudiante(String nombre, int edad, String genero, int identificacion, String curso) {
        super(nombre, edad, genero, identificacion);

        this.curso = curso;
        this.materias = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        super.imprimir();

    }

    public void agregarMateria(Docente docente) {

        System.out.println("\nIngrese el nombre de la materia:");
        String nombre = sc.nextLine();

        Materia materia = new Materia(docente, nombre, 0, 0, 0);
        materias.add(materia);
        materia.imprimir();

    }

    public void mostrarMaterias() {
        if (materias.isEmpty()) {
            System.out.println("\nNo hay materias registradas\n");
        } else {
            for (Materia materia : materias) {
                materia.imprimir();
            }
        }
    }

    public void registrarNotas(String nomMateria) {
        boolean noEncontradoM = true;
        int posicion = 0;
        for (Materia materia : materias) {

            if (materias.get(posicion).getNombre().equals(nomMateria) == true) {

                System.out.println("\n Ingrese Nota 1:");
                double nota1 = sc.nextDouble();
                System.out.println("Ingrese Nota 2:");
                double nota2 = sc.nextDouble();
                System.out.println("Ingrese Nota 3:");
                double nota3 = sc.nextDouble();

                materias.get(posicion).setNota1(nota1);
                materias.get(posicion).setNota2(nota2);
                materias.get(posicion).setNota3(nota3);

                noEncontradoM = false;
            }
            posicion++;
        }
        if (noEncontradoM) {
            System.out.println("No se encontro esa materia");
        }

    }

    public void calcularPromedio() {
        if (materias.isEmpty()) {
            System.out.println("\nNo se encuentran notas\n");
        } else {
            double promedio = 0;
            double sumaPromedios = 0;
            double promedioTotal = 0;
            
            for (Materia materia : materias) {
                promedio = ((materia.getNota1() + materia.getNota2() + materia.getNota3()) / 3);
                sumaPromedios += promedio;
            }
            promedioTotal = sumaPromedios / materias.size();

            System.out.println("Promedio: " + promedioTotal);
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
