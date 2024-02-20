package comparator;

public class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;}

    // Getters and setters

    public static Comparator<Student> idComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.id, s2.id);
        }
    };
}
