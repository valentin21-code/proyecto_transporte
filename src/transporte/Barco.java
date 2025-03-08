package transporte;

public class Barco extends Vehiculo implements ConMotor {
    public Barco() {
        super(50); 
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del barco está encendido.");
    }

    @Override
    public void describir() {
        System.out.println("Soy un barco que navega a " + velocidadMaxima + " km/h.");
    }
}