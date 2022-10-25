/*
 * Program.java        13/10/21
 *
 * Calcula la velocidad de un tren en Km/Hora, a partir de la distancia y el tiempo requerido, en segundos
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param dist an int
     * @param time an int
     * @return the speed in Km/h
     * 
     */
    public double velocity (double dist,double time) {
     double speed;   
     // Primero calculamos los metros por segundo
        speed = dist / time;
     // Luego lo pasamos a KM/H
        speed = speed * 3600 / 1000;
        return speed;
    }
}