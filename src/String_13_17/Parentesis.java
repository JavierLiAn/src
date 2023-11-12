package String_13_17;


import java.util.Scanner;

import static java.lang.System.*;

public class Parentesis {

    public static boolean parentesis (String cadena) {

        int apertura = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == '(') {
                apertura++;
            }
            if (cadena.charAt(i) == ')') {
                apertura--;
            }
            if (apertura < 0) {
                return false;
            }
        }

        if (apertura == 0) {return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String str;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();


        if (parentesis(str)){
            System.out.println("Está bien parentizada.");

        }else{
            System.out.println("No está bien parentizada.");

        }
    }
}

