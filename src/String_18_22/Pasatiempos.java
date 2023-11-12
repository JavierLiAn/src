package String_18_22;

import java.util.Scanner;

import static java.lang.System.*;

public class Pasatiempos {

    public static String ocultaVocales (String cadena) {
        String str = "";

        for (int i = 0; i < cadena.length()-1; i++) {

            switch (cadena.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    str+='.';
                    break;
                default:
                    str+=cadena.charAt(i);
            }
        }

        /* Otra opción:

        cadena = cadena.replace('a','.' );
        cadena = cadena.replace('e','.' );
        cadena = cadena.replace('i','.' );
        cadena = cadena.replace('o','.' );
        cadena = cadena.replace('u','.' );
        */

        return str;
    }

    public static void main(String[] args) {

        String cadena;

        Scanner input = new Scanner(in);
        System.out.println("Introduce el texto: ");
        cadena = input.nextLine();

        System.out.print(ocultaVocales(cadena));
        }
    }


