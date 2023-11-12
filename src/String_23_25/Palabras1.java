package String_23_25;

import java.util.Scanner;

public class Palabras1 {


    public static void main(String[] args) {

        String cadena;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el texto ");
        cadena = input.nextLine();

        cadena = cadena.trim();
        cadena = cadena.replaceAll("[,.;:]", " ");
        String[] palabras = cadena.split("\\s+");

        System.out.println(palabras.length);
    }
}