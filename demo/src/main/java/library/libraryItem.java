class LibraryItem {
  private String title;
  private String author;
  public LibraryItem(String title, String author) {
  this.title = title;
  this.author = author;
  }
  public String getTitle() {
  return title;
  }
  public String getAuthor() {
  return author;
  }
  public void displayInfo() {
  System.out.println("Title: " + title + ", Author: " + author);
  }
  }
  class Book extends LibraryItem {
    private String genre;
    public Book(String title, String author, String genre) {
    super(title, author);
    this.genre = genre;
    }
    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Genre: " + genre)}
    
