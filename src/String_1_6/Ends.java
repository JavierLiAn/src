package String_1_6;

import java.util.Scanner;

import static java.lang.System.*;

public class Ends {

    public static boolean acabaCon (String str, String str2){

        return str.endsWith(str2);
    }

    public static void main(String[] args) {

        String str;
        String str2;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();

        System.out.println("Introduce la cadena: ");
        str2 = input.nextLine();

        if (acabaCon(str2,str)){
            System.out.println("La primera cadena finaliza el contenido de la segunda");

        }else{
            System.out.println("La primera cadena no finaliza el contenido de la segunda");

        }
    }
}
