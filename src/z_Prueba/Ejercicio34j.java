package z_Prueba;

import java.util.Scanner;

public class Ejercicio34j {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el número: ");
        String str = input.nextLine();

        if (str.startsWith("X")) {
            str = '0' + str.substring(1);
        } else if (str.startsWith("Y")) {
            str = '1' + str.substring(1);
        } else if (str.startsWith("Z")) {
            str = '2' + str.substring(1);
        }

        int numero = Integer.parseInt(str);
        int resto = numero % 23;

        String[] anArray = {"T","R","W","A","G","M","Y", "F","P","D",
                "X","B", "N","J", "Z","S","Q","V","H","L","C","K","E"};

        System.out.println("El NIF es: " + str + anArray[resto]);
    }
}
