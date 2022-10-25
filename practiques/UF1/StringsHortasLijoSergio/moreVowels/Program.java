/*
 * Program.java        31/1/22
 *
 * Determina si un array tiene más vocales que otros carácteres
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
     * @param i an String
     * 
     * @return a boolean
     */
    
    public void numberOfVowels(String str) {
        // Definimos unos contadores para comparar
        int contadorVowels = 0;
        int contadorRest = 0;
        // Pasamos a minúsculas
        String newStr = str.toLowerCase();
        longitud = str.length();
        System.out.print("\n\n MORE VOWELS \n\n");                
        // Con un bucle buscamos los carácteres y sumamos cada ocurrencia encontrada a un contador
        for (int i = 0; i < longitud ; i++)  
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                str.charAt(i) == 'u') {
            contadorVowels++;
        } else {
            contadorRest++;            
        }
        // Ahora comparamos los contadores y printamos resultado
        if (contadorVowels > contadorRest) {
            System.out.print("La mayoría son vocales");
        } else if (contadorVowels < contadorRest) {
            System.out.print("La mayoria son otros carácteres");
        } else {
            System.out.print("Hay tantas vocales como del resto de carácteres");
        }
    }
}
