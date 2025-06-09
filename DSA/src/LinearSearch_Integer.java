public class LinearSearch_Integer {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 60};
        int target = 30;
        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println(" Not found");
        }
    }

    // Linear Search logic
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            //  check each element
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
