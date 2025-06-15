public class Day3_BubbleSort2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 2, 6},
            {5, 4, 1},
            {8, 7, 3}
        };

        // Sort each row using Bubble Sort
        for (int[] row : matrix) {
            for (int i = 0; i < row.length - 1; i++) {
                for (int j = 0; j < row.length - 1 - i; j++) {
                    if (row[j] > row[j + 1]) {
                        int temp = row[j];
                        row[j] = row[j + 1];
                        row[j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted 2D Array Row-wise:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
