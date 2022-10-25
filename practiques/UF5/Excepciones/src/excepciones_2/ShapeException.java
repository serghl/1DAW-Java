package excepciones_2;

public class ShapeException extends Exception{
	private String message;
	
	public ShapeException (String message) {
		super(message);
	}
	
}
