package com.galvanize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void test0(){
        Author author = new Author("Krishna","krishna.karki@xome.com",29);
        Book book = new Book(author);
        book.setGenre("Literature");
        book.setPages(100);
        book.setPublished_date("01-10-2020");
        book.setTitle("Krishna");

        Book book1 = new Book(author);
        book1.setGenre("Fiction");
        book1.setPages(100);
        book1.setPublished_date("01-10-2020");
        book1.setTitle("Mark");

        Book book2 = new Book(author);
        book2.setGenre("Fiction");
        book2.setPages(100);
        book2.setPublished_date("01-10-2020");
        book2.setTitle("Mike");

        Report report = new Report(author);
        Library library = new Library();
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.printBooks(library.getBooks());
        library.printBooks(library.sortBook());
        assertEquals(library.searchBookByTitle("Mike"),book2);

    }

}
