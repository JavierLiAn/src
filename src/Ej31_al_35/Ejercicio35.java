package Ej31_al_35;

public class Ejercicio35 {
    public static void main(String[] args) {

        float notas=0;
        boolean diez = false;
        int[] anArray = {6, 8, 4, 1, 9, 3, 2, 9, 8, 7, 9, 3, 4, 1, 6, 10, 5, 9, 6, 7, 9};


        for (int i = 0; i < anArray.length; i++) {
            notas = notas + anArray[i];

            if (anArray[i]== 10){
                diez = true;
            }
        }

        System.out.println("La nota media es: "+(notas/anArray.length));

        if (diez) {
            System.out.println("Hay un diez.");
        }else{
            System.out.println("No hay ningún diez.");
        }
    }
}





