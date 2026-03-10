/** Exercise 2 — Sum of Array Elements

Create an array with five integers.
Print each element and calculate the sum of all values in the array.

by morgannaLabs
https://github.com/morgannaLabs

*/


public class Exercise2ArraySum {
	
	
	
	public static void main(String[] args) {
		
		int sum = 0;
		int [] array = new int [5];
		
		array[0] = 5;
		array[1] = 8;
		array[2] = 12;
		array[3] = 3;
		array[4] = 7;
		
		for (int value : array) {
			sum += value;
			System.out.println(value);
		}
		
		System.out.println("The result of the sum is : " + sum);
	}



}

