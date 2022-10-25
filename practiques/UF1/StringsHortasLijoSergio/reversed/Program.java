/*
 * Program.java        7/2/22
 *
 * Invierte un string
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
     * 
     * @return a reversedString
     */
    
    public String reverse(String str) {
        String reversedString = "";     
        int longitud = str.length();
        char character;              
        System.out.print("\n\n REVERSE \n\n");                
        // Con un bucle buscamos los carácteres y los sumamos al string final
        for ( int i = 0 ; i < longitud ; i++ ) {  
            character = str.charAt(i);    
            reversedString = character + reversedString;           
        }
        return reversedString;
    }
}
