public class CircleTUI {
    
    public static void main(String[] args) {
        
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);
        
        System.out.println("-- CIRCLE --");
        
        System.out.println(c1.toString());
        System.out.println("------------");
        System.out.println(c2.toString());
        
        c1.compare(c2);
        if (c1.compare(c2)) {
            System.out.println("C1 es el circulo con mayor area");
        }      else {
            System.out.println("C2 es el circulo con mayor area");
        }
    }
}
