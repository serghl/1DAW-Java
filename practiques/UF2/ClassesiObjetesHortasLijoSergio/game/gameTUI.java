public class gameTUI {
    
    
    
    public static void main(String[] args) {
        Position po1 = new Position(1,1);
        Player pl1 = new Player(po1,5);
        
       
        pl1.jump();
        pl1.fall();
        pl1.moveLeft();
        pl1.moveLeft();
        System.out.println(pl1);

    }
}