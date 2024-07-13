package week05assignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		
		for (char c : log.toCharArray()) {
		    System.out.print(c + " ");
		}
		
		System.out.println();
	}
	
	@Override
	public void error(String error) {
		
	    System.out.print("ERROR: ");
		for (char c : error.toCharArray()) {
			System.out.print(c + " ");
		}
	}

}
