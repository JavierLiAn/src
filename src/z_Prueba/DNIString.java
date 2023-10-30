package z_Prueba;

import java.util.Scanner;
public class DNIString {
    public static void main(String[] args) {

        //Otra opción sería utilizar un String Auxiliar

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String strAux = str;

        strAux =strAux.replace('X','0');
        strAux =strAux.replace('Y','1');
        strAux =strAux.replace('Z','2');

        int numero = Integer.parseInt(strAux);

        int resto = numero%23;

        String anArray[] = {"T","R","W","A","G","M","Y", "F","P","D",
                "X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        System.out.println("NIF: "+str+anArray[resto]);

    }
}