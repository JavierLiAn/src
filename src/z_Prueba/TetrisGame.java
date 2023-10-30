package z_Prueba;

import java.util.Random;

public class TetrisGame {
    private static final int FILAS = 20;
    private static final int COLUMNAS = 10;
    private static final int VACIO = 0;

    private int[][] tablero;
    private Random random;

    private int[][] piezaActual;
    private int filaActual;
    private int columnaActual;

    public TetrisGame() {
        tablero = new int[FILAS][COLUMNAS];
        random = new Random();
        piezaActual = new int[4][4];
        generarPieza();
    }

    public void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = VACIO;
            }
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < piezaActual.length; i++) {
            for (int j = 0; j < piezaActual[i].length; j++) {
                if (piezaActual[i][j] != VACIO) {
                    tablero[filaActual + i][columnaActual + j] = piezaActual[i][j];
                }
            }
        }
    }

    public void generarPieza() {
        int[][] cuadrado = { { 1, 1 }, { 1, 1 } };
        piezaActual = cuadrado;

        filaActual = 0;
        columnaActual = COLUMNAS / 2 - 1;
    }

    public boolean moverPieza(int fila, int columna) {
        int[][] nuevaPosicion = new int[piezaActual.length][piezaActual[0].length];

        // Copiar la pieza actual en la nueva posición
        for (int i = 0; i < piezaActual.length; i++) {
            for (int j = 0; j < piezaActual[i].length; j++) {
                nuevaPosicion[i][j] = piezaActual[i][j];
            }
        }

        // Verificar si el movimiento es válido


        return false;
    }
    private boolean esMovimientoValido(int[][] nuevaPosicion, int fila, int columna) {
        // Verificar límites del tablero
        if (fila < 0 || fila + nuevaPosicion.length > FILAS || columna < 0 || columna + nuevaPosicion[0].length > COLUMNAS) {
            return false;
        }

        // Verificar colisiones con otras piezas
        for (int i = 0; i < nuevaPosicion.length; i++) {
            for (int j = 0; j < nuevaPosicion[i].length; j++) {
                if (nuevaPosicion[i][j] != VACIO) {
                    if (tablero[fila + i][columna + j] != VACIO) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public void actualizarTablero() {
        // Código para actualizar el tablero con la pieza actual
        // Verificar colisiones y eliminar filas completas si es necesario
    }

    public static void main(String[] args) {
        TetrisGame juego = new TetrisGame();
        juego.inicializarTablero();
        juego.imprimirTablero();
    }
}

