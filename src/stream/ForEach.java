package stream;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .forEach(System.out::println);
    }

}
