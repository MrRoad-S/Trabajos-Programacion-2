public class Movimiento {
    private Administrador administrador;
    private Producto producto;
    private String fecha;
    private String tipoMovimiento;

    public Movimiento(Producto producto, String fecha, String tipoMovimiento, Administrador administrador) {
        this.producto = producto;
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
        this.administrador=administrador;
    }

    public void imprimir() {
        System.out.println("------------------------------");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo de movimiento: " + tipoMovimiento);
        System.out.println("Movimiento realizado por: "+ administrador.getNombre());
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

}
