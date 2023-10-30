package Ej36_al_40;


public class Ejercicio40 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int aux;

        System.out.print(num1+" "+num2+" ");

        for (int i = 0; i <= 37; i++) {
            aux = num1 + num2;
            System.out.print(aux+" ");
            num1 = num2;
            num2 = aux;
            }

        System.out.println();
    }
}