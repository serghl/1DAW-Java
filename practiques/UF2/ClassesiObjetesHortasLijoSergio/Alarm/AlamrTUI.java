

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

/**
 * Modelizes a calendar to know the fertility periods of a woman.
 * 
 * For more information, 
 * see http://en.wikipedia.org/wiki/Calendar-based_contraceptive_methods
 * 
 * @author Mònica Ramírez Arceda
 * @version 22/02/2012
 */
public class AlamrTUI {
    
    public static void main(String[] args) {
        Alarm f = new Alarm();
        
        //System.out.println("--- > Fecha ahora "+ f.getAlarmDatetime());
        //System.out.println("--- > Total de segundos "+ f.secondsLeft());
        
        f.setAlarmDateTime("14/05/2022-09:55:00");
        System.out.println ("Nombre de segons " + f.secondsLeft());
        System.out.println ("Falten " + f.timeLeft());
        while (!f.isRinging()){
            System.out.println ("Nombre de segons " + f.secondsLeft());
        }
        System.out.println ("RIIIIIIIINNNNNNNNNNNNNGGGGGGG");
    }
}