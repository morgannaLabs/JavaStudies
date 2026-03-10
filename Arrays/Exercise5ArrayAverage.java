/** Exercise 5 — Calculate the Average
Create an array with five integers and calculate the average value of the elements.
by morgannaLabs - https://github.com/morgannaLabs
*/

public class Exercise5ArrayAverage {
  public static void main(String[] args) {
		
		int array [] = new int [5];
		int average = 0;
		int sum = 0;
		
		array [0] = 10;
		array [1] = 8;
		array [2] = 7;
		array [3] = 9;
		array [4] = 6;
		
		for (int i = 0; i < array.length; i++) {
			sum += array [i];
		}
		
		average = sum / array.length;
		System.out.println ("The average is: " + average);

	}
}
