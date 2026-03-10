/** Exercise 6 — Count Numbers Greater Than 10
Create an array with five integers and count how many numbers are greater than 10.
by morgannaLabs - https://github.com/morgannaLabs
*/


public class Exercise6GreaterThan10 {
	public static void main(String[] args) {
		
		int array [] = new int [5];
		int counter = 0;
		
		array [0] = 5;
		array [1] = 12;
		array [2] = 17;
		array [3] = 3;
		array [4] = 21;
		
		for (int number : array) {
			
			if (number > 10) {
				counter ++;
			}
		}
		
		System.out.println ("Count of numbers greater than 10: " + counter);
				
	}
}
