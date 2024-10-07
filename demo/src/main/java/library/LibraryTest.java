package library;

public class LibraryTest {
    public static void main(String[] args) {
        // Create an instance of Book
        Book myBook = new Book("fille de papier", "Musso");

        // Display the book information
        System.out.println(myBook.getBookInfo());  

        // Try borrowing the book
        myBook.borrowBook(); 
        System.out.println(myBook.getBookInfo()); 

        // Try borrowing the book again 
        myBook.borrowBook(); 

        // Return the book
        myBook.returnBook(); 
        System.out.println(myBook.getBookInfo());  

        // Borrow it again to ensure it works after returning
        myBook.borrowBook(); 
        System.out.println(myBook.getBookInfo()); 
    }
}