package Excepciones_clases_figuras;

public class TestRectangle {

    /**
     * Create Rectangle objects trying to force exceptions to occur.
     *
     */
    public TestRectangle() {
		Rectangle theRectangle;
	
		// Test the negative width/height exception.
		try {
		    theRectangle = new Rectangle( 1.0, 1.0, -2.0, 2.0 );
		    System.out.println(
	    	            "Did not get expected exception after negative width." );
		} catch( ShapeException e ) {
		    System.out.println( "Exception after negative width." );
		    System.out.print( "The message text was: " );
		    System.out.println( e.getMessage() );
		}
	
		try {
		    theRectangle = new Rectangle( 1.0, 1.0, 2.0, -2.0 );
		    System.out.println(
			    "Did not get expected exception after negative height." );
		} catch( ShapeException e ) {
		    System.out.println( "Exception after negative height." );
		    System.out.print( "The message text was: " );
		    System.out.println( e.getMessage() );
		}
	
		// Test the negative stretch factor exception
		try {
		    theRectangle = new Rectangle( 1.0, 1.0, 2.0, 2.0 );
	
		    theRectangle.stretchBy( -3 );
		    System.out.println( "Did not get expected exception after "
	                                + "negative stretch." );
		} catch( ShapeException e ) {
		    System.out.println( "Exception after negative stretch factor." );
		    System.out.print( "The message text was: " );
		    System.out.println( e.getMessage() );
		}
	
		// Perform operations that should not generate exceptions.
		try {
		    theRectangle = new Rectangle( 1.0, 1.0, 2.0, 2.0 );
	
		    System.out.println( "The rectangle area is " 
	                                + theRectangle.area() );
		    theRectangle.stretchBy( 3 );
		    System.out.println( "After stretching the area is " 
				        + theRectangle.area() );
		} catch( ShapeException e ) {
		    System.out.println( "Unexpected exception." );
		    System.out.print( "The message text was: " );
		    System.out.println( e.getMessage() );
		}

    }
	
  
    public static void main( String[] args ) {
		TestRectangle test;
		test = new TestRectangle();
    }
    
} 
