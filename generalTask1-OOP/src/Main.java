public class Main {
    public static void main(String[] args) {

        Library library = new Library(3); // maksimum 5 kitab

        Book b1 = new Book("Java", "James", 1995);
        Book b2 = new Book("Clean Code", "Robert", 2008);
        Book b3 = new Book("Java", "James", 1995);
        Book b4 = new Book("Java", "James", 1995);

        b1.barrow();
        b1.returnBook();

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);

        library.showAvailableBooks();
    }
}
