package RefuerzoRecursividad;

import java.util.Scanner;

public class Ejercicio5 {

    public static String decimalABinario(int numero) {
        String binario;

        binario=numero % 2+"";
        numero = numero / 2;

        if (numero >= 1) {
            return decimalABinario(numero)+ binario;
        } else {
            return binario;
            }
        }


    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int numero = inputValue.nextInt();

        System.out.println(decimalABinario(numero));

    }
}