public class Library {

    private Book[] books;
    private int count = 0; // neçə kitab var

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void showAvailableBooks() {
        for (int i = 0; i < count; i++) {
            if (books[i].isAvailable()) {
                books[i].showInfo();
            }
        }
    }
}
