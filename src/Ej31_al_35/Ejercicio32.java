package Ej31_al_35;

import java.util.Scanner;

class Ejercicio32 {
    public static void main(String[] args) {

        int[] anArray;
        anArray = new int[10];
        Scanner inputValue = new Scanner(System.in);

        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Introduce el número: ");
            anArray[i] = inputValue.nextInt();
        }

        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[anArray.length - i - 1]+" ");
        }
        System.out.println();

        /* Otra forma

        for (int i = 9; i > -1; i--) {
            System.out.print(anArray[i]+" ");
        }
        System.out.println(); */
    }
}