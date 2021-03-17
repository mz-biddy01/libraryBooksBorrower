import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("demon", "Craig", "horror");
    }
    @Test
    public void borrowerHas0Book(){
        assertEquals(0, borrower.borrowerBookCount());

    }

    @Test
    public void canAddBookToBorrower(){
        borrower.addBookToBorrower(book);
        assertEquals(1, borrower.borrowerBookCount());
    }


}
