package Interfaces;

import SistemaDeGestionTurnos.*;

public interface GestorTurnos {

    public void agregarTurno(Cliente cliente);
    public void atenderTurno(Empleado empleado);
    public void mostrarTurnosPendientes();
    public void mostrarTurnosAtendidos();

}
