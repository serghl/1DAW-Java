/*
 * Program.java    12/4/22
 *
 * Crea la clase Vehicle
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public abstract class Vehicle {
    
    /** Atributes */
    private String regPlate;
    protected int power;
    
    // CONSTRUCTORS
    
    
    /*
     * Constructor 
     */
    
    public Vehicle(String regPlate, int power) {
        this.regPlate = regPlate;
        this.power = power;
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
     * Gets the power
     *      
     */
    
    public int getPower() {
        return this.power;
    }
        
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Get the fee
    
    public abstract double calculateFee();
     
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
     Vehicle other = (Vehicle) obj;
     if (regPlate == null) {
     if (other.regPlate != null)
     return false;
     } else if (regPlate != other.regPlate)
     return false;
     return true;
     }
    
    
    public String toString() {
        return "regPlate : " + this.regPlate + "\npower: " + this.power;
    }
}

