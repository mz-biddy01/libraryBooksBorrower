import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Borrower borrower;


    @Before
    public void Before() {
        library = new Library(2);
        book = new Book("Lust", "Helen", "romance");
        book1 = new Book("Demons", "Craig", "horror");
        borrower = new Borrower();
    }
    @Test
    public void booksCountStartsAt0(){
        assertEquals(0, library.bookCount());
    }
    @Test
    public void canAddBooks(){
        library.addBook(book);
        assertEquals(1, library.bookCount());

    }

    @Test
    public void canCountBooks(){
        library.addBook(book);
        library.addBook(book1);
        assertEquals(2, library.bookCount());

    }

    @Test
    public void canTakeBook(){
        library.addBook(book);
        library.borrowBook(book, borrower);
        assertFalse(library.getBook().contains(book));
        assertEquals(0, library.bookCount());
        assertTrue(borrower.getBook().contains(book));

    }



}
