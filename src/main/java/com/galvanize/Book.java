package com.galvanize;

public class Book {

    private String title;
    private String published_date;
    private String genre;
    private int pages;
    private final Author author;

    public Book(Author author) {
        this.author = author;
    }

    public Book(String title, String published_date, String genre, int pages, Author author) {
        this.title = title;
        this.published_date = published_date;
        this.genre = genre;
        this.pages = pages;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getPublished_date() {
        return published_date;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public Author getAuthor() {
        return author;
    }
}
