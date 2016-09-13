public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, weight;
		double seconds, e, checking, height;
		String firstName, lastName, title, nickname, suffix;
		
		x = 10;
		y = 400;
		age = 39;
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		weight = 160;
		height = 10.1;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		nickname = "Bob";
		suffix = "Senior";
				
		System.out.println( "The variable x contains " + x);
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds.");
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + " " + lastName );
		System.out.println( "My weight is " + weight + " " + "pounds." );
		System.out.println( "My height is " + height + " " + "feet." );
		System.out.println( "My nickname is " + nickname );
		System.out.println( "My name is " + firstName + " " + lastName + "," + " " + suffix );
	}
}