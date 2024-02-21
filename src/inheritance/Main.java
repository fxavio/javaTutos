package inheritance;
 //class animal
 class Animal {
     void eat() {
         System.out.println("Animal is eating...");
     }
 }

 //class dog extends animal
 class Dog extends Animal {
     void bark() {
         System.out.println("Dog is barking...");
     }
 }

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.bark(); // Dog's own behavior
        System.out.println("Dog's class: " + dog.getClass());
        System.out.println("Dog's hash code: " + dog.hashCode());
        System.out.println("Dog's superclass: " + dog.getClass().getSuperclass());
        System.out.println("Dog's package: " + dog.getClass().getPackage());

    }


}
