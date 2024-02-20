package linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");

        // Add a duplicate element
        linkedList.add("Five");

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Remove an element
        linkedList.remove("Two");

        // Print the LinkedList after removing an element
        System.out.println("LinkedList after removing an element: " + linkedList);
    }
}
