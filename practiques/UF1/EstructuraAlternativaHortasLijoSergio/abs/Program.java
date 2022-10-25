/*
 * Program.java        27/10/21
 *
 * Calcula el valor absoluto de un numero real
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    public double abs(double x){
        // Creamos una variable que defina el valor absoluto
        double absX;
        // Asignamos el valor de x a la variable
        absX = x;
        // Aqui le decimos que si x es negativo, cambiamos el signo
        if (x < 0) {
            absX = -x;
        }
        return absX;
    }
}