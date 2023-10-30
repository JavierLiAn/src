package MetodosValor;

import java.util.Scanner;

public class Ejercicio3 {
    public static double potencia(double x, int n){

        if (n == 0) {
            return 1;

        }else{
             return x * potencia(x, n-1);
        }
    }

    public static void main(String[]args) {

        double x;
        int n;

        Scanner inputValue;

        System.out.println("Introduce la base:");
        inputValue = new Scanner(System.in);
        x = inputValue.nextDouble();

        System.out.println("Introduce el exponente:");
        inputValue = new Scanner(System.in);
        n = inputValue.nextInt();

        System.out.println(potencia(x, n));

    }
}
