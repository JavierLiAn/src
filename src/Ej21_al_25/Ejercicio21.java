package Ej21_al_25;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        int año;
        boolean bisiesto = false;
        Scanner inputValue;

        System.out.println("Introduce el año: ");
        inputValue = new Scanner(System.in);
        año = inputValue.nextInt();

        if ((año % 4 == 0 && año % 100 != 0)||( año % 400 == 0 )){
            bisiesto = true;
        }

        if (bisiesto) {
            System.out.println("Es un año bisiesto");
        }else{
            System.out.println("No es un año bisiesto");
        }

    }
}