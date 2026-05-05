package Figuras.Figuras3D;

import Figuras.Figura;

public abstract class Figura3D extends Figura {
    public Figura3D() {
    }

    public Figura3D(int posX, int posY, String color) {
        super(posX, posY, color);
    }

    public abstract double calcularVolumen();

    public String toString() {
        return super.toString();
    }
}
