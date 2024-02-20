package comparab;

public abstract class Comparable<S> {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");

        System.out.println("Comparison result: " + student1.compareTo(student2));
    }

    public abstract int compareTo(Student other);
}

