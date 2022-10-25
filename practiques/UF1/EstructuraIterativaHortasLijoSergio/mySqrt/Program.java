/*
 * Program.java        24/11/21
 *
 * A partir de un numero entero positivo, calcula la parte entera de la raiz cuadrada
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     * @n1 an int to be add
     * @return the sqrt
     */ 
    public int mySqrt(int n1) {
        // Iniciamos las variables
        int temp = 0;
        int sqrt = n1 / 2;
        // Iniciamos un bucle, do while en este caso, diviendo entre dos y sumando a la variable
        do {
            temp = sqrt;
            sqrt = (temp + (n1 / temp)) / 2;
        // Hasta llegar a 0
        } while ((temp - sqrt) != 0);
        
        return sqrt;
    }
}




