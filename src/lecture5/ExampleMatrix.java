package lecture5;

import java.util.Random;

public class ExampleMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {67, 2, 8, 78},
                {9, 1, 9},
                {7}
        };

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < 4; j++) { // exception
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        Random random = new Random();
        int bound = 90;

        int rowCount = 3;
        int columnCount = 7;
        int[][] newMatrix = new int[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                newMatrix[i][j] = random.nextInt(bound) + 10;
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");
        int[][] randomMatrix = new int[rowCount][];
        for (int i = 0; i < rowCount; i++) {
            randomMatrix[i] = new int[random.nextInt(10) + 1];
            for (int j = 0; j < randomMatrix[i].length; j++) {
                randomMatrix[i][j] = random.nextInt(bound) + 10;
                System.out.print(randomMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
