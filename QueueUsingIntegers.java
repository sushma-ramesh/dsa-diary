class QueueUsingIntegers {
    private int[] arr = new int[5];
    private int front = 0, rear = -1, size = 0;

    public void enqueue(int data) {
        if (size == arr.length) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return data;
    }

    public int peek() {
        return arr[front];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingIntegers q = new QueueUsingIntegers();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.enqueue(40);
        q.display();
    }
}