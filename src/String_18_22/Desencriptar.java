package String_18_22;

import java.util.Scanner;

import static java.lang.System.in;

public class Desencriptar {

    public static String desencriptarTexto (String texto, int n ) {
        String textoEncriptado = "";

        for (int i = 0; i < texto.length(); i++) {

            if ((texto.charAt(i)) >= 48 && (texto.charAt(i)) <= 57) {
                textoEncriptado += desencriptarNumero(texto.charAt(i),n);

            } else if ((texto.charAt(i)) >= 97 && (texto.charAt(i)) <= 122) {
                textoEncriptado += desencriptarMinuscula(texto.charAt(i),n);

            } else if ((texto.charAt(i)) >= 65 && (texto.charAt(i)) <= 90) {
                textoEncriptado += desencriptarMayuscula(texto.charAt(i),n);

            }  else {
                textoEncriptado += texto.charAt(i);
            }
        }

        return textoEncriptado;
    }

    public static String desencriptarNumero (char caracter, int n ) {
        String caracterDesencriptado = "";

        if (caracter - n < 48) {
            char numero = (char) (57 - (47 - (caracter - n)) % 10);
            caracterDesencriptado += numero;

        } else {
            char numero = (char) (caracter - n);
            caracterDesencriptado += numero;
        }

        return caracterDesencriptado;
    }

    public static String desencriptarMinuscula (char caracter, int n ) {
        String caracterDesencriptado = "";

        if (caracter - n < 97) {
            char numero = (char) (122 - (96 - (caracter - n)) % 26);
            caracterDesencriptado += numero;

        } else {
            char numero = (char) (caracter - n);
            caracterDesencriptado += numero;
        }

        return caracterDesencriptado;
    }
    public static String desencriptarMayuscula (char caracter, int n ) {
        String caracterDesencriptado = "";

        if (caracter - n < 65) {
            char numero = (char) (90 - (64 - (caracter - n)) % 26);
            caracterDesencriptado += numero;

        } else {
            char numero = (char) (caracter - n);
            caracterDesencriptado += numero;
        }

        return caracterDesencriptado;
    }

    public static void main(String[] args) {

        String textoCodificado;
        int n;

        Scanner input = new Scanner(in);
        System.out.println("Introduce el texto codificado: ");
        textoCodificado = input.nextLine();

        System.out.println("Introduce el número: ");
        n = input.nextInt();

        System.out.println(desencriptarTexto(textoCodificado, n));

        /*

        Versión del programa sin utilizar métodos:

        for (int i = 0; i < textoCodificado.length(); i++) {


            if ((textoCodificado.charAt(i)) >= 48 && (textoCodificado.charAt(i)) <= 57) {
                if ((textoCodificado.charAt(i) - n) < 48) {
                    char letra = (char) (57 - (47 - (textoCodificado.charAt(i) - n)) % 10);
                    textoDesencriptado += letra;

                } else {
                    char letra = (char) (textoCodificado.charAt(i) - n);
                    textoDesencriptado += letra;
                }
            } else if ((textoCodificado.charAt(i)) >= 65 && (textoCodificado.charAt(i)) <= 90) {
                if ((textoCodificado.charAt(i) - n) < 65) {
                    char letra = (char) (90 - (64 - (textoCodificado.charAt(i) - n)) % 26);
                    textoDesencriptado += letra;

                } else {
                    char letra = (char) (textoCodificado.charAt(i) - n);
                    textoDesencriptado += letra;
                }
            } else if ((textoCodificado.charAt(i)) >= 97 && (textoCodificado.charAt(i)) <= 122) {
                if ((textoCodificado.charAt(i) - n) < 97) {
                    char letra = (char) (122 - (96 - (textoCodificado.charAt(i) - n)) % 26);
                    textoDesencriptado += letra;

                } else {
                    char letra = (char) (textoCodificado.charAt(i) - n);
                    textoDesencriptado += letra;
                }

            } else {
                char letra = (char) (textoCodificado.charAt(i));
                textoDesencriptado += letra;
            }
        }

        System.out.println(textoDesencriptado);*/

    }
}