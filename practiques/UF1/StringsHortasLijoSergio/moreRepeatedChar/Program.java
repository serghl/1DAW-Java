/*
 * Program.java        9/2/22
 *
 * Pasa un String a mayúsculas
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
     * 
     * @returns an String
     */
    public String[] moreRepeatedChar(String str) {                 
        String[] moreRepeats = new String [2];
        int max = 0;
        int contador = 0;
        int contadorMax = 0;
        int longitud = str.length();
        char character = ' ';
       // Recorremos un bucle dentro de otro en búsqueda de repeticiones
        for (int i = 0; i < longitud ; i++) {
            // Variables de caracter I
            char charI = str.charAt(i);  
            for (int j = 0; j < longitud; j++) {
       // Variable de caracter J
                char charJ = str.charAt(j);
        // Aqui buscamos repeticiones y sumamos al contador
                if (charJ == charI) {
                    contador++;
                }
            }
            if (contador > max) {
                character = charI;
            }
        } 
        // Ahora contamos las veces que se repite el carácter
        for (int i = 0; i < longitud; i++) {
            char charI = str.charAt(i); 
            if (charI == character) {
                contadorMax++;
            }
        }
        // Asignamos los valore y retornamos el Array
        moreRepeats[0] = Integer.toString(contadorMax);
        moreRepeats[1] = Integer.toString((int)character);
        System.out.println("Rep , ASCII");
        return moreRepeats;
    }
}
