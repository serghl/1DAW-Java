/*
 * Program.java        21/2/22
 *
 * Clase position, simula una posicion
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Position {
    
    /** The x position */
    private double posX;
    /** The y position */
    private double posY;  
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     * 
     * @param name the person's name
     */
    public Position() {
        this.posX = 0;
        this.posY = 0;
    }
    
    /**
     * 
     * Constructor
     * 
     * @param posX the x position
     * @param posY the y position
     * 
     */
    
    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Set and Get the X position
     * 
     * @return the x position
     */
    
    public double getPositionX() {
        return this.posX;
    }
    
    public void setPositionX(int posX) {
        this.posX = posX;
    }
    
    /**
     * Set and Get the Y position
     * 
     * @return the Y position
     */
    
    public double getPositionY() {
        return this.posY;
    }
    
    public void setPositionY(int posY) {
        this.posY = posY;
    }
    
    // --------  MORE METHODS -----------
    
    /*
     * Increment and decrease
     * 
     */
    
    public void incX () {
        this.posX++;
    }
    
    public void decX () {
        this.posX--;
    }
    
    public void incY() {
        this.posY++;
    }
    
    public void decY() {
        this.posY--;
    }
    
    /*
     * Establish the XY positon
     * 
     */
   
    public void setXY () {
        Position setXY = new Position(this.posX, this.posY);        
    }    
      
    // TO STRING 
    
    public String toString() {
        return "La posicion es " + this.posX + " y " + this.posY ;        
    }
}