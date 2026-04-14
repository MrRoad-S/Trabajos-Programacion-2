import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorInventario {
    List<Movimiento> movimientos;
    Scanner sc = new Scanner(System.in);

    public GestorInventario() {
        this.movimientos = new ArrayList<>();
    }

    public void registrarEntrada(Producto producto, Administrador administrador) {
        System.out.println("Esriba la cantidad");
        int cantidadE = sc.nextInt();
        System.out.println("Escriba la fecha de entrada: ");
        sc.nextLine();
        String fecha = sc.nextLine();
        String tipoEntrada = "Entrada";
        Movimiento movimiento = new Movimiento(producto, fecha, tipoEntrada, administrador);
        System.out.println("¡\nMovimiento registrado!");
        producto.añadirStock(cantidadE);
        movimiento.imprimir();
        System.out.println("Catidad de stock restante: " + producto.getStock());
        movimientos.add(movimiento);

    }

    public void registrarSalida(Producto producto, Administrador administrador) {
        int cantidadInicial = producto.getStock();
        if (producto.getStock() > 0) {
            System.out.println("Esriba la cantidad");
            int cantidadS = sc.nextInt();  
            System.out.println("Escriba la fecha de salida: ");
            sc.nextLine();
            String fecha = sc.nextLine();
            String tipoEntrada = "Salida";
            Movimiento movimiento = new Movimiento(producto, fecha, tipoEntrada, administrador);
            producto.removerStock(cantidadS);
            if(cantidadInicial == producto.getStock()){
               System.out.println("Movimiento no registrado");
            }
            else{
                movimiento.imprimir();
                System.out.println("Catidad de stock restante: " + producto.getStock());
                movimientos.add(movimiento);
            }
            
        } else {
            System.out.println("\nNo se encuentra mas stock de este producto");
        }
    }

    public void historialMovimiento() {
        if (movimientos.isEmpty()) {
            System.out.println("\nNo hay movimientos registrados");
        }else{
            for (Movimiento movimiento : movimientos) {
                movimiento.imprimir();
            }
        }
    }
}
