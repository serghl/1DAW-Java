/*
 * Program.java        19/4/22
 *
 * Crea la clase UserOffer1
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class UserOffer1 extends UserWithOffer {
    
    /** Atributes */
    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    
    public UserOffer1 (String name, String dni, double priceMinute) {
       super(name, dni, priceMinute);
    }
    
    // Bill amount
    
    public double billAmount() {
        return 0;
    }
    
}