/*
 * Program.java        8/4/22
 *
 * Crea la clase Person
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public abstract class Area {
    
    /** Atributes */
    private String code;
    private double surfaceArea;
    private boolean naturalLight;
    private double consumption; // In KwH
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Area() {
        this.code= "";            
    }
    
    /*
     * Constructor 
     */
    
    public Area(String code, double surfaceArea, boolean naturalLight, double consumption) {
        this.code = code;
        this.surfaceArea = surfaceArea;
        this.naturalLight = naturalLight;
        this.consumption = consumption;
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
    
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Gets the Surface Area
     * 
     */
    
    public Double getSurfaceArea() {
        return this.surfaceArea;
    }
    
    public void setSurfaceArea(Double surfaceArea) {        
        this.surfaceArea = surfaceArea;
    }            
    
      /**
     * Gets the Consumption
     * 
     */
    
    public double getConsumption() {
        return this.consumption;
    }
    
    public void setConsumption(Double consumption) {        
        this.consumption = consumption;
    } 
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Get the consumption per m2
    
    public double consumptionM2() {
        return this.consumption / this.surfaceArea;
    }
    
    
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
        Area other = (Area) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (code != other.code)
            return false;
        return true;
    }
    
    
    public String toString() {
        return "\ncode : " + this.code + "\nsurfaceArea: " + this.surfaceArea + "\nnaturalLight : " + 
            this.naturalLight + "\nconsumption : " + this.consumption;
    }
}

