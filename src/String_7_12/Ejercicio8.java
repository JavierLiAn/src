package String_7_12;


import java.util.Scanner;

import static java.lang.System.*;

public class Ejercicio8 {

    public static int ultimaPosicionEnCadena (String str, String str2){

        int posicion = str.lastIndexOf(str2);

        return posicion;
    }

    public static void main(String[] args) {

        String str;
        String str2;


        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();

        System.out.println("Introduce la cadena: ");
        str2 = input.nextLine();

        System.out.println(ultimaPosicionEnCadena(str, str2));
    }
}
