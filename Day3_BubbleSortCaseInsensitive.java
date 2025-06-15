public class Day3_BubbleSortCaseInsensitive {
    public static void main(String[] args) {
        String[] usernames = {"Zebra", "apple", "Banana", "mango", "cherry"};

        for (int i = 0; i < usernames.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < usernames.length - 1 - i; j++) {
                if (usernames[j].compareToIgnoreCase(usernames[j + 1]) > 0) {
                    String temp = usernames[j];
                    usernames[j] = usernames[j + 1];
                    usernames[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.print("Sorted Usernames (Case-Insensitive): ");
        for (String user : usernames) {
            System.out.print(user + " ");
        }
    }
}
