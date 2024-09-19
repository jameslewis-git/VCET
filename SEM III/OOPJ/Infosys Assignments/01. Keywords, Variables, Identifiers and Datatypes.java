public class DataTypesExample {
    public static void main(String[] args) {
        int a = 10;
        float b = 5.5f;
        char c = 'A';
        double d = 3.14159;

        System.out.println("Variable Declaration and Initialization:");
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Character: " + c);
        System.out.println("Double: " + d + "\n");

        int validIdentifier1 = 20;
        float validIdentifier2 = 10.5f;

        System.out.println("Identifiers and Keywords:");
        System.out.println("Valid Identifier 1: " + validIdentifier1);
        System.out.println("Valid Identifier 2: " + validIdentifier2 + "\n");

        float num1 = 5.5f;
        int num2;

        num2 = (int) num1;
        System.out.println("Type Casting:");
        System.out.println("Explicit type casting (float to int): " + num2 + "\n");

        System.out.println("Size of Different Data Types:");
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " byte");
    }
}
/*
Output:-
Variable Declaration and Initialization:
Integer: 10
Float: 5.5
Character: A
Double: 3.14159

Identifiers and Keywords:
Valid Identifier 1: 20
Valid Identifier 2: 10.5

Type Casting:
Explicit type casting (float to int): 5

Size of Different Data Types:
Size of int: 4 bytes
Size of float: 4 bytes
Size of double: 8 bytes
Size of char: 2 byte

  */ 
