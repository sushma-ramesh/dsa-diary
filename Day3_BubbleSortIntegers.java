public class Day3_BubbleSortIntegers {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break; // break if no swaps
        }

        System.out.print("Sorted Integers: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
