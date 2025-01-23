
import java.util.Scanner;

public class insertionsort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

      
        System.out.println("Original array:");
        printArray(arr);

       
        insertionSort(arr);

     
        System.out.println("Sorted array:");
        printArray(arr);

        scanner.close();
    }
}


/*
Output:- 
Enter the number of elements: 5
Enter the elements:
2
Enter the elements:
2
2
4
6
8
1
Original array:
2 4 6 8 1
Sorted array:
1 2 4 6 8
*/
