import java.util.Arrays;

public class Day2_BinarySearchString {
    public static int binarySearch(String[] arr, String target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = target.compareTo(arr[mid]);
            
            if (result == 0) return mid;
            else if (result > 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "mango", "orange"};
        Arrays.sort(arr); // Ensure sorted
        String target = "mango";
        int index = binarySearch(arr, target);
        System.out.println("Target found at index: " + index);
    }
}
