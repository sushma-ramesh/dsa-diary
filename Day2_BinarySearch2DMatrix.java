public class Day2_BinarySearch2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0, high = rows * cols - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int value = matrix[mid / cols][mid % cols];
            
            if (value == target) return true;
            else if (value < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        int target = 15;
        System.out.println("Target found: " + searchMatrix(matrix, target));
    }
}
