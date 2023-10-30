package z_Prueba;

import java.util.Random;
import java.util.Scanner;

public class Tetris2 {
    static final int ANCHO_TABLERO = 10;
    static final int ALTO_TABLERO = 10;
    static int[][] tablero = new int[ALTO_TABLERO][ANCHO_TABLERO];
    static int[][] pieza;

    static int offsetX = 0;
    static int offsetY = ANCHO_TABLERO / 2 - 1; // Inicia en el centro superior
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static int[][][] modelosPiezas = {
            {{1, 1, 1}, {0, 1, 0}},
            {{1, 1, 1, 1}},
            {{1, 1, 0}, {0, 1, 1}},
            {{0, 1, 1}, {1, 1, 0}},
            {{1, 1, 1}, {1, 0, 0}},
            {{1, 1, 1}, {0, 0, 1}},
            {{1, 1}, {1, 1}}
    };

    static final String[] COLORES = {
            "\u001B[0m",
            "\u001B[31m",
            "\u001B[32m",
            "\u001B[33m",
            "\u001B[34m",
            "\u001B[35m",
            "\u001B[36m",
            "\u001B[37m"
    };

    static void iniciarHiloDescenso() {
        Thread hilo = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1500);
                    descenderPieza();
                    imprimirTablero();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        });
        hilo.start();
    }

    public static void main(String[] args) {
        iniciarHiloDescenso();

        while (true) {
            if (pieza == null) {
                pieza = getModeloPiezaAleatoria();
            }

            imprimirTablero();
            String movimiento = scanner.nextLine();

            switch (movimiento) {
                case "a":
                    moverIzquierda();
                    break;
                case "d":
                    moverDerecha();
                    break;
                case "w":
                    rotarPieza();
                    break;
                case "s":
                    caerRapido();
                    break;
                default:
                    System.out.println("Movimiento no válido.");
            }

            if (comprobarTopeAlcanzado() || comprobarFinDeJuego()) {
                System.out.println("¡Las piezas llegaron a la parte superior del tablero o se tocó otra pieza! Fin del juego.");
                System.out.println("¿Deseas jugar de nuevo? (s/n)");

                String reiniciar = scanner.nextLine();
                if (reiniciar.equalsIgnoreCase("s")) {
                    resetearJuego();
                } else {
                    return;
                }
            }
        }
    }

    static int[][] getModeloPiezaAleatoria() {
        return modelosPiezas[random.nextInt(modelosPiezas.length)];
    }

    static void caerRapido() {
        int offsetXOriginal = offsetX;

        while (offsetX + pieza.length < ALTO_TABLERO && !comprobarColisionConOtrasPiezas(1, 0)) {
            offsetX++;
        }

        if (offsetX != offsetXOriginal) {
            colocarPieza();
            pieza = getModeloPiezaAleatoria();
        }
    }

    static void descenderPieza() {
        if (offsetX + pieza.length < ALTO_TABLERO && !comprobarColisionConOtrasPiezas(1, 0)) {
            offsetX++;
        } else {
            colocarPieza();
            pieza = getModeloPiezaAleatoria();
        }
    }

    static void colocarPieza() {
        if (!comprobarColisionConOtrasPiezas(0, 0)) {
            for (int i = 0; i < pieza.length; i++) {
                for (int j = 0; j < pieza[0].length; j++) {
                    if (pieza[i][j] == 1) {
                        tablero[i + offsetX][j + offsetY] = 1;
                    }
                }
            }
        }

        offsetX = 0;
        offsetY = ANCHO_TABLERO / 2 - 1;
        limpiarFilasCompletas();
    }

    static boolean comprobarColisionConOtrasPiezas(int dx, int dy) {
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[0].length; j++) {
                if (pieza[i][j] == 1) {
                    int x = i + offsetX + dx;
                    int y = j + offsetY + dy;
                    if (x >= 0 && x < ALTO_TABLERO && y >= 0 && y < ANCHO_TABLERO) {
                        if (tablero[x][y] == 1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    static void resetearJuego() {
        tablero = new int[ALTO_TABLERO][ANCHO_TABLERO];
        pieza = null;
        offsetX = 0;
        offsetY = ANCHO_TABLERO / 2 - 1;
    }

    static void moverIzquierda() {
        if (offsetY > 0) {
            offsetY--;
        }
    }

    static void moverDerecha() {
        if (offsetY + pieza[0].length < ANCHO_TABLERO) {
            offsetY++;
        }
    }

    static void rotarPieza() {
        int[][] piezaRotada = new int[pieza[0].length][pieza.length];
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[0].length; j++) {
                piezaRotada[j][pieza.length - i - 1] = pieza[i][j];
            }
        }
        pieza = piezaRotada;
    }

    static void imprimirTablero() {
        for (int i = 0; i < ALTO_TABLERO; i++) {
            for (int j = 0; j < ANCHO_TABLERO; j++) {
                if (i >= offsetX && i < offsetX + pieza.length &&
                        j >= offsetY && j < offsetY + pieza[0].length) {
                    int valor = pieza[i - offsetX][j - offsetY];
                    String color = obtenerColorParaValor(valor);
                    System.out.print(color + "■ " + COLORES[0]);
                } else {
                    int valor = tablero[i][j];
                    String color = obtenerColorParaValor(valor);
                    System.out.print(color + "■ " + COLORES[0]);
                }
            }
            System.out.println();
        }
    }

    static String obtenerColorParaValor(int valor) {
        return COLORES[valor];
    }

    static void limpiarFilasCompletas() {
        for (int i = ALTO_TABLERO - 1; i >= 0; i--) {
            boolean filaCompleta = true;
            for (int j = 0; j < ANCHO_TABLERO; j++) {
                if (tablero[i][j] != 1) {
                    filaCompleta = false;
                    break;
                }
            }
            if (filaCompleta) {
                for (int k = i; k > 0; k--) {
                    System.arraycopy(tablero[k - 1], 0, tablero[k], 0, ANCHO_TABLERO);
                }
                i++;
            }
        }
    }

    static boolean comprobarTopeAlcanzado() {
        for (int j = 0; j < ANCHO_TABLERO; j++) {
            if (tablero[0][j] == 1) {
                return true;
            }
        }
        return false;
    }

    static boolean comprobarFinDeJuego() {
        for (int i = 0; i < pieza.length; i++) {
            for (int j = 0; j < pieza[0].length; j++) {
                if (pieza[i][j] == 1) {
                    int x = i + offsetX;
                    int y = j + offsetY;
                    if (x >= 0 && x < ALTO_TABLERO && y >= 0 && y < ANCHO_TABLERO) {
                        if (tablero[x][y] == 1) {
                            return true;
                        }
                        // Verificamos si hay una pieza a una distancia de 1 posición
                        if (x + 1 < ALTO_TABLERO && tablero[x + 1][y] == 1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
