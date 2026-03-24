public class App {
    public static void main(String[] args){
        Biblioteca biblioteca1=new Biblioteca("Biblioteca Nacional");
        
        biblioteca1.añadirLibro(new Libro("Cien años de soledad","Gabriel Garcia Marquez", 1967, "Sudamericana","858.67 M5666"));
        biblioteca1.añadirLibro(new Libro("Rayuela","Julio Cortazar", 1963, "Sudamericana","863.55 J667"));
        biblioteca1.añadirLibro(new Libro("La tia julia y el escribidor","Mario Vargas Llosa", 1977, "Seix Barral","868.23 L567"));

        biblioteca1.listarLibros();
    }
}
