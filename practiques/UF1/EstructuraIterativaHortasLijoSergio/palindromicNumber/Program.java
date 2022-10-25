/*
 * Program.java        23/11/21
 *
 * Determina si un número es palíndromo
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
    public boolean isPalindromic(int n1) {
        boolean palindro = false;
        int temp = n1;
        int invertido = 0;
        int resto = 0;
        // Aqui creamos el bucle poniendo como condicion que sea pare al llegar a 0
        while (temp != 0) {
        // Primero vamos cogiendo el ultimo dígito y asignandoselo a resto 
            resto = temp % 10;
        // Luego vamos construyendo el número invertido, sumando la variable resto
            invertido = invertido * 10 + resto;
        // Aqui vamos quitando digitos de la cifra inicial
            temp = temp / 10;
        }
        // Aqui comparamos si el numero invertido y el original son iguales
        if (invertido == n1) {
            palindro = true;
        }
        return palindro;    
    }
}




