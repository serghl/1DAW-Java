/*
 * Program.java        20/11/21
 *
 * Calcula si dos números son "amigos", si la suma de los divisores de un número, suman igual que otro
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
     * @return if there are amicables
     */ 
    public boolean areAmicableNumbers(int n1, int n2) {
        boolean amicable = false;
        int sum = 0;
        // Aqui con el for sumamos los divisores, excepto el número en si, usando el metodo divisors
        for (int i = 1; i < n1 ; i++) {
            if (n1 % i == 0) {
                sum = sum + i; 
            }
            // Aquí los comparamos 
        }
        if (sum == n2) {
            amicable = true;
            System.out.printf("La suma de los divisores de %d, es %d , por lo que es ",n1 ,sum );
        } else {
            System.out.printf("La suma de los divisores de %d, es %d , por lo que es ",n1 ,sum );
        }
        return amicable;
    }
}

