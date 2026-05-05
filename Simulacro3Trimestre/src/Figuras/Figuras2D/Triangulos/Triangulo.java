package Figuras.Figuras2D.Triangulos;

import Figuras.Figuras2D.Figura2D;

public class Triangulo extends Figura2D {
    private int base;
    private int altura;

    public Triangulo() {
        int base = 0;
        int altura = 0;
    }

    public Triangulo(int posX, int posY, String color, int base, int altura) {
        super(posX, posY, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public void describir() {
        System.out.println("Soy un Triangulo y tengo una a base y altura de: " + base + ", " + altura);
    }
}
