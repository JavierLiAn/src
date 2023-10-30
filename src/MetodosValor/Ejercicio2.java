package MetodosValor;

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean esTriangulo(int num1, int num2, int num3){

        return num1 <= num2 + num3 && num2 <= num1 +num3 && num3 <= num1 +num2;
    }

    public static void main(String[]args){

        int num1;
        int num2;
        int num3;


        Scanner inputValue;
        System.out.println("Introduce el valor 1:");
        inputValue = new Scanner(System.in);
        num1= inputValue.nextInt();

        System.out.println("Introduce el valor 2:");
        inputValue = new Scanner(System.in);
        num2= inputValue.nextInt();

        System.out.println("Introduce el valor 3:");
        inputValue = new Scanner(System.in);
        num3= inputValue.nextInt();


        if (esTriangulo(num1, num2, num3)) {
            System.out.println("Pueden formar un triángulo");

        }else{
            System.out.println("No pueden formar un triángulo");
        }







    }


}
