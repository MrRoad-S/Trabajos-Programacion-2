package Interfaces;

import java.time.LocalDate;

import SistemaDeGestionTurnos.*;

public interface GestorTurnos {

    public void agregarTurno(Cliente cliente, LocalDate fecha);
    public void atenderTurno(Empleado empleado);
    public void mostrarTurnosPendientes();
    public void mostrarTurnosAtendidos();

}
