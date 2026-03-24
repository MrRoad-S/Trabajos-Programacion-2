package peaje;

import java.util.ArrayList;
import java.util.List;
import vehiculo.*;

public class Peaje {
    
    private  String nombre;
    private String departamento;
    private int totalPeaje;
    private int total;
    private int totalCamiones;
    private int totalCarros;
    private List<Vehiculo> vehiculos;

    public Peaje (String nombre, String departamento) {

        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getTotalPeaje() {
        return totalPeaje;
    }

    public int getTotalCamiones() {
        return totalCamiones;
    }

    public int getTotalCarros() {
        return totalCarros;
    }

    public int getTotal() {
         return total;
     }

    public List<Vehiculo> getVehiculos() {
         return vehiculos;
     }

    public void setVehiculos(List<Vehiculo> vehiculos) {
         this.vehiculos = vehiculos;
     }


    public void setTotal(int total) {
         this.total = total;
     }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setTotalPeaje(int totalPeaje) {
        this.totalPeaje = totalPeaje;
    }

    public void setTotalCamiones(int totalCamiones) {
        this.totalCamiones = totalCamiones;
    }

    public void setTotalCarros(int totalCarros) {
        this.totalCarros = totalCarros;
    }

    public void anadirVehiculo (Vehiculo vehiculo){

    vehiculos.add(vehiculo);

    }

    public int calcularPeaje (Vehiculo vehiculo) {

        total = (vehiculo.getValorPeaje());

        return total;
    }

    public void CalcularTotalPeaje(){

        for (Vehiculo vehiculo : vehiculos)
        {totalPeaje += vehiculo.getValorPeaje();}

    }
    
     public void imprimir(){

        System.out.println("\n______________________________________________________\n");

        System.out.println("Número total de peajes pagados: " + totalPeaje);
        System.out.println("Número total de camiones atendidos: " + totalCamiones);
        System.out.println("Número total de carros atendidos: " + totalCarros);

        System.out.println("\n______________________________________________________\n");
    }



}
