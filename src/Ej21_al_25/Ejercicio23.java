package Ej21_al_25;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        int positivos = 0;
        int numero;

        do {
            System.out.println("Introduce un número:");
            numero = inputValue.nextInt();

            if (numero > 0) {
                positivos = positivos+1;
            }

        } while (numero != 0);

        System.out.println("Total de números positivos: " + positivos);
    }
}





