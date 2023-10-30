package Ej21_al_25;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        float notas;
        float sumaNotas = 1;
        float cantidadNotas = -1;
        boolean diez = false;

        do {
            System.out.println("Introduce un número:");
            notas = inputValue.nextFloat();
            sumaNotas += notas;
            cantidadNotas ++;

            if (notas == 10){
                diez = true;
            }
        } while (notas != -1);

        System.out.println("La nota media es: "+(sumaNotas/cantidadNotas));

        if (diez) {
            System.out.println("Hay un diez.");
        }else{
            System.out.println("No hay ningún diez.");
        }
    }
}





