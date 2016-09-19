import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		
		pin = 12345;
		
		System.out.println("WECOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		
		while ( entry != pin ) {
			System.out.println("\nINCORRECTPIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}