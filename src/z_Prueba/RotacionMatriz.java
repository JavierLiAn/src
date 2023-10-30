package z_Prueba;

public class RotacionMatriz {

    public static void main(String[] args) {
        int[][] matrizMenor = {
                {1, 0, 1},
                {1, 0, 1},
                {1, 0, 0}
        };

        for (int i = 0; i < 5; i++) {
            matrizMenor = rotarMatrizDerecha(matrizMenor);
            imprimirMatriz(matrizMenor);
            System.out.println();
        }
    }

    public static int[][] rotarMatrizDerecha(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizRotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[j][filas - i - 1] = matriz[i][j];
            }
        }

        return matrizRotada;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
