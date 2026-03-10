/** Exercise 1 — Print Array Elements
Create an array with five integers and print all elements using a for-each loop.
by morgannaLabs - https://github.com/morgannaLabs
*/

public class Exercise1PrintArray {

	public static void main(String[] args) {
		
		int [] array = new int[5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for (int value : array) {
			System.out.println(value);
		}
	}
}
