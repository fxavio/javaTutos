package hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);

        // Add a duplicate element
        hashMap.put("Five", 5);

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);

        // Remove an element
        hashMap.remove("Two");

        // Print the HashMap after removing an element
        System.out.println("HashMap after removing an element: " + hashMap);
    }
}
