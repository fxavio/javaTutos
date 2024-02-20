package stack;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        System.out.println("Stack: " + stack);
        // Access the top element
        String top = stack.peek();
        System.out.println("Top element: " + top);
        // Remove an element
        String removed = stack.pop();
        System.out.println("Removed element: " + removed);
        System.out.println("Stack: " + stack);
    }
}

