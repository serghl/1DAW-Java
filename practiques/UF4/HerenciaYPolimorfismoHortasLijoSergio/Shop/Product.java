/*
 * Program.java    13/4/22
 *
 * Crea la clase Vehicle
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public abstract class Product {
    
    /** Atributes */
    private String code;
    private String description;
    private int units;
    private float basePrice;
    
    // CONSTRUCTORS
        
    /*
     * Constructor 
     */
    
    public Product(String code, String description, int units, float basePrice) {
        this.code = code;
        this.description = description;
        this.units = units;
        this.basePrice = basePrice;
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the code
     *      
     */
    
    public String getCode() {
        return this.code;
    }
    
     /**
     * Gets the description
     *      
     */
    
    public String getDescription() {
        return this.description;
    }
    
    /**
     * Gets the units
     *      
     */
    
    public int getUnits() {
        return this.units;
    }
    /**
     * Gets the units
     *      
     */
    
    public float getBasePrice() {
        return this.basePrice;
    }
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Get the fee
    
    public abstract float price();
     
    // Equals & hashCode    
    
    
     @Override
     public int hashCode() {
     final int prime = 31;
     int result = 1;
     result = prime * result + ((code == null) ? 0 : code.hashCode());
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
     Product other = (Product) obj;
     if (code == null) {
     if (other.code != null)
     return false;
     } else if (code != other.code)
     return false;
     return true;
     }
    
    
    public String toString() {
        return "\ncode : " + this.code + "\ndescription : " + this.description + "\nunits: " + this.units
          +  "\nbasePrice : " + this.basePrice;
    }
}

