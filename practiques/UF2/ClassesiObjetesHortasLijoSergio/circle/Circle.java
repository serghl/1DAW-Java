/*
 * Program.java        23/2/22
 *
 * Crea la clase circle
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Circle {
    
    /** The size of the radius */
    private double radius;
    
    
// CONSTRUCTORS
    
    
    /*
     * Constructor by default.
     */
    public Circle() {
        this.radius = 1;
    }
    
    /**
     * 
     * Constructor
     * 
     * @param radius, an double
     * 
     */
    
    public Circle(double radius) {
        this.radius = radius;        
    }
    
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets and set the radius
     *      
     */
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    // --------  MORE METHODS -----------
    
    
    
    // Calcula el area 
    
    public double area() {        
        return (this.radius * this.radius) * Math.PI;        
    }
    
    // La circunferencia
    
    public double perimeter() {
        return Math.PI * 2 * this.radius;
    }
    
    // Comparar dos circulos en base al area
    
    public boolean compare(Circle c2) {
        boolean bigger = false;
        if (this.area() > c2.area()) {
            bigger = true;                
        }
        return bigger;
    }
    
    /*
     * 
     * Textual representation of the object
     * 
     */
    
    public String toString() {
        String s;
        s ="Radio          : " +this.radius+ 
            "\nCircunferencia : " +this.perimeter()+ 
            "\nArea           : "+ this.area();        
        return s;
    }
}

