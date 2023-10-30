package Metodos_Ej1_al_5;

import java.util.Scanner;

public class Ejercicio1 {

    public static void mayorDeEdad(int edad){

        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }
    }

    public static void main(String[] args) {
        int edad;
        System.out.println("Introduce la edad:");
        Scanner inputValue = new Scanner(System.in);
        edad = inputValue.nextInt();

        mayorDeEdad(edad);
    }
}


