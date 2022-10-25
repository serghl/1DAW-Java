/*
 * Program.java        14/4/22
 *
 * Crea la clase SportBoatsWithoutMotor
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class SportBoatsWithoutMotor extends Boat {
    
    /** Atributes */       
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
     public SportBoatsWithoutMotor(String regPlate, double length, int year) {
       super(regPlate, length, year);
    }
    
    /*
     * OTHER METHOS
     *      
     */
    
     // Price
    
     public double amountAccordingToBoat() {
     return 0;
     }
            
}

