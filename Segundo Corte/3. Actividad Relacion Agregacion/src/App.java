public class App {
    public static void main(String[] args) throws Exception {
        Producto producto1=new Producto(1, "Kirby", "EL GUERRERO ESTELAR", 999999);
        Producto producto2=new Producto(2, "frijol", "1b", 5000);
        Producto producto3=new Producto(3, "Azucar", "1b", 2000);
        Orden orden1=new Orden(1);
        orden1.añadirItem(1, 64, producto1);
        orden1.añadirItem(2, 3, producto2);
        orden1.añadirItem(3, 5, producto3);
        
        orden1.imprimir();
        System.out.println("__________________________________________");
        System.out.println("Total: " + orden1.calcularTotalOrden());

        
    }
}
