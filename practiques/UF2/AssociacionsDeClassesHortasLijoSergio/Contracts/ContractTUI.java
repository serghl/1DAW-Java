/*
 * ContractsTUI.java
 * 
 *
 */

import java.util.HashSet;

public class ContractTUI {
    
    public static void main(String[] args) {
        
        Company com1 = new Company(11222333,"Coca-Cola","Alimentación");
        Company com2 = new Company(22222333,"Seat","Automocion");
        Person p1 = new Person(44555666,"Pepito"); 
        Person p2 = new Person(77555666,"Manuel"); 
        Contract con1 = new Contract(111,"17/04/2022","17/06/2022",com1);
        Contract con2 = new Contract(222,"13/06/2022","22/06/2022",com2);
        Contract con3 = new Contract(333,"17/08/2022","25/08/2022",com1);
        Contract con4 = new Contract(444,"21/10/2022","21/11/2022",com2);
        
        HashSet<Contract> newContracts;
        
        System.out.println("-------------");
        System.out.println(com1);
        System.out.println("-------------");
        System.out.println(com2);
        System.out.println("-------------");
        System.out.println(p1);
        System.out.println("-------------");
        System.out.println(p2);
        System.out.println("-------------");
        System.out.println(con1);
        System.out.println("-------------");
        System.out.println(con2);
        System.out.println("------ CAN CONTRACT 1 BE DONE-------");
        System.out.println(p1.signContract(con1));
        System.out.println("------- CAN CONTRACT 2 BE DONE ------");
        System.out.println(p1.signContract(con2));
        System.out.println("------- CAN CONTRACT 3 BE DONE ------");
        System.out.println(p1.signContract(con3));
        System.out.println("------- CAN CONTRACT 4 BE DONE ------");
        System.out.println(p1.signContract(con4));
        System.out.println("------ DURATION OF HOURS OF CONTRACT 2 -------");        
        System.out.println(con1.duration());
        System.out.println("------ TOTAL WORK TIME OF PERSON 1 ------");
        System.out.println(p1.workedTime());
        System.out.println("------- NUMBER OF COMPANIES THAT PERSON 1 WORKED FOR ------");
        System.out.println(p1.nCompanies());
    }
}

