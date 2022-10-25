/*
 * Program.java        8/2/22
 *
 * Cuenta las ocurrencias de un string dentro de otro string
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
     * @param Str2 an String
     * 
     * @return an int
     */
    
    public void ocurrencesOfString(String str, String str2) {
        int index = 0;
        int contador = 0;
        // Hacemos un ciclo que pare si el indexOf devuelve -1
        while (index != -1) {
            index = str.indexOf(str2, index);
            // Si encuentra, sumamos uno al contador y saltamos la cantidad de carácteres que contenga el substr
            if (index != -1) {
                contador++;
                index += str2.length();
            }
        }
        // Printamos
         System.out.println(contador);   
    }
}
