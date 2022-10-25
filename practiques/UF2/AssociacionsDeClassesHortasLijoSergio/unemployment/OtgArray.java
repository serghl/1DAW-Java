/*
 * OtgArray.java   
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package unemployment;

/**
 * Modelizes the unemployment queue of an OTG.
 */
public class OtgArray {

    /** OTG's code **/
    private int code;
    /** Number of unemployed people in the queue */
    private int nUnemployed;
    /** Maximum number of unemployed people in the queue */
    private static final int MAX_UNEMPLOYED = 3;
    /** Unemployment queue */
    private Unemployed[] unemploymentQueue;

    // Constructors

    public OtgArray() {
        this.code = 1;
        this.unemploymentQueue = new Unemployed[MAX_UNEMPLOYED];
        this.nUnemployed = 0;
    }

    /**
     * Add an unemployed to the end of the queue.
     * 
     * @param u an unemployed
     * @return true if the unemployed is added, false otherwise
     */
    public boolean addUnemployed(Unemployed u) {
        boolean isAdded = false;
        // Add the unemployed if we have space enough
        // if (numUnemployed < MAX_UNEMPLOYED) {
        if (this.nUnemployed < this.unemploymentQueue.length) {
            this.unemploymentQueue[this.nUnemployed] = u;
            this.nUnemployed++;
            isAdded = true;
        }
        return isAdded;
    }

    /**
     * Calls the next unemployed: gets the first unemployed 
     * of the queue and removes him/her from the queue
     * 
     * @return the first unemployed of the queue
     */
    public Unemployed next() {
        Unemployed u = null;
        // Check if we have someone in the queue
        if (this.nUnemployed > 0) {
            // Get the first unemployed
            u = this.unemploymentQueue[0];
            // Move unemployed people one position: the second will be the
            // first, the third will be the second...
            for (int i = 0; i < this.nUnemployed && i < this.unemploymentQueue.length - 1; i++) {
                this.unemploymentQueue[i] = this.unemploymentQueue[i + 1];
            }
            // The rest of the queue will be empty
            for (int i = this.nUnemployed - 1; i < this.unemploymentQueue.length; i++) {
                this.unemploymentQueue[i] = null;
            }
            // One unemployed less in the queue...
            this.nUnemployed--;
        }

        return u;
    }

    /**
     * Gets the last unemployed of the queue.
     * No dequeued
     * 
     * @return the last unemployed of the queue
     */
    public Unemployed last() {
        Unemployed u = null;
        // If there are unemployed people, get the last one
        if (this.nUnemployed > 0) {
            u = this.unemploymentQueue[this.nUnemployed - 1];
        }
        return u;
    }

    /**
     * Calculates how many unemployed people are in the queue.
     * 
     * @return the number of unemployed people.
     */
    public int howManyUnemployed() {
        return this.nUnemployed;
    }

    /**
     * Empty the queue.
     */
    public void emptyQueue() {
        // Build a new queue
        this.unemploymentQueue = new Unemployed[OtgArray.MAX_UNEMPLOYED];
        // Reset the number of unemployed
        this.nUnemployed = 0;
        // another way: we could empty the queue
        // for (int i = numUnemployed; i < unemploymentQueue.length; i++) {
        // unemploymentQueue[i] = null;
        // }
        // nUnemployed = 0;
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
        OtgArray other = (OtgArray) obj;
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
