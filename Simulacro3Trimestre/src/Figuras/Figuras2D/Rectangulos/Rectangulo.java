package Figuras.Figuras2D.Rectangulos;

import Figuras.Figuras2D.Figura2D;

public class Rectangulo extends Figura2D {
    private int base;
    private int altura;

    public Rectangulo() {
        int base = 0;
        int altura = 0;
    }

    public Rectangulo(int posX, int posY, String color, int base, int altura) {
        super(posX, posY, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public void describir() {
        System.out.println("Soy un Rectángulo y tengo una a base y altura de: " + base + ", " + altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
