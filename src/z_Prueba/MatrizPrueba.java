package z_Prueba;

import java.util.Scanner;

public class MatrizPrueba {
    public static void main(String[] args) {
        int[][] matrizMenor = {
                {1, 0, 1},
                {1, 0, 1},
                {1, 0, 0}
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("1")) {
                int filas = matrizMenor.length;
                int columnas = matrizMenor[0].length;
                int[][] matrizRotada = new int[columnas][filas];

                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matrizRotada[j][i] = matrizMenor[i][columnas - j - 1];
                    }
                }

                matrizMenor = matrizRotada;

                for (int i = 0; i < columnas; i++) {
                    for (int j = 0; j < filas; j++) {
                        System.out.print(matrizMenor[j][i] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Presiona 1 para mostrar la matriz:");
            }
        }
    }
}
