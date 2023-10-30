package z_Prueba;

import java.util.Scanner;

public class matrizUnos {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10]; // Creamos una matriz de 10x10

        // Rellenamos la matriz con unos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = 1;
            }
        }

        // Cambiamos las posiciones a 0
        matriz[0][3] = 0;
        matriz[1][3] = 0;
        matriz[2][3] = 0;
        matriz[2][4] = 0;

        // Mostramos la matriz en la consola
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la dirección (1 para derecha, -1 para izquierda): ");
        int direccion = scanner.nextInt();

        // Movemos los ceros
        if (direccion == 1) {
            for (int i = 0; i < 10; i++) {
                for (int j = 8; j >= 0; j--) {
                    if (matriz[i][j] == 0) {
                        matriz[i][j] = 1;
                        matriz[i][j+1] = 0;
                    }
                }
            }
        } else if (direccion == -1) {
            for (int i = 0; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    if (matriz[i][j] == 0) {
                        matriz[i][j] = 1;
                        matriz[i][j-1] = 0;
                    }
                }
            }
        } else {
            System.out.println("Dirección no válida.");
        }

        // Mostramos la matriz actualizada
        System.out.println("Matriz Actualizada:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
