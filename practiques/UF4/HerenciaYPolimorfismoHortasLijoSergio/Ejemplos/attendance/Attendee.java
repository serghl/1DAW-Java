/*
 * Attendee.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package attendance;

import java.time.LocalDateTime;

/**
 * Simulates attendance.
 */
public interface Attendee {
    public int absences(LocalDateTime day1, LocalDateTime day2);
}
