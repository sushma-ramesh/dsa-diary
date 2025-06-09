import java.util.Scanner;

public class LinearSearch_Usernames {
    public static void main(String[] args) {
        String[] usernames = {"alice", "bob", "charlie", "david"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username to search: ");
        String input = scanner.nextLine();

        boolean found = false;
        for (String name : usernames) {
            if (name.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("User found!");
        } else {
            System.out.println("User not found.");
        }
    }
}
