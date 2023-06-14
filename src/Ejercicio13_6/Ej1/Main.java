package Ejercicio13_6.Ej1;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Empleado("Marcos", 5000, 3);
        empleados[1] = new Empleado("Jose", 7500, 6);
        empleados[2] = new Empleado("Pedro", 9800, 8);

        double porcentajeAumento = 10;

        for (Empleado empleado : empleados) {
            if (empleado.getAntiguedad() > 5) {
                empleado.aplicarAumentoSalario(porcentajeAumento);
            }
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario actualizado: " + empleado.getSalario());
            System.out.println("--------------------------");
        }
    }
}

