/*
 * ContactsTUI.java
 * 
 *
 */

import java.util.HashSet;

public class ContactTUI {
    
    public static void main(String[] args) {
        
        Contact c1 = new Contact(11222333,"Menganito","666555444");
        Contact c2 = new Contact(22333444,"Fulanito","111222333");   
        Contact c3 = new Contact(33444555,"Andres","222333444");   
        Contact c4 = new Contact(44555666,"Jorge","333444555");
        Contact c5 = new Contact(55666777,"Franciso","555666777");
        
        c1.addContact(c2);
        c1.addContact(c3);
        c1.addContact(c4);
        c1.addContact(c5);
        //c1.addContact(c1);
        
        // Busca el dni del contacto 2 en la lista del 1
        System.out.println("Busca DNI de c2 en c1 contacts list");
        System.out.println(c1.search(22333444));
        System.out.println("----------------");
        // Lista los contactos de contacto 1
        System.out.println("Listado de contactos de c1");
        c1.listContacts();
    }
}

