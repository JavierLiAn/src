package RefuerzoRecursividad;

import java.util.Scanner;

public class Ejercicio3 {

    public static String invertirNumeroACadena(int num) {
        String cadena = "";

        if (num > 10) {
            cadena += Integer.toString(num % 10);
            num = num/10;
            return cadena + invertirNumeroACadena(num);
        }
        return Integer.toString(num);
    }

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int numero = inputValue.nextInt();

        System.out.println(invertirNumeroACadena(numero));

    }
}