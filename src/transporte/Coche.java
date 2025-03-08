package transporte;

public class Coche extends Vehiculo implements ConMotor {
    public Coche() {
        super(180); 
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del coche está encendido.");
    }

    @Override
    public void describir() {
        System.out.println("Soy un coche que puede alcanzar " + velocidadMaxima + " km/h.");
    }
}