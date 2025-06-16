public class SelectionSort2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 2, 6},
            {5, 4, 1},
            {8, 7, 3}
        };

        for (int[] row : matrix) {
            for (int i = 0; i < row.length - 1; i++) {
                int minIdx = i;

                for (int j = i + 1; j < row.length; j++) {
                    if (row[j] < row[minIdx]) {
                        minIdx = j;
                    }
                }

                int temp = row[minIdx];
                row[minIdx] = row[i];
                row[i] = temp;
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
