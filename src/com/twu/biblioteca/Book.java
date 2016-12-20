package com.twu.biblioteca;

/**
 * Created by parvez on 20/12/16.
 */
public class Book implements LibraryItem{
    private String title;
    private String author;
    private int publishedYear;

    public Book(String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    @Override
    public boolean equals(Object obj) {
        Book other = (Book) obj;
        if(other.getAuthor() == author && other.getTitle() == title && other.getPublishedYear()== publishedYear) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String getDetails() {
        return "Book Title: " + title + ", " + "Book author: "+author + ", " + "Published Year:"+publishedYear + "\n";
    }
}
