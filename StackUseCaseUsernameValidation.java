class StackUseCaseUsernameValidation {
    public static void main(String[] args) {
        StackUsingStrings stack = new StackUsingStrings();
        stack.push("Krishna");
        stack.push("Ram");
        stack.push("sita");

        System.out.println("Validating usernames (peek and pop):");
        while (true) {
            String user = stack.pop();
            if (user == null) break;
            System.out.println("Validated: " + user);
        }
    }
}
