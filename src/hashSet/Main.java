package hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");

        // Add a duplicate element
        hashSet.add("Five");

        // Print the HashSet
        System.out.println("HashSet: " + hashSet);

        // Remove an element
        hashSet.remove("Two");

        // Print the HashSet after removing an element
        System.out.println("HashSet after removing an element: " + hashSet);
    }
}
