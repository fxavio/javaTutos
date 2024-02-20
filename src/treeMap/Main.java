package treeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> ageMap = new TreeMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);

        System.out.println("Age Map: " + ageMap);

        System.out.println("Alice's age: " + ageMap.get("Alice"));

        System.out.println("Bob's age: " + ageMap.get("Bob"));
        // Add a duplicate key
        ageMap.put("Alice", 35);
        System.out.println("Age Map: " + ageMap);

        ageMap.remove("Bob");
        System.out.println("Age Map: " + ageMap);

        ageMap.clear();
        System.out.println("Age Map: " + ageMap);

        if (ageMap.isEmpty()) {
            System.out.println("Age Map is empty");
        }
        System.out.println("Size of Age Map: " + ageMap.size());

    }
}
