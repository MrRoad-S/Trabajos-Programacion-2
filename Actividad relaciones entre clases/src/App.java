import java.util.Scanner;

import Vehiculos.Carro;
import Vehiculos.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

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
                    AgregarVehiculo(sc);
                    break;
            
                default:System.out.println("Opcion no valida");
                    break;
            }
            
                break;
        
        }while(opcion != 0);
    }

    public static void AgregarVehiculo(Scanner sc){
        int opcion = -1;
        do{
            System.out.print("""
            ------------------------------------------
            Elija el vehiculo que desea agregar

                1. Automóvil.
                2. Camión.
                0. Salir.

            ------------------------------------------
            elije una opcion:""");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    agregarCarro(sc);
                    break;
                case 2:
                
                    break;
                default: System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion !=0);

        
    }
    public static void agregarCarro(Scanner sc){
        
        System.out.println("Ingresar la placa del carro: ");

        sc.nextLine();
        String placa = sc.nextLine();
       
        Carro carro = new Carro(placa);
        carro.getValorPeaje();
        carro.imprimir();
        
    }
    public static void agregarCamion(Scanner sc, Vehiculo vehiculo){

    }
    
}
