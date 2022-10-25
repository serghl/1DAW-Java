/*
 * Unemployed.java   
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package unemployment;

/**
 * Modelizes an unemployed.
 */
public class Unemployed {

    /** Unemployed's NIF */
    private final String nif;
    /** Unemployed's name */
    private String name;

    // Constructors

    public Unemployed(String nif, String name) {
        this.nif = nif;
        this.name = name;
    }

    /**
     * Compares two unemployed to decide if they're equals. 
     * Two unemployed are equals if both have the same NIF.
     * 
     * @param object an object
     * @return true if both have the same NIF, false otherwise
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Unemployed other = (Unemployed) obj;
        if (nif == null) {
            if (other.nif != null)
                return false;
        } else if (!nif.equals(other.nif))
            return false;
        return true;
    }

    /**
     * Calculates a hash code for this unemployed.
     * 
     * @return a hash code for the unemployed.
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nif == null) ? 0 : nif.hashCode());
        return result;
    }

    // Getters & setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return this.nif;
    }

}
