/*
 * Program.java        1/2/22
 *
 * Busca si una cadena contiene las 5 vocales
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param str an String
     * 
     * @return a boolean
     */
    
    public boolean allVowels(String str) {
        boolean fiveVowels = true; 
        String stringLower = str.toLowerCase();
        int[] arrayVocales = new int[5];
        int longitud = str.length(); 
        int i = 0;
        System.out.print("\n\n ALL VOWELS \n\n");                
        // Con un bucle buscamos la vocal y cambiamos a 1 la correspondiente posicion del array de int        
        for ( i = 0; i < longitud; i++) {  
            // Importante declarar esta variable dentro del for
            char vowel = stringLower.charAt(i);
            if (vowel == 'a') {
                arrayVocales[0] = 1;
            } else if (vowel == 'e') {
                arrayVocales[1] = 1;
            } else if (vowel == 'i') {
                arrayVocales[2] = 1;
            } else if (vowel == 'o') {
                arrayVocales[3] = 1;
            } else if (vowel == 'u') {
                arrayVocales[4] = 1;
            }
        }
        // Ahora chequeamos las posiciones a 1, para comprobar las vocales
        for (i = 0; i < 5; i++) {
            if (arrayVocales[i] != 1) {
                fiveVowels = false;
            }
        }
        return fiveVowels;
    }        
}



