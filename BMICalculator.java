import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double feet, inches, pounds, bmi;
		
		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		inches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();
		
		inches = (feet*12) + inches;
		
		bmi = (pounds *(.45)) / ((inches*.0254)*(inches*.0254));
		
		System.out.println( "Your BMI is " + bmi );
	}
}