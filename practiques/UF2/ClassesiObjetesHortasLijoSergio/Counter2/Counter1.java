/*
 * Program.java        22/2/22
 *
 * Crea la clase circle
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Counter1 {
    
    /** The number */
    private int digit;
    
    
// CONSTRUCTORS
    
    
    /*
     * Constructor by default.
     */
    public Counter1() {
        this.digit = 0;
    }
    
    /**
     * 
     * Constructor
     * 
     * @param perimeter, the perimeter
     * 
     * -- Aqui llamamos al metodo set Digit por defecto --
     */
    
    public Counter1(int digit) {
        this.setDigit(digit);        
    }
    
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the perimeter
     * 
     * @return the perimeter
     */
    
    public int getDigit() {
        return this.digit;
    }
    
    /**
     * Set the digit
     * 
     * @return the digit
     */
    
    public void setDigit(int digit) {
        if(digit <= 9 && digit >=0) {
            this.digit = digit;
        } else {
            this.digit = 0;
        }
    }
    
    
    
    // --------  MORE METHODS -----------
    
    /*
     * Suma de uno en uno
     * 
     */
    public void increment() {
        if (this.digit == 9) {
            this.digit = 0;
        } else {
            this.digit++;
        }
    }
    
    /*
     * Resetea a cero
     * 
     */
    public void reset() {
        this.digit = 0;
    }
    
    /*
     * 
     * Textual representation of the object
     * 
     */
    
    public String toString() {
        String s = "El contador inicialmente está a " + this.digit;
        return s;
    }
}