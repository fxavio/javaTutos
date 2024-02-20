package stream;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        // Use the reduce method to sum all elements
        // lambda expression
        int sum = list.stream().reduce(0, (a, b) -> a + b);

        // or
        // method reference
        int sum1 = list.stream().reduce(0, Integer::sum);
        // Print the sum
        System.out.println("The sum of all elements is: " + sum);
        // Print the sum2
        System.out.println("The sum of all elements is: " + sum1);
    }
}
