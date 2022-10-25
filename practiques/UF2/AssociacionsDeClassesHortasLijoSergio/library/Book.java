/*
 * Book.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package library;

/**
 * Modelizes a book.
 */
public class Book {

    /** Book copy identifier code */
    private String code;
    /** Book's ISBN */
    private String isbn;
    /** Book's title */
    private String title;
    /** Book's writer */
    private String writer;

    /**
     * Constructor.
     * 
     * @param code the book copy's code
     */
    public Book(String code) {
        this.code = code;
    }

    /**
     * Constructor with all fields.
     * 
     * @param code the book copy identifier code
     * @param isbn the book's ISBN
     * @param title the book's title
     * @param writer the book's writer
     */
    public Book(String code, String isbn, String title, String writer) {
        this.code = code;
        this.isbn = isbn;
        this.title = title;
        this.writer = writer;
    }

    // equals & hashCode

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        return true;
    }

    // Getters & Setters

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getCode() {
        return this.code;
    }
}