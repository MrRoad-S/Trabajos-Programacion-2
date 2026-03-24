package SistemaDeGestionTurnos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Interfaces.*;

public class GestorTurnosMemoria implements GestorTurnos{

    private Queue<Turno> colaTurnos;
    private List<Turno> turnosAtendidos;
    private int idTurno=1;

    public GestorTurnosMemoria(){
        colaTurnos=new LinkedList<>();
        turnosAtendidos=new ArrayList<>();
    }
    @Override
    public void agregarTurno(Cliente cliente) {
        idTurno++;
        Turno turno=new Turno(0, cliente);
        colaTurnos.add(turno);
    }

    @Override
    public void atenderTurno(Empleado empleado) {
        Turno turno=colaTurnos.poll();
        turno.setEmpleado(empleado);
        turnosAtendidos.add(turno);
    }

    @Override
    public void mostrarTurnosPendientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarTurnosPendientes'");
    }

    @Override
    public void mostrarTurnosAtendidos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarTurnosAtendidos'");
    }
    
}
