/*
 * Program.java        21/12/21
 *
 * Ordena un array de Strings
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
     * @param int[]a an array of Strings
     * 
     * @return a boolean
     */
    
    public String[] sortWords(String[] a) {
                
        int i = 0;
        System.out.print("\n\n SORT WORDS \n\n");                
        // 
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


