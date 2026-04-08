package sistemagestionmateria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorMateriaApp {

    private List<Docente> profesores;
    private List<Estudiante> estudiantes;

    Scanner sc = new Scanner(System.in);

    Estudiante estudiante1 = new Estudiante("Natalia Erazo Lozano", 18, "Femenino", 1107848515, "3303D");

    Docente docente1 = new Docente("Santiago Camino Muñoz", 21, "Masculino", 1108639397);

    public GestorMateriaApp() {

        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void start() {

        int opcion = -1;

        estudiantes.add(estudiante1);
        profesores.add(docente1);

        do {

            System.out.print("""
                    ---------------------------------------------
                        (^-^)/  SISTEMA DE GESTIÓN DE NOTAS
                    ---------------------------------------------

                    1. Agregar Profesor
                    2. Mostrar listado de profesores
                    3. Agregar materia
                    4. Registrar o modificar notas de una materia
                    5. Mostrar materias
                    6. Mostrar promedio general
                    0. Salir

                    *********************************************
                    Seleccione una opcion: """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    agregarProfesor();

                    break;

                case 2:
                    System.out.println("\n----------------- Profesores ------------------");

                    for (Docente docente : profesores) {

                        docente.imprimir();

                    }

                    break;

                case 3:

                    System.out.println("\n----------------- Materias ------------------");
                    int opcion1=-1;
                    do {
                        System.out.print("""
                            
                                *******************************************
                                ¿Desea agregar una materia?

                                1.Si
                                0.No

                                -------------------------------------------
                                Seleccione una opcion:""");

                        opcion1 = sc.nextInt();

                        switch (opcion1) {

                            case 1:
                                System.out.println("\n-------------- Listado docentes --------------");
                                for (Docente docente1 : profesores) {
                                    System.out.println("Profesor: " + docente1.getNombre() + " Id:"
                                            + docente1.getIdentificacion());
                                }
                                System.out.println("\nIngrese la ID del profesor que se le asignara la Materia");
                                int IdProfesor = sc.nextInt();
                                boolean noEncontradoP = true;
                                int posicionP = 0;
                                for (Docente docente1 : profesores) {

                                    if (profesores.get(posicionP).getIdentificacion() == IdProfesor) {
                                        docente1 = profesores.get(posicionP);
                                        estudiante1.agregarMateria(docente1);

                                        noEncontradoP = false;

                                    }
                                    posicionP++;
                                }
                                if (noEncontradoP) {
                                    System.out.println("No se encontro ese codigo de profesor");
                                }
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcion invalida");

                                break;

                        }

                    } while (opcion1 != 0);

                    break;

                case 4:
                    System.out.println("\n----------------- Registro Notas ------------------");
                    int opcion2=-1;
                    do {
                        System.out.print("""

                                *******************************************
                                ¿Desea registrar o modificar notas?

                                1.Si
                                0.No

                                -------------------------------------------
                                Seleccione una opcion:""");

                        opcion2 = sc.nextInt();

                        switch (opcion2) {

                            case 1:
                                estudiante1.mostrarMaterias();
                                System.out.println("\nIngrese el nombre de la Materia");
                                sc.nextLine();
                                String nomMateria = sc.nextLine();
                                estudiante1.registrarNotas(nomMateria);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcion invalida");

                                break;

                        }

                    } while (opcion2 != 0);

                    break;

                case 5:
                    System.out.println("---------------------------------------------");
                    System.out.println("MATERIAS DEL ESTUDIANTE: " + estudiante1.getNombre());

                    estudiante1.mostrarMaterias();
                    break;

                case 6:
                    System.out.println("\n------------ Promedio general ---------------");
                    estudiante1.calcularPromedio();
                    break;

                case 0:
                    System.out.println("Bye, bye");
                    break;

                default:

                    System.out.println("Opcion no valida");

                    break;
            }

        } while (opcion != 0);

    }

    public void agregarProfesor() {

        int opcion=-1;
        do {
            System.out.print("""

                    *******************************************
                    ¿Desea agregar un profesor?

                    1.Si
                    0.No

                    -------------------------------------------
                    Seleccione una opcion:""");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("\nIngrese id del profesor:");
                    int identificacion = sc.nextInt();
                    System.out.println("Ingrese el nombre del profesor:");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad del profesor:");
                    int edad = sc.nextInt();
                    System.out.println("Ingrese el género del docente: ");
                    sc.nextLine();
                    String genero = sc.nextLine();

                    boolean noExiste = true;
                    int posicion = 0;

                    for (Docente docente : profesores) {

                        if (profesores.get(posicion).getIdentificacion() == identificacion) {
                            System.out.println("Ese codigo de profesor ya existe y le pertenece a: ");
                            docente.imprimir();
                            noExiste = false;
                        }
                        posicion++;

                    }

                    if (noExiste) {

                        Docente profe = new Docente(nombre, edad, genero, identificacion);
                        profesores.add(profe);
                        System.out.println("\n************ PROFESOR AÑADIDO ************");
                        profe.imprimir();
                    }

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 0);

    }
}
