package prac6_6;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] booksAndShops = {new Book("\"1984\" book"), new Shop("Adidas shop"), new Book("Great book")};
        for(Printable el : booksAndShops){
            el.print();
        }
    }
}
interface Printable {
    void print();
}
class Book implements Printable{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(this.title);
    }
}
class Shop implements Printable{
    private String title;

    public Shop(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(this.title);
    }
}
