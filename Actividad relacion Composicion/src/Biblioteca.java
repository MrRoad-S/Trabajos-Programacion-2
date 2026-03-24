import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> coleccionLibros;

    public Biblioteca(String nombre){
        this.nombre=nombre;
        this.coleccionLibros=new ArrayList<>();
    }

    public void añadirLibro(Libro libro){
        coleccionLibros.add(libro);
        
    }
    public void listarLibros(){

        for (Libro libro : coleccionLibros) {
        System.out.println("\n..........................................");
            libro.imprimir();
            
        }
    }
}
