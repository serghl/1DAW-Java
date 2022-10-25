/*
 * Program.java        8/10/21
 *
 * A partir de un numero entero de horas, otro de minutos y otro de segundos, calcula los segundos totales
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param horas an in
     * @param minutos an int
     * @para segundos an int
     * @return the total of segundos 
     */
    public int hms2s (int horas, int minutos, int segundos) {
        // Declaramos las variables
        int segTotal;
        // Pasamos todo a segundos
        segTotal = ((horas * 3600) + (minutos * 60) + segundos);
        
        return segTotal;
    }
}