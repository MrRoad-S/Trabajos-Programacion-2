package vehiculo;

public class Carro extends Vehiculo {

    protected int valorPeaje = 10000;
    
    public Carro (String placa){
        super(placa);
    }

    @Override
    public int getValorPeaje() {
        return super.getValorPeaje();
    }

    public void imprimir(){

        System.out.println("Placa del automovil: " + placa);
        System.out.println("Valor del peaje: $" + valorPeaje);

    }
    
}
