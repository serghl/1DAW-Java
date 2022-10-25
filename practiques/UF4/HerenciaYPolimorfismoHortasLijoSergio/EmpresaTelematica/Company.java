/*
 * Program.java        19/4/22
 *
 * Crea la clase Company
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.HashSet;

public class Company{
    
    /** Atributes */
    
    private HashSet<User> users;        
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Company () {
        this.users = new HashSet<User>();
    }
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Calculate the minutes of the connection
    
    public boolean add (User u) {
        boolean found = false; 
        for (User x : this.users) {
            if (x.equals(u)) {
                found = true;
            }
        }
        if (!found) {
            return this.users.add(u);
        } else {
            System.out.print("El user ya se encuentra en la compañia");
            return false;
        }    
    }
}
    
