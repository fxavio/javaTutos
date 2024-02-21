package exerc;

public class Lambda {
    // lambda expression example
    public static void main(String[] args) {
        // Lambda expression to define a function that squares a number
        MyFunction square = (int x) -> x * x;
        System.out.println(STR."Square of 5: \{square.apply(5)}");
    }
}
interface MyFunction {
    int apply(int x);
}