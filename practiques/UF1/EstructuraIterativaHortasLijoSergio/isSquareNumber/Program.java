/*
 * Program.java        30/11/21
 *
 * Determina si un número es primo
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
    
    public boolean isSquareNumber (int num) {
        // Declaramos variables
        boolean isSquare = false;
        int resultado = 0;
        int i = 1;        
        // Creamos el ciclo, parando cuando el resultado supere o iguale el valor introducido
        while (resultado <= num) {        
        // Formulamos el algoritmo, declarando el booleano true cuando sea exacto 
            resultado = i * i;
            if (resultado == num) {
                isSquare = true;        
            }
            i++;
        }
        return isSquare;
    }
}
