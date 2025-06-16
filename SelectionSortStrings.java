public class SelectionSortStrings {
    public static void main(String[] args) {
        String[] arr = {"zebra", "apple", "mango", "banana"};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }

            String temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted Strings: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
