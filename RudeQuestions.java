import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		String color;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? ");
		name = keyboard.next();
		
		System.out.print ( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print ("How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per  year!" );
		System.out.print( "What is your favorite color, " + name + "? " );
		color = keyboard.next();
		
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		

		
	}
}
/* Yes the program does not blow up up if I type an integer where it is expecting a double because a double
can be converted to an integer

The program does not blow up if I enter an integer where it is expecting a string

Program blows up at name if i enter only numbers. Program blows up if i input a non-integer for age, because it requires an integer. Also blows up if i input letters for income
and weight because it was expecting numbers.*/
