package RefuerzoRecursividad;

import java.util.Scanner;

public class Ejercicio2 {

    public static int productosDeEnterosPositivos(int num1, int num2) {

        if (num2 <= 0) {
            return 0;
        } else {
            return num1 + productosDeEnterosPositivos(num1, num2 - 1);
        }
    }

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int numero1 = inputValue.nextInt();

        System.out.println("Introduce el número: ");
        int numero2 = inputValue.nextInt();

        System.out.println(productosDeEnterosPositivos(numero1, numero2));

    }
}
