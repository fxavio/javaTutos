public class Conversion {

    public static void main(String[] args) {
        // Implicit conversion and explicit conversion
        int i = 100;
        float f = (long) i; // Implicit conversion
        System.out.println("Int value: " + i);
        System.out.println("Float value: " + f);

        // Explicit conversion
        double d = 100.04;
        long l1 = (long) d; // Explicit conversion
        int i1 = (int) l1; // Explicit conversion
        System.out.println("Double value: " + d);
        System.out.println("Long value: " + l1);
        System.out.println("Int value: " + i1);

    }
}
