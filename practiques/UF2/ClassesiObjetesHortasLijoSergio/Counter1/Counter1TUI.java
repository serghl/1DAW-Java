public class Counter1TUI {
            
    public static void main(String[] args) {
        
        Counter1 d1 = new Counter1(-5);
        Counter1 d2 = new Counter1(0);
        Counter1 d3 = new Counter1(12);
                
        //digit1.reset();
        //digit2.raise();
        d2.raise();
        d2.raise();
      
        d2.raise();
        //digit3.raise();
        
        System.out.println("-- AQUI --");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        
        
    }
}