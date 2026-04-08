package SistemaDeGestionTurnos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Interfaces.GestorTurnos;

public class TurnosApp {

    private GestorTurnos gestorTurnos;
    private List<Empleado> empleados;
    private List<Cliente> clientes;

    Scanner sc = new Scanner(System.in);

    Cliente cliente1 = new Cliente("Santiago Camino Muñoz", 1108639397, 21);
    Cliente cliente2 = new Cliente("Natalia Erazo Lozano", 1107848515, 18);
    Cliente cliente3 = new Cliente("Mimi", 123456789, 20);

    Empleado empleado1 = new Empleado("Kirby", 1992, 36, "Supervisor");
    Empleado empleado2 = new Empleado("Sonic", 1991, 35, "Cajero");

    public TurnosApp(GestorTurnos gestorTurnos) {
        this.gestorTurnos = gestorTurnos;
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void start() {
        // Aqui esta toda la logica para mostrar el menu e interactuar con el usuario
        int opcion = -1;
        empleados.add(empleado1);
        empleados.add(empleado2);
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        do {
            System.out.print("""
                    *******************************************
                    (^-^)/  SISTEMA DE GESTOR DE TURNOS
                    *******************************************
                    1. Registrar Cliente
                    2. Registrar Empleado
                    3. Crear turno para cliente
                    4. Atender siguiente turno
                    5. Mostrar turnos pendientes
                    6. Mostrar turnos atendidos
                    0. Salir
                    -------------------------------------------
                    Seleccione una opcion: """);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n-----------------Clientes------------------");

                    agregarCliente();

                    break;
                case 2:
                    System.out.println("\n-----------------Empleados-----------------");

                    agregarEmpleado();

                    break;
                case 3:
                    LocalDate fecha = LocalDate.now();
                    System.out.println("\n----------------Ids clientes--------------\n");
                    for (Cliente cliente : clientes) {
                        System.out.println("Cliente: " + cliente.getNombre() + " Id:" + cliente.getIdentificacion());
                    }
                    System.out.println("\nIngrese la ID del cliente que se le asignara el turno:");
                    int IdCliente = sc.nextInt();
                    boolean noEncontradoC = true;
                    int posicionC = 0;
                    for (Cliente ClienteE : clientes) {

                        if (clientes.get(posicionC).getIdentificacion() == IdCliente) {
                            ClienteE = clientes.get(posicionC);
                            System.out.println("\n*********** TURNO ASIGNADOS! :)**********");
                            gestorTurnos.agregarTurno(ClienteE, fecha);
                            noEncontradoC = false;
                            
                        }
                        posicionC++;
                    }
                    if (noEncontradoC) {
                        System.out.println("No se encontro ese codigo de Cliente");
                    }
                   

                    break;
                case 4:
                    System.out.println("\n----------------Ids empleados--------------\n");
                    for (Empleado empleado : empleados) {
                        System.out.println("Empleado: " + empleado.getNombre() + " Id:" + empleado.getIdentificacion());
                    }
                    System.out.println("\nIngrese la ID del empleador que atendera el turno:");
                    int identificacionEmpleado = sc.nextInt();
                    boolean noEncontradoE = true;
                    int posicion = 0;
                    for (Empleado empleadoE : empleados) {

                        if (empleados.get(posicion).getIdentificacion() == identificacionEmpleado) {
                            empleadoE = empleados.get(posicion);
                            gestorTurnos.atenderTurno(empleadoE);
                            noEncontradoE = false;
                        }
                        posicion++;
                    }
                    if (noEncontradoE) {
                        System.out.println("No se encontro ese codigo de empleado");
                    }
                    break;
                case 5:
                    System.out.println("\n-------------Turnos Pendientes-------------");
                    gestorTurnos.mostrarTurnosPendientes();

                    break;
                case 6:
                    System.out.println("\n-------------Turnos Atendidos--------------");
                    gestorTurnos.mostrarTurnosAtendidos();

                    break;
                case 0:
                    System.out.println("Bye, bye");

                    break;
                case 99:
                    System.out.println("\n---------------Kirby: POYO---------------");
                    System.out.println("""

                            (>'-')> <('-'<) ^('-')^ v('-')v(>'-')> (^-^)/

                               """);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }

    public void agregarEmpleado() {
        int opcion;
        do {
            System.out.print("""
                    -------------------------------------------
                    ¿Desea agregar empleado?

                    1.Si
                    0.No

                    -------------------------------------------
                    Seleccione una opcion:""");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                
                    System.out.println("\nIngrese id del empleado:");
                    int id = sc.nextInt();
                    System.out.println("Ingrese el nombre del empleado:");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad del empleado:");
                    int edad = sc.nextInt();
                    System.out.println("Ingresar el cargo del empleado:");
                    sc.nextLine();
                    String puesto = sc.nextLine();

                    boolean noExiste = true; //Fue creada para evitar poner usuarios con el mismo Id
                    int posicionE = 0;

                    for (Empleado empleado : empleados) {

                        if (empleados.get(posicionE).getIdentificacion() == id) {
                            System.out.println("Ese codigo de empleado ya existe pertenece a:");
                            empleado.imprimir();
                            noExiste = false;
                        }
                        posicionE++;

                    }

                    if (noExiste) {

                        Empleado empleado = new Empleado(nombre, id, edad, puesto);
                        System.out.println("\n************ EMPLEADO AÑADIDO ************");
                        empleados.add(empleado);
                        empleado1.imprimir();

                        
                    }

                    break;
                case 0:
                    System.out.println("\n--------------Lista Empleados--------------");
                    for (Empleado empleado1 : empleados) {
                        empleado1.imprimir();

                    }

                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);

    }

    public void agregarCliente() {
        int opcion;
        do {
            System.out.print("""
                    -------------------------------------------
                    ¿Desea agregar Cliente?

                    1.Si
                    0.No

                    -------------------------------------------
                    Seleccione una opcion:""");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("\nIngrese id del cliente:");
                    int id = sc.nextInt();
                    System.out.println("Ingrese el nombre del cliente:");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad del cliente:");
                    int edad = sc.nextInt();

                    boolean noExiste = true; //Fue creada para evitar poner usuarios con el mismo Id
                    int posicionC = 0;

                    for (Cliente cliente : clientes) {

                        if (clientes.get(posicionC).getIdentificacion() == id) {
                            System.out.println("Ese codigo de cliente ya existe y le pertenece a: ");
                            cliente.imprimir();
                            noExiste = false;
                        }
                        posicionC++;

                    }

                    if (noExiste) {

                        Cliente cliente = new Cliente(nombre, id, edad);
                        clientes.add(cliente);
                        System.out.println("\n************ CLIENTE AÑADIDO ************");
                        cliente.imprimir();
                            

                        

                    }

                    break;
                case 0:
                    System.out.println("\n--------------Lista Clientes--------------");
                    for (Cliente cliente1 : clientes) {

                        cliente1.imprimir();
                    }

                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);

    }
}
