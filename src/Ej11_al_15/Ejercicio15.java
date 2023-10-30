package Ej11_al_15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int numero;
        Scanner inputValue;

        System.out.println("Introduce un número del 1 al 10:");
        inputValue = new Scanner(System.in);
        numero = inputValue.nextInt();


        if (numero == 1) {
            System.out.println("Uno");
        } else if (numero == 2) {
            System.out.println("Dos");
        } else if (numero == 3) {
            System.out.println("Tres");
        } else if (numero == 4) {
            System.out.println("Cuatro");
        } else if (numero == 5) {
            System.out.println("Cinco");
        } else if (numero == 6) {
            System.out.println("Seis");
        } else if (numero == 7) {
            System.out.println("Siete");
        } else if (numero == 8) {
            System.out.println("Ocho");
        } else if (numero == 9) {
            System.out.println("Nueve");
        } else if (numero == 10) {
            System.out.println("Diez");
        }
    }

}