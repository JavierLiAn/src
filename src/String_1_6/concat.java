package String_1_6;

import java.util.Scanner;

import static java.lang.System.*;

public class concat {

    public static String concatenar (String str, String str2){

        String cadenaConcatenada = str.concat(str2);

        return cadenaConcatenada;
    }

    public static void main(String[] args) {

        String str;
        String str2;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();

        System.out.println("Introduce la cadena: ");
        str2 = input.nextLine();

        System.out.println(concatenar(str,str2));

    }
}
