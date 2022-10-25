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
     * @param sub an String
     * 
     * @returns an String
     */
    public void withoutString(String str, String sub) {        
        String stringCortado = "";      
        // En caso de encontrar el subString, lo recortamos con el replaceFirst (el replace original 
        // quitaria todas las ocurrencias)
        stringCortado = str.replaceFirst(sub,"");        
        System.out.println(stringCortado);
    }
}
