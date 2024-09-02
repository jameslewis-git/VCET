import java.io.*;

import java.util.*;


public class Condition 

{

    public static void main(String args[]) 

    {

        Scanner A = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");

        int a = A.nextInt();

        int b = A.nextInt();


        if (a > b) 

        {

            System.out.println("The Largest is " + a);

        } 

        else 

        {

            System.out.println("The largest is " + b);

        }

    }

}
