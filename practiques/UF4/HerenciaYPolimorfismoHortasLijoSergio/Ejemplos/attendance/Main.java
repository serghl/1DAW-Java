/*
 * Main.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package attendance;

import java.time.LocalDateTime;

/**
 * Main program.
 */
public class Main {

    public static void main(String[] args) {

        // Create some objects
        Student student = new Student("23456654L", "Joan Garcia");
        Teacher teacher = new Teacher("12458899X", "Marta Puig");
        Pas pas = new Pas("22333212T", "Jordi Martínez");
        LocalDateTime day1 = JodaDT.parseDDMMYYYY("01/09/2002");
        LocalDateTime day2 = JodaDT.parseDDMMYYYY("30/06/2002");

        // Since Student, Teacher and Pas implements Attendee interface, absences method is
        // implemented and can be called from all instances of these classes
        System.out.println("Llistat 1");
        System.out.println("=========");
        System.out.println("Puntuació d'absències de l'alumne: " + student.absences(day1, day2));
        System.out.println("Puntuació d'absències del professor: " + teacher.absences(day1, day2));
        System.out
                .println("Puntuació d'absències del treballador PAS: " + pas.absences(day1, day2));

        // Since Student, Teacher and Pas implements Attendee interface, all instances of these
        // classes can be added to a HashSet of type Attendee
        AttendanceControl ac = new AttendanceControl();
        ac.addToAttendees(student);
        ac.addToAttendees(teacher);
        ac.addToAttendees(pas);

        System.out.println("\n\nLlistat 2");
        System.out.println("=========");
        for (Attendee a : ac.getAttendees()) {
            // We will use two references to the same object: p (Person) to get the name, and a
            // (Attendee) to get absences
            Person p = (Person) a;
            System.out.println("Puntuació d'absències de " + p.getName() + ": "
                    + a.absences(day1, day2));
        }
    }

}
