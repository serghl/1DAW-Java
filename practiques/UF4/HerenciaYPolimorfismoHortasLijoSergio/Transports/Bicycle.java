/*
 * Program.java        7/4/22
 *
 * Crea la clase Bicycle
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Bicycle extends Transport {
    
    /** Atributes */
    private int nGears;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Bicycle(String id, double speed) {
        super(id, speed);
    }
    
    /*
     * Constructor 
     */
    
    public Bicycle(String id, double speed, int nGears) {
        super(id, speed);
        this.nGears = nGears;
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the gears
     *      
     */
    
    public double getNGears() {
        return this.nGears;
    }
    
    public void setNGears(int nGears) {
        this.nGears = nGears;
    }
    
    /*
     * 
     * MORE METHODS
     * 
     */
    
    // COST 
    @Override
    public double cost(double distance) {
        return 0;
    }
    
    // Equals & hashCode
    /*
     * 
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
     */
    
    public String toString() {
        return "\nnGears : " + this.nGears;
    }
}

