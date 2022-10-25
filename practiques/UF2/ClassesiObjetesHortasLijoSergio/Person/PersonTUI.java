public class PersonTUI {
    
    
    
    public static void main(String[] args) {
        Person p1 = new Person("Eli",27,1.60,'M',false);
        Person p2 = new Person("Alex",20,1.74,'H',false);
        printPerson(p1);
        printPerson(p2);
        
        p1.birthday();
        printPerson(p1);
        
        p2.birthday();
        printPerson(p2);
        
        Person girl = p1;
        Person boy = p2;
        
        girl.birthday();
        printPerson(p1);
        
        boy.birthday();
        printPerson(p2);
         
        // Aqui es lo mismo que abajo pero simplificado
        System.out.print("-- AQUI --");
        System.out.println(p2.toString());
        System.out.println(p2);
    }
    
    public static void printPerson(Person p) {
        System.out.println("Nom:     " + p.getName());
        System.out.println("Edad:    " + p.getAge());
        System.out.println("Altura:  " + p.getHeight());
        System.out.println("Sex:     " + p.getSex());
        System.out.println("Estado:  " + p.isMarried());
        System.out.println();
    }
}