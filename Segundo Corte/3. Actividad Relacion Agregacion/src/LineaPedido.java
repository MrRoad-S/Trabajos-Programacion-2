   public class LineaPedido {

        private int identificador;
        private int cantidad;
        public Producto producto;


        public LineaPedido(int identificador, int cantidad, Producto producto) {
            this.identificador = identificador;
            this.cantidad = cantidad;
            this.producto = producto;
        }


        public int getIdentificador() {
            return identificador;
        }


        public int getCantidad() {
            return cantidad;
        }

        public Producto getProducto() {
            return producto;
        }   

        public void setIdentificador(int identificador) {
            this.identificador = identificador;
        }


        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public void setProducto(Producto producto) {
            this.producto=producto;

        }   

        public int calcularSubTotalLineaPedido(){
            int subtotal=cantidad*producto.getPrecio();
            return subtotal;
        }
   
        public void imprimir() {

            System.out.println("..........................................");
            System.out.println("Id: "+ identificador);
            System.out.println("Cantidad: " + cantidad);
            producto.imprimir();

        }
    
    }
