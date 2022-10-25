/*
 * LibraryTUI.java
 * 
 *
 */

package library;

import java.util.HashSet;

public class LibraryTUI {

    public static void main(String[] args) {
        
     Library l = new Library();
     Book b1 = new Book("1"); 
     Book b2 = new Book("2","30583049","També això passarà","Milena Busquets");
     Book b3 = new Book("3","69583345","Alguns anys després","Jorge Wagensberg");
     Book b4 = new Book("4","70583345","Alguns anys després.Segona Part","Jorge Wagensberg");
     Book b5;
     HashSet<Book> newBooks;
     System.out.println("isbn=" + b1.getIsbn() + " title=" + b1.getTitle() + " Writer=" + b1.getWriter());
     System.out.println("isbn=" + b2.getIsbn() + " title=" + b2.getTitle() + " Writer=" + b2.getWriter());
     System.out.println("isbn=" + b3.getIsbn() + " title=" + b3.getTitle() + " Writer=" + b3.getWriter());
     System.out.println("Nombre de llibres arxivats = " + l.numberOfBooks());
     if (l.addBook(b1)) {
       System.out.println("LLibre arxivat");
     }
     System.out.println("Nombre de llibres arxivats = " + l.numberOfBooks());
     if (l.addBook(b2)) {
       System.out.println("LLibre arxivat");
     }
     System.out.println("Nombre de llibres arxivats = " + l.numberOfBooks());
     if (l.addBook(b2)) {
       System.out.println("LLibre arxivat");
     }
     System.out.println("Nombre de llibres arxivats = " + l.numberOfBooks());
     System.out.println("Nombre de llibres arxivats = " + l.numberOfBooks());
     if (l.addBook(b3)) {
       System.out.println("LLibre arxivat");
     }
     l.removeBook(b1);
     if (!l.isBookInLibrary(b4)) {
       System.out.println("El llibre no està arxivat");
     }
     System.out.println("Nombre de llibres arxivats = " + l.numberOfBooks());
     if (l.addBook(b4)) {
       System.out.println("LLibre arxivat");
     }
     System.out.println("Nombre de llibres arxivats = " + l.numberOfBooks());
     b5 = l.getBookFromCollection(b2);
     System.out.println("b5 conté isbn=" + b5.getIsbn() + " title=" + b5.getTitle() + " Writer=" + b5.getWriter());
      System.out.println("-----------------------------");
     newBooks = l.getBookByWriter("Jorge Wagensberg");
     for (Book i : newBooks) {
       System.out.println("isbn=" + i.getIsbn() + " title=" + i.getTitle() + " Writer=" + i.getWriter());
     } 
     
    } 
   
}