class QueueUseCase {
    public static void main(String[] args) {
        QueueUsingStrings queue = new QueueUsingStrings();
        queue.enqueue("Ticket#123");
        queue.enqueue("Ticket#124");
        queue.enqueue("Ticket#125");

        System.out.println("Processing Help Desk Tickets:");
        while (queue.peek() != null) {
            System.out.println("Solved: " + queue.dequeue());
        }
    }
}