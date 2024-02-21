package access;
public class Modif {

    public static class MyClass {
        public int publicField = 10;
        protected int protectedField = 30;
        int defaultField = 40;
        public int getPrivateField() {
            return 20;
        }
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Public field value: " + obj.publicField);
        System.out.println("Private field value: " + obj.getPrivateField());
        System.out.println("Protected field value: " + obj.protectedField);
        System.out.println("Default field value: " + obj.defaultField);
    }
}

