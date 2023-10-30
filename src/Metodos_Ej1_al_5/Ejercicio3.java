package Metodos_Ej1_al_5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void notaATexto (int nota){

        if (nota <= 3) {
            System.out.println("Muy Deficiente.");
        } else if (nota < 5) {
            System.out.println("Insuficiente.");
        } else if (nota < 6) {
            System.out.println("Suficiente.");
        } else if (nota < 7) {
            System.out.println("Bien.");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("Sobresaliente.");
        }
    }


    public static void main(String[] args) {
        int nota;
        Scanner inputValue;

        System.out.println("Introduce el valor:");
        inputValue = new Scanner(System.in);
        nota = inputValue.nextInt();

        notaATexto(nota);
    }
}