import Interfaces.GestorTurnos;
import SistemaDeGestionTurnos.*;

public class App {
    public static void main(String[] args) throws Exception {
        GestorTurnos gestorTurnos=new GestorTurnosMemoria();
        TurnosApp turnosApp=new TurnosApp(gestorTurnos);
        
        turnosApp.start();
    }
}
