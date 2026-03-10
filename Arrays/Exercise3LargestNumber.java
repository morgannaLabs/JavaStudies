/** Exercise 3 — Find the Largest Number
Create an array with five integers and find the largest number in the array.
by morgannaLabs - https://github.com/morgannaLabs
*/

public class Exercise3LargestNumber {
	public static void main (String [] args) {

		int [] array = new int [5];
		array[0] = 1;
		array[1] = 9;
		array[2] = 2;
		array[3] = 15;
		array[4] = 6;
		
		int largest = array[0];
		
		for (int value : array) {
			
			if (value > largest) {
				
				largest = value;
			}
		}
		System.out.println("The largest number is: " + largest);
	}
}
