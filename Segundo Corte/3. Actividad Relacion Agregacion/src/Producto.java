public class Producto {

        private int identificador;
        private String nombre;
        private String descripcion;
        private int precio;
        
        public Producto(int identificador, String nombre, String descripcion, int precio) {
            this.identificador = identificador;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
        }

        public int getIdentificador() {
            return identificador;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getPrecio() {
            return precio;
        }

        public void setIdentificador(int identificador) {
            this.identificador = identificador;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        public void imprimir() {

            System.out.println("--------Producto---------");
            System.out.println("Identificador: "+ identificador);
            System.out.println("Nombre:"+nombre);
            System.out.println("Descripcion: "+ descripcion);
            System.out.println("Precio: $"+ precio);
        
        }
}