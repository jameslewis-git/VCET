class Tester {
    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {68, 79, 86, 99, 23, 2, 41, 100};
        System.out.println("Sum of even numbers: " + calculateSumOfEvenNumbers(numbers));
    }
}


//Output:-
 // Sum of even numbers: 256

