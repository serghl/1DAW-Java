/*
 * TransportTUI.java
 * 
 *
 */

public class TransportTUI {
    
    public static void main(String[] args) {
        
        Bicycle b1 = new Bicycle("Mountain bike", 45, 5);
        Bicycle b2 = new Bicycle("Carretera", 70, 7);
        Car c1 = new Car("BMW", 200, "Diesel",1.28,6.3);
        Car c2 = new Car("Ibiza", 150, "Gasoline",1.55,4.6);
        Underground u1 = new Underground("L1", 60,1.80);
        
        System.out.println("Gasto en gasolina viaje en coche c1");
        System.out.println(c1.cost(100));
        System.out.println("Tiempo viaje en coche c1");
        System.out.println(c1.time(100));
        
        System.out.println("Gasto en gasolina viaje en coche c2");
        System.out.println(c2.cost(130));
        
        System.out.println("Precio viaje en Metro");
        System.out.println(u1.cost(100));
 
        
    }
}

