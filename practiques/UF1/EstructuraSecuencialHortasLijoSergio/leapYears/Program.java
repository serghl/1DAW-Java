/*
 * Program.java        19/10/21
 *
 * Calcula si un año es bisiesto
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
    public boolean isLeapYear(int year) {
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        return isLeap;
    }
}