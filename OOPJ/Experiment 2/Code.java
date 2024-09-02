import java.io.*;
import java.util.*;
public class UserInput
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = S.nextLine();
        System.out.println("Enter Your Age:");
        int age = S.nextInt();
        System.out.println("Your Name:"+ name);
        System.out.println("Your Age:"+ age);
    }
}
