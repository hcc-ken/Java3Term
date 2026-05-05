package Figuras.Figuras2D.Circulos;

import Figuras.Figuras2D.Figura2D;

public class Circulo extends Figura2D {
    private double radio;

    public Circulo() {
        radio = 0;
    }

    public Circulo(int posX, int posY, String color, double radio) {
        super(posX, posY, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public void describir() {
        System.out.println("Soy un Círculo y tengo un radio de: " + radio);
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * radio * radio;
    }
}
