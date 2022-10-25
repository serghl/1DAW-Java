/*
 * Program.java        14/4/22
 *
 * Crea la clase LuxuryYatch
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class LuxuryYatch extends SportBoatsWithMotor {
    
    /** Atributes */   
    
    private int nCabins;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
     public LuxuryYatch (String regPlate, double length, int year, int nPower, int nCabins) {
       super(regPlate, length, year, nPower);
       this.nCabins = nCabins;
    }
    
    /*
     * OTHER METHOS
     *      
     */
    
     // Price
    
     public double amountAccordingToBoat() {
     return getPower() + this.nCabins;
     }
            
}

