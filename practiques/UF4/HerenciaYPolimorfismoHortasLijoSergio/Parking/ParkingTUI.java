/*
 * ParkingTUI.java
 * 
 *
 */



public class ParkingTUI {
    
    public static void main(String[] args) {
        Parking p1 = new Parking(45);
        Car c1 = new Car("1234ABC",110,5);
        Car c2 = new Car("2345BCD",125,7);
        Car c3 = new Car("1234VDN",140,7);
        Motorbike m1 = new Motorbike("5678JDK",60);
        Motorbike m2 = new Motorbike("0000BBB",40);
        
        System.out.println("---------------------------------");
        System.out.println("Añadimos el coche 1 en la plaza 34");
        System.out.println(p1.add(c1,34));
        System.out.println("---------------------------------");
        System.out.println("Añadimos el coche 2 en la plaza 34");
        System.out.println(p1.add(c2,34));
        System.out.println("---------------------------------");
        System.out.println("Añadimos el coche 2 en la plaza 35");
        System.out.println(p1.add(c2,35));
        System.out.println("---------------------------------");
        System.out.println("Añadimos el coche 3 en la plaza 16");
        System.out.println(p1.add(c3,16));
        System.out.println("---------------------------------");
        System.out.println("Añadimos la moto 1 en la plaza 10");
        System.out.println(p1.add(m1,10));
        System.out.println("---------------------------------");
        System.out.println("Añadimos la moto 2 en la plaza 11");
        System.out.println(p1.add(m2,11));
        System.out.println("---------------------------------");
        System.out.println("Vaciamos la plaza 11");
        System.out.println(p1.remove(11));
        System.out.println("---------------------------------");
        System.out.println("Calculamos el precio de la plaza 34 (coche c1)");
        System.out.println(p1.calculateFee(34));
        System.out.println("---------------------------------");
        System.out.println("Calculamos el precio de la plaza 10 (moto m1)");
        System.out.println(p1.calculateFee(10));
        System.out.println("---------------------------------");
        System.out.println("Calculamos el precio de la plaza 16 (coche c3)");
        System.out.println(p1.calculateFee(16));
        System.out.println("---------------------------------");
        System.out.println("Calculamos el total del parking");
        System.out.println(p1.calculateTotal());
        System.out.println("---------------------------------");
        System.out.println("Reporte total del parking");
        p1.reportTotal("xxx");
    }
}

