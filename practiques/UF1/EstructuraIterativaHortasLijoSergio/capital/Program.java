/*
 * Program.java        17/11/21
 *
 * Calcula el capital final obtenido por un banco al finalizar un préstamo
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
    public void calculateFinalCapital (double capital, double interes, double anys) {
        // Asignamos un valor a la variable del capital final
        double capFin = capital;
        // Iniciamos el bucle
        for (int i = (int)anys; i > 0 ; i--) {
        // Aqui calculamos el importe - Deduciendo que el interés es anual??
            capFin = capFin + capital * interes / 100;
        }
        System.out.println("Capital final a pagar = " + capFin);
    }
    
}


