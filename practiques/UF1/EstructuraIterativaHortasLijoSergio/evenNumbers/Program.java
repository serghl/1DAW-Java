/*
 * Program.java        15/11/21
 *
 *  Escribe una secuencia de numeros pares dentro de un rango
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     * @n1 an int to be add
     * @n2 an int to be add
     *  
     */ 
    public void writeEvenNumbers(int n1, int n2) {
        // Arrancamos el bucle entre n1 y n2
        for (int i = n1; i < n2; i++) {
            // Determinamos
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        } 
    }
}
