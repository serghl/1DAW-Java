/*
 * Program.java        28/10/21
 *
 *  Determina el tipo de triangulo
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    /*
     * Determines if 3 segments form a triangle. 
     * 
     * @param a the length of a segment
     * @param b the length of a segment
     * @param c the length of a segment
     * @return true if -a-, -b- and -c- form a triangle, false otherwise
     */
    
    public boolean isTriangle(double a,double b, double c) {
        boolean isTriangle = false;
        if (a < b +c && b < a + c && c < a + b) {
            isTriangle = true;
        }
        return isTriangle;
    }
    
    /*
     * Finds out the type of a triangle. 
     * 
     * @param a the length of a segment
     * @param b the length of a segment
     * @param c the length of a segment
     * @return "Equilater", "Isosceles" or "Escale" if the triangle is valid or "Error" otherwise
     */
    
    public String typeOfTriangle(double a, double b, double c) {
        String type = "ERROR";
        Program p = new Program();
        if (p.isTriangle(a,b,c)) {
            if ( a != b && b != c) {
                type = "Escale";
            } else if ( a == b && b == c) {
                type = "Equilater"; 
            } else {
                type = "Isosceles";
            }
        }
        return type;
    }
    
    /*
     * Finds out the type of a triangle(2). 
     * 
     * @param a the length of a segment
     * @param b the length of a segment
     * @param c the length of a segment
     * @return "Equilater", "Isosceles" or "Escale" if the triangle is valid or "Error" otherwise
     */
    public String typeOfTriangle2(double a, double b, double c) {
        String type = "ERROR";
        Program p = new Program();
        if (p.isTriangle(a,b,c)) {
            if ( a == b) {
                if ( b == c ) {
                    type = "Equilátero";
                } else if ( b != c) {
                    type = "Isósceles";
                }
            }
            if (a != b) {
            } else if (a == c) {
                type = "Isosceles";
            } else if (b == c) {
                type = "Isosceles";
            } else {
                type = "Escale";
            }
            
        }
        return type;
    }   
}
