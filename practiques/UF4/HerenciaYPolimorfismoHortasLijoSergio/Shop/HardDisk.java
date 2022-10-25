/*
 * Program.java        13/4/22
 *
 * Crea la clase HardDisk
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class HardDisk extends Product {
    
    /** Atributes */   
   
    private float capacity;        
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public HardDisk(String code, String description, int units, float preuBase, float capacity) {
        super(code, description, units, preuBase);
        this.capacity = capacity;
    }
    
    /*
     * OTHER METHOS
     *      
     */
    
    public float price() {
    return getBasePrice() * this.capacity / 100 * 90;
    }
    
     /**
     * Gets the capacity
     *      
     */
    
    public float getCapacity() {
        return this.capacity;
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
     return super.toString() + "\ncapacity: " + this.capacity;
     }
    
    
}

