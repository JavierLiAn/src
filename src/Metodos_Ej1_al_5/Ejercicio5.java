package Metodos_Ej1_al_5;

import java.util.Scanner;

public class Ejercicio5 {
    static public int mayor;


    public static void numeroMayor (int numero1, int numero2, int numero3) {

        mayor = numero1;

        if (numero2 > mayor)
            mayor = numero2;
        if (numero3 > mayor)
            mayor = numero3;
    }


    public static void main (String[]args){

        Scanner inputValue = new Scanner(System.in);


        System.out.println("Introduce el número: ");
        int numero1 = inputValue.nextInt();

        System.out.println("Introduce el número: ");
        int numero2 = inputValue.nextInt();

        System.out.println("Introduce el número: ");
        int numero3 = inputValue.nextInt();


       numeroMayor(numero1, numero2, numero3);
        System.out.println("El número mayor es: " + mayor);
    }
}