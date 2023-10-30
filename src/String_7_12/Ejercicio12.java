package String_7_12;

import java.util.Scanner;

import static java.lang.System.*;

public class Ejercicio12 {
    public static boolean menosQueLaLongitudDada (String cadena, int k){

        String[] str = Librerias.Utilidades.dividirEnPalabras(cadena);

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > k){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String str;
        int k;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();

        System.out.println("Introduce la longitud: ");
        k = input.nextInt();

        if (menosQueLaLongitudDada(str, k)){
            System.out.println("Todas las cadenas son cortas");
        }else{
            System.out.println("Hay alguna palabra larga");
        }
    }
}
