/*
 * Program.java        9/2/22
 *
 * Fusiona dos Strings intercalando los ccarácteres
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
     * @param Str an String
     * @param Str2 an String
     * 
     * @return a mixed String
     */
    
    public String insertChars(String str, String str2) {    
        String stringFusion = "";
        char character, character2;        
        int longitud = str.length();        
        int longitud2 = str2.length();        
        // Ahora recorremos con la longitud del mayor
        System.out.println(longitud);
        for (int i = 0; i < longitud || i < longitud2; i++) {
            character = str.charAt(i);
            character2 = str2.charAt(i);
            if (i <= str.length()) {
            stringFusion = stringFusion + Character.toString(character);
            }
            if (i <= str2.length()) {
            stringFusion = stringFusion + Character.toString(character2);
            }
        }
        return stringFusion;
    }
}