/*
 * Program.java        19/11/21
 *
 * Escribe los números enteros perfectos que hay dentro de un rango
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
    public void perfectNumbers (int n1, int n2) {
        // Declaramos un booleano 
        boolean isPerfect = false;   
        // Declaramos un resultado final a comparar
        int resultado = 0;
        int x = n1;
        // Utilizamos el método anterior "divisors"
        while (x < n2) {
            for (int i = 1; i <= n1 ; i++) {
                if (n1 % i == 0) {
                    resultado = resultado + i; 
                    System.out.print(i+ " + ");
                    // Comparamos la variable resultado con el numero introducido    
                } else if (resultado == n1) {
                    isPerfect = true;
                }           
            }
            x++;
        }
    }
}







