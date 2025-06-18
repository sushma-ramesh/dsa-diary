class MergeSort2DArrayRowWise {
    public static void mergeSortRowWise(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            mergeSort(matrix[i], 0, matrix[i].length - 1);
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 1, 4},
            {9, 2, 5},
            {6, 8, 7}
        };
        mergeSortRowWise(matrix);
        for (int[] row : matrix) {
            for (int num : row) System.out.print(num + " ");
            System.out.println();
        }
    }
}