/** Exercise 1 — Triangle Type Identifier
 
 Given three sides of a triangle, determine if it is equilateral, isosceles, or scalene. 
 Also, make sure the sides can actually form a triangle (the sum of any two sides must be greater than the third). 
 
 by morgannaLabs - https://github.com/morgannaLabs
 */


import java.util.Scanner;

public class Exercise1TriangleType {
    
    static Scanner scanner = new Scanner (System.in);
    static double aSide, bSide, cSide;
    
	public static void main(String[] args) {
	    getSides();
	    showValues();
	}
	
	public static void getSides() {
	    System.out.println("Inform the first side of the triangle");
	    aSide = scanner.nextDouble();
	    
	    System.out.println("Inform the second side of the triangle");
	    bSide = scanner.nextDouble();
	    
	    System.out.println("Inform the third side of the triangle");
	    cSide = scanner.nextDouble();
	    
	    scanner.close();
	}
	
	public static void showValues() {
	    System.out.println(aSide + ", " + bSide + ", " + cSide);
	}

}
