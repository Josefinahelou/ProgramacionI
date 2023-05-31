public class EjercicioArray2 {
    public static void main(String[] args) {
        String [] autos = {"volkswagen", "ferrari", "aston martin", "renault"};
        String recipiente = "";
        for(String palabra : autos) {
            if(palabra .length() > autos.length) {
                recipiente = palabra;
            }
        }
        System.out.println("la palabra mas larga es " + recipiente);
    }
}
