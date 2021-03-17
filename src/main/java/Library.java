import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> book;


    public Library(int capacity) {
        this.capacity = capacity;
        this.book = new ArrayList<Book>();
    }

    public ArrayList<Book> getBook() {
        return book;
    }

    public int bookCount() {
        return this.book.size();

    }

    public void addBook(Book book) {
        if (this.bookCount() < this.capacity) {
            this.book.add(book);
        }
    }
    public void borrowBook(Book book, Borrower borrower){
        borrower.addBookToBorrower(book);
        this.book.remove(book);

    }
}
