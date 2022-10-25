/*
 * Program.java        19/10/21
 *
 * Calcula si una fecha es correcta
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * @params year an int
     * 
     */
    public boolean isDate (int day, int month, int year) {
        // Aqui validamos que la fecha corresponde a un mes de 31 dias
        boolean valid31month = day >= 1 && day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || 
                                                         month == 8 || month == 10 || month == 12 );
        // Aqui validamos si lo hace a uno de 30
        boolean valid30month = day >= 1 && day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11);
        // Aqui si es en Febrero de un año no bisiesto
        boolean valid28month = day >= 1 && day <= 28 && month == 2;
        // Aquí si es un 29 de Febrero, de un año bisiesto
        boolean valid29month = month == 2 && day == 29 && (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        // Aqui que se cumplan algunas de las anteriores, para que sea una fecha válida
        boolean isDate = valid31month || valid30month && valid28month || valid29month; 
        return isDate;
    }
}