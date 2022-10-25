/*
 * Program.java        2/2/22
 *
 * Determina si un array tiene sólo dígitos
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
     * @param i an String
     * 
     * @return a boolean
     */
    
    public int onlyDigits(String str) {
        boolean digits = true;
        boolean found = false;
        int longitud = str.length();
        int i = 0;
        int n = 0;
        
        System.out.print("\n\n ONLY DIGITS \n\n");                
        // Con un bucle buscamos los carácteres y sumamos cada ocurrencia encontrada a un contador
        while (i < longitud && !found) {  
            char charI = str.charAt(i);    
            if (charI == '1' || charI == '2'|| charI == '3' || charI == '4'
                    || charI == '5' || charI == '6' || charI == '7' || charI == '8'
                    || charI == '9' || charI == '0' || charI == ' ') {
                i++;
            } else {
                found = true;
                digits = false;
            }
        }
        if (digits) {
            n = Integer.parseInt(str);
        } else {
            n = -1;
        }
        return n;
    }
}
