import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // Create a list of 5 elements and print the list
        List<String> list = new java.util.ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");
        System.out.println(list);
        list.remove("Element 1");
        System.out.println(list);
    }
}
