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
        System.out.println("Escriba la fecha de entrada: ");
        String fecha = sc.nextLine();
        String tipoEntrada = "Entrada";
        Movimiento movimiento = new Movimiento(producto, fecha, tipoEntrada, administrador);
        System.out.println("¡\nMovimiento registrado!");
        producto.añadirStock();
        movimiento.imprimir();
        System.out.println("Catidad de stock restante: " + producto.getStock());
        movimientos.add(movimiento);

    }

    public void registrarSalida(Producto producto, Administrador administrador) {
        if (producto.getStock() > 0) {
            System.out.println("Escriba la fecha de salida: ");
            String fecha = sc.nextLine();
            String tipoEntrada = "Salida";
            Movimiento movimiento = new Movimiento(producto, fecha, tipoEntrada, administrador);

            System.out.println("¡\nMovimiento registrado!");
            producto.removerStock();
            movimiento.imprimir();
            System.out.println("Catidad de stock restante: " + producto.getStock());
            movimientos.add(movimiento);
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
