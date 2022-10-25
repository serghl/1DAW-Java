/*
 * Student.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package attendance;

import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 * Modelizes a student.
 */
public class Student extends Person implements Attendee {

    private String course;
    private int level;
    private ArrayList<String> enrolledSubjects = new ArrayList<String>();

    // Constructors

    public Student(String dni, String name) {
        super(dni, name);
    }

    /**
     * Enroll to a subject.
     * 
     * @param subject a subject
     * @return true if enrollment succeeds, false otherwise
     */
    public boolean addToEnrolledSubjects(String subject) {
        if (enrolledSubjects.contains(subject))
            return false;
        return this.enrolledSubjects.add(subject);
    }
    
    @Override
    public int absences(LocalDateTime day1, LocalDateTime day2) {
        // Here we'd add instructions to calculate student's attendance.
        // The following result is fictitious.
        return 73;
    }
    
    // Getters & setters

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<String> getEnrolledSubjects() {
        return this.enrolledSubjects;
    }

}
