package SistemaDeGestionTurnos;

public class Empleado extends Persona{
    private String puesto;

    public Empleado(String nombre, int identificacion, int edad, String puesto) {
        super(nombre, identificacion, edad);
        this.puesto=puesto;
        
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Puesto: " + puesto);
        System.out.println("..........................................");
    }
    
}
