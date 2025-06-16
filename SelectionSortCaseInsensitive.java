public class SelectionSortCaseInsensitive {
    public static void main(String[] args) {
        String[] usernames = {"Zebra", "apple", "Banana", "mango", "cherry"};

        for (int i = 0; i < usernames.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < usernames.length; j++) {
                if (usernames[j].compareToIgnoreCase(usernames[minIdx]) < 0) {
                    minIdx = j;
                }
            }

            String temp = usernames[minIdx];
            usernames[minIdx] = usernames[i];
            usernames[i] = temp;
        }

        System.out.print("Sorted Usernames (Case-Insensitive): ");
        for (String user : usernames) {
            System.out.print(user + " ");
        }
    }
}
