/** Exercise 1 — Triangle Type Identifier
 
 Given three sides of a triangle, determine if it is equilateral, isosceles, or scalene. 
 Also, make sure the sides can actually form a triangle (the sum of any two sides must be greater than the third). 
 
 by morgannaLabs - https://github.com/morgannaLabs
 */

// ===== IMPORT  =====
import java.util.Scanner; // Imports Scanner to read user input

public class Exercise1TriangleType {

	// ===== CLASS ATTRIBUTES =====
    static Scanner scanner = new Scanner (System.in); // Scanner object to rea user input
    static double aSide, bSide, cSide; // variables to store the triangle sides

	// ===== MAIN  METHOD =====
	
    public static void main(String[] args) {

		// Keeps asking for input until a valid triangle is provided
        while (true) {

            aSide = getSides(1);
            bSide = getSides(2);
            cSide = getSides(3);

			// If the triangle is valid, exit the loop
            if (validateTriangle()) {
                break; 
            }
        }

        calculateType(); // Determines the triangle type
        showValues(); // Displays the side values
        scanner.close(); // Closes the Scanner
    }

	// ===== INPUT =====

	// Reads a side value and validates it (no negatives, letters, or invalid input)
	public static double getSides(int counter) {

		// Keeps asking until a valid value is entered
	    while (true) {
	        try {
	            System.out.println("Inform the " + counter + "º side of the triangle: ");
	            double value = scanner.nextDouble();

				// If the value is not positive, show message and repeat
	            if (value <= 0) {
	                System.out.println("The side must be greater than zero!");
	                continue; 
	            }

				// Returns the valid value
	            return value;

			// Handles invalid (non-numeric) input
	        } catch (Exception e) {
	            System.out.println("Invalid input! Please enter a numeric value.");

				// Clears invalid input from the buffer
	            scanner.nextLine(); 
	        }
	    }
	}

	// ===== OUTPUT =====
	public static void showValues() {
	    System.out.println("Values: " + aSide + ", " + bSide + ", " + cSide);
	} 

	
	// ===== TRIANGLE VALIDATION =====

	// Checks if the sides satisfy the triangle inequality rule
	public static boolean validateTriangle () {
		
		// Returns true if it is a valid triangle
	    if ((aSide + bSide > cSide) && (aSide + cSide > bSide) && (bSide + cSide > aSide)) {
	    	return true;
	}

		// Otherwise, shows a message and returns false	
		else {
	    	System.out.println("Invalid Triangle! Try Again!");
	    	return false;
	    }
	    

	}
	
	// ===== TRIANGLE TYPE CLASSIFICATION  =====
	
	// Determines and displays the triangle type (assumes it is already valid)
	public static void calculateType () {

		// Equilateral: all sides are equal
		if (aSide == bSide && bSide == cSide) {
			System.out.println("Equilateral Triangle");
		}

		// Isosceles: two sides are equal
		else if ((aSide == bSide) || (aSide == cSide) || (bSide == cSide)) {
			System.out.println("Isosceles Triangle");
		}

		// Scalene: all sides are different
		else {
			System.out.println("Scalene Triangle");
		}
	}
	
}
