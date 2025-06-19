class QuickSort2DArrayRowWise {
    public static void quickSortRowWise(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            quickSort(matrix[i], 0, matrix[i].length - 1);
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {5, 3, 1},
            {8, 2, 4},
            {7, 6, 9}
        };
        quickSortRowWise(matrix);
        for (int[] row : matrix) {
            for (int num : row) System.out.print(num + " ");
            System.out.println();
        }
    }
}