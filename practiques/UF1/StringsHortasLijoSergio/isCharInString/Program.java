/*
 * Program.java        4/2/22
 *
 * Determina si un string contiene un carácter
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Arrays;

public class Program {
    
    /**
     * @param x a Char
     * @param Str an String
     * 
     * @return a boolean
     */
    
    public boolean isCharInString(char x, String str) {
        boolean isIt = false;
        boolean found = false;
        int longitud = str.length();
        int i = 0;       
        // Pasamos todo a minúsculas
        String stringLower = str.toLowerCase();
        char minuscX = Character.toLowerCase(x);
        System.out.print("\n\n IS CHAR IN STRING \n\n");                
        // Con un bucle buscamos los carácteres y cambiamos el booleano si lo encontramos
        while (i < longitud && !found) {  
            char character = stringLower.charAt(i);    
            if (character == minuscX) {
                found = true;
                isIt = true;
            } else {
                i++;
            }
        }
        return isIt;
    }
}
