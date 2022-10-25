package Excepciones_clases_figuras;

public abstract class Shape {

	protected double xLoc;
	protected double yLoc;

	// Constructor
	
	public Shape(double xLoc, double yLoc) {
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}

	//Getters y setters
	
	public double getXPos() {
		return xLoc;
	}

	public void setXPos(double xLoc) {
		this.xLoc = xLoc;
	}

	public double getYPos() {
		return yLoc;
	}

	public void setYPos(double yLoc) {
		this.yLoc = yLoc;
	}
	

	// Other Methods
	
	// Move to 
	
	public void moveTo(double xLoc, double yLoc) {
		setYPos(yLoc);
		setXPos(xLoc);
	}
	
	// Strech by
	
	public abstract void stretchBy(double factor) throws ShapeException;

	@Override
	public String toString() {
		return "Shape [xLoc=" + xLoc + ", yLoc=" + yLoc + "]";
	}
}
