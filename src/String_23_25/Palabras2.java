package String_23_25;

import java.util.Scanner;

public class Palabras2 {

    public static int contarPalabras (String cadena){

        int cantidadDePalabras = 0;
        boolean enPalabra = false;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (esLetra(caracter)) {
                enPalabra = true;

            } else {

                if (enPalabra) {
                    cantidadDePalabras++;
                    enPalabra = false;
                }
            }
        }

        if (enPalabra) {
            cantidadDePalabras++;
        }

        return cantidadDePalabras;
    }
    public static boolean esLetra (char caracter) {
        boolean letra = (caracter >= 'a' && caracter <= 'z') ||
                (caracter >= 'A' && caracter <= 'Z') ||
                (caracter >= 'ç' && caracter <= 'Ñ');

        return letra;
    }

    public static void main(String[] args) {

        String cadena;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el texto ");
        cadena = input.nextLine();

        System.out.println("Numero de palabras: " + contarPalabras(cadena));
    }
}