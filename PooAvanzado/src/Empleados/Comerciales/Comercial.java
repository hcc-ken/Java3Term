package Empleados.Comerciales;

import Empleados.Empleado;

public class Comercial extends Empleado {
    double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }
}
