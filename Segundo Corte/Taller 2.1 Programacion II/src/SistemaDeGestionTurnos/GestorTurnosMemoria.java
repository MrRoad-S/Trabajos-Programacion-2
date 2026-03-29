package SistemaDeGestionTurnos;

import java.time.LocalDate;
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
    public void agregarTurno(Cliente cliente, LocalDate fecha) {
        Turno turno=new Turno(idTurno, cliente, fecha);
        colaTurnos.add(turno);
        turno.imprimir();
        idTurno++;
        
    }

    @Override
    public void atenderTurno(Empleado empleado) {
        if(colaTurnos.isEmpty()){
            System.out.println("\nNo se puede asignar empleado. No hay turnos pendientes....\n");
        }else{
            Turno turno=colaTurnos.poll();
            turno.setEmpleado(empleado);
            turnosAtendidos.add(turno);
            System.out.println("\n************* TURNO ATENDIDO *************");
            turno.imprimir();  
        }
        
        
    }

    @Override
    public void mostrarTurnosPendientes() {
        if(colaTurnos.isEmpty()){
            System.out.println("\nNo hay turnos pendientes...\n"); 
        }else{
            for (Turno turno : colaTurnos) {
                turno.imprimir();
            }
        }
    }

    @Override
    public void mostrarTurnosAtendidos() {
        if(turnosAtendidos.isEmpty()){
            System.out.println("\nNo se han atendido ningun turno...\n");
        }else{
            for (Turno turno : turnosAtendidos){
                turno.imprimir();
            }
        }
    
    }
    
    
}
