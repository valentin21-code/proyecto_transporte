package app;

import transporte.*;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();
        Barco barco = new Barco();
        Avion avion = new Avion();

        coche.arrancar();
        coche.encenderMotor();
        coche.describir();
        
        System.out.println();

        bicicleta.arrancar();
        bicicleta.usarFuerzaHumana();
        bicicleta.describir();

        System.out.println();

        barco.arrancar();
        barco.encenderMotor();
        barco.describir();

        System.out.println();

        avion.arrancar();
        avion.encenderMotor();
        avion.describir();
    }
}