/*
 * Program.java        8/2/22
 *
 * Determina si una cadena es subcadena de otra
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
    
    public void isSubstring(String str, String sub) {
        String reversedString = "";     
        int subIndex = 0;
        int longitud = str.length();
        int subStringSize = 0;
        int i = 0;
        char character;
        char characterSub;
        // Con un bucle buscamos los carácteres del subString
        for ( i = 0 ; i < longitud ; i++ ) {   
            // En caso de encontrar una coincidencia, sumamos a un contador y abrimos otro bucle    
            if (str.charAt(i) == sub.charAt(0)) {
                subStringSize++;
                for (int j = 1; j < sub.length(); j++) {
                    // Aqui con otro if, cortamos en caso de que no coincidan mas
                    if (sub.charAt(j) == str.charAt(i+j)) {
                        subStringSize++;                        
                    }                   
                }
            }
        }
        if (subStringSize == sub.length()) {
            System.out.printf("El Substring \"%s\" se encuentra dentro del String, en la posicion %d\n",sub,i);                               
        } else {
            System.out.println("El Substring no se encuentra dentro del String");                           
        }
    }
    /**
     * Esto con el indexOf
     * 
     * @param Str an String
     * @param sub an String
     * @return a boolean
     */
    public void isSubString2(String str, String sub) {        
        int posicion = str.indexOf(sub);
        System.out.printf("El substring - %s - se encuentra en el String - %s - en la posicion %d \n",sub,str,posicion);
        
    }   
}
