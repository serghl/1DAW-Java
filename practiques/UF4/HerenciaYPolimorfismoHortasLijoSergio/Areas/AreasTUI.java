/*
 * SchoolTUI.java
 * 
 *
 */



public class AreasTUI {
    
    public static void main(String[] args) {
        Office o1 = new Office("123", 25, true, 12, 5, true);
        Classroom cr1 = new Classroom("222", 30, true, 15, 25, true, 25, true);
        Laboratory l1 = new Laboratory("333", 20, false, 25, 20, true, 3, true, 10);
        Computing c1 = new Computing("444", 35, true, 55, 35, true, 35, true, 5);
        Gym g1 = new Gym("555", 460, true, 20, 50, true, 40);
        
        System.out.println("-----------------------");
        System.out.println("Office 1");
        System.out.println(o1.toString());
        System.out.println("Office 1 consumption");
        System.out.println(o1.consumptionM2());
        System.out.println("-----------------------");
        System.out.println("Classroom 1");
        System.out.println(cr1.toString());
        System.out.println("Classroom 1 Student Surface Area");
        System.out.println(cr1.surfaceAreaStudent());
        System.out.println("Classroom 1 consumption");
        System.out.println(cr1.consumptionM2());
        System.out.println("-----------------------");
        System.out.println("Laboratory 1");
        System.out.println(l1.toString());
        System.out.println("Laboratory 1 Student Surface Area");
        System.out.println(l1.surfaceAreaStudent());
        System.out.println("Laboratory 1 consumption");
        System.out.println(l1.consumptionM2());
        System.out.println("-----------------------");
        System.out.println("Computing 1");
        System.out.println(c1.toString());
        System.out.println("Computing 1 Student Surface Area");
        System.out.println(c1.surfaceAreaStudent());
        System.out.println("Computing 1 consumption");
        System.out.println(c1.consumptionM2());
        System.out.println("-----------------------");
        System.out.println("Gym 1");
        System.out.println(g1.toString());
        System.out.println("Gym 1 Student Surface Area");
        System.out.println(g1.surfaceAreaStudent());
        System.out.println("Gym 1 consumption");
        System.out.println(g1.consumptionM2());
    }
}

