import java.util.ArrayList;

public class Borrower {

        private ArrayList<Book> book;

        public Borrower(){
            this.book = new ArrayList<Book>();
        }

        public ArrayList<Book> getBook() {
            return book;
    }

        public int borrowerBookCount(){
            return this.book.size();

        }

        public void addBookToBorrower(Book book){
            this.book.add(book);
        }


}
