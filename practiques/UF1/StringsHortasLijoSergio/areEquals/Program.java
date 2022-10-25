/*
 * Program.java        7/2/22
 *
 * Calcula si dos Strings tienen el mismo tamaño (Equals casero)
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Arrays;

public class Program {
    
    /**
     * @param Str an String
     * 
     * @return a boolean
     */
    
    public boolean areEquals(String str, String str2) {
        boolean equals = true;
        int longitud = str.length(); 
        int longitud2 = str2.length();
        System.out.print("\n\n ARE EQUALS \n\n");                
        // Con un bucle buscamos los carácteres y sumamos cada ocurrencia encontrada a un contador
        if (longitud == longitud2) {
            for (int i = 0; i < longitud; i++ ) {  
                char character = str.charAt(i); 
                char character2 = str2.charAt(i);
                if (character != character2) {
                    equals = false;
                }             
            }            
        } else {
            System.out.println("Los Strings tienen tamaños diferentes");
            equals = false;
        }
        return equals;
    }
}
