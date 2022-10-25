public class Counter2TUI {
    
    public static void main(String[] args) {
        
        Counter2 d1 = new Counter2(6,3);
        Counter2 d2 = new Counter2(1,2);
        
        System.out.println("-- AQUI --");
       
        System.out.println(d2.toString());
        //System.out.println(d3.toString());
        for (int i = 0; i < 100; i++) {
            d2.increment();
            System.out.println(d2.toString());
        }      
    }
}