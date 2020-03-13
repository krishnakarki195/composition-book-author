package com.galvanize;

public class Report implements Publisher {

    private String title;
    private String published_date;
    private final Author author;

    public Report(Author author) {
        this.author = author;
    }

    public Report(String title, String published_date, Author author) {
        this.title = title;
        this.published_date = published_date;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public void publish() {
        System.out.println("Report published date: " + getPublished_date());
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", published_date='" + published_date + '\'' +
                ", author=" + author +
                '}';
    }
}
