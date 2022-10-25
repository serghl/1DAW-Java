/*
 * Program.java        28/11/21
 *
 * Escribe cuantas veces se repite un dígito en un numero entero
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
    public int occurrences (int n, int d) {
        int rep = 0;
        int temp = n;        
        // Creamos un bucle que pare al llegar a 0
        while (temp > 0) {
        // Si el residuo es igual al digito que se pide, sumamos uno y restamos una cifra
            if (temp % 10 == d) {
                rep++;
                temp = temp / 10;
        // De otra manera, sólo restamos dígitos
            } else {
                temp = temp / 10;
            }
        }
        return rep;
    }
}




