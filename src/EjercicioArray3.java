public class EjercicioArray3 {
        public static void main(String[] args) {
            int[] arrayDeNumeros = {4, 14, 2, 56, 5, 9};
            int maximo = arrayDeNumeros[0];


            for (int i = 1; i < arrayDeNumeros.length; i++) {
                if (arrayDeNumeros[i] > maximo) {
                    maximo = arrayDeNumeros[i];
                }
            }

            System.out.println("El número máximo es: " + maximo);
        }
    }


