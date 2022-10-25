public class BicycleTUI {
    
    public static void main(String[] args) {
        
        // Argumentos para la bici -> model,Nrear,Nfront,rear,front,maxSpeed,speed
        
        /* 
         
        Bicycle b1 = new Bicycle("Mountain Bike",5,3,3,1,120,50);
        
        
        System.out.println("-- BICYCLE --");
        
        System.out.println(b1);
        // Velocidad Inicial       
        System.out.println(b1.getSpeed());
        System.out.println("Plato antes --> " + b1.getFrontSprocket());
        System.out.println("Piñon antes --> " + b1.getRearSprocket());
        // Metodo de stop
        b1.slowDown();
        b1.slowDown();
        b1.slowDown();
        b1.slowDown();
        System.out.println("Plato después --> " + b1.getFrontSprocket());
        System.out.println("Piñon despues --> "+ b1.getRearSprocket());
        // Velocidad Actual        
        System.out.println(b1.getSpeed());
        
        */
         // First example
        Bicycle btt = new Bicycle("BTT High Speed", 2, 1, 3, 7, 0);
        btt.accelerate();
        btt.accelerate();
        btt.changeFrontSprocket(1);
        btt.changeRearSprocket(1);
        btt.accelerate();
        btt.changeRearSprocket(1);
        btt.slowDown();
        btt.changeFrontSprocket(-1);
        btt.changeRearSprocket(-1);
        btt.changeRearSprocket(1);
        System.out.printf("La %s va a %fkm/h amb el plat %d i el pinyó %d.\n",
                          btt.getModel(),
                          btt.getSpeed(),
                          btt.getFrontSprocket(),
                          btt.getRearSprocket());

        // Second example
        Bicycle cityBike = new Bicycle("Comfort Riding", 1, 1, 1, 3, 0);
        cityBike.accelerate();
        cityBike.changeFrontSprocket(1);
        cityBike.changeRearSprocket(1);
        cityBike.changeRearSprocket(-1);
        cityBike.changeRearSprocket(1);
        System.out.printf("La %s va a %fkm/h amb el plat %d i el pinyó %d.\n\n",
                          cityBike.getModel(),
                          cityBike.getSpeed(),
                          cityBike.getFrontSprocket(),
                          cityBike.getRearSprocket());

         // Third example
        Person girl = new Person("Maria", 35, 190, 'W', false);
        girl.setBike(btt);
        System.out.printf("La persona %s que medeix %.2f té una %s!!!\n", 
                          girl.getName(), 
                          girl.getHeight(), 
                          girl.getBike().getModel());
        
        Person boy = new Person("Paco", 40, 180, 'M', false);
        boy.setBike(cityBike);
        System.out.printf("La persona %s que medeix %.2f té una %s!!!\n", 
                          boy.getName(), 
                          boy.getHeight(), 
                          boy.getBike().getModel());

     }
}
