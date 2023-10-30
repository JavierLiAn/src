package Ej26_al_30;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        numero = inputValue.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+" x "+ i +" = "+numero*i);
        }


    }
}

