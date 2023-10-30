package Ej11_al_15;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int valor;
        int valor2;
        int menor;
        int mayor;
        int orden;
        Scanner inputValue;

        System.out.println("Introduce el valor:");
        inputValue = new Scanner(System.in);
        valor = inputValue.nextInt();

        System.out.println("Introduce el valor:");
        inputValue = new Scanner(System.in);
        valor2 = inputValue.nextInt();

        System.out.println("Introduce 1 si quieres un orden Ascendente o 2 si lo quieres Descendente:");
        inputValue = new Scanner(System.in);
        orden = inputValue.nextInt();

        if (valor > valor2) {
            mayor = valor;
            menor = valor2;
        } else {
            mayor = valor2;
            menor = valor;
        }

        if (orden == 1) {
            System.out.println(valor + (", ") + valor2);
        }else{
            System.out.println(valor2 + (", ") + valor);
    }

}

}
