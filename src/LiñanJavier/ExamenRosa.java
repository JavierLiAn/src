package LiñanJavier;

import java.util.Scanner;

import static java.lang.System.in;

public class ExamenRosa {

    private static String[] ips = {"127.0.0.1", "255.255.255.255", "0.0.0.0", "", "172.12.0.254"};
    public static void main(String[] args) {

        boolean finished = false;
        String success = "Operación realizada con éxito.";
        String fail = "No se ha podido realizar la operación.";
        while (!finished) {
            System.out.println();
            System.out.println(
                    "0 - Finalizar el programa.\n" +
                    "1 - Introducir dirección IP.\n" +
                    "2 - Borrar dirección IP.\n" +
                    "3 - Mostrar direcciones IP."
            );
            System.out.println("Introduce tu opción (0-3): ");
            Scanner input = new Scanner(in);
            int option = input.nextInt();
            switch(option) {
                case 0:
                    finished = true;
                    break;
                case 1:
                    // add IP
                    System.out.println("Nueva dirección IP: ");
                    input = new Scanner(in);
                    String ip = input.nextLine();
                    boolean added = addIp(ip);
                    System.out.println(added ? success : fail);
                    break;
                case 2:
                    // delete IP
                    System.out.println("Selecciona la posición de dirección IP a borrar (0 a 4): ");
                    input = new Scanner(in);
                    int position = input.nextInt();
                    boolean removed = removeIp(position);
                    System.out.println(removed ? success : fail);
                    break;
                case 3:
                    // display IPs
                    displayIps();
                    break;
                default:
                    System.out.println("Opción inválida.");
                System.out.println();
            }
        }
        System.out.println("Au cacau.");
    }

    public static void displayIps() {
        for(int i=0; i < ips.length; i++) {
            System.out.println(ips[i]);
        }
    }

    public static boolean removeIp(int position) {
        if (position > 0 && position < ips.length) {
            ips[position] = "";
            return true;
        }
        return false;
    }
    public static boolean addIp(String ip) {
        if(isValid(ip)) {
            for(int i=0; i < ips.length; i++) {
                if (ips[i].equals("")) {
                    ips[i] = ip;
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid(String ip) {
        // comprobar cantidad de puntos de la IP y que o empiece por '.' ni acabe por '.'
        int dots = 0;
        for (int i=0; i < ip.length(); i++) {
            if(ip.charAt(i) == '.') {
                dots++;
            }
        }

        if(dots != 3 || ip.length() < 7 || ip.charAt(0) == '.' || ip.charAt(ip.length()-1) == '.') {
            return false;
        }

        String numberString = "";
        for(int i=0; i < ip.length(); i++) {
            if(ip.charAt(i) == '.') { // si es punto se comprueba el valor del número obtenido
                if(numberString.equals("")) { // dos puntos seguidos
                    return false;
                }
                int number = Integer.parseInt(numberString);
                if(number < 0 || number > 255) { // válidos solo números del 0 al 255
                    return false;
                }
                numberString = "";
            } else { // se comprueba si el char es un número
                char character = ip.charAt(i);
                if(character < '0' || character > '9') {
                    return false;
                }
                numberString+=ip.charAt(i);
            }
        }

        return true;
    }

}
