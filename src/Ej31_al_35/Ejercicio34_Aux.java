package Ej31_al_35;

import java.util.Scanner;

public class Ejercicio34_Aux {
    public static void main(String[] args) {
        int numero = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        String str = input.nextLine(); // Carga el NIE introducido en una variable String.

        String strAux = str; // Carga el valor del String en un String auxiliar.

        strAux =strAux.replace('X','0'); // Sustituye la letra del auxiliar
        strAux =strAux.replace('Y','1');
        strAux =strAux.replace('Z','2');


        numero = Integer.parseInt(strAux); // Carga el String auxiliar como un entero en la variable 'número'.

        int resto = numero%23;

        String anArray[] = new String[23];

        anArray[0] = "T";
        anArray[1] = "R";
        anArray[2] = "W";
        anArray[3] = "A";
        anArray[4] = "G";
        anArray[5] = "M";
        anArray[6] = "Y";
        anArray[7] = "F";
        anArray[8] = "P";
        anArray[9] = "D";
        anArray[10] = "X";
        anArray[11] = "B";
        anArray[12] = "N";
        anArray[13] = "J";
        anArray[14] = "Z";
        anArray[15] = "S";
        anArray[16] = "Q";
        anArray[17] = "V";
        anArray[18] = "H";
        anArray[19] = "L";
        anArray[20] = "C";
        anArray[21] = "K";
        anArray[22] = "E";

        System.out.println("NIF: "+str+anArray[resto]);

    }
}