
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		
		String errorString = "***ERROR: " + error + "***";
		
		for (int i = 0; i < errorString.length(); i++) {
			
			System.out.print("*");
		}
		
		System.out.println();
		
		System.out.println(errorString);
		
		for (int i = 0; i < errorString.length(); i++) {
			
			System.out.print("*");
		
		}
		
		System.out.println();

	}
	
}
