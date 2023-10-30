package Ej26_al_30;

public class Ejercicio29 {
    public static void main(String[] args) {


        boolean es_primo = true;

        for (int i = 3; i <= 100; i++) {
            es_primo = true;

            if (i % 2 != 0) {
                for (int j = 3; j <= i / 2; j += 2) {
                    if (i % j == 0) {
                        es_primo = false;
                        break;
                    }
                }
            } else {
                es_primo = false;
            }

            if (es_primo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}







