package z_Prueba;

import java.util.Scanner;

public class Tetris {
    static int[][] board = new int[10][10];
    static int[][] piece = {
            {1, 1, 1},
            {0, 1, 0}
    };

    static int offsetX = 0;
    static int offsetY = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1500); // Espera 2 segundo antes de mover hacia abajo
                    moveDown();
                     // Imprime el tablero antes de cada entrada
                    printPiece();
                    printBoard();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start(); // Inicia el hilo

        while (true) {           // Mostrar el tablero
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (i >= offsetX && i < offsetX + piece.length &&
                            j >= offsetY && j < offsetY + piece[0].length) {
                        int value = piece[i - offsetX][j - offsetY];
                        if (value == 1) {
                            System.out.print("■ ");
                        } else {
                            System.out.print(". ");
                        }
                    } else {
                        System.out.print(board[i][j] == 1 ? "■ " : ". ");
                    }
                }
                System.out.println();
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
                    if (offsetY + piece[0].length < board[0].length) {
                        offsetY++;
                    }
                    break;
                case "w":
                    // Rotar la pieza
                    int[][] rotatedPiece = new int[piece[0].length][piece.length];
                    for (int i = 0; i < piece.length; i++) {
                        for (int j = 0; j < piece[0].length; j++) {
                            rotatedPiece[j][piece.length - i - 1] = piece[i][j];
                        }
                    }
                    piece = rotatedPiece;
                    break;
                case "c":
                    // Colocar la pieza en el tablero
                    for (int i = 0; i < piece.length; i++) {
                        for (int j = 0; j < piece[0].length; j++) {
                            if (piece[i][j] == 1) {
                                board[i + offsetX][j + offsetY] = 1;
                            }
                        }
                    }

                    // Verificar si hay filas completas
                    for (int i = 0; i < board.length; i++) {
                        boolean filaCompleta = true;
                        for (int j = 0; j < board[0].length; j++) {
                            if (board[i][j] == 0) {
                                filaCompleta = false;
                                break;
                            }
                        }
                        if (filaCompleta) {
                            // Eliminar fila completa
                            for (int j = i; j > 0; j--) {
                                for (int k = 0; k < board[0].length; k++) {
                                    board[j][k] = board[j - 1][k];
                                }
                            }
                            // Agregar nueva fila vacía en la parte superior
                            for (int j = 0; j < board[0].length; j++) {
                                board[0][j] = 0;
                            }
                        }
                    }

                    // Crear una nueva pieza
                    piece = new int[][]{
                            {1, 1, 1},
                            {0, 1, 0}
                    };
                    offsetX = 0;
                    offsetY = 0;

                    break;
                default:
                    System.out.println("Movimiento no válido.");
            }

            System.out.println();
        }
    }

    static void moveDown() {
        if (offsetX + piece.length < board.length) {
            offsetX++;
        } else {
            // Colocar la pieza en el tablero
            for (int i = 0; i < piece.length; i++) {
                for (int j = 0; j < piece[0].length; j++) {
                    if (piece[i][j] == 1) {
                        board[i + offsetX][j + offsetY] = 1;
                    }
                }
            }

            // Verificar si hay filas completas y eliminarlas
            // (esto es parte del código que ya tenías)
            // ...

            // Crear una nueva pieza
            piece = new int[][]{
                    {1, 1, 1},
                    {0, 1, 0}
            };
            offsetX = 0;
            offsetY = 0;
        }
    }

    static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i >= offsetX && i < offsetX + piece.length &&
                        j >= offsetY && j < offsetY + piece[0].length) {
                    int value = piece[i - offsetX][j - offsetY];
                    if (value == 1) {
                        System.out.print("■ ");
                    } else {
                        System.out.print(". ");
                    }
                } else {
                    System.out.print(board[i][j] == 1 ? "■ " : ". ");
                }
            }
            System.out.println();
        }
    }

    static void printPiece() {
        for (int i = 0; i < piece.length; i++) {
            for (int j = 0; j < piece[0].length; j++) {
                System.out.print(piece[i][j] == 1 ? "■ " : ". ");
            }
            System.out.println();
        }
    }
}