import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private List<Book> books;

    public Author(String name){
        this.name = name;
        books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(String title, double price){
        Book book = new Book(title,this,price);
        books.add(book);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }
}
