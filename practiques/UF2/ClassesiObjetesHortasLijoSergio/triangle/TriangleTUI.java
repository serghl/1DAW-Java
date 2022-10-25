public class TriangleTUI {
    
    
    
    public static void main(String[] args) {
        Triangle t1 = new Triangle(5,6,7);
        Triangle t2 = new Triangle(1.32,2.55,4);
        // Por defecto
        Triangle t3 = new Triangle();
     
        
        t1.perimeter();
        printTriangle(t1);
        printTriangle(t2);
        printTriangle(t3);
       
        // Aqui es lo mismo que abajo pero simplificado
        // System.out.println("-- AQUI --");
        // System.out.println(t2.toString());
        
    }
    
    public static void printTriangle(Triangle t) {
        System.out.println("TRIANGULO:             " );
        System.out.println("Lado 1:             " + t.getSide1());
        System.out.println("Lado 2:             " + t.getSide2());
        System.out.println("Lado 3:             " + t.getSide3());
        System.out.printf("El perimetro es de: %.2f\n", t.perimeter());
        System.out.printf("El area es de:      %.2f\n", t.area());
        System.out.println();
    }
}