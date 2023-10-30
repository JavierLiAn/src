package Ej26_al_30;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int numero;
        numero = inputValue.nextInt();

        for (int i = 1; i <= numero; i++) {
            //for (int j = 1; j <= i; j++) {
            //   System.out.print(j + " ");
            //}

            System.out.print(i + " ");
            //System.out.println();

        }
    }

}
