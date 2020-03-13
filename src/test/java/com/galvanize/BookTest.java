package com.galvanize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void test0(){
        Author author = new Author("Krishna","krishna.karki@xome.com",29);
        Book book = new Book(author);
        book.setGenre("Literature");
        book.setPages(100);
        book.setPublished_date("01-10-2020");
        book.setTitle("Hello World!");

        assertEquals(book.getPages(),100);
        assertNotNull(book.getAuthor());
        assertNotNull(book);
    }


}
