import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int math;
		
		out.println( "Welcome to the UT Austin College Admissions Interface!" );
		out.print( "Please enter your SAT math score (200-800): " );
		math = keyboard.nextInt();
		
		out.print( "Admittance status: " );
		
		if ( math >= 790 )
			out.print( "CERTAIN " );
		if ( math >= 710 )
			out.print( "SAFE " );
		if (math >= 580 )
			out.print( "PROBABLE " );
		if (math >= 500 )
			out.print( "UNCERTAIN " );
		if (math >= 390 )
			out.print( "UNLIKELY " );
		else // below 390
			out.print( "DENIED " );
			
			out.println();
	}
}
//removing all but the last else causes you to be able to potentially receive multiple outcomes simultaneously 