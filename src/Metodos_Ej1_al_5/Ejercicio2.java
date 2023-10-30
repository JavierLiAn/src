package Metodos_Ej1_al_5;
import java.util.Scanner;
public class Ejercicio2 {

    public static void ascendente (int valor1, int valor2){

        if (valor1 < valor2){
            System.out.println(valor1+ (", ") +valor2);
        } else {
            System.out.println(valor2+ (", ") +valor1);
        }
    }

    public static void main(String[] args) {
        int valor1;
        int valor2;
        Scanner inputValue;

        System.out.println("Introduce el valor:");
        inputValue = new Scanner(System.in);
        valor1 = inputValue.nextInt();

        System.out.println("Introduce el valor:");
        inputValue = new Scanner(System.in);
        valor2 = inputValue.nextInt();

        ascendente(valor1, valor2);

    }
}
