package week05assignment;

public class App {

	public static void main(String[] args) {
		
		//Instantiating an instance of each class:
		Logger logger = new AsteriskLogger();
		Logger logger1 = new SpacedLogger();
		
		//Printing stuff to the console using AsteriskLogger:
		System.out.println("Testing the AsteriskLogger:\n");
		logger.log("Hi Tyler!");
		System.out.println();
		logger.error("OOPSIE");
		System.out.println();
		
		//Printing stuff to the console using SpacedLogger:
		System.out.println("Testing the SpacedLogger:\n");
		logger1.log("STRETCH");
		System.out.println();
		logger1.error("STRETCHEDERROR");
		System.out.println();

	}

}
