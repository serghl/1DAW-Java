/*
 * Program.java        7/4/22
 *
 * Crea la clase Teacher
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.HashSet;

public class Teacher extends Person {
    
    /** Atributes */
    private HashSet<String> subjects;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Teacher() {
        super();        
    }
    
    /*
     * Constructor 
     */
    
    public Teacher(String name) {
        super(name, address);        
        this.subjects = new HashSet<String>();
    }
    
    /**
     *
     * OTHER METHODS
     */
    
    // ADD SUBJECT
    
    public boolean addSubject(String subject) {
        return this.subjects.add(subject);
    }
    
    // REMOVE SUBJECT
    
    public boolean removeSubject(String subject) {
        return this.subjects.remove(subject);
    }
        
    // Equals & hashCode
    /* 
     * 
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
        return super.toString() + "\nsubjects : " + this.subjects;
    }
    
}

