/*
 * SchoolTUI.java
 * 
 *
 */



public class SchoolTUI {
    
    public static void main(String[] args) {
        Person p1 = new Person("Eduard","En algun lugar");
        Student s1 = new Student("Manuel","Paseo de Gracia","DAW",1);
        Student s2 = new Student("Pepe","Barceloneta","DAM",2);
        InternationalStudent is1 = new InternationalStudent("Mark","Raval","Sistemas",2,"USA");
        InternationalStudent is2 = new InternationalStudent("Joao","PobleNou","Redes",3,"Portugal");
        Teacher t1 = new Teacher("Maria","Sarria");
        Teacher t2 = new Teacher("Marta","Hospitalet");
        
        System.out.println("Añadimos asignaturas a Maria");
        t1.addSubject("Sistemas");
        t1.addSubject("BBDD");
        
// Como printar el toString de la clase padre?
        System.out.println("Printamos al Eduard");
        System.out.println(p1.toString());        

        System.out.println("\nPrintamos s1");
        System.out.println(s1.toString());
        
        System.out.println("\nPrintamos is1");
        System.out.println(is1.toString());
        
        System.out.println("\nPrintamos el array de asignaturas");
        System.out.println(t1.toString());
        
    }
}

