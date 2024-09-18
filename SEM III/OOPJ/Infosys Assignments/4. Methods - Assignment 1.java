class Calculator {

    // Instance variable to store the number
    public int num;

    // Method to calculate and return the sum of the digits of the num member variable
    public int sumOfDigits() {
        int sum = 0;
        int temp = num;
        
        // Loop to extract each digit and add it to the sum
        while (temp > 0) {
            sum += temp % 10;  // Add the last digit to sum
            temp /= 10;         // Remove the last digit
        }
        
        return sum;
    }
}

class Tester {

    public static void main(String args[]) {

        // Create an instance of Calculator
        Calculator calculator = new Calculator();
        
        // Test 1: Input 123, Expected Output 6
        calculator.num = 123;
        System.out.println("The sum of the digits of " + calculator.num + " is: " + calculator.sumOfDigits());  // Output: 6

        // Test 2: Input 6547, Expected Output 22
        calculator.num = 6547;
        System.out.println("The sum of the digits of " + calculator.num + " is: " + calculator.sumOfDigits());  // Output: 22
    }
}

/*
Output:-
  The sum of the digits of 123 is: 6
The sum of the digits of 6547 is: 22

  */
