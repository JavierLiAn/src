package Ej1_al_10;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        double radius;
        final double PI = 3.14159;
       
        Scanner inputValue;
        
        System.out.println("Enter the radius");
        inputValue = new Scanner(System.in);        
        radius = inputValue.nextDouble();
        
        double length;
        double area;
        length=2*PI*radius;
        area=PI*radius*radius;
        
        System.out.println("length: "+length);
        System.out.println("area: "+area);
        
            
    }
}
