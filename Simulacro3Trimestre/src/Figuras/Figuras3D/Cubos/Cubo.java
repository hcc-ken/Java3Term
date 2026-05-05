package Figuras.Figuras3D.Cubos;

import Figuras.Figuras3D.Figura3D;

public class Cubo extends Figura3D {
    private int lado;

    public Cubo() {
        super();
        int lado = 0;
    }

    public Cubo(int posX, int posY, String color, int lado) {
        super(posX, posY, color);
        this.lado = lado;
    }

    public String toString() {
        return super.toString() + "lado: " + lado;
    }

    @Override
    public double calcularVolumen() {
        return lado * lado * lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado * 6;
    }
}
