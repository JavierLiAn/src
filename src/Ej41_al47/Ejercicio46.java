package Ej41_al47;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        int max = 1;
        int min = 100;
        boolean ganador = false;
        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        System.out.println("Introduce un número: ");
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        while (numero!= -1){

            if (aleatorio < numero){
                System.out.println("El número secreto es más pequeño");
            }
            if (aleatorio > numero){
                System.out.println("El número secreto es más grande");
            }
            if (aleatorio == numero){
                ganador = true;
                break;
            }

            System.out.println("Introduce un número: ");
            input = new Scanner(System.in);
            numero = input.nextInt();
        }

        if (ganador) {
            System.out.println("Has ganado.");
        }else{
            System.out.println("Se rinde.");
        }
    }
}