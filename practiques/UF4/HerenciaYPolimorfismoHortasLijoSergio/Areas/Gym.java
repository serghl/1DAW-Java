/*
 * Program.java        11/4/22
 *
 * Crea la clase Gym
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Gym extends Classroom{
    
    /** Atributes */
    private boolean showers;
    private int nStands;
    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Gym(String code, double surfaceArea, boolean naturalLight, double consumption, 
                      int capacity, boolean showers, int nStands) {
        super(code, surfaceArea, naturalLight, consumption, capacity);
        this.showers = showers;
        this.nStands = nStands;
    }
    
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the Showers
     *      
     */
    
    public boolean getShowers() {
        return this.showers;
    }
    
    public void setShowers(boolean showers) {
        this.showers = showers;
    }
    
    /**
     * Gets the number of Stands
     *      
     */
    
    public int getNStands() {
        return this.nStands;
    }
    
    public void setNStands(int nStands) {
        this.nStands= nStands;
    }
    
    /*
     * 
     * OTHER METHODS
     *
     */
    @Override
    public double surfaceAreaStudent() {
        return (getSurfaceArea() - this.nStands) / getCapacity();
    }
    
    // Equals & hashCode    
    /*
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
     
     */
    public String toString() {
        return super.toString() + "\nShowers : " + this.showers + "\nnStands: " + this.nStands ;
    }
    
}

