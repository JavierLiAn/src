package z_Prueba;

import java.util.Scanner;



public class JuegoLaberinto {
    static char[][] laberinto = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', ' ', '#', ' ', '#', '#', ' ', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', '#', '#', ' ', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'#', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };

    static int jugadorPosX = 1;
    static int jugadorPosY = 1;
    static int salidaPosX = 5;
    static int salidaPosY = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Juego de Laberinto!");
        imprimirLaberinto();

        while (true) {
            System.out.print("Ingresa tu movimiento (arriba/abajo/izquierda/derecha): ");
            String movimiento = scanner.nextLine();
            moverJugador(movimiento);
            imprimirLaberinto();
        }
    }

    static void imprimirLaberinto() {
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                if (i == jugadorPosX && j == jugadorPosY) {
                    System.out.print('P');  // Jugador
                } else if (i == salidaPosX && j == salidaPosY) {
                    System.out.print('S');  // Salida
                } else {
                    System.out.print(laberinto[i][j]);
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    static void moverJugador(String direccion) {
        int nuevaPosX = jugadorPosX;
        int nuevaPosY = jugadorPosY;

        switch (direccion) {
            case "arriba":
                nuevaPosX--;
                break;
            case "abajo":
                nuevaPosX++;
                break;
            case "izquierda":
                nuevaPosY--;
                break;
            case "derecha":
                nuevaPosY++;
                break;
        }

        if (laberinto[nuevaPosX][nuevaPosY] != '#') {
            jugadorPosX = nuevaPosX;
            jugadorPosY = nuevaPosY;
        }

        if (jugadorPosX == salidaPosX && jugadorPosY == salidaPosY) {
            System.out.println("¡Has encontrado la salida! ¡Ganaste!");
            System.exit(0);
        }
    }
}
