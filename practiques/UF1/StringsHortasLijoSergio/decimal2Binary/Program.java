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
    
    /**
     * @param num an Int
     * 
     * @return an String
     */
    
    public String decimal2Binary(int num) {
        Program p = new Program();
        String resultado = "";        
        System.out.print("\n\n DECIMAL 2 BINARY \n\n");                
        // Con un bucle vamos sacando el residuo, añadiéndolo al String final        
        while (num > 0) {
            resultado += (num % 2);
            // Luego dividimos entre 2 para la siguiente iteración
            num = num / 2;        
        }
        // Le damos la vuelta
        resultado = p.reverse(resultado);
        return resultado;
    }
    
    public String decimal2Binary3(int num) {
        Program p = new Program();
        int i = 0, calc = 0;
        String binary = "";
        boolean end = false;
        System.out.print("\n\n DECIMAL 2 BINARY \n\n");                
        // Con un bucle vamos sacando el residuo, añadiéndolo al String final        
        while (num < 0) {
            num = num / 2;
            // con esto creamos el string invertido
            binary = num % 2 == 0 ? '0' + binary : '1' + binary;
        }
        
        return binary;
    }
    
    // Aqui con el propio metodo de toBinaryString
    public static String decimal2Binary2(int num) {
        return Integer.toBinaryString(num);    
    }
}
