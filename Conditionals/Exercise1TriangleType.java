/** Exercise 1 — Triangle Type Identifier
 
 Given three sides of a triangle, determine if it is equilateral, isosceles, or scalene. 
 Also, make sure the sides can actually form a triangle (the sum of any two sides must be greater than the third). 
 
 by morgannaLabs - https://github.com/morgannaLabs
 */

// ===== IMPORT  =====
import java.util.Scanner;

public class Exercise1TriangleType {

	// ===== CLASS ATTRIBUTES =====
    static Scanner scanner = new Scanner (System.in);
    static double aSide, bSide, cSide;
    static boolean isValid;

	// ===== MAIN  =====
	public static void main(String[] args) {
		while (!isValid) {
			getSides();
		    isValid = validateTriangle();
		}
		
		calculateType();
		showValues();
		scanner.close();
	} // end main

	// ===== INPUT =====
	public static void getSides() {
	    System.out.println("Inform the first side of the triangle: ");
	    aSide = scanner.nextDouble();
	    
	    System.out.println("Inform the second side of the triangle: ");
	    bSide = scanner.nextDouble();
	    
	    System.out.println("Inform the third side of the triangle: ");
	    cSide = scanner.nextDouble();
	    
	    
	}

	// ===== OUTPUT =====
	public static void showValues() {
	    System.out.println("Values: " + aSide + ", " + bSide + ", " + cSide);
	} 

	
	// ===== TRIANGLE VALIDATION =====
	public static boolean validateTriangle () {
	    if ((aSide + bSide > cSide) && (aSide + cSide > bSide) && (bSide + cSide > aSide)) {
	    	isValid = true;
	}
	    else {
	    	System.out.println("Invalid Triangle! Try Again!");
	    	isValid = false;
	    }
	    
	    return isValid;

	}
	
	// ===== TRIANGLE TYPE CLASSIFICATION  =====
	public static void calculateType () {
		
		if (aSide == bSide && bSide == cSide) {
			System.out.println("Equilateral Triangle");
		}
		
		else if ((aSide == bSide) || (aSide == cSide) || (bSide == cSide)) {
			System.out.println("Isosceles Triangle");
		}
		
		else {
			System.out.println("Scalene Triangle");
		}

		
		
	}
	
}
