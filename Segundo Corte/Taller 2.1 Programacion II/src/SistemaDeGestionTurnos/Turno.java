package SistemaDeGestionTurnos;

import java.time.LocalDate;

public class Turno {
    private Cliente cliente;
    private Empleado empleado;
    private int id;
    private LocalDate fecha;

    public Turno(int id, Cliente cliente, LocalDate fecha){
        this.id=id;
        this.cliente=cliente;
        this.fecha=fecha;
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void imprimir(){
        System.out.println("---------------Turno---------------");
        System.out.println("Id: "+id);
        System.out.println("Nombre: " + cliente);
        System.out.println("Fecha: "+ fecha);
    }
}
