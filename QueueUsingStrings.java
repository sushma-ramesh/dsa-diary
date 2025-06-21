class QueueUsingStrings {
    private String[] arr = new String[5];
    private int front = 0, rear = -1, size = 0;

    public void enqueue(String data) {
        if (size == arr.length) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return null;
        }
        String data = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return data;
    }

    public String peek() {
        return arr[front];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingStrings q = new QueueUsingStrings();
        q.enqueue("Krishna");
        q.enqueue("Sita");
        q.enqueue("Ram");
        q.dequeue();
        q.display();
    }
}