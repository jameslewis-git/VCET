class Rectangle {
    // Instance variables to store the dimensions of the rectangle
    public float length;
    public float width;
    
    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        double area = length * width;
        return Math.round(area * 100.0) / 100.0;  // Round off to two decimal places
    }

    // Method to calculate and return the perimeter of the rectangle
    public double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        return Math.round(perimeter * 100.0) / 100.0;  // Round off to two decimal places
    }
}

class Tester {

    public static void main(String args[]) {

        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle();

        // Test Case 1: length = 12f, width = 5f
        rectangle.length = 12f;
        rectangle.width = 5f;
        System.out.println("Area of the rectangle is " + rectangle.calculateArea());  // Output: 60.0
        System.out.println("Perimeter of the rectangle is " + rectangle.calculatePerimeter());  // Output: 34.0
        
        // Test Case 2: length = 6f, width = 3f
        rectangle.length = 6f;
        rectangle.width = 3f;
        System.out.println("Area of the rectangle is " + rectangle.calculateArea());  // Output: 18.0
        System.out.println("Perimeter of the rectangle is " + rectangle.calculatePerimeter());  // Output: 18.0
    }
}


//Output:-
//  Area of the rectangle is 60.0
//Perimeter of the rectangle is 34.0
//Area of the rectangle is 18.0
//Perimeter of the rectangle is 18.0

  
