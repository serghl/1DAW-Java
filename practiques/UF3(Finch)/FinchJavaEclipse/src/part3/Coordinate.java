package part3;

public class Coordinate {

	   private int x;
	   private int y;
	   private Coordinate parent;

	    public Coordinate(int x, int y) {
	        this.x = x;
	        this.y = y;
	        this.parent = null;
	    }

	    public Coordinate(int x, int y, Coordinate parent) {
	        this.x = x;
	        this.y = y;
	        this.parent = parent;
	    }

	    int getX() {
	        return x;
	    }

	    int getY() {
	        return y;
	    }

	    Coordinate getParent() {
	        return parent;
	    }
}
