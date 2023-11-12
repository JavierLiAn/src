package String_18_22;

import java.util.Scanner;

import static java.lang.System.in;

public class Encriptar {

    public static String encriptarTexto (String texto, int n ) {
        String textoEncriptado = "";

        for (int i = 0; i < texto.length(); i++) {

            if ((texto.charAt(i)) >= 48 && (texto.charAt(i)) <= 57) {
                textoEncriptado += encriptarNumero(texto.charAt(i),n);

            } else if ((texto.charAt(i)) >= 97 && (texto.charAt(i)) <= 122) {
                textoEncriptado += encriptarMinuscula(texto.charAt(i),n);

            } else if ((texto.charAt(i)) >= 65 && (texto.charAt(i)) <= 90) {
                textoEncriptado += encriptarMayuscula(texto.charAt(i), n);

            }else {
                textoEncriptado += (texto.charAt(i));
            }
        }

        return textoEncriptado;
    }

    public static String encriptarNumero (char caracter, int n ) {
        String caracterEncriptado = "";

        if (caracter + n > 57) {
            char numero = (char) (48 + (caracter + n - 48) % 10);
            caracterEncriptado += numero;

        } else {
            char letra = (char) (caracter + n);
            caracterEncriptado += letra;
        }

        return caracterEncriptado;
    }

    public static String encriptarMinuscula (char caracter, int n ) {
        String caracterEncriptado = "";

        if (caracter + n > 122) {
            char letra = (char) (97 + (caracter + n - 97) % 26);
            caracterEncriptado += letra;

        } else {
            char letra = (char) (caracter + n);
            caracterEncriptado += letra;
        }

        return caracterEncriptado;
    }

    public static String encriptarMayuscula (char caracter, int n ) {
        String caracterEncriptado = "";

        if (caracter + n > 90) {
            char letra = (char) (65 + (caracter + n - 65) % 26);
            caracterEncriptado += letra;

        } else {
            char letra = (char) (caracter + n);
            caracterEncriptado += letra;
        }

        return caracterEncriptado;
    }

    public static void main(String[] args) {

        String texto;
        int n;

        Scanner input = new Scanner(in);
        System.out.println("Introduce el texto ");
        texto = input.nextLine();

        System.out.println("Introduce el número: ");
        n = input.nextInt();

        System.out.println(encriptarTexto(texto, n));


        /* Versión del programa sin usar métodos:

        for (int i = 0; i < texto.length(); i++) {

            if ((texto.charAt(i)) >= 48 && (texto.charAt(i)) <= 57) {
                if ((texto.charAt(i) + n) > 57) {
                    char letra = (char) (48 + (texto.charAt(i) + n - 48) % 10);
                    textoCodificado += letra;

                } else {
                    char letra = (char) (texto.charAt(i) + n);
                    textoCodificado += letra;
                }
                textoCodificado += encriptarNumero(texto.charAt(i),n);

            } else if ((texto.charAt(i)) >= 65 && (texto.charAt(i)) <= 90) {
                if ((texto.charAt(i) + n) > 90) {
                    char letra = (char) (65 + (texto.charAt(i) + n - 65) % 26);
                    textoCodificado += letra;

                } else {
                    char letra = (char) (texto.charAt(i) + n);
                    textoCodificado += letra;
                textoCodificado += encriptarMayuscula(texto.charAt(i),n);

            } else if ((texto.charAt(i)) >= 97 && (texto.charAt(i)) <= 122) {
                if ((texto.charAt(i) + n) > 122) {
                    char letra = (char) (97 + (texto.charAt(i) + n - 97) % 26);
                    textoCodificado += letra;

                } else {
                    char letra = (char) (texto.charAt(i) + n);
                    textoCodificado += letra;

                textoCodificado += encriptarMinuscula(texto.charAt(i),n);

            } else {
                char letra = (char) (texto.charAt(i));
                textoCodificado += letra;
            }
        }*/

    }
}