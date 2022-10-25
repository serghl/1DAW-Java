/*
 * Program.java        7/4/22
 *
 * Crea la clase abstracta Transport
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public abstract class Transport {
    
    /** Atributes */
    private String id;
    private double speed;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Transport() {
        this.id= "";
        this.speed = 1;        
    }
    
    /*
     * Constructor 
     */
    
    public Transport(String id, double speed) {
        this.id = id;
        this.speed = speed;
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the Speed
     *      
     */
    
    public double getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    /**
     * Gets the id
     * 
     */
    
    public String getId() {
        return this.id;
    }
    
    /*
     * 
     * MORE METHODS
     * 
     */
    
    // COST 
    
    public abstract double cost(double distance);
    
    // TIME 
    
    public double time(double distance) {
        return distance/speed;
    }
    
    // Equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Transport other = (Transport) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (id != other.id)
            return false;
        return true;
    }
    
    
    public String toString() {
        return "\nid : " + this.id+ "\nspeed : " + this.speed;
    }
}

