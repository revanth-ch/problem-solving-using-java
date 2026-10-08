package Week_4;

import java.util.*;

public class Task10 {

    public static void rotateMatrix(
            int[][] matrix, int r) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int layers = Math.min(rows, cols) / 2;

        for (int layer = 0; layer < layers; layer++) {

            ArrayList<Integer> elements =
                    new ArrayList<>();

            // Top
            for (int j = layer; j < cols - layer; j++) {
                elements.add(matrix[layer][j]);
            }

            // Right
            for (int i = layer + 1;
                 i < rows - layer; i++) {

                elements.add(
                        matrix[i][cols - layer - 1]
                );
            }

            // Bottom
            for (int j = cols - layer - 2;
                 j >= layer; j--) {

                elements.add(
                        matrix[rows - layer - 1][j]
                );
            }

            // Left
            for (int i = rows - layer - 2;
                 i > layer; i--) {

                elements.add(matrix[i][layer]);
            }

            int size = elements.size();

            int rotation = r % size;

            int index = rotation;

            // Top
            for (int j = layer; j < cols - layer; j++) {

                matrix[layer][j] =
                        elements.get(index % size);

                index++;
            }

            // Right
            for (int i = layer + 1;
                 i < rows - layer; i++) {

                matrix[i][cols - layer - 1] =
                        elements.get(index % size);

                index++;
            }

            // Bottom
            for (int j = cols - layer - 2;
                 j >= layer; j--) {

                matrix[rows - layer - 1][j] =
                        elements.get(index % size);

                index++;
            }

            // Left
            for (int i = rows - layer - 2;
                 i > layer; i--) {

                matrix[i][layer] =
                        elements.get(index % size);

                index++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(matrix, r);

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}