/*
 * OtgArrayList.java   
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package unemployment;

import java.util.ArrayList;

/**
 * Modelizes the unemployment queue of an OTG.
 */
public class OtgArrayList {

    /** OTG's code **/
    private int code;
    /** Unemployment queue */
    private ArrayList<Unemployed> unemploymentQueue;

    // Constructors

    public OtgArrayList() {
        this.code = 1;
        this.unemploymentQueue = new ArrayList<Unemployed>();
    }

    /**
     * Add an unemployed to the end of the queue.
     * 
     * @param true if the unemployed is added, false otherwise
     */
    public boolean addUnemployed(Unemployed u) {
        // Afegim l'aturat
        return this.unemploymentQueue.add(u);
    }

    /**
     * Fa passar al següent aturat: retorna la primera persona aturda de la cua
     * i el treu de la cua.
     * 
     * @return primer aturat de la cua
     */
    public Unemployed next() {
        Unemployed u = null;
        // Check if we have someone in the queue
        if (howManyUnemployed() > 0) {
            // Get the first unemployed
            u = this.unemploymentQueue.get(0);
            // Remove him/her from the queue
            this.unemploymentQueue.remove(0);
            // unemploymentQueue.remove(u);
        }
        return u;
    }

    /**
     * Retorna l'últim aturat de la cua (sense treure'l de la cua)
     * 
     * @return últim aturat de la cua
     */
    public Unemployed last() {
        Unemployed u = null;
        // If there are unemployed people, get the last one
        if (howManyUnemployed() > 0) {
            u = this.unemploymentQueue.get(howManyUnemployed() - 1);
        }
        return u;
    }

    /**
     * Calculates how many unemployed people are in the queue.
     * 
     * @return the number of unemployed people.
     */
    public int howManyUnemployed() {
        return this.unemploymentQueue.size();
    }

    /**
     * Empty the queue.
     */
    public void emptyQueue() {
        this.unemploymentQueue.clear();
    }

    /**
     * Compares two OTG to decide if they're equals. 
     * Two OTG are equals if both have the same code.
     * 
     * @param object an object
     * @return true if both have the same code, false otherwise
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OtgArrayList other = (OtgArrayList) obj;
        if (code != other.code)
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
        result = prime * result + code;
        return result;
    }

}
