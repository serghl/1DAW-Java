/*
 * Program.java        2/11/21
 *
 * Determina el numero de dias que tiene un mes a partir del mes y el año
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    public int getNumberOfDays(int month, int year) {
        int days;
        // Valoramos la opción de que sea un mes de 31
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        // Aqui de que sea de 30
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        // Aqui un febrero de año bisiesto
        } else if ( month == 2 && (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            days = 29;
        // Aqui Febrero de un no bisiesto
        } else  if (month == 2) {
            days = 28;
        // Aqui cualquier otro, retornamos un cero?
        } else {
            days = -1;
        }
        return days ;
    }
}