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