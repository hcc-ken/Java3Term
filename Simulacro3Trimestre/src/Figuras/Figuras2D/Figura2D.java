package Figuras.Figuras2D;

import Figuras.Figura;

public abstract class Figura2D extends Figura {

    public Figura2D() {
        super();
    }

    public Figura2D(int posX, int posY, String color) {
        super(posX, posY, color);
    }

    public String toString() {
        return super.toString();
    }

    public abstract void describir();
}
