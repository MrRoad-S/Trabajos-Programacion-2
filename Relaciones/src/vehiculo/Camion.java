package vehiculo;

public class Camion extends Vehiculo {

    private int valorPeajeEje = 5000;
    private int numeroEjes;
    

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public int getValorPeajeEje() {
        return valorPeajeEje;
    }

      @Override
    public int getValorPeaje() {
        this.valorPeaje = valorPeajeEje*numeroEjes;
        return (this.valorPeaje);
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setValorPeajeEje(int valorPeajeEje) {
        this.valorPeajeEje = valorPeajeEje;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

     public void imprimir(){

        System.out.println("Placa del camión: " + placa);
        System.out.println("Número de ejes del camión: " + numeroEjes);
        System.out.println("Valor del peaje: $" + valorPeajeEje);

    }

   
    
}
