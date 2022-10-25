/*
 * Program.java        19/4/22
 *
 * Crea la clase UserWithoutOffer
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class UserWithoutOffer extends User {
    
    /** Atributes */
    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    
    public UserWithoutOffer (String name, String dni, double priceMinute) {
       super(name, dni, priceMinute);
    }
    
    // Bill amount
    
    public double billAmount() {
        return 0;
    }
    
}