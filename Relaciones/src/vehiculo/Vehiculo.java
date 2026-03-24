package vehiculo;

public class Vehiculo {

    protected String placa;
    protected int valorPeaje;

    public Vehiculo (String placa){

        this.placa = placa;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public int getValorPeaje() {
        return valorPeaje;
    }


    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    

}
