package String_1_6;

import java.util.Scanner;

import static java.lang.System.*;

public class Contains {

    public static boolean contiene (String str, String str2){

        return str.contains(str2);
    }

    public static void main(String[] args) {

        String str;
        String str2;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();

        System.out.println("Introduce la cadena: ");
        str2 = input.nextLine();

        if (contiene(str2,str)){
            System.out.println("La primera cadena está contenida en la segunda");

        }else{
            System.out.println("La primera cadena no está dentro en la segunda");

        }

    }
}
