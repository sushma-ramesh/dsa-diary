public class LinearSearch_2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
        };
        int target = 30;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Found at (" + i + "," + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
