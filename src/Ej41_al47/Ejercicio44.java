package Ej41_al47;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio44 {
    public static void main(String[] args) {
        int exponente=0;
        int resultado=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Binario: ");
        String str = input.nextLine();

        for (int i = str.length()-1; i >=0; i--) {

            if (str.charAt(i)=='1'){
                resultado += Math.pow(2 , exponente);
            }

            exponente++;

        }

        System.out.println("Decimal: "+resultado);
    }
}