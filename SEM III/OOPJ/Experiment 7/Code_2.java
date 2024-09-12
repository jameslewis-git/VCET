//String Example

public class StringExample {
    public static void main(String[] args) {
        String s1 = "java";
        char[] ch = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);
        String s3 = new String("example");

        System.out.println("String s1: " + s1);
        System.out.println("String s2: " + s2);
        System.out.println("String s3: " + s3);

        int lengthS1 = strlen(s1);
        System.out.println("Length of s1: " + lengthS1);

        int comparisonResult = strcmp(s1, s2);
        System.out.println("Comparison of s1 and s2: " + comparisonResult);

        String concatenatedString = strcat(s1, s2);
        System.out.println("Concatenated String: " + concatenatedString);

        String reversedS1 = strrev(s1);
        System.out.println("Reversed s1: " + reversedS1);
    }

    public static int strlen(String s) {
        return s.length();
    }

    public static int strcmp(String s1, String s2) {
        return s1.compareTo(s2);
    }

    public static String strcat(String s1, String s2) {
        return s1 + s2;
    }

    public static String strrev(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
/*
Output:-
  String s1: java
String s2: strings
String s3: example
Length of s1: 4
Comparison of s1 and s2: -9
Concatenated String: javastrings
Reversed s1: avaj

  */
