package com.designpatterns.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class LibraryPrototypeTestSuite {

    @Test
    public void testShallowAndDeepCopy() {
        //Given
        Book book1 = new Book("Hack your Brain", "Radek Kotarski", LocalDate.of(2017, 9,24));
        Book book2 = new Book("Time Management", "XXX", LocalDate.of(2016, 11,1));
        Book book3 = new Book("Head First", "YYY", LocalDate.of(2004, 4,12));

        Set<Book> bookList = new HashSet<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        Library library = new Library("Central Library");
        library.setBooks(bookList);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Central Library - shallow copy");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Central Library - deep copy");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        assertEquals(2, library.getBooks().size());
        assertEquals(2, shallowClonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
