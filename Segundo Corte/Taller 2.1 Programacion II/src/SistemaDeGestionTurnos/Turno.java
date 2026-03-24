package SistemaDeGestionTurnos;

public class Turno {
    private Cliente cliente;
    private Empleado empleado;
    private int id;

    public Turno(int id, Cliente cliente){
        this.id=id;
        this.cliente=cliente;
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
    
}
