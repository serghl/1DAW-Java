/*
 * Program.java        28/11/21
 *
 * A partir de un numero entero positivo, escribe su factorizacion en numeros primos
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     * @n1 an int to be add
     * 
     */ 
    public void primeFactorization(int n1) {
        int temp = n1;
        int primo = 2;
        // Descartamos uno como divisor, para tope del bucle
        while (temp != 1) {
            // Si el temporal se divide entre 2 lo imprimimos
            if (temp % primo == 0) {
                System.out.printf("%d ", primo);
                // Ahora dividimos y asignamos el valor a la variable
                temp = temp / primo;
            } else {
                primo++;
            }
        }
    }
}




