/*
 * Program.java        19/3/22
 *
 * Crea la clase SaleLine
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.HashSet;

public class SaleLine {
    
    /** Atributes */
    private int nup;
    private Product product;        
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     * 
     */
    public SaleLine() {
        this.nup = 0;
        this.product = null;
    }
    
    /*
     * Constructor 
     */
    
   public SaleLine(int nup, Product product) {
        this.nup = nup;
        this.product = product;        
    }
        
    /**
     * Getters y setters
     */
    
     
    
    /**
     * Gets the number of axles
     */      
     
    
    public int getNup() {
        return nup;
    }
    
    public void setNup(int nup) {        
        this.nup = nup;
    }
    
    /**
     * Gets the product
     */      
     
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {        
        this.product = product;
    }
    
    
    // Equals & hashCode
    
    // CHEQUEAR ESTO, YA QUE NO HAY "CLAVE PRIMARIA"
    
    /*
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Product == null) ? 0 : Product.hashCode());
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
        if (Product == null) {
            if (other.Product != null)
                return false;
        } else if (Product != other.Product)
            return false;
        return true;
    }
    */
    
    public String toString() {
        return "\nnup : " + this.nup + "\nProduct: " + this.product ;
    }
}

