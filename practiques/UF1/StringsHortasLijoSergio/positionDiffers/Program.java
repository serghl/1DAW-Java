/*
 * Program.java        8/2/22
 *
 * Determina en que punto discrepan dos Strings
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Arrays;

public class Program {
    
    /**
     * @param str an string
     * @param str2 an String
     * 
     * @returns an String
     */
    public int positionDiffers(String str, String str2) {        
        int position = -1;
        char character, character2;   
        int i = 0;
        boolean found = false;
        // Primero comparamos ambos tamaños
        if (str.length() == str2.length()) {
            while (i < str.length() && !found) {
                character = str.charAt(i);
                character2 = str2.charAt(i);
                if (character != character2) {
                    position = i;
                    found = true;
                } else {
                    i++;
                }           
            }
        } else {
            System.out.print("Los Strings tienen distinto tamaño \n");
            position = 0;
        }
        return position;    
    }
}
