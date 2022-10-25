/*
 * Program.java        7/2/22
 *
 * Invierte un string y define si es un palíndromo
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
        // Con un bucle buscamos los carácteres y los sumamos al string final
        for ( int i = 0 ; i < longitud ; i++ ) {  
            character = str.charAt(i);    
            reversedString = character + reversedString;           
        }
        return reversedString;
    }
     /**
     *
     * @param Str an String
     * 
     * @return a boolean
     */
    
    public boolean isPalindrome(String str1) {
        // Llamaremos a un metodo anterior
        Program p = new Program();
        boolean found = false;
        boolean isPal = true;
        // Definimos longitudes
        int longitud = str1.length();
        // Creamos un string inverso
        String str2 = p.reverse(str1);
        int i = 0;
        // Recorremos los strings comparando los carácteres, con un ciclo de búsqueda
        while (i < longitud && !found) {
            if (str1.charAt(i) != str2.charAt(i)) {
                found = true;
                isPal = false;
            } else {
                i++;
            }
        }
    return isPal;
    }
}
