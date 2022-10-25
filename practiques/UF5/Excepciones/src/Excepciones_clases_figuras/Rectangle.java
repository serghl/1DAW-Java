package Excepciones_clases_figuras;

public class Rectangle extends Shape {
	public double myWidth;
	public double myHeight;

	public Rectangle(double xLoc, double yLoc, double myWidth, double myHeight) throws ShapeException {
		super(xLoc, yLoc);
		if (myWidth <= 0) {
			throw new ShapeException("El valor de anchura no puede ser negativo");
		} else {
			this.myWidth = myWidth;
		}

		if (myHeight <= 0) {
			throw new ShapeException("El valor de altura no puede ser negativo");
		} else {
			this.myHeight = myHeight;
		}
	}

	// Getters y setters

	public double getWidth() {
		return myWidth;
	}

	public void setWidth(double myWidth) {
		this.myWidth = myWidth;
	}

	public double getHeight() {
		return myHeight;
	}

	public void setHeight(double myHeight) {
		this.myHeight = myHeight;
	}

	// Other methods

	public double area() {
		return this.myHeight * this.myWidth;
	}

	public void stretchBy(double factor) throws ShapeException {
		if (factor < 0) {
			throw new ShapeException("El factor no puede ser negativo");
		} else {
			setHeight(this.myHeight * factor);
			setWidth(this.myWidth * factor);
		}
	}

}
