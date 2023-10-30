package z_Prueba;

import java.util.Scanner;

public class prueba23 {
    public static void main(String[] args){

        int num;
        int positivos =0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = inputValue.nextInt();

        while (num !=0) {
            System.out.println("Introduce un número: ");
            num = inputValue.nextInt();
            if (num >= 0) {
                positivos = positivos + 1;
            }
        }
        System.out.println("Cantidad de números positivos: "+positivos);
    }
}
