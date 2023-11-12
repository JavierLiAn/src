package String_13_17;

import java.util.Scanner;

import static java.lang.System.*;

public class Digitos2 {

    public static int contarNumeros (String cadena){

        int numeros = 0;

        for (int i = 0; i < cadena.length()-1; i++) {
            if (Digitos.esDigito(cadena.charAt(i))) {
                if (!Digitos.esDigito(cadena.charAt(i+1))){
                    numeros ++;
                }
            }
        }
        if (Digitos.esDigito(cadena.charAt(cadena.length()-1))) {
            numeros++;
        }
        return numeros;

    }


    public static void main(String[] args) {

        String str;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();


        System.out.println("Números: "+contarNumeros(str));

    }
}

