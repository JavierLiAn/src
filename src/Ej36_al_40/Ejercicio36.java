package Ej36_al_40;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {

        int max=0;
        int[] anArray = new int[10];
        Scanner inputValue = new Scanner(System.in);

        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Introduce el número: ");
            anArray[i] = inputValue.nextInt();
            if (max < anArray[i]){
                max = anArray[i];
            }
        }

        System.out.println("Número máximo = "+max);
    }
}
