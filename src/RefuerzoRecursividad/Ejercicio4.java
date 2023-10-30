package RefuerzoRecursividad;

import java.util.Scanner;

public class Ejercicio4 {

    public static int invertirNumero(int num) {
        String cadena = "";
        int cifra;
        if (num > 10) {

            //Copia el entero en una cadena para más adelante sacar su longitud.
            cadena = Integer.toString(num);

            //Multiplica una cifra del número por 10 elevado a su posición.
            cifra = (int) (num % 10 * Math. pow(10, cadena.length()-1));

            num = num / 10;

            //recorre las cifras con recursividad, sumando cada resultado de cifra * 10^posición
            //Ej: 1234 = 1000 + 200 + 30
            return cifra + invertirNumero(num);
        }
        //la cifra que falta
        return num;

    }

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int numero = inputValue.nextInt();

        System.out.println(invertirNumero(numero));

    }
}