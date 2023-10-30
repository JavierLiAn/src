package String_1_6;

import java.util.Scanner;

import static java.lang.System.*;

public class Reemplazar {

    public static String reemplazar (String str, String caracter1, String caracter2){

        String reemplazo = str.replace(caracter1, caracter2);

        return reemplazo;
    }

    public static void main(String[] args) {

        String str;
        String caracter1;
        String caracter2;


        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();

        System.out.println("Introduce la letra: ");
        caracter1 = input.nextLine();

        System.out.println("Introduce la letra por la que la quieres reemplazar: ");
        caracter2 = input.nextLine();

        System.out.println(reemplazar(str, caracter1,caracter2));

    }
}
