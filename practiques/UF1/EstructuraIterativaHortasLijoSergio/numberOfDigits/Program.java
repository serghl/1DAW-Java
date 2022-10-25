/*
 * Program.java        22/11/21
 *
 * Averigua la cantidad de dígitos que tiene un número entero
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     * @n1 an int to be add
     *  
     */ 
    public int numberOfDigits (int n1) {
        int longitud = 0;
        int i = n1;
        // Creamos un ciclo while en el que sumamos unidades a la variable longitud, siempre y cuando no sea 0 
        while (i != 0)  {
            longitud++;
        // Aqui vamos quitando dígitos hasta llegar a cero
            i = i / 10;
        }        
        return longitud ;    
    }
}




