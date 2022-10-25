/*
 * Program.java        23/2/22
 *
 * Cylinder clase
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Cylinder {
    
    /** The size of the radius */
    private double radius;
    
    /** The height */
    private double height;
    
    
// CONSTRUCTORS
    
    
    /*
     * Constructor by default.
     */
    public Cylinder() {
        this.radius = 0;
        this.height = 0;
    }
    
    /**
     * 
     * Constructor
     * 
     * @param radius, an double
     * @param height, an double
     * 
     */
    
    public Cylinder (double radius, double height) {
        this.radius = radius;        
        this.height = height;
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
    
    /**
     * Gets and set the height
     *      
     */
    
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    // --------  MORE METHODS -----------
    
    // Calcula el area total
    
    public double areaTotal() {        
        return (2 * Math.PI * this.radius *(this.radius + this.height));        
    }
    
    // El volumen
    
    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
    
    // Comparar dos cilindros en base al area total
    
    public boolean compare(Cylinder c2) {
        boolean bigger = false;
            if (this.areaTotal() > c2.areaTotal()) {
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
            "\nAltura         : " +this.height+ 
            "\nVolumen        : " +this.volume()+ 
            "\nArea Total     : "+ this.areaTotal();        
        return s;
    }
}

