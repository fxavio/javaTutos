package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 22);
        System.out.println(STR."Name: \{person.getName()}");
        System.out.println(STR."Age: \{person.getAge()}");
        person.setName("Bob");
        person.setAge(25);
        System.out.println(STR."Name: \{person.getName()}");
        System.out.println(STR."Age: \{person.getAge()}");
    }
}
