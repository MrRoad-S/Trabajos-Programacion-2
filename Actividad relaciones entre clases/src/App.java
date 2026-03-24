import java.util.List;
import java.util.Scanner;

import Vehiculos.Peaje;
import Vehiculos.Carro;
import Vehiculos.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Peaje peaje=new Peaje("La lizama", "santander");

        int opcion = -1;
        System.out.println("""
        ______________________________________    
                Administracion Peaje
        ______________________________________
                """);
        do{
            System.out.print("""
                ------------------------------------
                    1.Agregar Vehiculo
                    2.Cacular total peaje
                    0.Salir
                ------------------------------------
                elije una opcion:""");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    AgregarVehiculo(sc, peaje, null);
                    break;
                case 2: 
                    peaje.calcularPeaje(null);
                    peaje.imprimir();
                    break;
            
                default:System.out.println("Opcion no valida");
                    break;
            }
            
                break;
        
        }while(opcion != 0);
        
    }

    public static void AgregarVehiculo(Scanner sc, Peaje peaje, List<Vehiculo> vehiculos){
        int opcion = -1;
        do{
            System.out.print("""
            ------------------------------------------
            Elija el vehiculo que desea agregar

                1. Carro.
                2. Camión.
                0. Salir.

            ------------------------------------------
            elije una opcion:""");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    agregarCarro(sc, peaje, vehiculos);
                    break;
                case 2:
                
                    break;
                default: System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion !=0);
        System.out.println("...................................");
        System.out.println("Listado :");

        for(Vehiculo vehiculo : vehiculos){
            vehiculo.toString();
        }
        
 
        System.out.println(".....................................");

        
    }
    public static void agregarCarro(Scanner sc, Peaje peaje, List<Vehiculo> vehiculos){
        
        System.out.println("Ingresar la placa del carro: ");

        sc.nextLine();
        String placa = sc.nextLine();
       
        Carro carro = new Carro(placa);
        carro.getValorPeaje();
        carro.imprimir();
        peaje.añadirVehiculo(carro, vehiculos);
        
    }
    public static void agregarCamion(Scanner sc, Peaje peaje){

    }
    
}
