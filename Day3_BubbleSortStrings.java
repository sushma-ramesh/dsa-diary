public class Day3_BubbleSortStrings {
    public static void main(String[] args) {
        String[] arr = {"zebra", "apple", "mango", "banana"};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.print("Sorted Strings: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
