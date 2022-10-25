/*
 * Program.java    13/4/22
 *
 * Crea la clase Boat
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.time.LocalDateTime;

public abstract class Boat {
    
    /** Atributes */
    private String regPlate;
    private double length;
    private int year;
    
    // CONSTRUCTORS
        
    /*
     * Constructor 
     */
    
    public Boat(String regPlate, double length, int year) {
        this.regPlate = regPlate;
        this.length = length;
        this.year = year;
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the regPlate
     *      
     */
    
    public String getRegPlate() {
        return this.regPlate;
    }
    
     /**
     * Gets the year
     *      
     */
    
    public int getYear() {
        return this.year;
    }
    
    /**
     * Gets the length
     *      
     */
    
    public double getLength() {
        return this.length;
    }
    
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Get the fee
    
    public abstract double amountAccordingToBoat();
    
    // Get the base amount
    
    public double baseAmount() {
    double amount = amountAccordingToBoat() + (this.length * 10);
    return amount;
    }
     
    // Equals & hashCode    
        
     @Override
     public int hashCode() {
     final int prime = 31;
     int result = 1;
     result = prime * result + ((regPlate == null) ? 0 : regPlate.hashCode());
     return result;
     }
     
     @Override
     public boolean equals(Object obj) {
     if (this == obj)
     return true;
     if (obj == null)
     return false;
     if (getClass() != obj.getClass())
     return false;
     Boat other = (Boat) obj;
     if (regPlate == null) {
     if (other.regPlate != null)
     return false;
     } else if (regPlate != other.regPlate)
     return false;
     return true;
     }
    
    
    public String toString() {
        return "\nregPlate : " + this.regPlate + "\nlength : " + this.length + "\nyear : " + this.year;
    }
}

