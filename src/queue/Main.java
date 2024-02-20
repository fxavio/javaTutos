package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Create a Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        System.out.println("Queue: " + queue);
        // Remove an element from the Queue
        String removed = queue.remove();
        System.out.println("Removed from Queue: " + removed);
    }
}
