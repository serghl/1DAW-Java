public class ChronometerTUI {
    
    
    
    public static void main(String[] args) {
        Chronometer c1 = new Chronometer();
        
        
        c1.start();
        for (int i = 0; i < 250; i++) {
            for (int j = 0; j < 200; j++ ){
                for (int k = 0 ; k < 12000;  k++) {
                }
            }
        }
        c1.stop();
        System.out.print(c1.lapse());
    }
}