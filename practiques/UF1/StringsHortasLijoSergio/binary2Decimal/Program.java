/*
 * Program.java        8/2/22
 *
 * Calculadora de Decimal a Binario
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
    
    public int binary2String(String num) {
        int stringLength = num.length();
        int resultado = 0; 
        int counter = 0;
        System.out.print("\n\n BINARY 2 DECIMAL \n\n");                
        // Con un bucle vamos sacando el residuo, añadiéndolo al String final        
        for (int i = num.length() -1; i >= 0; i--) {
            if (num.charAt(i) == '1') {
                resultado += (int)Math.pow(2,stringLength -i -1);
            }
        }
        return resultado;
        
    }    
}

