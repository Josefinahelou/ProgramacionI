package Parcial2;
import java.util.Scanner;
public class CompCod {
    public static void main(String[] args)
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
    int numero = scanner.nextInt();

        if (numero > 0) {
        System.out.println("Es positivo");
    } else {
        System.out.println("Es negativo");
    }
}

