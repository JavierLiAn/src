package Ej41_al47;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {

        float num1 = 0;
        float num2 = 1;
        float aux;

        float n;
        Scanner input = new Scanner(System.in);
        System.out.print("Escribe el valor de n: ");
        n = input.nextFloat();

        for (int i = 0; i <= n-3; i++) {
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
        }

        System.out.print("Aproximación al número aureo: "+ num2/num1);

    }
}