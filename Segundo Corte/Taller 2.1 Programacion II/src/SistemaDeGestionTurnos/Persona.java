package SistemaDeGestionTurnos;

public class Persona {
    private String nombre;
    private int identificacion;
    private int edad;

    public Persona(String nombre, int identificacion, int edad){
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimir(){
        System.out.println("..........................................");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificacion: "+ identificacion);
        System.out.println("Edad: "+ edad);
    }
    
}
