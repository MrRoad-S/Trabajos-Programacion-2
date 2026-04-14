public class Producto {

    private int id;
    private String nombre;
    private String tipoProducto;
    private int stock;

    public Producto(int id, String nombre, String tipoProducto, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void imprimir() {
        System.out.println("-------------------------");
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de producto: " + tipoProducto);
        System.out.println("Stock del producto: " + stock);
    }
    public int añadirStock(){
        stock++;
        return stock;
    }

    public int removerStock(){
        stock--;
        return stock;
    }

}
