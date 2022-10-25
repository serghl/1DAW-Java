/*
 * Program.java        7/4/22
 *
 * Crea la clase Person
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Person {
    
    /** Atributes */
    private String name;
    private String address;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Person() {
        this.name= "";
        this.address = "";        
    }
    
    /*
     * Constructor 
     */
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
       
    /**
     * Getters y setters
     */
    
    /**
     * Gets the name
     *      
     */
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the address
     * 
     */
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {        
        this.address = address;
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
        return "\nname : " + this.name + "\naddress: " + this.address;
    }
}

