/** Exercise 4 — Count Even Numbers
Create an array with six integers and count how many numbers are even.
by morgannaLabs - https://github.com/morgannaLabs
 */

public class Exercise4CountEvenNumbers {
	public static void main (String [] args) {
		
		int [] array = new int [6];
		array [0] = 7;
		array [1] = 12;
		array [2] = 9;
		array [3] = 20;
		array [4] = 3;
		array [5] = 8;
		
		int evenCounter = 0;
		
		for (int number : array) {
			
			if (number % 2 == 0) {
				evenCounter++;
			}
		}
		
		System.out.println("Number of even numbers: " + evenCounter);
	}
}
