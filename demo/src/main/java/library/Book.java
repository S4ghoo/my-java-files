package library;

public class Book {
    // Private attributes
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor to initialize the title, author, and set isAvailable to true
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    // Public method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is already borrowed.");
        }
    }

    // Public method to return the book
    public void returnBook() {
        isAvailable = true;
        System.out.println("You have successfully returned the book: " + title);
    }

    // Public method to get book information
    public String getBookInfo() {
        String availability = isAvailable ? "Available" : "Not Available";
        return "Title: " + title + ", Author: " + author + ", Status: " + availability;
    }
}