package StringManip;

public class Main {
    public static void main(String[] args) {
        //concatenation example
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2; // Using +
        // OR
        String result2 = str1.concat(" ").concat(str2); // Using concat()
        // OR
        String result3 = String.join(" ", str1, str2); // Using join()

        //substring example
        String str = "Hello World";
        String sub = str.substring(6); // Using substring()
        String sub2 = str.substring(6, 11); // Using substring()
        //replace example
        String str3 = "Hello World";
        String replaceString = str3.replace('H', 'W'); // Using replace()
        String replaceString2 = str3.replace("Hello", "Hi"); // Using replace()

        //split example
        String str4 = "Hello World";
        String[] splitString = str4.split(" "); // Using split()
        String[] splitString2 = str4.split("o"); // Using split()

        //toLowerCase and toUpperCase example
        String str5 = "Hello World";
        String lower = str5.toLowerCase(); // Using toLowerCase()
        String upper = str5.toUpperCase(); // Using toUpperCase()
        //trim example
        String str6 = " Hello World ";
        String trim = str6.trim(); // Using trim()
        //valueOf example
        int i = 10;
        String value = String.valueOf(i); // Using valueOf()
        //charAt example
        String str7 = "Hello";
        char charAt = str7.charAt(0); // Using charAt()
        //indexOf example
        String str8 = "Hello World";
        int index = str8.indexOf('o'); // Using indexOf()
        int index2 = str8.indexOf('o', 5); // Using indexOf()
        //contains
        String str9 = "Hello World";
        boolean contains = str9.contains("Hello"); // Using contains()
        //equals example
        String str10 = "Hello";
        boolean equals = str10.equals("Hello"); // Using equals()
        //equalsIgnoreCase example
        String str11 = "Hello";
        boolean equalsIgnoreCase = str11.equalsIgnoreCase("hello"); // Using equalsIgnoreCase()
        //compareTo example

        String str12 = "Hello";
        int compare = str12.compareTo("Hello"); // Using compareTo()
        int compare2 = str12.compareTo("hello"); // Using compareTo()
        //endsWith example
        String str13 = "Hello";
        boolean endsWith = str13.endsWith("lo"); // Using endsWith()
        //startsWith example
        String str14 = "Hello";
        boolean startsWith = true; // Using startsWith()/
        //length example
        String str15 = "Hello";
        int length = str15.length(); // Using length()
        //isEmpty example
        String str16 = "";
        boolean isEmpty = str16.isEmpty(); // Using isEmpty()

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(sub);
        System.out.println(sub2);
        System.out.println(replaceString);
        System.out.println(replaceString2);
        System.out.println(splitString);
        System.out.println(splitString2);
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(trim);
        System.out.println(value);
        System.out.println(charAt);
        System.out.println(index);
        System.out.println(index2);
        System.out.println(contains);
        System.out.println(equals);
        System.out.println(equalsIgnoreCase);
        System.out.println(compare);
        System.out.println(compare2);
        System.out.println(endsWith);
        System.out.println(startsWith);
        System.out.println(length);
        System.out.println(isEmpty);


    }

}
