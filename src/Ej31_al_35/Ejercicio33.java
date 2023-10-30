package Ej31_al_35;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {

        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        numero = inputValue.nextInt();

        int resto = numero%23;

        String[] anArray = new String[23];

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

        System.out.println("DNI: "+numero+anArray[resto]);
    }
}