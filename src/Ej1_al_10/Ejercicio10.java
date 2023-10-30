package Ej1_al_10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int valor;
        Scanner inputValue;
        
        System.out.println("Introduce el valor:");
        inputValue = new Scanner(System.in);        
        valor = inputValue.nextInt();
        
        
       if (valor >= 0){
            System.out.println("El valor es positivo");
            } else {
            System.out.println("El valor es negativo");
            }
    }
}
