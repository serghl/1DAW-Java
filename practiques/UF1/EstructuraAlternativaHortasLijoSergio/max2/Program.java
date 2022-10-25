/*
 * Program.java        27/10/21
 *
 * Calcula el numero máximo entre dos números reales
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    public double max2(double n1, double n2){
        double max;
        // Declaramos una variable a devolver y aquí hacemos la formula
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        return max;
    }
}