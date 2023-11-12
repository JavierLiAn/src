package String_23_25;


import String_18_22.Desencriptar;
import String_18_22.Encriptar;

import java.util.Scanner;


public class Criptografia {
    public static void main(String[] args) {

        int numero;
        String texto;
        String textoEncriptado;
        String textoDesencriptado;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el texto ");
        texto = input.nextLine();

        System.out.print("Escribe el codificador: ");
        numero = input.nextInt();

        textoEncriptado = Encriptar.encriptarTexto(texto, numero);

        textoDesencriptado = Desencriptar.desencriptarTexto(textoEncriptado, numero);

        System.out.println("Texto encriptado:     " + textoEncriptado);
        System.out.println("Texto desencriptado:  " + textoDesencriptado);

    }
}