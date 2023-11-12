package String_13_17;

import java.util.Scanner;

import static java.lang.System.*;

public class Digitos {


    public static boolean esDigito (char caracter){

        if (caracter >= '0'&& caracter <= '9'){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        String str;
        int digito = 0;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();


        for (int i = 0; i < str.length(); i++) {
            if (esDigito(str.charAt(i))) {
                digito++;
            }
        }

        System.out.println("Digitos: "+digito);

    }
}

