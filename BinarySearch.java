public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23};
        int index = binarySearch(arr, 12);
        System.out.println("Found at index: " + index);
    }
}
