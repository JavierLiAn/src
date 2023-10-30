package z_Prueba;

import java.util.Scanner;

public class JuegoTetris {

    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static int[][] tablero = new int[FILAS][COLUMNAS];
    private static int[][] piezaActual = new int[4][4];
    private static int filaActual = 0;
    private static int columnaActual = 3;

    public static void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    public static void imprimirTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void generarPieza() {
        int tipoPieza = (int) (Math.random() * 7); // Genera un número aleatorio entre 0 y 6

        switch (tipoPieza) {
            case 0:
                piezaActual = new int[][]{
                        {1, 1, 1, 1},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}
                };
                break;
            case 1:
                piezaActual = new int[][]{
                        {1, 1, 0, 0},
                        {1, 1, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}
                };
                break;
            case 2:
                piezaActual = new int[][]{
                        {1, 1, 1, 0},
                        {1, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}
                };
                break;
            case 3:
                piezaActual = new int[][]{
                        {1, 1, 1, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}
                };
                break;
            case 4:
                piezaActual = new int[][]{
                        {1, 1, 1, 0},
                        {0, 1, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}
                };
                break;
            case 5:
                piezaActual = new int[][]{
                        {1, 1, 1, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}
                };
                break;
            case 6:
                piezaActual = new int[][]{
                        {1, 1, 1, 0},
                        {1, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}
                };
                break;
        }

        // Inicializa la posición de la pieza
        filaActual = 0;
        columnaActual = COLUMNAS / 2 - 2;
    }


    public static boolean moverPieza(int fila, int columna) {
        int nuevaFila = filaActual + fila;
        int nuevaColumna = columnaActual + columna;

        // Verificar si el movimiento es válido
        if (esMovimientoValido(nuevaFila, nuevaColumna)) {
            // Limpiar la posición anterior de la pieza
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (piezaActual[i][j] == 1) {
                        tablero[filaActual + i][columnaActual + j] = 0;
                    }
                }
            }

            // Actualizar la posición de la pieza
            filaActual = nuevaFila;
            columnaActual = nuevaColumna;

            // Dibujar la pieza en la nueva posición
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (piezaActual[i][j] == 1) {
                        tablero[filaActual + i][columnaActual + j] = 1;
                    }
                }
            }

            return true; // El movimiento fue exitoso
        }

        return false; // El movimiento no fue válido
    }

    public static boolean esMovimientoValido(int fila, int columna) {
        // Verificar si la nueva posición de la pieza está dentro de los límites del tablero
        if (fila < 0 || fila + 4 > FILAS || columna < 0 || columna + 4 > COLUMNAS) {
            return false;
        }

        // Verificar si hay colisiones con otras piezas en la nueva posición
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (piezaActual[i][j] == 1 && tablero[fila + i][columna + j] == 1) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void actualizarTablero() {
        int[][] tempTablero = new int[FILAS][COLUMNAS];

        // Copia el tablero actual en la matriz temporal
        for (int i = 0; i < FILAS; i++) {
            System.arraycopy(tablero[i], 0, tempTablero[i], 0, COLUMNAS);
        }

        // Copia la pieza actual en el tablero temporal
        for (int i = 0; i < piezaActual.length; i++) {
            for (int j = 0; j < piezaActual[0].length; j++) {
                if (piezaActual[i][j] == 1) {
                    tempTablero[filaActual + i][columnaActual + j] = 1;
                }
            }
        }

        // Verifica colisiones
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tablero[i][j] == 1 && tempTablero[i][j] == 1) {
                    return; // Hay colisión, no actualices el tablero
                }
            }
        }

        // No hay colisión, actualiza el tablero
        for (int i = 0; i < FILAS; i++) {
            System.arraycopy(tempTablero[i], 0, tablero[i], 0, COLUMNAS);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        inicializarTablero();

        while (true) {
            // Generar y mostrar la pieza actual
            generarPieza();
            imprimirTablero();

            // Obtener entrada del usuario (movimiento)
            System.out.print("Ingresa el movimiento (w para rotar, a para izquierda, d para derecha, q para salir): ");
            char movimiento = scanner.next().charAt(0);

            // Procesar movimiento
            if (movimiento == 'q') {
                break;
            } else if (movimiento == 'a') {
                moverPieza(0, -1);
            } else if (movimiento == 'd') {
                moverPieza(0, 1);
            } else if (movimiento == 'w') {
                // Rotar la pieza
            }

            // Actualizar tablero
            actualizarTablero();
        }

        scanner.close();
    }
}
