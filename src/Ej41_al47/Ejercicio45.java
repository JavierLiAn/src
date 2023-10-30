package Ej41_al47;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {

        String binario;

        Scanner input = new Scanner(System.in);
        System.out.println("Decimal: ");
        String str = input.nextLine();

        int numero = Integer.parseInt(str);

        binario=numero % 2+"";
        numero = numero / 2;

        while (numero >= 1) {

            binario=numero % 2 + binario;
            numero = numero / 2;

        }

        System.out.println(binario);
    }
}