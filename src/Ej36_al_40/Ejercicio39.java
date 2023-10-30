package Ej36_al_40;


import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {

        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        numero = inputValue.nextInt();

        System.out.println("Los divisores de "+numero+" son: ");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i+" ");
                }
            }

        System.out.println();
    }
}