package Ej16_al_20;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        int mes;
        Scanner inputValue;


        System.out.println("Introduce el número del mes: ");
        inputValue = new Scanner(System.in);
        mes = inputValue.nextInt();



        switch (mes) {
            case 1:
                System.out.println("Tiene 31 días : ");
                break;
            case 2:
                System.out.println("Tiene 28 días : ");
                break;
            case 3:
                System.out.println("Tiene 31 días : ");
                break;
            case 4:
                System.out.println("Tiene 30 días : ");
                break;
            case 5:
                System.out.println("Tiene 31 días : ");
                break;
            case 6:
                System.out.println("Tiene 30 días : ");
                break;
            case 7:
                System.out.println("Tiene 31 días : ");
                break;
            case 8:
                System.out.println("Tiene 31 días : ");
                break;
            case 9:
                System.out.println("Tiene 30 días : ");
                break;
            case 10:
                System.out.println("Tiene 31 días : ");
                break;
            case 11:
                System.out.println("Tiene 30 días : ");
                break;
            case 12:
                System.out.println("Tiene 31 días : ");
                break;
        }
    }

}