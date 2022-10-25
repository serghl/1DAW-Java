/*
 * Program.java        11/4/22
 *
 * Crea la clase Laboratory
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Computing extends Classroom{
    
    /** Atributes */
    private int nPrinters;
    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Computing (String code, double surfaceArea, boolean naturalLight, double consumption, 
                      int capacity, boolean chairTable, int nComputers, boolean networkConn, int nPrinters) {
        super(code, surfaceArea, naturalLight, consumption, capacity, chairTable, nComputers, networkConn);
        this.nPrinters = nPrinters;
    }
    
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the number of nBunsen
     *      
     */
    
    public int getNPrinters() {
        return this.nPrinters;
    }
    
    public void setNPrinters(int nPrinters) {
        this.nPrinters = nPrinters;
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
        return super.toString() + "\nnPrinters : " + this.nPrinters;
    }
    
}

