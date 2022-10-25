/*
 * Program.java        21/3/22
 *
 * Crea la clase Flight
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.time.LocalDateTime;

public class Flight {
    
    /** Atributes */
    private String code;
    private String departureDT;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Plane plane;
    
// CONSTRUCTORS
    
    /*
     * Constructor by default.
     * 
     * @param name the person's name
     */
    public Flight() {
        this.code= "";      
    }
    
    /*
     * Constructor 
     */
    
    public Flight(String code) {
        this.code = code;
    }
    
    /*
     * Constructor 
     */
    public Flight(String code, String departureDT, Airport departureAirport, Airport arrivalAirport, Plane plane) {
        this.code = code;
        this.departureDT = departureDT;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.plane = plane;
    }
    /**
     * Getters y setters
     */
    
    /**
     * Gets the code
     *      
     */
    
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Gets the departure Date Time
     * 
     */
    
    public String getdepartureDT() {
        return this.departureDT;
    }
    
    public void setDepartureDT(String departureDT) {        
        this.departureDT = departureDT;
    }        
    
    /**
     * Gets the departure Airport
     *      
     */
    
    public Airport getDepartureAirport() {
        return this.departureAirport;
    }
    
    public void setDepartureAirport(Airport departureAirport) {        
        this.departureAirport = departureAirport;
    }  
    
    /**
     * Gets the arrival Airport
     *      
     */
    
    public Airport getArrivalAirport() {
        return this.arrivalAirport;
    }
    
    public void setArrivalAirport(Airport arrivalAirport) {        
        this.arrivalAirport = arrivalAirport;
    }  
    
    /**
     * Gets the plane
     *      
     */
    
    public Plane getPlane() {
        return this.plane;
    }
    
    public void setPlane(Plane plane) {        
        this.plane = plane;
    }  
    
    
    /*
     * 
     * MORE METHODS
     * 
     */
    
    /*
     * Duration of the flight in hours 
     * 
     */
    
    public double durationInHours() {
        double duration = this.departureAirport.distance(this.arrivalAirport) / this.plane.getV() ;
        return Math.round(duration * 100.0) / 100.0;
    }
    
    /*
     * Duration of the flight in a String 
     * 
     */
    
    public String duration() {
        String duration = "";
        double totalMinutes = durationInHours() * 60;
        int hours = (int)totalMinutes / 60;
        int minutes = (int)totalMinutes % 60;
        // Añadimos ceros al string
        if (minutes < 10 && hours < 10) {
            duration = "0"+hours+":0"+minutes;
        } else if (hours < 10) {
            duration = "0"+hours+":"+minutes;
        } else if (minutes < 10) {
            duration = hours+":0"+minutes;
        } else {
            duration = hours+":"+minutes;
        }
        return duration;
    }
    
    /*
     * Get an estimated arrivalDateTime
     * 
     */
    
    public String arrivalDateTime() {
        String adt = "";
        // Split the values to an array and then parse it to Int
        String[] time = duration().split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        char gmt;
        // Hour diference because GMT
        // Negative 
        if (Math.abs(departureAirport.getGmt()) > Math.abs(arrivalAirport.getGmt())) {
            gmt = 'N';
        // Positive
        } else if (Math.abs(departureAirport.getGmt()) < Math.abs(arrivalAirport.getGmt())) {
            gmt = 'P';
        // Neutro
        } else {
            gmt = 'X';
        }
        double difHor = Math.abs(departureAirport.getGmt()) + Math.abs(arrivalAirport.getGmt());
        // LocalDateTime of departure
        LocalDateTime departureTime = JodaDT.parseDDMMYYYYhhmm(this.departureDT);
        // LocalDateTime of arrival
        // Adding the minutes and the hours
        LocalDateTime eta = departureTime.plusHours(hours);        
        eta = eta.plusMinutes(minutes);             
        // Aplicamos la diferencia horaria
        if (gmt == 'N') {
            eta = eta.plusHours((int)difHor);
        } else if (gmt == 'P') {
            eta = eta.minusHours((int)difHor);
        }        
        // Lo traducimos a String
        adt = JodaDT.formatDDMMYYYYhhmm(eta);
        return adt;
    }
    
    // Equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Flight other = (Flight) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (code != other.code)
            return false;
        return true;
    }
    
    public String toString() {
        return "\ncode : " + this.code + "\ndepartureDT: " + this.departureDT + "\ndepartureAirport: "
            + this.departureAirport + "\narrivalAirport: " + this.arrivalAirport + "\nplane :" + this.plane ;
    }
}

