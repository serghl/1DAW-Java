/*
 * Program.java       11/2/22
 *
 * Numero de palabras en un String (uso de split)
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
    // Con expresiones regulare
    public void numberOfWords (String str) {
        int nOfWords = 0;                
        System.out.print("\n\n NUMBER OF WORDS \n\n");                
        // Con un bucle vamos sacando el residuo, añadiéndolo al String final        
        String[] words = str.split("\\s+");
        nOfWords = words.length;
        System.out.printf("El string contiene %d palabras", nOfWords);        
    }
    // Sin ellas
    public void numberOfWords2 (String str) {
        int nOfWords = 1;
        char character;
        System.out.print("\n\n NUMBER OF WORDS 2 \n\n");                
        // Con un bucle vamos sacando el residuo, añadiéndolo al String final        
        for (int i = 1; i < str.length(); i++ ) {
            character = str.charAt(i);
            if (character == ' ') {
                nOfWords++;
            }
            
        }
        System.out.print(nOfWords);
    }
}

