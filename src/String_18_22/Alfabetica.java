package String_18_22;

import java.util.Scanner;

import static java.lang.System.*;

public class Alfabetica {

    public static boolean esAlfabetica (String valor) {

        for (int i = 0; i < valor.length()-1; i++) {
            if (valor.charAt(i) > valor.charAt(i+1)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String cadena;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la palabra: ");
        cadena = input.nextLine();

        if (esAlfabetica(cadena)){
            System.out.print("Es alfabetica.");
        }else{
            System.out.print("No es alfabetica.");

        }
    }
}

