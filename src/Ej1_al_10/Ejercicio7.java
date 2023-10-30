package Ej1_al_10;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        float precio;
        float precioRebajado;
        float descuento;
        Scanner inputValue;
        
        System.out.println("Introduce el precio real:");
        inputValue = new Scanner(System.in);        
        precio = inputValue.nextFloat();
        
        System.out.println("Introduce el precio rebajado:");       
        inputValue = new Scanner(System.in);      
        precioRebajado = inputValue.nextFloat();
        
        descuento=(precio - precioRebajado)/precio * 100;
        
        System.out.println(descuento);
        }
}  

