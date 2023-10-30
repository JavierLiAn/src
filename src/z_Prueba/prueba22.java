package z_Prueba;

import java.util.Scanner;

public class prueba22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            }
        }

        System.out.println("Cantidad de números positivos: " + contadorPositivos);
        scanner.close();
    }
}
