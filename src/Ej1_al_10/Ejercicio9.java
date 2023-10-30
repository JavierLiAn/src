package Ej1_al_10;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        int age;
        Scanner inputValue;
        
        System.out.println("Enter the age:");
        inputValue = new Scanner(System.in);        
        age = inputValue.nextInt();
        
        
       if (age >= 18){
            System.out.println("You have the legal age");
            } else {
            System.out.println("You are under the legal age");
            }
    }
}
