/*
 * Program.java        20/10/21
 *
 * Calcula el punto de impacto de un proyectil, a partir de la velocdad y el ángulo
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * @params velocity an int
     * @params angle an int
     * 
     */
    public double flightTime(double velocity, double angle){
        double flightTime = (2 * velocity * Math.sin(Math.toRadians(angle))) / 9.81;
        return flightTime;
    }
    
    public double distance(double velocity, double angle){ 
    double distance = Math.pow(velocity,2) * Math.sin(2 * Math.toRadians(angle)) / 9.81;
    return distance;
    }
}