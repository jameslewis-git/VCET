class Bike {
	String brand;
	String color;

	// Method to display bike information
	void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
	}
}
public class Main {
	public static void main(String[] args) {
		// Create Bike objects
		Bike bike1 = new Bike();
		Bike bike2 = new Bike();
		Bike bike3 = new Bike();

		// Initialize bike details
		bike1.brand = "Harley-Davidson";
		bike1.color = "Black";
		bike2.brand = "Ducati";
		bike2.color = "Red";
		bike3.brand = "Kawasaki";
		bike3.color = "Green";

		// Display information about each bike
		System.out.println("Bike 1 Information:");
		bike1.displayInfo();
		System.out.println("\nBike 2 Information:");
		bike2.displayInfo();
		System.out.println("\nBike 3 Information:");
		bike3.displayInfo();
	}
}



/*
Bike 1 Information:
Brand: Harley-Davidson
Color: Black

Bike 2 Information:
Brand: Ducati
Color: Red

Bike 3 Information:
Brand: Kawasaki
Color: Green
*/
