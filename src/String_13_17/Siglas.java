package String_13_17;


import java.util.Scanner;

import static java.lang.System.*;

public class Siglas {

    public static String siglasDeUnaFrase (String cadena) {

        String[] array = Librerias.Utilidades.dividirEnPalabras(cadena);
        String siglas = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) >= 'A' && array[i].charAt(0) <= 'Z'){
                // Otras opciones para comprobar si es mayúscula:
                //---- Si el carácter es >= 65 y <= 90
                //---- Usando la función Character.isUpperCase(nombreDelCarácter)

                siglas += array[i].charAt(0);
            }
        }
        return siglas;
    }


    public static void main(String[] args) {

        String cadena;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la frase: ");
        cadena = input.nextLine();

        System.out.print("Siglas: \n"+siglasDeUnaFrase(cadena));

    }
}

