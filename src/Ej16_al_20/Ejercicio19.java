package Ej16_al_20;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        float precioHora;
        float horas;
        float normal = 35;
        float extra;
        float pagoBruto;
        float impuestos = 0;
        Scanner inputValue;

        System.out.println("Introduce el precio por hora: ");
        inputValue = new Scanner(System.in);
        precioHora = inputValue.nextFloat();

        System.out.println("Introduce el número de horas:");
        inputValue = new Scanner(System.in);
        horas = inputValue.nextFloat();

        if (horas > 35) {
            extra = (horas - normal);
            pagoBruto = (normal * precioHora + extra * precioHora * (float)1.50);
        }else{
            pagoBruto = horas * precioHora;
        }

        float auxBruto = pagoBruto;

        if (auxBruto > 900) {
            impuestos += (auxBruto-900)*(float)0.45;
            auxBruto = 900;
        }
        if (auxBruto > 500) {
            impuestos += (auxBruto - 500) * 0.25;
        }

        System.out.println("Pago bruto: "+pagoBruto);
        System.out.println("Salario neto: "+(pagoBruto-impuestos));
        System.out.println("Impuestos: "+impuestos);

    }

}