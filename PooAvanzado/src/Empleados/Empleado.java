package Empleados;

public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected double salario;

    public static final int PLUS = 300;

    public Empleado (String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
}
