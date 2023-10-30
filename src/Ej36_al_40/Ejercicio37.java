package Ej36_al_40;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {

        int anArray[] = new int[10];
        Scanner inputValue = new Scanner(System.in);


        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Introduce el número: ");
            anArray[i] = inputValue.nextInt();
        }

        int max = anArray[0];
        int min = anArray[0];

        for (int i = 0; i < anArray.length; i++) {
            if (max < anArray[i]){
                max = anArray[i];
            }
            if (min > anArray[i]){
                min = anArray[i];
            }
        }

        System.out.println("Número máximo = "+max);
        System.out.println("Número mínimo = "+min);
    }
}
