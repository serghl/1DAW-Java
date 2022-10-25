/*
 * Program.java        22/3/22
 *
 * Crea la clase Product
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Product {
    
    /** Atributes */
    private int ean;
    private String description;
    private String brand;
    private double price;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Product() {
        this.ean = 0;
        this.description = "";
        this.price = 0;
    }
    
    /*
     * Constructor 
     */
    
    public Product(int ean) {
        this.ean = ean;
        this.description = "";
        this.price = 0;
    }
    
    /*
     * Constructor 
     */
    
    public Product(int ean, String description, String brand, double price) {
        this.ean = ean;
        this.description = description;
        this.brand = brand;
        this.price = price;
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the regnumber
     *      
     */
    
    public int getEan() {
        return this.ean;
    }
    
    public void setEan(int ean) {
        this.ean= ean;
    }
    
    /**
     * Gets the weight
     * 
     */
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {        
        this.price = price;
    }        
    
    /**
     * MORE METHODS
     *      
     */
   
    
    // Equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ean == 0) ? 0 : ean % 5);
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
        if (ean == 0) {
            if (other.ean!= 0)
                return false;
        } else if (ean != other.ean)
            return false;
        return true;
    }
    
    public String toString() {
        return "\nean : " + this.ean + "\ndescription: " + this.description+ "\nbrand: " + this.brand +
            "\nprice : " + this.price ;
    }
}

