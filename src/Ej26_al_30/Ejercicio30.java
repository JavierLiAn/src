package Ej26_al_30;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args){

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Escribe una palabra o frase es palíndroma");

        String texto = inputValue.nextLine();
        int longitud = texto.length();
        boolean esPalindromo = true;

        for (int i = 0; i < longitud / 2; i++) {
            if (texto.charAt(i) != texto.charAt(longitud - i - 1)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println("Es palíndromo.");
        }else{
            System.out.println("No es palíndromo.");
        }
    }
}
