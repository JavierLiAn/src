package String_7_12;


import java.util.Scanner;

import static java.lang.System.*;

public class Ejercicio7 {

    public static int primeraPosicionEnCadena (String str, String str2){

        int posicion = str.indexOf(str2);

        return posicion;
    }

    public static void main(String[] args) {

        String str;
        String str2;


        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();

        System.out.println("Introduce la segunda cadena: ");
        str2 = input.nextLine();

        System.out.println("Posición de la primera ocurrencia de la segunda cadena: "+primeraPosicionEnCadena(str, str2));
    }
}
