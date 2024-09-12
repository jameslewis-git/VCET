//2D ARRAY

public class TwoDArray {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;

        int[][] array = new int[rows][columns];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value++;
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*
Output:-
  The 2D array is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
  */
