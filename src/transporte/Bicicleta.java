package transporte;

public class Bicicleta extends Vehiculo implements SinMotor {
    public Bicicleta() {
        super(30); 
    }

    @Override
    public void usarFuerzaHumana() {
        System.out.println("Usando fuerza humana para mover la bicicleta.");
    }

    @Override
    public void describir() {
        System.out.println("Soy una bicicleta con una velocidad máxima de " + velocidadMaxima + " km/h.");
    }
}