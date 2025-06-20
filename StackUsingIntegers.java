class StackUsingIntegers {
    private int[] arr = new int[5];
    private int top = -1;

    public void push(int data) {
        if (top < arr.length - 1) arr[++top] = data;
        else System.out.println("Stack Overflow");
    }

    public int pop() {
        if (top >= 0) return arr[top--];
        else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) return arr[top];
        else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public void display() {
        for (int i = 0; i <= top; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingIntegers stack = new StackUsingIntegers();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.peek());
        stack.pop();
        stack.display();
    }
}