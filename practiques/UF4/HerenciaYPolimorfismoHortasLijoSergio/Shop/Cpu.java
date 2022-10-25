/*
 * Program.java        13/4/22
 *
 * Crea la clase Cpu
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Cpu extends Product {
    
    /** Atributes */   
   
    private float speed;        
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Cpu (String code, String description, int units, float preuBase, float speed) {
        super(code, description, units, preuBase);
        this.speed = speed;        
    }
    
    /*
     * OTHER METHOS
     *      
     */
    
     /**
     * Gets the description
     *      
     */
    
    public float getSpeed() {
        return this.speed;
    }
    
    
     // Price
    
    public float price() {
    return getBasePrice() * this.speed;
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
     return super.toString() + "\nspeed: " + this.speed;
     }
    
    
}

