package stream;

import java.util.*;

public class Map {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
