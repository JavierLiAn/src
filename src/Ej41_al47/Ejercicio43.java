package Ej41_al47;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {

        int numero;
        int divisor;
        int cociente = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Escribe el dividendo: ");
        numero = input.nextInt();

        System.out.print("Escribe el divisor: ");
        divisor = input.nextInt();


            while (numero >= divisor) {
                numero = numero - divisor;
                cociente++;

            }

        System.out.println("Cociente: "+cociente);

        System.out.println("Resto: " +numero);
    }
}