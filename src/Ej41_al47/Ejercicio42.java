package Ej41_al47;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {

        int numero;
        int multiplicador;
        int resultado=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Escribe el numero: ");
        numero = input.nextInt();

        System.out.print("Escribe el multiplicador: ");
        multiplicador = input.nextInt();


        for (int i = 0; i <= multiplicador-1; i++) {
            resultado += numero;
        }

        System.out.println("Resultado: "+resultado);

    }
}