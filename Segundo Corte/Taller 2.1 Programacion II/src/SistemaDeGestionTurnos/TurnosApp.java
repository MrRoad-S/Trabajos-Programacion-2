package SistemaDeGestionTurnos;

import java.time.LocalDate;
import java.util.Scanner;

import Interfaces.GestorTurnos;

public class TurnosApp {

    private GestorTurnos gestorTurnos;
    Scanner sc=new Scanner(System.in);
    
    Empleado empleado1=new Empleado("Kirby", 9022, 21, "Supervisor");
    Empleado empleado2=new Empleado("Sonic", 1991, 15, "Cajero");

    Cliente cliente1=new Cliente("Santiago Camino Muñoz", 1108, 22);
    Cliente cliente2=new Cliente("Natalia Erazo Lozano", 1109, 18);
    Cliente cliente3=new Cliente("MetaKnight", 0, 0);

    public TurnosApp(GestorTurnos gestorTurnos){
        this.gestorTurnos=gestorTurnos;
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
                    cliente1.setGenero("Hombre");
                    cliente2.setGenero("Mujer");
                    cliente3.setGenero("Hombre");
                    System.out.println("\n---------------Clientes---------------");
                    cliente1.imprimir();
                    cliente2.imprimir();
                    cliente3.imprimir();
                    
                    break;
                case 2:
                    empleado1.setGenero("Hombre");
                    empleado2.setGenero("Hombre");
                    System.out.println("\n--------------Empleados---------------");
                    empleado1.imprimir();
                    empleado2.imprimir();
                    break;
                case 3:
                    GestorTurnosMemoria GTM=new GestorTurnosMemoria();
                    LocalDate fecha = LocalDate.now();
                    GTM.agregarTurno(cliente1, fecha);
                    System.out.println("Turno asignado");

                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
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
}
