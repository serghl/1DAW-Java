/*
 * Library.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package library;

import java.util.HashSet;

/**
 * Modelizes a library.
 */
public class Library {

    /** Library's books collection */
    private HashSet<Book> books;

    /**
     * Constructor.
     */
    public Library() {
        this.books = new HashSet<Book>();
    }

    /**
     * Adds a book to the library.
     * 
     * @param book the book to add.
     * @return true if the book is added, false otherwise
     */
    public boolean addBook(Book book) {
        return this.books.add(book);
    }

    /**
     * Removes a book from the library.
     * 
     * @param book the book to remove.
     * @return true if the book is removed, false otherwise
     */
    public boolean removeBook(Book book) {
        return this.books.remove(book);
    }

    /**
     * Checks whether a book is in the library.
     * 
     * @param book the book to find.
     * @return true if the book is in the library, false otherwise.
     */
    public boolean isBookInLibrary(Book book) {
        boolean is = this.books.contains(book);
        return is;
    }

    /**
     * Counts how many book copies there are in the library.
     * 
     * @return the number of book copies.
     */
    public int numberOfBooks() {
        return this.books.size();
    }

    /**
     * Gets a book from the collection of the library.
     * 
     * @param book a book
     * @return the book copy or null if it is not in the library
     */
    public Book getBookFromCollection(Book book) {
        // Traverse all the books
        for (Book b : this.books) {
            if (b.equals(book)) {
                return b;
            }
        }
        return null;
    }

    /**
     * Gets a book from the collection of the library.
     * 
     * @param code a book code
     * @return the book with code -code-
     */
    public Book getBookFromCollection(String code) {
        Book b = new Book(code);  // fake book
        Book book = this.getBookFromCollection(b);
        return book;
    }

    /**
     * Get all books written by a writer.
     * 
     * @param writer a writer
     * @return a collection of all the books written by -writer-
     */
    public HashSet<Book> getBookByWriter(String writer) {
        HashSet<Book> ba = new HashSet<Book>();
        // Traverse all books looking for those that are written by the writer
         for (Book l : this.books) {
            if (l.getWriter().equals(writer)) { 
                // Add this book to another HashSet
                ba.add(l);
            }   
        }
        return ba;
    }
}
