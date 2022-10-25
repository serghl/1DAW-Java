/*
 * Program.java    19/4/22
 *
 * Crea la clase User
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.HashSet;

public abstract class User {
    
    /** Atributes */
    private String dni;
    private String name;
    protected double priceMinute;
    private HashSet<Connection> connections;
    
    // CONSTRUCTORS
    
    
    /*
     * Constructor 
     */
    
    public User(String name, String dni, double priceMinute) {
        this.dni = dni;
        this.name = name;
        this.priceMinute = priceMinute;
        this.connections = new HashSet<Connection>();
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the dni
     *      
     */
    
    public String getDni() {
        return this.dni;
    }
    
    /**
     * Gets the name
     *      
     */
    
    public String getName() {
        return this.name;
    }
    
    /**
     * Gets the hashset of connections
     *      
     */
    
    public HashSet<Connection> getConnection() {
        return this.connections;
    }
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Get the billAmount
    
    public abstract double billAmount();
    
    // Add a connection
    
    public boolean add(Connection c) {
        return this.connections.add(c);
    }
    
    // Get the total of minutes
    
    public double totalMinutes() {
        double totalMin = 0;
        for (Connection c : this.connections) {
            totalMin += c.minutes();
        }
        return totalMin;
    }
    
    // Reset the total of minutes
    
    public void reset() {
        
    }
    
    
    // Equals & hashCode    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
        User other = (User) obj;
        if (dni == null) {
            if (other.dni!= null)
                return false;
        } else if (dni != other.dni)
            return false;
        return true;
    }
    
    
    public String toString() {
        return "\ndni : " + this.dni + "\nname : " + this.name;
    }
}

