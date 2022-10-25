package Excepciones_clases_figuras;

public class Circle extends Shape {
	public double myRadius;

	public Circle(double myXPos, double myYPos, double myRadius) throws ShapeException {
		super(myXPos, myYPos);
		if (myRadius < 0) {
			throw new ShapeException("El radio es negativo");
		} else {
			this.myRadius = myRadius;
		}
	}

	// Getter

	public double getRadius() {
		return this.myRadius;
	}

	public void setRadius(double myRadius) {
		this.myRadius = myRadius;
	}

	// Other methods

	public double area() {
		return Math.PI * Math.pow(this.myRadius, 2);
	}

	public void stretchBy(double factor) throws ShapeException {
		if (factor < 0) {
			throw new ShapeException("El factor no puede ser negativo");			
		} else {
			setRadius(myRadius * factor);
		}
	}

	@Override
	public String toString() {
		return "Circle [myRadius=" + myRadius + "]";
	}

}
