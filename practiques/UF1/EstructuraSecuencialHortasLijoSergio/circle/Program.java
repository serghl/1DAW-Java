/*
 * Program.java        20/10/21
 *
 * El perimetro y el área de un círculo, a partir de su radio
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * @params radius an double
     * 
     */
    public double perimeter(double radius){
        double diameter = radius * 2;
        double perimeter = Math.PI*diameter;
        return perimeter;
        
    }
    
    public double area(double radius){ 
        double area = Math.PI*Math.pow(radius,2);
    return area;
    }
}