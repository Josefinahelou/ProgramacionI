package Ejercicio13_6.Ej1;

public class Empleado {
    private String nombre;
    private double salario;
    private int antiguedad;

    public Empleado(String nombre, double salario, int antiguedad) {
        this.nombre = nombre;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void aplicarAumentoSalario(double porcentajeAumento) {
        double aumento = salario * porcentajeAumento/ 100;
        salario += aumento;
    }
}

