/*
 * Program.java        9/2/22
 *
 * Calcula la letra de un dni
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Arrays;

public class Program {
    
    /**
     * @param str an int
     * 
     * @returns an String
     */
    public String dni2nif(int str) {                 
        // Iniciamos variables
        String nif = Integer.toString(str);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraActual = ' ';
        int residuo = str % 23;
        // Buscamos la posicion del residuo en el string de letras
        letraActual = letras.charAt(residuo);
        // Le asginamos la letra al resultado final
        nif += letraActual; 
     return nif;   
    }
}
