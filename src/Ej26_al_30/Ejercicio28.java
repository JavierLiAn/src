package Ej26_al_30;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        int numero;
        boolean es_primo = true;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        numero = inputValue.nextInt();

        if (numero % 2 != 0) {
            for (int i = 3; i <= numero / 2; i += 2) {
                if (numero % i == 0) {
                    es_primo = false;
                    break;
                }
            }

        } else {
            es_primo = false;
        }

        if (es_primo) {
            System.out.println("Es primo.");
        }else{
            System.out.println("No es primo.");
        }
    }
}







