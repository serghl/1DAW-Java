/*
 * AttendanceControl.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package attendance;

import java.util.HashSet;

/**
 * Attendance control of a school.
 */

public class AttendanceControl {
    private HashSet<Attendee> attendees;

    public AttendanceControl() {
        this.attendees = new HashSet<Attendee>();
    }

    /**
     * Add an attendee
     * 
     * @param a an attendee
     * @return true if the attendee can be added, false otherwhise
     */
    public boolean addToAttendees(Attendee a) {
        return this.attendees.add(a);
    }
    
    // Getters & setters

    public HashSet<Attendee> getAttendees() {
        return this.attendees;
    }
    
    
}
