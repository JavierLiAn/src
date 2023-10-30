package Metodos_Ej1_al_5;

import java.util.Scanner;

public class Ejercicio4 {
    static public int positivos=0;


    public static void contarPositivos(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] >= 0) {
                positivos = positivos + 1;
            }
        }
    }

        public static void main (String[]args){

            Scanner inputValue = new Scanner(System.in);

            int[] numeros = new int[10];


            for (int i = 0; i < 10; i++) {
                System.out.println("Introduce el número: ");
                numeros[i] = inputValue.nextInt();

            }
            contarPositivos(numeros);
            System.out.println("Cantidad de números positivos: " + positivos);
        }


    }