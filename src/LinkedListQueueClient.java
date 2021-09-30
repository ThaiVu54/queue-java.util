public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(44);
        queue.enqueue(40);
        queue.dequeue();


        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
