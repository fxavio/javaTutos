package collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Using ArrayList, which implements the List interface
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println("Elements in myList:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }
    }
}
