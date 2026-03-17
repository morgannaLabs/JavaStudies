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

	// ===== MAIN  METHOD =====
	
    public static void main(String[] args) {

        while (true) {

            aSide = getSides(1);
            bSide = getSides(2);
            cSide = getSides(3);

            if (validateTriangle()) {
                break; 
            }
        }

        calculateType();
        showValues();
        scanner.close();
    }

	// ===== INPUT =====
	
	public static double getSides(int counter) {

	    while (true) {
	        try {
	            System.out.println("Inform the " + counter + "º side of the triangle: ");
	            
	            double value = scanner.nextDouble();
	            
	            if (value <= 0) {
	                System.out.println("The side must be greater than zero!");
	                continue; 
	            }
	            
	            return value;

	        } catch (Exception e) {
	            System.out.println("Invalid input! Please enter a numeric value.");

	            scanner.nextLine(); 
	        }
	    }
	}

	// ===== OUTPUT =====
	public static void showValues() {
	    System.out.println("Values: " + aSide + ", " + bSide + ", " + cSide);
	} 

	
	// ===== TRIANGLE VALIDATION =====
	public static boolean validateTriangle () {
		
		
	    if ((aSide + bSide > cSide) && (aSide + cSide > bSide) && (bSide + cSide > aSide)) {
	    	return true;
	}
	    else {
	    	System.out.println("Invalid Triangle! Try Again!");
	    	return false;
	    }
	    

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
