/*
 * Program.java        14/4/22
 *
 * Crea la clase SportBoatsWithMotor
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class SportBoatsWithMotor extends Boat {
    
    /** Atributes */       
    
    private int power;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
     public SportBoatsWithMotor(String regPlate, double length, int year, int power) {
       super(regPlate, length, year);
       this.power = power;
    }
    
        /**
     * Gets the Power
     *      
     */
    
    public int getPower() {
        return this.power;
    }
    /*
     * OTHER METHOS
     *      
     */
    
     // Price
    
     public double amountAccordingToBoat() {
     return this.power;
     }
            
}

