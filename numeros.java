package numerosprimos;

/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments arg[0] es el primer parámetro que
     * se le pasa cuando se ejecuta por linea de comandos
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean verificar = false;

    public static void main(String arg[]) {
        int numUsuario = 0;
        int nd = 0;
        numUsuario = Integer.parseInt(arg[0]);
        if (numUsuario <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int contador = 1; contador <= 99999; contador++) {
            int valorContador = contador;
            int contador_W = 0;

            while (valorContador != 0) {
                valorContador = valorContador / 10;
                contador_W++;
            }
            nd = contador_W;

            if (nd == numUsuario) {
                if (contador < 4) {
                    verificar = true;
                } else {
                    if (contador % 2 == 0) {
                        verificar = false;
                    } else {
                        int c1 = 0;
                        int i1 = 1;
                        int l = (contador - 1) / 2;
                        if (l % 2 == 0) {
                            l--;
                        }
                        while (i1 <= l) {
                            if (contador % i1 == 0) {
                                c1++;
                            }
                            i1 += 2;
                            if (c1 == 2) {
                                i1 = l + 1;
                            }
                        }

                        if (c1 == 1) {
                            verificar = true;
                        }
                    }
                }

                if (verificar == true) {
                    System.out.println(contador);
                }
            }
        }
    }
}

}
