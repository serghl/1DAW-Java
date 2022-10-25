/*
 * FlightsTUI.java
 * 
 *
 */

import java.util.HashSet;

public class FlightsTUI {
    
    public static void main(String[] args) {
        Airport a1 = new Airport("SCQ","Santiago de Compostela","42.8963013","-8.4151402",1);
        Airport a2 = new Airport("BCN","Barcelona","41.2971001","2.07846",1);
        Airport a3 = new Airport("JFK","New York - JFK","40.639801","-73.7789002",-4);
        Plane p1 = new Plane("123","AIRBUS A320",871);
        Plane p2 = new Plane("345","BOEING 737",952);
        Plane p3 = new Plane("678","BOEING 747",893);
        // Vuelo Santiago-BCN con un airbus
        Flight f1 = new Flight("ABC","15/08/2022-22:00",a1,a2,p1);
        // Vuelo Santiago-BCN con un boeing
        Flight f2 = new Flight("DEF","15/08/2022-22:00",a1,a2,p2);
        // Vuelo JFK-BCN con un boeing747
        Flight f3 = new Flight("DEF","16/08/2022-10:00",a3,a2,p3);
        // Vuelo BCN-JFK con un boeing747
        Flight f4 = new Flight("DEF","16/08/2022-10:00",a2,a3,p3);
        
        System.out.println("----------------------------------------------");
        System.out.println("Info Aeropuerto de Santiago");
        System.out.println(a1);
        System.out.println("----------------------------------------------");
        System.out.println("Info Aeropuerto de Barcelona");
        System.out.println(a2);
        System.out.println("----------------------------------------------");
        System.out.println("Info Avion1");
        System.out.println(p1);
        System.out.println("----------------------------------------------");
        System.out.println("Info Avion2");
        System.out.println(p2);
        System.out.println("----------------------------------------------");
        System.out.println("Distancia entre A1 (Santiago) y A2 (Barcelona)");
        System.out.println(a1.distance(a2));
        System.out.println("----------------------------------------------");
        System.out.println("Distancia entre A2 (Barcelona) y A3 (New York)");
        System.out.println(a2.distance(a3));
        System.out.println("----------------------------------------------");
        System.out.println("Info del vuelo F1");
        System.out.println(f1);
        System.out.println("----------------------------------------------");
        System.out.println("Info del vuelo F2");
        System.out.println(f2);
        System.out.println("----------------------------------------------");
        System.out.println("Info del vuelo F3");
        System.out.println(f3);
        System.out.println("----------------------------------------------");
        System.out.println("Info del vuelo F4");
        System.out.println(f4);
        System.out.println("----------------------------------------------");
        System.out.println("Duracion (Double) del vuelo F1 en horas");
        System.out.println(f1.durationInHours());
        System.out.println("----------------------------------------------");
        System.out.println("Duracion (Double) del vuelo F2 en horas");
        System.out.println(f2.durationInHours());
        System.out.println("----------------------------------------------");
        System.out.println("Duracion (Double) del vuelo F3 en horas");
        System.out.println(f3.durationInHours());
        System.out.println("----------------------------------------------");
        System.out.println("Duracion (Double) del vuelo F1 (SCQ-BCN-AIRBUS320) en hh:mm");
        System.out.println(f1.duration());
        System.out.println("----------------------------------------------");
        System.out.println("Duracion (Double) del vuelo F2 (SCQ-BCN-BOEING737) en hh:mm");
        System.out.println(f2.duration());
        System.out.println("----------------------------------------------");
        System.out.println("Duracion (Double) del vuelo F3 (JFK-BCN-BOEING747) en hh:mm");
        System.out.println(f3.duration());
        System.out.println("----------------------------------------------");
        System.out.println("Duracion (Double) del vuelo F4 (BCN-JFK-BOEING747) en hh:mm");
        System.out.println(f4.duration());
        System.out.println("----------------------------------------------");
        System.out.println("Destination Arrival Date Time F3 (JFK-BCN-BOEING747) 16/08/2022-10:00 ");
        System.out.println(f3.arrivalDateTime());
        System.out.println("----------------------------------------------");
        System.out.println("Destination Arrival Date Time F4 (BCN-JFK-BOEING747) 16/08/2022-10:00 ");
        System.out.println(f4.arrivalDateTime());
    }
    
}

