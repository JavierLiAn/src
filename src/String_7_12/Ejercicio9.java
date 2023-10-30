package String_7_12;

import java.util.Scanner;

import static java.lang.System.*;

public class Ejercicio9 {

    public static String mostrarSubcadena (String str, int num, int num2){

        if (num >= 0 && num2 <= str.length() && num < num2){
            return str.substring(num, num2);

        }else{
            return null;
        }
    }

    public static void main(String[] args) {

        String str;
        int num;
        int num2;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();

        System.out.println("Introduce el número: ");
        num = input.nextInt();

        System.out.println("Introduce el número: ");
        num2 = input.nextInt();

        System.out.println(mostrarSubcadena(str, num, num2));
    }
}
