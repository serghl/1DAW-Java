/*
 * Program.java        9/2/22
 *
 * Pasa un String a mayúsculas
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
     * 
     * @returns an String
     */
    public String toUpper(String str) {                 
        return str.toUpperCase();
    }
    
    /**
     * @param str an string
     * 
     * @returns an String
     */
    public String toUpper2(String str) {                 
        String upper = "";        
        // Recorremos el bucle en búsqueda de minusculas
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            // Aqui buscamos minusculas 
            if (character >= 'a' || character <= 'z') {
               // Pasamos a mayusculas y añadimos al String
                upper += (char)(character - 32);
            }
        }
        return upper;
    }
}
