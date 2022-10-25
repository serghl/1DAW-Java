/*
 * Program.java        20/10/21
 *
 * Calcula el area lateral y el volumen de un cilindro recto, a partir de su radio y su altura
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * @params radius an double
     * @params height an double
     * 
     */
    public double volume(double radius, double height){
        double volume = Math.PI * Math.pow(radius,2) * height;
        return volume;
    }
    
    public double areaL(double radius, double height){ 
        double areaL = 2 * Math.PI * radius * height;
    return areaL;
    }
}