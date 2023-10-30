package Ej16_al_20;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner inputValue;

        System.out.println("Introduce un número");
        inputValue = new Scanner(System.in);
        numero1 = inputValue.nextInt();

        System.out.println("Introduce otro número:");
        inputValue = new Scanner(System.in);
        numero2 = inputValue.nextInt();

        String op;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Indica la operación (+, -, * , /): ");
        op = miScanner.next();


        switch (op) {
            case "+":
                System.out.println(numero1+numero2);
                break;
            case "-":
                System.out.println(numero1-numero2);
                break;
            case "*":
                System.out.println(numero1*numero2);
                break;
            case "/":
                System.out.println(numero1/numero2);
                break;
        }
    }

}