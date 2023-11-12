package Matrices;

public class OperacionesMatrices {

    public static void main(String[] args) {


        int[][] matriz1 = new int[][]{
                {1, 1, 1, 0},
                {1, 0, 0, 0},
                {0, 4, 0, 0},
                {0, 0, 0, 0}

        };

        int[][] matriz2 = new int[][]{
                {1, 1, 1, 0},
                {1, 0, 0, 0},
                {0, 0, 2, 0},
                {0, 0, 0, 0}

        };

        int[][] matrizResultado = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}

        };



        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[i].length ; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j] ;
                System.out.print(matrizResultado[i][j]+"\t");

            }
            System.out.print("\n");

        }
        System.out.println();


    }

}
