/*
 * Alarm.java        1.1 28/11/2012 
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                     Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

/**
 * Modelizes an alarm.
 */
public class Alarm {
    
    /** Current datetime */
    private LocalDateTime now;
    /** Alarm's datetime */
    private LocalDateTime alarmDateTime;
    
    // Constructor
    public Alarm() {
        // Set current datetime
        this.now = LocalDateTime.now(); 
        // Deactivate the alarm (past datetime)
        this.alarmDateTime = this.now.minusDays(1);
    }
    
    // Getters y Setters
    
    // Now
    
    
    // AlarmDateTime
    
    
    
    
    /**
     * Sets alarm.
     * 
     * @param day alarm's day
     * @param month alarm's month
     * @param year alarm's year
     * @param hour alarm's hour
     * @param minute alarm's minute
     */
    public void setAlarmDateTime(int day, int month, int year, int hour, int minute) {
        this.alarmDateTime = LocalDateTime.of(year, month, day, hour, minute); 
    }
    
    /**
     * Sets alarm.
     * 
     * @param date with format DD/MM/YYYY-hh:mm:ss
     */
    public void setAlarmDateTime(String date) {
        this.alarmDateTime = JodaDT.parseDDMMYYYYhhmmss(date);
    } 
    
    /**
     * Generates a string with datetime's alarm (format DD/MM/YYYY-hh:mm).
     * 
     * @return cadena amb el temps de l'alarma
     */
    public String getAlarmDatetime() {
        // Get alarm's year
        int year = this.alarmDateTime.getYear();
        // Get alarm's month
        int month = this.alarmDateTime.getMonthValue();
        // Get alarm's day
        int day = this.alarmDateTime.getDayOfMonth();
        // Get alarm's hour
        int hour = this.alarmDateTime.getHour();
        // Get alarm's minute
        int minute = this.alarmDateTime.getMinute();
        // Build formatted string        
        return day + "/" + month + "/" + year + "-" + hour + ":" + minute;
    }
    
    /**
     * Calculates how many seconds are left to alarm's datetime. 
     * Returns -1 if the alarm's datetime is in the past.
     * 
     * @return the number of seconds or -1
     */
    public long secondsLeft() {
        // Sets now with current datetime
        this.now = LocalDateTime.now();
        // Gets duration in seconds between now and alarm's datetime
        long totalSec = JodaDT.durationInSeconds(now, alarmDateTime);
        return totalSec;
    }
    
    /**
     * Generates a string with the time left to alarm's datetime. 
     * Returns null if the alarm's datetime is in the past.
     * 
     * @return a string
     */
    public String timeLeft() {
        String tl = null;
        // Set current datetime
        this.now = LocalDateTime.now();       
        // Get the period(gap) between now and alarm time, with period.between method
        Period alarmGap = Period.between(this.now.toLocalDate(), this.alarmDateTime.toLocalDate());
        // Set now and alarmTime in LocalDate
        LocalDateTime dateAlarm = LocalDateTime.of(alarmDateTime.getYear(),alarmDateTime.getMonthValue(),
                                                   alarmDateTime.getDayOfMonth(),this.now.getHour(),this.now.getMinute(),
                                                   this.now.getSecond());
        // Get the time in seconds, minutes and hours
        long secondsTotal = JodaDT.durationInSeconds(now, this.alarmDateTime);
        //System.out.println("Seconds check - " + secondsTotal);        
        // Get them im positive
        secondsTotal = Math.abs(secondsTotal);
        long hours = secondsTotal / 3600;
        long minutes = secondsTotal % 3600 / 60;
        long seconds = secondsTotal % 3600 % 60;
        // Set the String to return
        
        tl = alarmGap.getYears() + " years, " + alarmGap.getMonths() + " months, " + alarmGap.getDays() +
            " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " segundos. ";
        
        return tl;
    }
    
    /**
     * Determines if the alarm is ringing.
     * 
     * @return true if alrm is ringing, false otherwise
     */
    public boolean isRinging() {
       // Set current datetime
        this.now = LocalDateTime.now();
        // If alarm's datetime is now (don't control seconds), alarm is ringing
        boolean ring = alarmDateTime.getYear() == now.getYear()
                && alarmDateTime.getMonthValue() == now.getMonthValue()
                && alarmDateTime.getDayOfMonth() == now.getDayOfMonth()
                && now.getHour() == alarmDateTime.getHour()
                && now.getMinute() == alarmDateTime.getMinute();
        return ring;
    }
    
}
