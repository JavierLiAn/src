package Ej1_al_10;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner inputValue;
        
        System.out.println("Enter the number 1");
        inputValue = new Scanner(System.in);        
        number1 = inputValue.nextInt();
        
        System.out.println("Enter the number 2");       
        inputValue = new Scanner(System.in);      
        number2 = inputValue.nextInt();
        
        int sum = number1+number2;
        int sub = number1-number2;
        int mult = number1*number2;
        int div = number1/number2;
    
        
        System.out.println("sum: "+sum);
        System.out.println("subtraction: "+sub);
        System.out.println("multiplicación: "+mult);
        System.out.println("division: "+div);



    }
}
