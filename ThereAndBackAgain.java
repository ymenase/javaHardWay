public class ThereAndBackAgain {
	public static void main( String[] args ) {
		System.out.println( "Here." );
		erebor();
		System.out.println( "Back first time." );
		erebor();
		System.out.println( "Back around second time." );
	}
	
	public static void erebor() {
		System.out.println( "There." );
	}
}
//when i remove the parentheses, it says that line 4 is not a statement. i put them back