package treeSet;

import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("Elements in set: " + set);
        // Add a duplicate element
        set.add("Banana");
        System.out.println("Elements in set after adding a duplicate: " + set);
        // Remove an element
        set.remove("Banana");
        System.out.println("Elements in set after removing an element: " + set);
        // Check if a set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is set empty? " + isEmpty);
        // Get the size of the set
        int size = set.size();
        System.out.println("Size of set: " + size);
        // Clear the set
        set.clear();
        System.out.println("Elements in set after clearing: " + set);
    }
}
