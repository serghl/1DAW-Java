/*
 * SurgeryTUI.java
 * 
 *
 */

import java.util.HashSet;

public class SurgeryTUI {
    
    public static void main(String[] args) {
        
        
        Surgery s1 = new Surgery("Dr. Matasanos","Traumatólogo");  
        Visit v1 = new Visit("15/08/2022-09:00","Manuel");
        Visit v2 = new Visit("15/08/2022-09:02","Pepe");
        Visit v3 = new Visit("18/08/2022-09:00","Fermin");
        HashSet<Visit> newVisits;
        
        // Visita 1
        if (s1.isProgramable(v1)) {
            System.out.println("La visita v1 se puede programar");
            s1.program(v1);
        } else {
            System.out.println("Algo falla en la v1");
        }
        System.out.println("---------------------------");        
        
        // Visita 2        
        if (s1.isProgramable(v2)) {
            System.out.println("La visita v2 se puede programar");
            s1.program(v2);
        } else {
            System.out.println("Algo falla en la v2");
        }
        System.out.println("---------------------------");
        
        // Visita 3
        if (s1.isProgramable(v3)) {
            System.out.println("La visita v3 se puede programar");
            s1.program(v3);
        } else {
            System.out.println("Algo falla en la v3");
        }
        System.out.println("---------------------------");
        
        // Quitar la visita 2
        if (s1.removeVisit(v2)) {
            System.out.println("La visita 2 se ha eliminado");            
        } else {
            System.out.println("La visita no se ha podido eliminar");
        }
        System.out.println("---------------------------");
        
        // Fecha de la visita 2
        System.out.println(v2);
        System.out.println("---------------------------");
        
        // Muestra las visitas actuales
        System.out.println("Numero de visitas actuales --> " + s1.countVisits());
        System.out.println("---------------------------");
        
        // Muestra las visitas en un periodo concreto
        System.out.println("Visitas del 13 al 17 --> " + s1.countVisits("13/08/2022-09:30","17/08/2022-09:30"));
        System.out.println("---------------------------");
        
        // Quitar todas las visitas
        s1.removeAll();        
        System.out.println("---------------------------");
    }
}

