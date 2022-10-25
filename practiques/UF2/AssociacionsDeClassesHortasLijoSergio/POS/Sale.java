/*
 * Program.java        19/3/22
 *
 * Crea la clase Sale
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.HashSet;

public class Sale {
    
    /** Atributes */
    private int code;
    private String dateTime;
    private HashSet<SaleLine> saleLines;
    
    
// CONSTRUCTORS
    
    /*
     * Constructor by default.
     * 
     */
    public Sale() {
        this.code = 0;        
    }
    
    /*
     * Constructor 
     */
    
   public Sale(int code, String dateTime) {
        this.code = code;
        this.dateTime = dateTime;
        this.saleLines = new HashSet<SaleLine>();
    }
        
    /**
     * Getters y setters
     */
    
     
    
    /**
     * Gets the number of axles
     *      
     
    
    public int getNAxles() {
        return nAxles;
    }
    
    public void setNAxles(int nAxles) {        
        this.nAxles = nAxles;
    }
    
    */
   
   // MOTE METHODS
   
   // ADD
   
   public boolean add (SaleLine sl) {
       return this.saleLines.add(sl);
   }
   
   // REMOVE
   
   public boolean remove (SaleLine sl) {
       return this.saleLines.remove(sl);
   }
   
   // Total Amount
   
   public double totalAmount () {
       double amount = 0;
       for (SaleLine s : saleLines) {
           amount += s.getProduct().getPrice() * s.getNup();
       }
       return amount;
   }
    
    // Equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == 0) ? 0 : code % 5);
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
        Sale other = (Sale) obj;
        if (code == 0) {
            if (other.code!= 0)
                return false;
        } else if (code != other.code)
            return false;
        return true;
    }
    
    public String toString() {
        return "\ncode: " + this.code + "\ndateTime: " + this.dateTime ;
    }
}

