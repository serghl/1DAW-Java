/*
 * Program.java        7/4/22
 *
 * Crea la clase Student
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class InternationalStudent extends Student {
    
    /** Atributes */
    private String country;    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public InternationalStudent() {
        super();        
    }
    
    /*
     * Constructor 
     */
    
    public InternationalStudent (String name) {
        super (name);
        this.country = country;        
    }
        
    /**
     * Getters y setters
     */
    
    /**
     * Gets the cycle
     *      
     */
    
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
               
    // Equals & hashCode
    /* 
     
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
        Person other = (Person) obj;
        if (name == null) {
            if (other.name!= null)
                return false;
        } else if (name != other.name)
            return false;
        return true;
    }
    */
    
    public String toString() {
        return super.toString() + "\ncountry : " + this.country ;
    }
}

