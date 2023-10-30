package String_1_6;

import java.util.Scanner;

import static java.lang.System.*;

public class CompararIgnoreCase {

    public static int compararIgnoreCase(String str, String str2){

        return str2.compareToIgnoreCase(str);
    }

    public static void main(String[] args) {

        String str;
        String str2
                ;
        Scanner input = new Scanner(in);
        out.println("Introduce la cadena: ");
        str = input.nextLine();

        out.println("Introduce la otra cadena: ");
        str2 = input.nextLine();


        if (compararIgnoreCase(str,str2)> 0) {
            System.out.println("La primera cadena es mayor que la segunda");
        }else if (compararIgnoreCase(str,str2)< 0) {
            System.out.println("La primera cadena es menor que la segunda");
        }else{
            System.out.println("La primera cadena es igual que la segunda");

        }
    }
}
