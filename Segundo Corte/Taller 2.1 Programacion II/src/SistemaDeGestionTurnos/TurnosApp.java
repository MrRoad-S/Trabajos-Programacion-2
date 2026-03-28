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
    Cliente cliente2=new Cliente("Natalia Erazo Lozano", 1209089, 18);
    
    Empleado empleado1=new Empleado("Kirby", 9022, 21, "Supervisor");
    Empleado empleado2=new Empleado("Sonic", 1991, 15, "Cajero");

    public TurnosApp(GestorTurnos gestorTurnos){
        this.gestorTurnos=gestorTurnos;
        this.empleados =new ArrayList<>();
        this.clientes =new ArrayList<>();
    }
    
    public void start(Scanner sc){
        //Aqui esta toda la logica para mostrar el menu e interactuar con el usuario
        int opcion = -1;
        do{
            System.out.print("""
            **************************************
                 SISTEMA DE GESTOR DE TURNOS
            **************************************
            1. Registrar Cliente
            2. Registrar Empleado
            3. Crear turno para cliente
            4. Atender siguiente turno
            5. Mostrar turnos pendientes
            6. Mostrar turnos atendidos
            0. Salir
            --------------------------------------
            Seleccione una opcion:""");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n---------------Clientes---------------");
                    clientes.add(cliente1);
                    clientes.add(cliente2);
                    agregarCliente();
                    
                    break;
                case 2:
                    System.out.println("\n--------------Empleados---------------");
                    empleados.add(empleado1);
                    empleados.add(empleado2);
                    agregarEmpleado();
                    break;
                case 3:
                    LocalDate fecha = LocalDate.now();
                    System.out.println("Turno asignado");

                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 0:
                    System.out.println("Bye, bye");
                    break;
                case 99:
                    System.out.println("-------------Kirby: POYO--------------");
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
