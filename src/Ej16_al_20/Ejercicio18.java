package Ej16_al_20;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        Scanner inputValue;

        System.out.println("Introduce las horas: ");
        inputValue = new Scanner(System.in);
        horas = inputValue.nextInt();

        System.out.println("Introduce los minutos: ");
        inputValue = new Scanner(System.in);
        minutos = inputValue.nextInt();

        System.out.println("Introduce los segundos: ");
        inputValue = new Scanner(System.in);
        segundos = inputValue.nextInt()+1;

        if (segundos > 60) {
            segundos = 0;
            minutos++;
            if (minutos > 60) {
                minutos = 0;
                horas++;
                if (horas > 24) {
                    horas = 0;
                }

            }

        }
        System.out.println(horas+" horas "+minutos+" minutos y "+segundos+" segundos");
    }
}