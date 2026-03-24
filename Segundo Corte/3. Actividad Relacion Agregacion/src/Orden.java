import java.util.ArrayList;
import java.util.List;

    public class Orden {

        private int identificador;
        private List<LineaPedido> itemsPedido;

    public Orden(int identificador) {

        this.identificador = identificador;
        this.itemsPedido = new ArrayList<>();

    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int calcularTotalOrden() {
        int total=0;
        for(LineaPedido detalle: itemsPedido){
            total+=detalle.calcularSubTotalLineaPedido();
        }
        return total;

    }

    public void imprimir() {
        
        System.out.println("--------------Orden-----------------");
        System.out.println("Identificador: #" + identificador);
         for(LineaPedido detalle: itemsPedido){
            detalle.imprimir();
        }

    }

    public void añadirItem (int identificador, int cantidad, Producto producto) {
        LineaPedido detalle=new LineaPedido(identificador, cantidad, producto);
        itemsPedido.add(detalle);

    }
}