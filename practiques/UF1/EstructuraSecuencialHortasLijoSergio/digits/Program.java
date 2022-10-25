/*
 * Program.java        11/10/21
 *
 * Calcular una position en una secuencia de enteros
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param n an int
     * @param p an int
     * @return the number of the positon
     * 
     */
    public int digitPosition (int n, int p) {
        // Definimos las variables 
        int x;
        int last;
        // Limpiamos las posiciones de la derecha
        x = n / (int)Math.pow(10, p -1);
        // Sacamos el residuo entre 10, que nos descarta el último número
        last = x % 10;
        return last;
    }
}