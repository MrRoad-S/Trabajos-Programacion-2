
import java.util.List;
import java.util.Scanner;
import peaje.Peaje;
import vehiculo.Camion;
import vehiculo.Carro;
import vehiculo.Vehiculo;

public class App {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        
      //------------------------------------------------------------------------------------------
      //                                         MAIN MENU
      //------------------------------------------------------------------------------------------

      int opcion = -1;


        System.out.println(""" 
        ____________________________________________________________________________

                                       PEAJES - MENÚ
        ____________________________________________________________________________
                """);

      do { 

        System.out.println("""

        ----------------------------------------------------------------------------
        
        1. Agregar vehículo.
        2. Calcular total de peaje.
        3. Salir.

        ----------------------------------------------------------------------------

                                Por favor, elegir una opción:
                                
        ----------------------------------------------------------------------------
                
                """);

        opcion = sc.nextInt();

        switch (opcion){

              case 1:

              do{
              
              System.out.println("""
                ----------------------------------------------------------------------------

                ¿Es el vehículo un automóvil o un camión?

                1. Automóvil.
                2. Camión.
                0. Salir.

                ----------------------------------------------------------------------------
                """);

                opcion = sc.nextInt();

                if(opcion == 1){agregarUnCarro(sc,1);}
                if(opcion == 2){agregarUnCamion(sc,2);}
                if(opcion == 3){System.out.println("\n                           bye byeee!!!!\n");}
                  
                  }while (opcion != 0);

              break;

              case 2:
              System.out.println("\n________________________________________________________________________________________\n");
            
              Peaje peaje = new Peaje("La Lizama", "Santander");
              peaje.CalcularTotalPeaje();
              peaje.imprimir();
              break;

              case 3:
              System.out.println("\n________________________________________________________________________________________\n");
              System.out.println("\n                           bye byeee!!!!\n");
              System.out.println("\n________________________________________________________________________________________\n");
              break;

              default: System.out.println("\n________________________________________________________________________________________\n");
               System.out.println("\n                       Lo lamento, la opción no es válida\n");
              System.out.println("\n________________________________________________________________________________________\n");
              break;

        }
          
      } while (opcion != 3);
    
             
    }

      //------------------------------------------------------------------------------------------
      //                                         METODOS
      //------------------------------------------------------------------------------------------


      public static void agregarUnCarro(Scanner sc, int opcion){

        System.out.println("\n________________________________________________________________________________________\n");
        System.out.println("Por favor, ingresar la placa del automóvil: ");
        System.out.println("\n________________________________________________________________________________________\n");
        sc.nextLine();
        String placa = sc.nextLine();
        
        
        System.out.println("\n---------------------------------------------------------------------------------\n");
        System.out.println("                                  Automóvil añadido!!!!");
        System.out.println("\n---------------------------------------------------------------------------------\n");
       
        Carro carro = new Carro(placa);

        System.out.println("\n---------------------------------------------------------------------------------\n");
        carro.setPlaca(placa);
        carro.getValorPeaje();
        carro.imprimir();
        System.out.println("\n---------------------------------------------------------------------------------\n");
      }
      
      public static void agregarUnCamion(Scanner sc,  int opcion ){

        System.out.println("\n________________________________________________________________________________________\n");
        System.out.println("Por favor, ingresar la placa del automóvil: ");
        System.out.println("\n________________________________________________________________________________________\n");
        sc.nextLine();
        String placa = sc.nextLine();

        System.out.println("¿Cúantos ejes tiene su camión?");
        int ejes = sc.nextInt();
        System.out.println("\n________________________________________________________________________________________\n");

        System.out.println("\n---------------------------------------------------------------------------------\n");
        System.out.println("                                  Camión añadido!!!!");
        System.out.println("\n---------------------------------------------------------------------------------\n");

        Camion camion = new Camion(placa, ejes);

        System.out.println("\n---------------------------------------------------------------------------------\n");
        camion.setNumeroEjes(ejes);
        camion.setPlaca(placa);
        System.out.println("Valor del peaje (prueba): $" + camion.getValorPeaje());
        camion.getValorPeaje();
        camion.imprimir();
        System.out.println("\n---------------------------------------------------------------------------------\n");
      }
}
