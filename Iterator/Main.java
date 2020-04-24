import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("サピエンス全史前編"));
        bookShelf.appendBook(new Book("サピエンス全史後編"));
        bookShelf.appendBook(new Book("利己的な遺伝子"));
        bookShelf.appendBook(new Book("動的平衡論3"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}