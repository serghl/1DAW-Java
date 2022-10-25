/*
 * Program.java        2/11/21
 *
 * Súmale un día a una fecha
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    public String dayPlus1(int day, int month, int year) {
        // Inicializamos las variables a mostrar, asignando el valor de la fecha introducida
        int day1 = day; 
        int month1 = month; 
        int year1 = year;
        // Operación a realizar en caso de ser el último día de un mes de 31 días
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) { 
            day1=1;
            month1++;
            // Operación a realizar en caso de ser el último día de un mes de 30 días
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            day1=1;
            month1++;
            // Operación a realizar en caso de ser el último día de un Febrero de año bisiesto
        } else if ((month == 2) && day == 29 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) && day == 29)) {
            day1=1;
            month1++;
            // Operación a realizar en caso de ser el último día de un Febrero de año no bisiesto
        } else if ((month == 2) && day == 28 && !((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) && day == 29)){
            day1=1;
            month1++;
            // Operación a realizar en caso de ser el último día de Diciembre
        } else if (month == 12 && day == 31) {
            day1=1;
            month1=1;
            year1++;
            // Aquí si sólo cabe sumar un día, o sea, el resto de casos
        } else {
            day1++;
        }
        return day1 +"/"+month1+"/"+year1 ;
    }
    
    
    
    public String dayPlus1_2(int day, int month, int year) {
        int d = 0;
        int m = 0;
        int y = 0;
        // Caso A, meses de menos de 30 días
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            // Caso A1, Si no es el ultimo día del mes 
            if (d < 30){
                d++;
            } else {
                // Caso A2, Si es el ultimo día del mes 
                m++;
                d = 1;
            }
            // Caso B, meses de menos de 30 días
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 ) {
                // Caso B1, Si no es el ultimo día del mes 
                if (d < 31){
                    d++;
                } else {
                    // Caso B2, Si es el ultimo día del mes 
                    m++;
                    d = 1;
                    if (m == 12) {
                        m = 1;
                        y++;
                    } else {
                        m++;
                    }
                }
            }
                // CASO ESPECIAL : FEBRERO
                // AÑO BISIESTO
            } else if ((y % 4 == 0 && y % 100 != 0) && m == 2 && d == 29) {
                // Caso C1 : Si no es ultimo dia de mes
                if (d < 29) {
                    d++;
                } else {
                    // Casi C2 : si es último día de mes
                    m++;
                    d = 1;
                }
                // CASO ESPECIAL : FEBRERO
                // AÑO NO BISIESTO
            } else {
                if (month == 2 && d < 28) {
                    d++;
                } else {
                    m++;
                    d = 1;
                }
            }
           return d +"/"+m+"/"+y ; 
    }
}
          
           
            
            
