package MetodosValor;

import java.util.Scanner;

public class Ejercicio4 {

    public static int positivos(int[] array) {
        int positivos=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positivos = positivos + 1;
            }
        }
        return positivos;
    }


    public static void main(String[] args) {

        int anArray[] = new int[10];
        Scanner inputValue = new Scanner(System.in);


        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Introduce el número: ");
            anArray[i] = inputValue.nextInt();
        }

        System.out.println("Cantidad de números positivos: "+positivos(anArray));

        }
    }


