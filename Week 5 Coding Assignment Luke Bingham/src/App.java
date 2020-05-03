
public class App {

	public static void main(String[] args) {
	
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		
		asteriskLogger.log("this is test one");
		
		asteriskLogger.error("this is test two");
		
		SpacedLogger spacedLogger = new SpacedLogger();
		
		spacedLogger.log("This is test three");
		
		spacedLogger.error("This is test four");

	}

}
