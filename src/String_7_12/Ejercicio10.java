package String_7_12;

import java.util.Scanner;

import static java.lang.System.*;

public class Ejercicio10 {

    public static int palabrasConLongitudDada (String cadena, int k){

        String[] str = Librerias.Utilidades.dividirEnPalabras(cadena);
        int cantidad = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == k){
                cantidad ++;
            }
        }
        return cantidad;
        }


    public static void main(String[] args) {

        String str;
        int longitud;

        Scanner input = new Scanner(in);
        System.out.println("Introduce la cadena: ");
        str = input.nextLine();

        System.out.println("Introduce la longitud: ");
        longitud = input.nextInt();

        System.out.println(palabrasConLongitudDada(str,longitud));
    }
}
