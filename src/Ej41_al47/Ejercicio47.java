package Ej41_al47;
import java.util.Scanner;
public class Ejercicio47 {

    public static void main(String[] args){

        String[] cadenas = new String[5];
        int[] longitud = new int[5]; //Un segundo array para guardar la longitud de las cadenas

        System.out.println("Introduce 5 cadenas de texto:");
        Scanner escaner = new Scanner(System.in);

        String aux;
        int max = 0;
        String asteriscos ="**********";

        for (int i = 0; i < cadenas.length; i++){

            cadenas[i] = escaner.next();
            aux =cadenas[i];
            longitud[i] = aux.length(); //se guarda la longitud de cada cadena usando un auxiliar

            if (max <= aux.length()){
                max = aux.length();
            }

        }
        for (int i = 0; i < max; i++) {
            asteriscos += "*";
        }

        System.out.println(asteriscos);


        for (int i = 0; i < cadenas.length; i++){
            aux ="";

            for (int j = 0; j < max-longitud[i]; j++) {
                aux += " ";

            }

            System.out.println("*    "+cadenas[i]+aux+"    *");
        }

        System.out.println(asteriscos);
    }
}



