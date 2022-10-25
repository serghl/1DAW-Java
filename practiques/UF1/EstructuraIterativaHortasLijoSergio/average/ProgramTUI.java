/*
 * Program.java        28/11/21
 *
 * Calcula la media de una secuencie (terminada en zero)
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Scanner;

public class ProgramTUI {
    
    /**
     * 
     * @param args not used
     * 
     */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int numeros = 0;
        int total = 0;
        int average = 0;
        System.out.print("\n\n Even Numbers \n\n La secuencia se detendrá con un zer0 \n\n");        
        // Empezamos con la lista de números
        System.out.print("Cual es el primer número?");
        num = s.nextInt();
        numeros++;
        // Hacemos que la iteracion corte si hay un cero
        while (num != 0) {
            total = total + num;
            System.out.printf("Cual es el siguiente número?");
            num = s.nextInt();
            numeros++;
        }
        average = total / numeros;
        System.out.printf("\n\n La media de los %d números introducidos, es : %d \n\n",numeros , average);                
    }
    
}
