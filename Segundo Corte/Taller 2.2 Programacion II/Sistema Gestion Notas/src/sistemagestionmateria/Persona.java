package sistemagestionmateria;

public class Persona {

    private String nombre;
    private String genero;
    private int identificacion;
    private int edad;

    public Persona(String nombre, int edad, String genero, int identificacion) {

        this.nombre = nombre;
        this.genero = genero;
        this.identificacion = identificacion;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void imprimir() {

        System.out.println("..........................................");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Género: " + genero);
        System.out.println("..........................................");

    }

}
