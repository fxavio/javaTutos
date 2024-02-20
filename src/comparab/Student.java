package comparab;

public class Student extends Comparable<Student> {
    private final int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}
