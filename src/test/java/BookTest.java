import org.junit.Before;

public class BookTest {

    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book("Lust", "Helen", "romance");
        library = new Library(2);
    }
}
