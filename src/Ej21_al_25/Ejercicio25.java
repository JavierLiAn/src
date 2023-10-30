package Ej21_al_25;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        numero = inputValue.nextInt();

        int factorial=1;
        for (int i = 1; i <= numero; i++) {
            factorial *=i;
        }

        System.out.println("El factorial es: "+factorial);
        }
    }

