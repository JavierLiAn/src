package Ej11_al_15;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int valor;
        int valor2;
        Scanner inputValue;

        System.out.println("Introduce el valor:");
        inputValue = new Scanner(System.in);
        valor = inputValue.nextInt();

        System.out.println("Introduce el valor:");
        inputValue = new Scanner(System.in);
        valor2 = inputValue.nextInt();


        if (valor > valor2){
            System.out.println(valor);
        } else {
            System.out.println(valor2);
        }
    }
}
