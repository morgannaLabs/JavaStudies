/** Exercise 7 — Reverse an Array
Create an array with five integers and create a second array containing the elements in reverse order.
by morgannaLabs - https://github.com/morgannaLabs
 */

public class Exercise7ReverseArray {
	public static void main(String[] args) {
		
		int array [] = new int [5];
		int reversed [] = new int [5];
		int j = array.length - 1;
		
		array [0] = 1;
		array [1] = 2;
		array [2] = 3;
		array [3] = 4;
		array [4] = 5;
		
		for (int i = 0; i < array.length; i++ ) {
			
			reversed [i] = array [j];
			System.out.println(reversed[i]);
			j--;
		}
	}
}
