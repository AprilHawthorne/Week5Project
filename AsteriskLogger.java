//#3
public class AsteriskLogger implements Logger {

	@Override
	//#4
	public void log (String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	//#5
	public void error (String error) {
		for (int i = 0; i < 13 + error.length(); i++) {
			System.out.print("*");
		} 	System.out.println();
		
		System.out.println("***Error: " + error + "***");
		
		for (int i = 0; i < 13 + error.length(); i++) {
			System.out.print("*");
		}	System.out.println();

	}
	
}
