import Interfaces.GestorTurnos;
import SistemaDeGestionTurnos.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        GestorTurnos gestorTurnos=new GestorTurnosMemoria();
        TurnosApp turnosApp=new TurnosApp(gestorTurnos);
        
        Scanner sc=new Scanner(System.in);
        
        turnosApp.start(sc);
    }
}
