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

    Scanner sc=new Scanner(System.in);
    Cliente cliente1=new Cliente("Santiago Camino Muñoz", 1108639397, 21);
    Cliente cliente2=new Cliente("Natalia Erazo Lozano", 1107848515, 18);
    Cliente cliente3=new Cliente("Mimi", 123456789, 20);
    
    Empleado empleado1=new Empleado("Kirby", 1992, 36, "Supervisor");
    Empleado empleado2=new Empleado("Sonic", 1991, 35, "Cajero");

    public TurnosApp(GestorTurnos gestorTurnos){
        this.gestorTurnos=gestorTurnos;
        this.empleados =new ArrayList<>();
        this.clientes =new ArrayList<>();
    }
    
    public void start(Scanner sc){
        //Aqui esta toda la logica para mostrar el menu e interactuar con el usuario
        int opcion = -1;
        empleados.add(empleado1);
        empleados.add(empleado2);
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
        do{
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
                    System.out.println("\n*********** TURNO ASIGNADOS! :)**********");
                    gestorTurnos.agregarTurno(cliente1, fecha);
                    gestorTurnos.agregarTurno(cliente2, fecha);
                    gestorTurnos.agregarTurno(cliente3, fecha);
                    
                    break;
                case 4:
                    System.out.println("----------------Ids empleados--------------");
                    for (Empleado empleado : empleados) {
                        System.out.println("Empleado: " + empleado.getNombre() + " Id:"+ empleado.getIdentificacion());
                    }
                    System.out.println("\nIngrese la ID del empleador que atendera el turno:");
                    int identificacionEmpleado=sc.nextInt();
                    boolean noEncontrado = true;
                    int posicion=0;
                    for (Empleado empleadoE : empleados) {
                        
                            if (empleados.get(posicion).getIdentificacion() == identificacionEmpleado){
                                empleadoE = empleados.get(posicion);
                                gestorTurnos.atenderTurno(empleadoE);
                                noEncontrado = false;   
                            }
                            posicion++;                                            
                    }
                    if (noEncontrado) {
                        System.out.println("No se encontro ese codigo de empleado");
                    }      
                    break;
                case 5:
                    System.out.println("\n--------------Turnos Pendientes------------");
                    gestorTurnos.mostrarTurnosPendientes();

                    break;
                case 6:
                    System.out.println("\n--------------Turnos Atendidos--------------");
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
                default: System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 0);    
    }
    public void agregarEmpleado(){

        for(Empleado empleado: empleados){
            empleado.imprimir();
        }
    }

    public void agregarCliente(){
        
        for(Cliente cliente: clientes){
            
            cliente.imprimir();
        }
    }
}
