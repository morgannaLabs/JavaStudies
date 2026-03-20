/** Exercise 2 — Student Grade Evaluator
 
Read three grades of a student and calculate the average. Then classify the result as passed, recovery, failed. 
Don't let invalid grade be inserted (less than 0 or greater than 10)
 
 by morgannaLabs - https://github.com/morgannaLabs
 */


import javax.swing.JOptionPane;

public class Exercise2GradeEvaluator {
	
	static double grade1, grade2, grade3, average;
	
	public static void main (String [] args) {
		
		grade1 = readGrades(1);
		grade2 = readGrades(2);
		grade3 = readGrades(3);
		
		average = calculateAverage(grade1, grade2, grade3);
		classifyFinalGrade(average);
		
	}
	
	public static double readGrades(int counter) {
		
		while (true) {
		
		try {
		double grade = Double.parseDouble(JOptionPane.showInputDialog("Inform the " + counter + "º grade"));
		
		if (grade > 10 || grade < 0) {
			JOptionPane.showMessageDialog(null, "Invalid Grade! Only Numbers between 0 and 10! Try Again!");
			continue;
		}
		
		return grade;
		
		}
		
		catch (NumberFormatException e) {

		    JOptionPane.showMessageDialog(null, "Only Numbers between 0 and 10! Try Again!");
		}
	}
		
}
	
	public static double calculateAverage(double grade1, double grade2, double grade3) {
		
		double sum = grade1 + grade2 + grade3;
		double average = sum / 3;
		
		return average;
	}
	
	public static void classifyFinalGrade(double average) {
		
		if (average >= 7) {
			JOptionPane.showMessageDialog(null, "Congratualtions, you passed!! Your final grade is: " + average);
		}
		
		else if (average >= 5 && average <= 6) {
			JOptionPane.showMessageDialog(null, "You must do the recovery! Your final grade is: " + average);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "You failed! See Yo next year! Your final grade is: " + average);
		}
		
	}

}
