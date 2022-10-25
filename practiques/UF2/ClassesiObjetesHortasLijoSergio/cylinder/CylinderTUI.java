public class CylinderTUI {
    
    public static void main(String[] args) {
        
        Cylinder c1 = new Cylinder(3,5);
        Cylinder c2 = new Cylinder(5,7);
        
        System.out.println("-- CYLINDER --");
        
        System.out.println(c1);
        System.out.println("------------");
        System.out.println(c2);
        // Como llamo al metodo desde aqui añadiendo dos argumentos?
        c1.compare(c2);
        System.out.println("------------");
        if (c1.compare(c2)) {
            System.out.println("C1 es el cilindro con mayor area total");
        }      else {
            System.out.println("C2 es el cilindro con mayor area total");
        }
    }      
}
