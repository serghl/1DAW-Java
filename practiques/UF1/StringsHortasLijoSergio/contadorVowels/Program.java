/*
 * Program.java        31/1/22
 *
 * Cuenta las vocales de una cadena
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
    
    public int numberOfVowels(String str) {
        int contadorVowels = 0;
        char vowel;
        int longitud = str.length();
        String stringLower = str.toLowerCase();
        System.out.print("\n\n NUMBER OF VOWELS \n\n");                
        // Con un bucle buscamos los carácteres y sumamos cada ocurrencia encontrada a un contador
        for (int i = 0; i < longitud ; i++) {  
            vowel = stringLower.charAt(i);
            if (vowel == 'a' || vowel == 'e' ||
                vowel == 'i' || vowel == 'o' ||
                vowel == 'u') {
                contadorVowels++;
            }                   
        }
         return contadorVowels;
    }
}


