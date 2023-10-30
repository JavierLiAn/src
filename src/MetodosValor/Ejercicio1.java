package MetodosValor;

import java.util.Scanner;

public class Ejercicio1 {

    public static boolean esDivisible(int num1, int num2){

        return num1 % num2 == 0;
    }

    public static void main(String[]args){

        int n;
        int m;


        Scanner inputValue;
        System.out.println("Introduce el valor n:");
        inputValue = new Scanner(System.in);
        n= inputValue.nextInt();

        System.out.println("Introduce el valor m:");
        inputValue = new Scanner(System.in);
        m= inputValue.nextInt();


        if (esDivisible(n, m)) {
            System.out.println("Es divisible");

        }else{
            System.out.println("No es divisible");
        }







    }


}
