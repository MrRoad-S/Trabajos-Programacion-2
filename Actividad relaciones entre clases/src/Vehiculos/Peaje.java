package Vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Peaje {

    private String nombre;
    private String departamento;
    static int totalPeaje = 0;
    static int totalCamiones = 0;
    static int totalCarros = 0;
    static List<Vehiculo> vehiculos;

    public Peaje(String nombre, String departamento){
        this.nombre=nombre;
        this.departamento= departamento;
        vehiculos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void añadirVehiculo(Vehiculo vehiculo, List<Vehiculo> vehiculos){
        vehiculos.add(vehiculo);
    }

    public int calcularPeaje(Vehiculo vehiculo){
        if (vehiculo instanceof Carro) { 
            totalCarros++; 
            totalPeaje += Carro.valorPeaje;

            return Carro.valorPeaje; 

        } else if (vehiculo instanceof Camion) { 

            totalCamiones++; 
        Camion camion = (Camion) vehiculo;


        totalPeaje += camion.numeroEjes * camion.valorPeajeEje;

        return camion.numeroEjes * camion.valorPeajeEje;
        } else return -1; 
    }

    public void imprimir(){

        System.out.println("-------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Total del peaje: " + totalPeaje);
        System.out.println("Total de carros: " + totalCarros);
        System.out.println("TotalCarros: " + totalCamiones);
        System.out.println("-------------------------------------");
    }
    
}
