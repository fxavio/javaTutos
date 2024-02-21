public class RegularExpression {
    // simple regular expression
    public static void main(String[] args) {
        String str = "Hello";
        // expression to match a string that is exactly "Hello"
        System.out.println(str.matches("Hello"));
        // expression to match a string that starts with "H" or "h"
        System.out.println(str.matches("[Hh]ello"));
        // expression to match a string that starts with an uppercase letter, followed by lowercase letters
        System.out.println(str.matches("[A-Z][a-z]*"));
        String str2 = "Hello123";
        // expression to match a string that starts with an uppercase letter, followed by lowercase letters, and ends with any number of digits
        System.out.println(str2.matches("[A-Z][a-z]*[0-9]*"));
        String str3 = "Hello123@";
        // expression to match a string that starts with an uppercase letter, followed by lowercase letters, and ends with any number of digits, and an @ symbol
        System.out.println(str3.matches("[A-Z][a-z]*[0-9]*[@]"));
    }
}
