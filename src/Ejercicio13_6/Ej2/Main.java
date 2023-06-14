package Ejercicio13_6.Ej2;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];

        productos[0] = new Producto("Camisa", 26, 1);
        productos[1] = new Producto("Pantalón", 50, 9);
        productos[2] = new Producto("Zapatos", 45, 2);

        for (Producto producto : productos) {
            double valorTotal = producto.calcularValorTotal();
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Valor total: " + valorTotal);
            System.out.println("--------------------------");
        }
    }
}
