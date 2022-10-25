/*
 * Program.java        21/12/21
 *
 * Determina si un array es una secuencia creciente
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Arrays;

public class Program {
    
    /**
     * 
     * @param int[]a an array of int
     * 
     * @return a boolean
     */
    public boolean areSorted(int[] a) {
        boolean areSorted = true;
        boolean found = false;        
        int i = 0;
        System.out.print("\n\n Are Sorted \n\n");                
        // Creamos un bucle de búsqueda que corte cuando encuentre un no,secuencual
        while (i < a.length - 1 && !found) {
            if (a[i] >= a[i+1]) {
                found = true;
                areSorted = false;
            } else {
                i++;
            }
        }        
        return areSorted;
    }
}


