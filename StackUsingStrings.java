class StackUsingStrings {
    private String[] arr = new String[5];
    private int top = -1;

    public void push(String data) {
        if (top < arr.length - 1) arr[++top] = data;
        else System.out.println("Stack Overflow");
    }

    public String pop() {
        if (top >= 0) return arr[top--];
        else {
            System.out.println("Stack Underflow");
            return null;
        }
    }

    public String peek() {
        if (top >= 0) return arr[top];
        else {
            System.out.println("Stack is Empty");
            return null;
        }
    }

    public void display() {
        for (int i = 0; i <= top; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingStrings stack = new StackUsingStrings();
        stack.push("Alice");
        stack.push("Bob");
        System.out.println("Top: " + stack.peek());
        stack.pop();
        stack.display();
    }
}
