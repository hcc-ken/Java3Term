package Empleados.Repartidores;

import Empleados.Empleado;

public class Repartidor extends Empleado {
    String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }


}
