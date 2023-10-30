package MetodosValor;

import java.util.Scanner;

public class Ejercicio5 {

    public static String letraDni (int num) {

        int resto = num%23;

        String[] anArray = {"T","R","W","A","G","M","Y", "F","P","D",
                "X","B", "N","J","Z","S","Q","V","H","L","C","K","E"};


        return anArray[resto];
    }


    public static void main(String[] args) {

        int numero;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        numero = inputValue.nextInt();


        System.out.println("DNI: "+numero+letraDni(numero));
    }
}
