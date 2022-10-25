/*
 * Program.java        12/11/21
 *
 *  Escribe una secuencia de numeros random dentro de un intervalo
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
     * @p an int to be add
     *  
     */ 
    public void writeRandomNumbers(int n1, int n2, int p) {
        int numero;
        for (int i = 0; i < p; i++) {
            // Multiplicamos primero el intervalo (entre parentesis) y luego lo trasladamos sumando el n1
            numero = (int) (Math.random() * (n2 - n1)) + n1;
            System.out.println(numero);
        }
    } 
}