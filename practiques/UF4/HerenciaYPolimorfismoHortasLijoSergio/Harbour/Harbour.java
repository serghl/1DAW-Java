/*
 * Program.java    14/4/22
 *
 * Crea la clase Harbour
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Harbour {
    
    /** Atributes */
    private String city;
    private String country;
    private int year;
    private ArrayList<Rent> rents;
    
    // CONSTRUCTORS
    
    /*
     * Constructor 
     */
    
    public Harbour(String city, String country) {
        this.city = city;
        this.country = country;        
        this.rents = new ArrayList<Rent>();
    }
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Add a rent
    
    public boolean add(Rent r) {
        return this.rents.add(r);
    }
    
    // Calculate days of a month (old Method UF1)
    
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
    
    // Calculate a monthly amount
    
    public double calculateAmountMonth(int month, int year) {
        double monthlyAmount = 0;
        // Calculamos dias del mes y pasamos inicio y fin a LDT (argumentos)
        int daysMonth = getNumberOfDays(month,year);        
        String iniDateToCalc = "01/" + String.valueOf(month) + "/" + String.valueOf(year);
        String endDateToCalc =  String.valueOf(daysMonth)+"/" + String.valueOf(month) + "/" + String.valueOf(year);
        LocalDateTime ini = JodaDT.parseDDMMYYYY(iniDateToCalc);
        LocalDateTime end = JodaDT.parseDDMMYYYY(endDateToCalc);
        if (month < 1 || month > 12 || year < 1950 || year > 2200 ) {
            System.out.println("La fecha introducida es incorrecta");
            monthlyAmount = -1;
        } else {
            for (Rent r : this.rents) {
                // Pasamos las fechas de inicio y fin del alquiler a LDT (historico del barco)
                LocalDateTime rentIni = JodaDT.parseDDMMYYYY(r.getIniDate());
                LocalDateTime rentEnd = JodaDT.parseDDMMYYYY(r.getEndDate());
                if (JodaDT.isInInterval(ini, rentIni, rentEnd)) {                    
                    // Chequeamos que el alquiler no termine antes de final del mes a comprobar, si es asi contamos los dias
                    if (JodaDT.isInInterval(rentEnd,ini,end)) {
                        long daysMonthRent = 0;
                        daysMonthRent = ChronoUnit.DAYS.between(ini, rentEnd) + 1;
                        monthlyAmount += daysMonthRent * r.amountPerDay();
                    } else {
                        monthlyAmount += r.amountPerDay() * daysMonth;
                    }
                    // Aqui lo mismo pero para comprobar que el comienzo no sea a mitad de mes
                } else if (JodaDT.isInInterval(end, rentIni, rentEnd)) {
                    if (JodaDT.isInInterval(rentIni,ini,end)) {
                        long daysMonthRent = 0;
                        daysMonthRent = ChronoUnit.DAYS.between(rentIni, end) + 1;
                        monthlyAmount += daysMonthRent * r.amountPerDay();
                    } else {
                        monthlyAmount += r.amountPerDay() * daysMonth;
                    }
                }
            }
        }
        return monthlyAmount;
    }
    
    // Build a report of the rents
    // String pathReport
    public void reportRents(String pathReport) {      
        int i = 0;
        // Create the report on a Text File
        Writer wr = new Writer(pathReport + "-"+ LocalDate.now() +".txt");
        // Write a string to the file
        wr.println("PUERTO DE " + this.city + "," +this.country);
        wr.println("*******************************************");
        
        for (Rent r : this.rents) {
            wr.println("Alquiler Nº"+ i);
            wr.println("DNI :" +r.getDni());
            wr.println("Nombre :" +r.getName());
            wr.println("Código Amarre :" +r.getWharfageCode());
            wr.println("Inicio / Fin :" +r.getIniDate()+ " / "+r.getEndDate());
            wr.println("Importe Total :" +r.amount());
            wr.println("Importe Diario :" +r.amountPerDay());   
            wr.println("-----------------------------------");
        }
        // Close the file writer
        wr.close();
    }
}



