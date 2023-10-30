package Ej21_al_25;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        int positivos=0;
        int numero;


        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número: ");
            numero = inputValue.nextInt();

            if (numero >= 0) {
                positivos = positivos + 1;
            }

        }System.out.println("Cantidad de números positivos: "+positivos);
    }

}
