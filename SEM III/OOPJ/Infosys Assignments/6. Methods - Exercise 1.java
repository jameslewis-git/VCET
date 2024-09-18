class Calculator {

    // Method to calculate the average of three integers
    public double findAverage(int number1, int number2, int number3) {
        double sum = number1 + number2 + number3;
        double average = sum / 3;
        return Math.round(average * 100.0) / 100.0;
    }
}

class Tester {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Test the findAverage method
        double avg = calculator.findAverage(10, 20, 30);
        System.out.println("The average is: " + avg);
        
        // You can add more test cases as needed
        double avg2 = calculator.findAverage(65, 175, 85);
        System.out.println("The average is: " + avg2);
    }
}


//Output:-
//  The average is: 20.0
//The average is: 108.33

  
