public class LinearSearch_String {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Grapes", "Mango"};
        String target = "Mango";
        int index = search(fruits, target);

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }

    public static int search(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
