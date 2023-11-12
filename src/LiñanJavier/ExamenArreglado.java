package LiñanJavier;

import java.util.Scanner;

import static java.lang.System.in;

public class ExamenArreglado {

    public static boolean esDigito (char caracter){

        if (caracter >= '0' && caracter <= '9') {
            return true;
        }else{
            return false;
        }
    }

    public static boolean validarIP (String cadena){

        boolean esIP = true;
        String numero = "";
        int puntos = 0;
        int numeroCompleto;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            boolean punto = caracter == '.';

            if (esDigito(caracter) || punto) {

                if (esDigito(caracter)){
                    numero += cadena.charAt(i);
                }

                if (punto){
                    if (esDigito(cadena.charAt(i+1)) == false){ // Si después de "." no hay numero devuelve false.
                        return false;                       // Así me aseguro de que habrá un número al final de la IP
                    }

                    numeroCompleto = Integer.parseInt(numero);
                    if (numeroCompleto < 0 || numeroCompleto > 255) {
                        return false;
                    }
                    numero = "";

                    puntos++;
                    if (puntos > 3){
                        return false;
                    }
                }

            } else {
                return false;
            }
        }
        if (puntos < 3){
            return false;
        }
        return esIP;
    }

    public static void main(String[] args) {

        int codigo = 1;
        String[] listaIps = {"0.0.0.42","123.123.123.123","0.0.0.0","255.255.255.255",""};
        String nuevaIp;
        int posicion;

        Scanner input = new Scanner(in);

        while (codigo != 0){
            System.out.println("-0 Finalizar programa.\n-1 Introducir dirección IP.\n-2 Borrar dirección IP.\n-3 Mostrar direcciones IP.\n\nIntroduce tu opción de trabajo (0-4):");
            codigo = input.nextInt();

            if (codigo > 3 || codigo < 0){
                System.out.println("Error. Introduce un código correcto.\n");

            } else {

                switch (codigo) {

                    case 1:
                        System.out.println("Introduce la dirección IP: ");
                        nuevaIp = input.next();

                        if (validarIP(nuevaIp)) {
                            for (int i = 0; i < listaIps.length; i++) {
                                if (listaIps[i] == "") {
                                    listaIps[i] = nuevaIp;
                                    break;
                                }
                            }
                        }
                        break;

                    case 2:

                        System.out.println("Selecciona la posición de la lista que quieres borrar: ");
                        posicion = input.nextInt();

                        for (int i = 0; i < listaIps.length; i++) {

                            if (posicion == i) {
                                listaIps[i] = "";
                            }
                        }
                        break;

                    case 3:
                        for (int i = 0; i < listaIps.length; i++) {
                            System.out.print(listaIps[i] + "\n");
                        }
                        System.out.println();

                        break;
                }
            }
        }

        System.out.println("Programa finalizado.");
    }

}
