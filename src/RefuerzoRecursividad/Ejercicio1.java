package RefuerzoRecursividad;

import java.util.Scanner;

public class Ejercicio1 {

    public static int sumaNEnterosPositivos(int num) {

        if (num <= 0) {
            return 0;
        } else {
            return num + sumaNEnterosPositivos(num - 1);
        }
    }

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int numero = inputValue.nextInt();

        System.out.println(sumaNEnterosPositivos(numero));

    }
}
