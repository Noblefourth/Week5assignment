package Week5;

public class App {

	public static void main(String[] args) {
		AsteriskLogger aLog = new AsteriskLogger();
		SpacedLogger sLog = new SpacedLogger();
	   
		aLog.log("Hello");
		sLog.log("Error");
		
		aLog.error("Goodbye");
		sLog.error("Error");
	    }
	}
