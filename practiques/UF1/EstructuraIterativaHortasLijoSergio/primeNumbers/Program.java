/*
 * Program.java        9/12/21
 *
 * Escribe los numeros primos dentro de un intervalo
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param args not used
     * 
     */
    
    public void writePrimeNumbers (int n1, int n2) {
        // Declaramos la variable como true por defecto
        int i;
        int num;
        boolean primo = false;        
        // Recorremos los números
        for ( i = n1; i <= n2; i++) {
            num = 2;
            primo = false;
            // Ahora chequeamos cada numero para ver si es primo
            while (num <= i - 1 && !primo) {
                primo = i % num == 0;
                num++;
            }
            // Si es primo lo imprimimos
            if (!primo) {
                System.out.printf("%d ", i);
            }
        }
    }
}
