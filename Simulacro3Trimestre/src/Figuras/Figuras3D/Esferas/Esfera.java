package Figuras.Figuras3D.Esferas;

import Figuras.Figuras3D.Figura3D;

public class Esfera extends Figura3D {
    private double radio;

    public Esfera() {
        super();
        double radio = 0;
    }

    public Esfera(int posX, int posY, String color, double radio) {
        super(posX, posY, color);
        this.radio = radio;
    }
    @Override
    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    public String describir() {
        return "Soy una esfera.";
    }
}
