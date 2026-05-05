package Figuras;

public abstract class Figura {
    protected int posX;
    protected int posY;
    protected String color;

    public Figura() {
        posX = 0;
        posY = 0;
        color = "";
    }

    public Figura(int posX, int posY, String color) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Posición: " + posX + ", " + posY +
                "\n Color: " + color;
    }
}
