/*
 * Program.java        14/4/22
 *
 * Crea la clase SailBoat
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class SailBoat extends SportBoatsWithoutMotor {
    
    /** Atributes */   
    
    private int nMasts;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
     public SailBoat (String regPlate, double length, int year, int nMasts) {
       super(regPlate, length, year);
       this.nMasts = nMasts;
    }
    
    /*
     * OTHER METHOS
     *      
     */
    
     // Price
    
     public double amountAccordingToBoat() {
     return this.nMasts;
     }
            
}

