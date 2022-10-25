/*
 * Program.java        8/10/21
 *
 * Calcula la media aritmética de 3 números enteros
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param a an int
     * @param b an int
     * @param c an int
     * @return the average
     */
    public int average (int a, int b, int c) {
        // Declaramos la variable average
        int average;
        // Asignamos la suma de base y altura, partida por dos, a la variable area.
        average = (a + b + c) / 3;
        
        return average;
    }
}