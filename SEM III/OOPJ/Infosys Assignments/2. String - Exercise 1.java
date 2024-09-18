public class Tester {
    public static String removeWhiteSpaces(String str) {
        // Replace all whitespace characters with an empty string
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String input1 = "Hello How are you";
        String output1 = removeWhiteSpaces(input1);
        System.out.println(output1); // Output: HelloHowareyou

        String input2 = "J    ava pro    gramming";
        String output2 = removeWhiteSpaces(input2);
        System.out.println(output2); // Output: Javaprogramming
    }
}
/*
Output:-
  HelloHowareyou
  Javaprogramming
*/
