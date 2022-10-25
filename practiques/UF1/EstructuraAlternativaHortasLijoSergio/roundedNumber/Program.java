/*
 * Program.java        28/10/21
 *
 * Redondea un número doble, con el número en si y el número de decimales que redondeamos
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    public double round(double a, int nd){
        int u, y;        
        // Aqui movemos la coma
        double x = a * Math.pow(10, nd+1);
        // Convertimos a int para quitar decimales
        y = (int) x;
        // Get the digits of unit
        u = y % 10;
        y = y / 10;
        if (u >= 5) {
            y = y + 1;
        }
        // Devolver los decimales
        x = y / Math.pow(10, nd);
        return x;
    }
}
