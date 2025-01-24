import java.util.ArrayList;
import java.util.List;

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
}

class Library{
    private static String libraryName;
    private List<Book> books;

    public Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void showBooks(){
        System.out.println("\n==== Books offered by " + libraryName + " ====");
        for(Book books : books){
            System.out.println("- " + books.getTitle() + "  -  " + books.getAuthor());
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {

        Library library1 = new Library("Epic Reads");
        Library library2 = new Library("Textual Treasures");

        Book book1 = new Book("Thinking in Java", "Bruce Eckel");
        Book book2 = new Book("Java The Complete Reference", "Herbert Schildt");
        Book book3 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        Book book4 = new Book("The Hobbit", "J.R.R. Tolkien");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);
        library2.addBook(book4);

        library1.showBooks();
        library2.showBooks();
    }
}