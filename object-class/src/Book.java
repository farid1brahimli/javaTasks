public class Book {
    //TASK3
    static String title;
    static String author;
    static int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }
    public Book(){
        this.title = "";
        this.author = "";
        this.price = 0;
    }
}
