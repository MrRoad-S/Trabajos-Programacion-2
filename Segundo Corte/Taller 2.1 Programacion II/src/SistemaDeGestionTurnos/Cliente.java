package SistemaDeGestionTurnos;

public class Cliente extends Persona{

    public Cliente(String nombre, int identificacion, int edad) {
        super(nombre, identificacion, edad);
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("..........................................");
    }
    
}
