import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorInventarioApp {
    List<Producto> productos;
    GestorInventario gestorInventario;
    Scanner sc = new Scanner(System.in);
    GestorInventario gestorInventario2 = new GestorInventario();
    Administrador administrador = new Administrador("Santiago Camino Muñoz", 1108639397);

    Producto producto1 = new Producto(1, "Televisor", "Electronico", 5);
    Producto producto2 = new Producto(2, "Mesa", "Muebles", 1);

    public GestorInventarioApp() {
        this.productos = new ArrayList<>();
    }

    public void start() {

        productos.add(producto1);
        productos.add(producto2);

        int opcion = -1;
        do {
            System.out.print("""

                    ----- SISTEMA DE INVENTARIO -----

                    1. Registrar Entrada de producto
                    2. Registrar Salida de producto
                    3. Ver Estado del Inventario
                    4. Ver historial de movimientos
                    0. Salir
                    
                    ---------------------------------
                    Seleccione una opcion:""");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int opcion1 = -1;
                    do {
                        System.out.print("""
                                -----------------------------------------
                                Desea registar una entrada de producto

                                1.Si
                                0.No

                                ------------------------------------------
                                Seleccione una opcion:""");
                        opcion1 = sc.nextInt();
                        switch (opcion1) {
                            case 1:
                                System.out.println("----------------------------------");
                                System.out.println("Seleccione el id del producto a entrar:");
                                for (Producto producto : productos) {
                                    System.out.println( "Id: " + producto.getId()+ " Producto: " + producto.getNombre());
                                }
                                System.out.println("----------------------------------");
                                int idProductos = sc.nextInt();
                                boolean noEncontrado=true;
                                int posicion = 0;
                                for (Producto producto : productos) {
                                    if (productos.get(posicion).getId() == idProductos){
                                        gestorInventario2.registrarEntrada(producto, administrador);
                                        noEncontrado=false;
                                    }
                                    posicion++;
                                }
                                if(noEncontrado){
                                    System.out.println("\nNo se encuentra ese producto");
                                }
                                break;
                            case 0:
                                break;
                            default:
                                break;
                        }
                    } while (opcion1 != 0);

                    break;
                case 2:
                     int opcion2 = -1;
                    do {
                        System.out.print("""
                                -----------------------------------------
                                Desea registar una Salida de producto

                                1.Si
                                0.No

                                ------------------------------------------
                                Seleccione una opcion:""");
                        opcion2 = sc.nextInt();
                        switch (opcion2) {
                            case 1:
                                 System.out.println("----------------------------------");
                                System.out.println("Seleccione el id del producto a Salir:");
                                for (Producto producto : productos) {
                                    System.out.println( "Id: " + producto.getId()+ " Producto: " + producto.getNombre());
                                }
                                System.out.println("----------------------------------");
                                int idProductos = sc.nextInt();
                                int posicion = 0;
                                boolean noEncontrado = true;
                                for (Producto producto : productos) {
                                    if (productos.get(posicion).getId() == idProductos){
                                        gestorInventario2.registrarSalida(producto, administrador);
                                        noEncontrado=false;
                                    }
                                    posicion++;
                                }
                                if(noEncontrado){
                                    System.out.println("\nNo se encuentra ese producto");
                                }
                                break;
                                case 0:
                                break;
                            default:
                                break;
                        }
                   
                        }while (opcion2!=0); 
                    break;
                case 3:
                    System.out.println("-----------Estado del inventario------------");
                    for (Producto producto : productos) {
                        producto.imprimir();
                    }
                    System.out.println("-------------------------------------------");
                    break;
                case 4:
                    System.out.println("\n---------Historial de movimientos----------");
                    gestorInventario2.historialMovimiento();
                    System.out.println("--------------------------------------------");
                    break;
                case 0:
                    System.out.println("Bye bye (n.n)/");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);

    }
}
