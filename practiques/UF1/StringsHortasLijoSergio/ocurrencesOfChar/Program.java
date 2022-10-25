/*
 * Program.java        4/2/22
 *
 * Cuenta las ocurrencias de un carácter en una cadena
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
    
    public int ocurrencesOfChar(char x, String str) {
        boolean isIt = false;        
        int longitud = str.length();
        int contador = 0;
        int i = 0;       
        // Pasamos todo a minúsculas
        String stringLower = str.toLowerCase();
        char minX = Character.toLowerCase(x);
        System.out.print("\n\n OCURRENCES OF CHAR \n\n");                
        // Con un bucle buscamos los carácteres y sumamos cada ocurrencia encontrada a un contador
        for (i = 0; i < longitud; i++ ) {  
            char character = stringLower.charAt(i);    
            if (character == minX) {
                contador++;
            }             
        }
        return contador;
    }
}
