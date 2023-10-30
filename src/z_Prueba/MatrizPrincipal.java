package z_Prueba;

import java.util.Scanner;



public class MatrizPrincipal {
    public static void main(String[] args) {
        int[][] matrizMayor = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        int[][] matrizMenor = {
                {1, 0, 1},
                {1, 0, 1},
                {1, 0, 0}
        };

        Scanner scanner = new Scanner(System.in);

        int offsetX = 0;
        int offsetY = 0;

        int filas = matrizMenor.length;
        int columnas = matrizMenor[0].length;

        int[][] matrizRotada = new int[columnas][filas];

        boolean moviendoAbajo = true;

        while (true) {
            for (int i = 0; i < matrizMayor.length; i++) {
                for (int j = 0; j < matrizMayor[0].length; j++) {
                    boolean isInsideSubmatrix = i >= offsetX && i < offsetX + matrizMenor.length &&
                            j >= offsetY && j < offsetY + matrizMenor[0].length;
                    if (isInsideSubmatrix) {
                        int valor = matrizMenor[i - offsetX][j - offsetY];
                        if (valor == 0) {
                            System.out.print("\u001B[31m" + valor + "\u001B[0m ");
                        } else {
                            System.out.print(valor + " ");
                        }
                    } else {
                        System.out.print(matrizMayor[i][j] + " ");
                    }
                }
                System.out.println();
            }

            if (moviendoAbajo) {
                if (offsetX + matrizMenor.length < matrizMayor.length) {
                    offsetX++;
                } else {
                    moviendoAbajo = false;
                    offsetX = 0;
                }
            } else {
                if (offsetX < matrizMayor.length) {
                    offsetX++;
                } else {
                    moviendoAbajo = true;
                    offsetX = 0;
                }
            }

            System.out.println("Ingresa la dirección de movimiento (a/d): ");
            String movimiento = scanner.nextLine();

            switch (movimiento) {
                case "a":
                    if (offsetY > 0) {
                        offsetY--;
                    }
                    break;
                case "d":
                    if (offsetY + matrizMenor[0].length < matrizMayor[0].length) {
                        offsetY++;
                    }
                    break;
                case "w":

                    filas = matrizMenor.length;
                    columnas = matrizMenor[0].length;
                    matrizRotada = new int[columnas][filas];

                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            matrizRotada[j][i] = matrizMenor[i][columnas - j - 1];
                        }
                    }
                    matrizMenor = matrizRotada;

                    break;

                case "c":
                    break;
                default:
                    System.out.println("Movimiento no válido.");
            }

            System.out.println();
        }
    }
}
