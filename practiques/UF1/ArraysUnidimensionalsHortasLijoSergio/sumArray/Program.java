/*
 * Program.java        3/12/21
 *
 * Suma una cadena de arrays
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param args not used
     * 
     */
    
    public double sumArray (double[]a) {
        double suma = 0;
        System.out.print("\n\n SUMA DE UN ARRAY \n\n");        
        // Iterate the array and sum each element
        for (int i = 0; i < a.length; i++) {      
            suma = suma + a[i];
        }                            
        return suma;
    }
}
