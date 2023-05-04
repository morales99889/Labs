//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availableSeats = 10;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 15.25; 
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'A'; 
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean itIsHotOutside = true; 
		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Emily"; 
		
		// 6. Create a variable to hold a street address
		String streetAddress = "123 East Dr";

		// 7. Print all variables to the console
		System.out.println("Seats left on plane: " + availableSeats);
		System.out.println("Cost of groceries: " + costOfGroceries);
		System.out.println("Customers middle initial: " + middleInitial);
		System.out.println("Is it hot outside: " +itIsHotOutside);
		System.out.println("The first name of the customer is: " + customerFirstName);
		System.out.println(streetAddress + " Is where the customer lives");

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availableSeats = availableSeats - 2; 

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries = costOfGroceries + 2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'E';

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		itIsHotOutside = false;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Morales"; 
		System.out.println(fullName);
		
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hello, my name is " + fullName + " and I live at " + streetAddress + ".");
		
		String firstName = "Tom";

		String lastName = "Sawyer";

		System.out.println(firstName + "lastName");
	}
}