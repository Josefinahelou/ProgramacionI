public class EjercicioArray {
    public static void main(String[] args) {
        String [] autos = {"volkswagen", "ferrari", "aston martin", "renault"};
        char letra = 'v';
        int count = 0;
         for(String palabra : autos){
             if(palabra.startsWith(String.valueOf(letra))){
                 count++;
             }

         }
           System.out.println("el numero de opciones que comienzan con la letra " + letra + " es " + count);
    }
}
