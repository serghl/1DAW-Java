/*
 * Program.java        13/10/21
 *
 * Calcula el valor en metros, de una distancia expresada en millas
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param miles an double
     * @return the distance in meters
     * 
     */
    public double miles2meters (double miles) {
        double meters = miles * 1852;
        return meters;
    }
}