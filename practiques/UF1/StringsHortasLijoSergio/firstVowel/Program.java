/*
 * Program.java        31/1/22
 *
 * Encuentra la posicion de la primera vocal, si no hay retorna un espacio en blanco
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param i an String
     * 
     * @return a boolean
     */
    
    public String firstVowel(String str) {
        boolean found = false;
        ing longitud = str.length() 
        String respuesta;
        int posicion = -1;
        int i = 0;
        System.out.print("\n\n FIRST VOWEL \n\n");                
        // Con un bucle buscamos la vocal y la asignamos, parando el bucle al encontrar la primera
        while ( i < longitud && !found) {  
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
                str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                posicion = i;
                found = true;
            } else {
                i++;
            }
        }
        // Aqui damos el valor al String de retorno, dependiendo de la posicion de la vocal, si la hay
        if (posicion != -1) {
            respuesta = String.valueOf(posicion);
        } else {
            respuesta = " ";          
        }
        return respuesta;
    }
}


