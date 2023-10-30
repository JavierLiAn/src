package Ej31_al_35;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        int numero;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        String str = input.nextLine();

        str = str.replace('X','0'); // Sustituye la letra del String
        str = str.replace('Y','1');
        str = str.replace('Z','2');

        numero = Integer.parseInt(str); // Carga el String como entero en 'número'

        int resto = numero%23;

        String[] anArray = {"T","R","W","A","G","M","Y", "F","P","D",
                "X","B", "N","J", "Z","S","Q","V","H","L","C","K","E"};

        if (str.charAt(0) == '0') {
            str = str.replaceFirst("0", "X");
        } else if (str.charAt(0) == '1') {
            str = str.replaceFirst("1","Y");
        } else if (str.charAt(0) == '2') {
            str = str.replaceFirst("2","Z");
        }

        System.out.println("El NIF es: "+str+anArray[resto]);

        /*

        Otra opción sería utilizar un String Auxiliar para operar en él y así
        no tener que volver a sustituir para poner la letra del String al final

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String strAux = str;

        strAux =strAux.replace('X','0');
        strAux =strAux.replace('Y','1');
        strAux =strAux.replace('Z','2');

        int numero = Integer.parseInt(strAux);

        int resto = numero%23;

        String[] anArray = {"T","R","W","A","G","M","Y", "F","P","D",
                "X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        System.out.println("NIF: "+str+anArray[resto]);

         */
    }
}