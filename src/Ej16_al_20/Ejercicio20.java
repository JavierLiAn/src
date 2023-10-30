package Ej16_al_20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        float precio;
        float precioFinal;

        Scanner inputValue;

        System.out.println("Introduce el precio: ");
        inputValue = new Scanner(System.in);
        precio = inputValue.nextFloat();

        precioFinal = precio;

        if (precio >= 6 && precio < 60){
            precioFinal = precio-precio *(float)0.05;
        }
        if (precio >= 60){
            precioFinal = precio-precio*(float)0.1;
        }

        System.out.println(precioFinal);
    }

}
