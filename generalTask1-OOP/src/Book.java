public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void barrow () {
        if (isAvailable) {
            System.out.println(this.title + " barrowed");
            isAvailable = false;
        } else {
            System.out.println(this.title + " not available");
        }
    }

    public void returnBook() {
        if (isAvailable) {
            System.out.println(this.title + " is not borrowed");
        } else {
            System.out.println(this.title + " returned");
        }
    }

    public void showInfo() {
        System.out.println(title + " - " + author + " (" + year + ")");
    }
}
