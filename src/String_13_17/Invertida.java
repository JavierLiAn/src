package String_13_17;


import java.util.Scanner;

import static java.lang.System.*;

    public class Invertida {

        public static String invertirPorPalabras (String cadena) {

            String[] array = Librerias.Utilidades.dividirEnPalabras(cadena);
            String cadenaInvertida = "";

            for (int i = array.length-1; i >= 0; i--) {

                cadenaInvertida += array[i] + " ";
            }
            return cadenaInvertida;
       }


    public static void main(String[] args) {

        String cadena;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la frase: ");
        cadena = input.nextLine();

        System.out.print("Frase invertida: \n"+invertirPorPalabras(cadena));

    }
}

