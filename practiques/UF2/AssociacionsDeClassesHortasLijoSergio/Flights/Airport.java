/*
 * Program.java        21/3/22
 *
 * Crea la clase Airport
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.ArrayList;

public class Airport {
    
    /** Atributes */
    private String code;
    private String name;
    private String lat;
    private String lon;
    private double gmt;    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Airport() {
        this.code = "";
        this.name = "";        
    }
    
    /*
     * Constructor 
     */
    
    public Airport(String code) {
        this.code = code;
        this.name = "";
    }
    
    /*
     * Constructor 
     */
    
    public Airport(String code, String name, String lat, String lon, double gmt) {
        this.code = code;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.gmt = gmt;
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
     * Gets the name
     * 
     */
    
    public String name() {
        return name;
    }
    
    public void setName(String name) {        
        this.name = name;
    }      
    
    /**
     * Gets the latitude
     * 
     */
    
    public String getLat() {
        return lat;
    }
    
    public void setLat(String lat) {        
        this.lat = lat;
    } 
    
    /**
     * Gets the longitude
     * 
     */
    
    public String getLon() {
        return lon;
    }
    
    public void setLon(String lon) {        
        this.lon = lon;
    } 
    
    /**
     * Gets the GMT
     * 
     */
    
    public double getGmt() {
        return gmt;
    }
    
    public void setGmt(Double gmt) {        
        this.gmt = gmt;
    } 
    
    /**
     * MORE METHODS
     *      
     */
    
    // Get the distance between 2 airports
    
    public double distance(Airport a2) {
        int R = 6371; // Radius of the earth        
        double latDistance = Math.toRadians(Double.parseDouble(a2.getLat()) - Double.parseDouble(this.lat));
        double lonDistance = Math.toRadians(Double.parseDouble(a2.getLon()) - Double.parseDouble(this.lon));
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
            + Math.cos(Math.toRadians(Double.parseDouble(this.lat))) * 
            Math.cos(Math.toRadians(Double.parseDouble(a2.getLat())))
            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // Convert to meters
        distance = Math.pow(distance, 2);
        distance = Math.sqrt(distance)/1000; // Distance in KM              
        distance = Math.round(distance * 100.0) / 100.0;
        return distance;
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
        Airport other = (Airport) obj;
        if (code == null) {
            if (other.code!= null)
                return false;
        } else if (code != other.code)
            return false;
        return true;
    }
    
    public String toString() {
        return "\ncode : " + this.code + "\nname: " + this.name+ "\nlat: " + this.lat +
            "\nlon : " + this.lon + "\ngmt : " +this.gmt;
    }
}

