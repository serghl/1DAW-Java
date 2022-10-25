/*
 * Program.java        22/3/22
 *
 * Crea la clase Catalog
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.HashSet;

public class Catalog {
    
    /** Atributes */    
    private String name;
    private HashSet<Product> products;
    
    
// CONSTRUCTORS
    
    /*
     * Constructor by default.
     * 
     */
    public Catalog() {
        this.name = "";        
        this.products = new HashSet<Product>();
    }
    
    /*
     * Constructor 
     */
    
    public Catalog(String name) {
        this.name = name;        
        this.products = new HashSet<Product>();
    }
    
    /**
     * OTHER METHODS
     */
    
    
    
    /**
     * ADD        
     */
    
    public boolean add (Product product) {
        return this.products.add(product);
    }
    
    /**
     * REMOVE        
     */
    
    public boolean remove (Product product) {
        return this.products.remove(product);
    }
    
    /**
     * SEARCH        
     */
    
    public Product search (int ean) {
        Product searched = null;
        for (Product p : products) {
            if (p.getEan() == ean) {
                searched = p;
            }
        }
        return searched;
    }
    
    /**
     * NUMBER OF PRODUCTS        
     */
    
    public int productsNumber() {
        return this.products.size();
    }            
    
    // Equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Catalog other = (Catalog) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (name != other.name)
            return false;
        return true;
    }
    
    public String toString() {
        return "\nname: " + this.name ;
    }
}

