package abstraction;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();
    }
}
