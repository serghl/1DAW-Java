/*
 * Program.java        28/10/21
 *
 * Determina si un nombre real és positiu, negatiu o zero
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    public String sign(double n){
        String x;
        // Declaramos una variable a devolver y aquí hacemos la formula
        if (n > 0) {
            x = "Positiu";
        } else if (n < 0){
            x = "Negatiu";
        } else {
            x = "Zero";
        }
        return x;
    }
}