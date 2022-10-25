package Excepciones_clases_figuras;

public class ShapeException extends Exception {
	private String message;

	public ShapeException(String message) {
		super(message);
	}
}
