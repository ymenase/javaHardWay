import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double pounds, inches, bmi;
		
		System.out.print( "Your height in inches: " );
		inches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();
		
		bmi = (pounds *(.45)) / ((inches*.0254)*(inches*.0254));
		
		System.out.println( "Your BMI is " + bmi );
	}
}