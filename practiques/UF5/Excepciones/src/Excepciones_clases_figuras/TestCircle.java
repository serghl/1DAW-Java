package Excepciones_clases_figuras;

public class TestCircle {

	 
    public TestCircle() {
		Circle theCircle;
	
		// Test the negative radius exception.
	
		try {
		    theCircle = new Circle( 1.0, 1.0, -2.0 );
		    System.out.println(
	    		    "Did not get expected exception after negative radius." );
		} catch( ShapeException e ) {
		    System.out.println( "Exception after negative radius." );
		    System.out.print( "The message text was: " );
		    System.out.println( e.getMessage() );
		}
	
		// Test the negative stretch factor exception
	
		try {
		    theCircle = new Circle( 1.0, 1.0, 4.0 );	
		    theCircle.stretchBy( -3 );
		    System.out.println( "Did not get expected exception after "
	                                + "negative stretch." );
		} catch( ShapeException e ) {
		    System.out.println( "Exception after negative stretch factor." );
		    System.out.print( "The message text was: " );
		    System.out.println( e.getMessage() );
		}
	
		// Perform operations that should not generate exceptions.
	
		try {
		    theCircle = new Circle( 1.0, 1.0, 4.0 );
		    System.out.println( "The circle area is " + theCircle.area() );
		    theCircle.stretchBy( 3 );
		    System.out.println( "After stretching the area is " + theCircle.area() );
		} catch( ShapeException e ) {
		    System.out.println( "Unexpected exception." );
		    System.out.print( "The message text was: " );
		    System.out.println( e.getMessage() );
		}		
    }
	
   
    public static void main( String[] args ) {
		TestCircle test;
		test = new TestCircle();
    }
} 

