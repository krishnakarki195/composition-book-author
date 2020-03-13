package com.galvanize;

import java.util.*;

public class Library {

    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> sortBook(){
        List<Book> sortedBooksByTitle = new ArrayList<>();
        for(Book book: books){
            sortedBooksByTitle.add(book);
        }
        Collections.sort(sortedBooksByTitle, new SortBookByTitle());
        return sortedBooksByTitle;

    }

    public Book searchBookByTitle(String title){
        for(Book book: books){
            if(title.equals(book.getTitle())) return book;
        }
        return null;
    }

    public void addBook(Book book){
        books.add(book);
    }

    class SortBookByTitle implements Comparator<Book>
    {
        public int compare(Book a, Book b)
        {
            return a.getTitle().compareTo(b.getTitle());
        }
    }

    public void printBooks(List<Book> books){
        for(Book book: books){
            System.out.println(book.getTitle());
        }
    }

}
