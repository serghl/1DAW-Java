/*
 * AquariumTUI.java
 * 
 *
 */



public class AquariumTUI {
    
    public static void main(String[] args) {
        Fish f1 = new Fish("Lubina","Moronidae",'M',4,16,4,7,"Atlantic Ocean",'O',14.5);
        Plant p1 = new Plant("Alga","Algae",'L',1,9,3,5,'B');
        
        
        System.out.println("---------------");
        System.out.println("Fish 1");
        System.out.println(f1);
        System.out.println("---------------");
        System.out.println("Plant 1");
        System.out.println(p1);
    }
}

