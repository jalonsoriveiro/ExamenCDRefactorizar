package factorial;

public class Factorial {

    public static void main(String[] args) {
        //Numero que vamos a multiplicar
        int numMultiplicar;
        //Variable para almacer y mostrar resultado
        int totalMultiplicacion;

        numMultiplicar = 8;
        // Contador de bucle for
        int contador;
        if (numMultiplicar == 0) {
            totalMultiplicacion = 1;
        } else {
            totalMultiplicacion = 1;
            for (contador = numMultiplicar; contador >= 1; contador--) {
                totalMultiplicacion = totalMultiplicacion * contador;
            }
        }

        System.out.println(totalMultiplicacion);

    }

}
