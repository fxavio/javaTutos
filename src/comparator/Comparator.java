package comparator;

public abstract class Comparator<S> {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");

        System.out.println("Comparison result: " + Student.idComparator.compare(student1, student2));
    }

    public abstract int compare(Student s1, Student s2);
}

